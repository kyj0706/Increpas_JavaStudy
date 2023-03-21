package mymain.tcp.multichat;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiServer_t extends JFrame {

	
	
	JTextArea  jta_display;
	JTextField jtf_user_count;
	JList<String> jlist_user;
	
	ServerSocket  server;
	
	List<ReadThread> socketList = new ArrayList<ReadThread>();//접속된 소켓을포함 쓰레드목록
	List<String>     userList   = new ArrayList<String>();    //접속자목록저장
	
	//동기화 관리객체
	Object syncObj = new Object();
	
	
	
	Font font = new Font("굴림체", Font.BOLD, 16);
	
	public MultiServer_t() {
		// TODO Auto-generated constructor stub
		super("멀티서버_t");

		//출력창 초기화
		init_display();
		
		//접속자수창 초기화
		init_user_count();
		
		//접속자 목록창 초기화
		init_user_list();
		
		//서버초기화
		init_server();
		
		
		//위치            x     y 
		this.setLocation(300, 200);

		//크기        W    H  
		//this.setSize(400, 300);
		pack();

		//보여주기
		this.setVisible(true);

		//종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_server() {
		// TODO Auto-generated method stub
		
		
		try {
			server = new ServerSocket(8000);
			
			//별도 쓰레드 할당해서 대기시킨다
			new Thread() {
				
				public void run() {
					
					while(true) {
						
						try {
							//접속대기 -> 자소켓생성후 요청측과 연결
							Socket child = server.accept();
							
							
							ReadThread rt = new ReadThread(child);
							rt.start();
							
							socketList.add(rt);
							//접속자수를 출력
							display_user_count();
							
							//InetAddress ia = child.getInetAddress();
							//System.out.printf("[%s]님 연결요청\n", ia.getHostAddress());
							
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				
			}.start();
			
			//서버모니터
			display_message("서버 구동중...");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	protected void display_user_count() {
		// TODO Auto-generated method stub
		jtf_user_count.setText( socketList.size() + "" );
	}

	private void display_message(String message) {
		// TODO Auto-generated method stub
		jta_display.append(message);
		jta_display.append("\r\n");
		
		//항상 최근추가된 글을 화면에 보이도록 처리...
		int position = jta_display.getDocument().getLength();
		jta_display.setCaretPosition(position);
			
		
	}

	private void init_user_list() {
		// TODO Auto-generated method stub
		jlist_user = new JList<String>();
		
		JScrollPane jsp = new JScrollPane(jlist_user);
		
		jsp.setPreferredSize(new Dimension(120, 0));
		
		this.add(jsp, "East");
		
	}

	private void init_user_count() {
		// TODO Auto-generated method stub
		
		JPanel p = new JPanel(new GridLayout(1, 3));
		
		JLabel jlb_title1 = new JLabel("접속자수:", JLabel.RIGHT);
		jlb_title1.setFont(font);
		
		jtf_user_count = new JTextField("0");
		jtf_user_count.setFont(font);
		jtf_user_count.setHorizontalAlignment(JTextField.CENTER);
		
		JLabel jlb_title2 = new JLabel("(명)");
		jlb_title2.setFont(font);
		
		p.add(jlb_title1);
		p.add(jtf_user_count);
		p.add(jlb_title2);
				
		
		this.add(p, "South");
		
	}

	private void init_display() {
		// TODO Auto-generated method stub
		jta_display =  new JTextArea();
		
		JScrollPane jsp = new JScrollPane(jta_display);
		
		jsp.setPreferredSize(new Dimension(400, 400));
		
		this.add(jsp,"Center");
		
		jta_display.setFont(font);
		
		//읽기전용
		jta_display.setEditable(false);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MultiServer_t();
	}
	
//---수신쓰레드 내부클래스로 선언
	class ReadThread extends Thread
	{
		Socket child;
		BufferedReader br;
		
	
		public ReadThread(Socket child) {
			super();
			this.child = child;
			
			try {
				//InputStream -> InputStreamReader -> BufferedReader
				InputStreamReader isr = new InputStreamReader(child.getInputStream());
				br                    = new BufferedReader(isr); 
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}



		@Override
		public void run() {
		// TODO Auto-generated method stub
		    while(true) {
		    	
		    	try {
					
		    		String readData = br.readLine();//1라인단위로 받기
		    		
					if(readData==null) {
						//System.out.println("--정상종료--");
						break;
					}
					
					//모니터
					display_message(readData);
					
					//욕설에대한 filter
					String [] bad_string={"개놈","나쁜놈","죽일놈"};
					
					for(String bad : bad_string) {
						
						readData = readData.replaceAll(bad, "***");
					}
					
					/* 강퇴시키는 
					 	if(readData.contains("진우")) {
						child.close(); //강퇴
						break;
					}*/
					
					
					
					
					
					//데이터 처리
					String [] msg_array = readData.split("#");
					
					// readData = "IN#홍길동"; 
					// readData = "MSG#홍길동#안녕하세요"; 
					//                            0       1            2   
					// String [] msg_array  = { "IN"  , "홍길동" };
					// String [] msg_array  = { "MSG" , "홍길동" ,"안녕하세요"};
					
					//입장메시지면
					if(msg_array[0].equals("IN")) {
						
						synchronized (syncObj) 
						{
							//접속자명을 유저목록 추가
							userList.add(msg_array[1]);
							//접속자 목록을 우측리스트에 출력
							display_user_list();
							
							send_message_all(readData+"\n");
							
							//현재 접속자 목록을 모든 클라이언트에게 전송
							send_user_list_all();
						}
					}else if(msg_array[0].equals("MSG")) {
						
						synchronized (syncObj) 
						{
							//모든접속자에게 전송
							send_message_all(readData+"\n");
						}
						
					}else if(msg_array[0].equals("DRAW")) {
						
						synchronized (syncObj) 
						{
							//모든접속자에게 전송
							send_message_all(readData+"\n");
						}
						
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					//System.out.println("--비정상종료--");
					break;
				}
		    	
		    }//end-while
		    
		 
		    synchronized (syncObj) 
		    {
			    //퇴장상황
			    int index = socketList.indexOf(this);//ArrayList에 저장된 index구한다
			    socketList.remove(index);
			    display_user_count();
			    
			    //유저목록에서 유저정보 삭제
			    String del_user_name = userList.get(index);//퇴장한 유저명 얻어온다
			    userList.remove(index);
			    display_user_list();
			    
			    //퇴장정보를 접속된 모든 클라이언트에게 전송
			    String send_data = String.format("OUT#%s\n", del_user_name);
			    
			    send_message_all(send_data);
			    
			    //현재 접속자 목록을 모든 클라이언트에게 전송
				send_user_list_all();
			    
			    
			    
		    }
		    
		}//end-run() 
		
	}//end-ReadThread	

	
	public void display_user_list() {
		// TODO Auto-generated method stub
		String []  user_array = new String[userList.size()];
		userList.toArray(user_array);
		jlist_user.setListData(user_array);
				
	}

	public void send_user_list_all() {
		// TODO Auto-generated method stub
		//String send_data = "LIST#길동1#길동2#길동3#\n"
		
		StringBuffer sb = new StringBuffer("LIST#");
		
		for(String user_name : userList) {
			
			sb.append(user_name);
			sb.append("#");
		}
		
		sb.append("\n");
		
		String send_data = sb.toString();
		
		//System.out.print(send_data);
		//유저목록을 모든사용자에게 전송
		send_message_all(send_data);
		
		
	}

	public void send_message_all(String send_data) {
		// TODO Auto-generated method stub
		for(ReadThread rt : socketList) {
			
			try {
				rt.child.getOutputStream().write(send_data.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
}

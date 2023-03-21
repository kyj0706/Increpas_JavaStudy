package mymain.tcp.multichat;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
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

public class MultiServer extends JFrame {

	//순1 (필요한거 선언)
	JTextArea 	jta_display;
	JTextField  jtf_user_count;//
	JList<String> jlist_user;
	
	//순16_1 (서버소켓을 만듭시다)
	ServerSocket server;
	
	//순18_10 : 접속된 소켓을 포함 쓰레드 목록
	List<ReadThread> socketList= new ArrayList<ReadThread>();
	
	//메3_1 :접속자목록 저장 
	List<String> userList = new ArrayList<String>();
	
	//동1_1 : 동기화 관리객체
	Object syncObj = new Object();
	
	//순3(폰트지정)
	Font font = new Font("굴림체", Font.BOLD, 16);
	

	
	//기본생성자
	public MultiServer() {
		// TODO Auto-generated constructor stub

		super("멀티서버");

		//(초기화[준비])
		//순1_1 : 출력창초기화 
		init_display();
		//순1_2 :접속자수창 초기화
		init_user_count();
		//순1_3접속자목록창 초기화
		init_user_list();
		
		//순16_2: 서버를 초기화
		init_server();
		
		
		//위치            x     y
		this.setLocation(300, 200);

		//크기        W     H
		//this.setSize(400, 300);
		
		//순2 (자신의 window 고정)
		pack();
		

		//보여주기
		this.setVisible(true);

		//종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_server() {
		// TODO Auto-generated method stub
		
		
		
		try {
			//순16_3 (입력후 예외처리)
			server = new ServerSocket(8000);
			
			//별도 쓰레드 할당해서 대시기신다.
			//순16_5 (익명으로 만들어준다) 일꾼등장
			//왜 ? 굳이 뭘 할게 없다 그냥 구동만 하면 되니깐
			new Thread() {
				public void run() {
					//순16_6 -> 16_4에 할일을 이 일꾼에게 할당해 주는거다
					while(true) {
						try {
							//접속대기 -> 자소캣생성후 요청측과 연결
							Socket chrid = server.accept();
							
							//순18_11
							ReadThread rt = new ReadThread(chrid);
							rt.start();
							socketList.add(rt);

							//순19_1 : (접속자수를 출력)
							display_user_count();
							
							
							//접속정보 확인용 
							//InetAddress ia = chrid.getInetAddress();
							//System.out.printf("[%s]님 연결요청\n",ia);
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}.start();
			
			//서버모니터
			//순16_7(서버가 구동되는지 보여주자 (사용자에게)
			display_message("서버 구동중...");
			
			
			//순16_4 (이렇게 하면 main에게 일시키고 계~~속 대기중이다 그래서 화면도 안뜬다)
			//왜 ? 아니 들어온게 없잖아 .... 뭐하라고 ? main이 파업하신다.
			//그래서 작업자를 하나 지정해 주자 (너!! 일해 !!) 16_5로
//			while(true) {
//				
//				Socket chrid = server.accept();//큐스택 ?
//			}
//			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void display_user_count() {
		// TODO Auto-generated method stub
		//순19_2 : user count 합니다.
		jtf_user_count.setText(socketList.size()+"");
		
	}

	private void display_message(String message) {
		// TODO Auto-generated method stub
		//순16_8 (내용 올려줄꺼야)
		jta_display.append(message);
		jta_display.append("\r\n");
		
		//순16_9 (항상 최근 추가된 글을 화면에 보이도록 처리...)
		int position =jta_display.getDocument().getLength();
		jta_display.setCaretPosition(position);
		
	}

	private void init_user_list() {
		// TODO Auto-generated method stub
		//순11_1 (user에 리스트 사용할거야
		jlist_user = new JList<String>();
		//순11_2
		JScrollPane jsp = new JScrollPane(jlist_user);//(보여지는 화면이 늘어나면 스크롤해줘)
		jsp.setPreferredSize(new Dimension(120, 0));//(사용할께 new 사이즈는 이거야)
		this.add(jsp,"East");// (넣어줘 오른쪽에)
		
	}

	private void init_user_count() {
		// TODO Auto-generated method stub
		//순9_1 (아래 패널을 사용할거야 1줄에 3개로)
		JPanel p = new JPanel(new GridLayout(1,3));
		
		//순10_1 (JPanel 설정한거 위치 잡아서 만들거야)
		JLabel jlb_title1 = new JLabel("접속자수:",JLabel.RIGHT);
		jlb_title1.setFont(font); //폰트설정해줘
		
		jtf_user_count = new JTextField("0");//유저카운트 할거 만들어줘 시작은 0이야
		jtf_user_count.setFont(font);//폰트설정해줘
		jtf_user_count.setHorizontalAlignment(JTextField.CENTER);// 왼쪽으로 쏠려있잖아 가운데로 해줘
		
		JLabel jlb_title2 = new JLabel("(명)");
		jlb_title1.setFont(font);
		
		//순10_2 (보여줘 순서는 이렇게)[add순서가 다르면 보여지는 순서가 바뀐다.]
		p.add(jlb_title1);
		p.add(jtf_user_count);
		p.add(jlb_title2);
		
		
		
		//순9_2 (넣어줘 남쪽[아래에다가])
		this.add(p,"South");
		
	}

	private void init_display() {
		// TODO Auto-generated method stub
		//순5 (보여줘 <-입력창 선언[만들어서])
		jta_display = new JTextArea();
		//순6_1 (보여지는 화면이 늘어나면 스크롤해줘)
		JScrollPane jsp = new JScrollPane(jta_display);
		//순6_2 (사용할께 new 사이즈는 이거야)
		jsp.setPreferredSize(new Dimension(400, 400));
		//순6_3 (위치는 중간이야)
		this.add(jsp,"Center");
		//순7(위에서 설정한 폰트를 설정해서 보여줘)
		jta_display.setFont(font);
		//순8 (읽기만 해줘 쓰기는안되)
		jta_display.setEditable(false);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MultiServer();

	}
	
	//--수신쓰레드 내부클래스로 선언
		//순18_1 (내부클래스로 사용) 
		//왜 ? 다 사용하기 위해 ???
		class ReadThread extends Thread
		{
			//순18_2
			Socket child;
			BufferedReader br;
			
			
			
			//순18_4 생성자
			public ReadThread(Socket child) {
				super();
				this.child = child;
				
				try {
					//순18_5(예외처리)
					InputStreamReader isr = new InputStreamReader(child.getInputStream());
					//순18_6
					br					  = new BufferedReader(isr);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
			
			//순18_3
			@Override
			public void run() {
			// TODO Auto-generated method stub
				while(true) {
					
					//순18_7
					try {
						String readData = br.readLine();//1라인단위로 받기
						//순18_8
						if(readData==null) {
							//System.out.println("--[정상종료]--");
							break;
						}
						//메2_1 데이터 받고 처리
						//데이터 처리
						String [] msg_array = readData.split("#");
						//readData = "IN#카카오" :
						//                        0      1
						//String [] msg_array =["IN","카카오"];
						
						//메2_2 [0]이 IN이 맞아 ???
						if(msg_array[0].equals("IN")) {
							
							//동1_2
							synchronized (syncObj) 
							{
							
							//메3_2 : 입장 IN이 맞으면 
							//유저목록에 추가해
							userList.add(msg_array[1]);
							
							//메4_1 : 접속자 목록을 우측리스트에 출력
							display_user_list();
							
							send_message_all(readData+"\n");
							
							//현재 접속자 목록을 모든 클라이언트에게 전송
							send_user_list_all();
							
							}
						}else if (msg_array[0].equals("MSG")) {
							
							synchronized (syncObj) 
							{
							//모든접속자에게 전송
							send_message_all(readData+"\n");
							}
						}
							
						
						
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
						//System.out.println("--[비정상종료]--");
						break;
					}
					
					
				}//end : while
				
				//동1_3
				synchronized(syncObj) 
				{
				
					//순20_1
					//퇴장상황
					int index = socketList.indexOf(this); //ArrayList에 저장된 index구한다.
					socketList.remove(index);
					display_user_count();
					
					//메4_3
					//유저목록에서 유저정보 삭제
					String del_user_name =userList.get(index);//퇴장한 유저명 얻어온다.
					userList.remove(index);
					display_user_list();
				
					//퇴장정보는 접속된 모든 클라이언트에게 전송
					String send_data = String.format("OUT#%s\n", del_user_name);
					
					send_message_all(send_data);
					
					//현재 접속자 목록을 모든 클라이언트에게 전송
					send_user_list_all();
				
				}
				
			}//end: run()
			
		}//end : ReadThread

		public void display_user_list() {
			// TODO Auto-generated method stub
			//메4_2 : 유저의 목록을 배열에 담아서 출력합니다.
			String [] user_array = new String [userList.size()];
			userList.toArray(user_array);
			jlist_user.setListData(user_array);
		}

		public void send_user_list_all() {
			// TODO Auto-generated method stub
			//String send_data = "LIST#카카오1#카카오2#카카오\n"
			
			
			StringBuffer sb = new StringBuffer("LIST#");
			
			for(String user_name : userList) {
				
				sb.append(user_name);
				sb.append("#");
			}
			sb.append("\n");
			
			String send_data = sb.toString();
			
			//System.out.print(send_data);
			
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


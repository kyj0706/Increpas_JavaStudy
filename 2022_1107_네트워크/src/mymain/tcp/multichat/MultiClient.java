package mymain.tcp.multichat;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiClient extends JFrame {

	
	
	JTextArea  jta_display;
	JList<String> jlist_user;
	
	//순12 필요한거 선언
	JTextField jtf_message;
	JButton    jbt_connect;
	
	
	
	//순15_3
	boolean bConnect =false;//연결상태 사용할거야 
	
	//순17_1 (소켓선언)
	Socket client;
	//순17_2 (라인단위로 받아오기위해서 수신IO)
	BufferedReader br;
	
	//메1_1
	String user_name="카카오";
	
	Font font = new Font("굴림체", Font.BOLD, 16);
	
	public MultiClient() {
		// TODO Auto-generated constructor stub
		super("멀티 클라이언트");

		//출력창 초기화
		init_display();
		
		//접속자수창 초기화
		init_input();
		
		//접속자 목록창 초기화
		init_user_list();
		
		//키이벤트초기화
		init_key_event();
		
		//위치            x     y 
		this.setLocation(900, 200);

		//크기        W    H  
		//this.setSize(400, 300);
		pack();

		//보여주기
		this.setVisible(true);

		//종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_key_event() {
		// TODO Auto-generated method stub
		
		//익명클래스 (이름없는 무명의 객체 생성)
		KeyAdapter adapter = new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					//연결된 상태면 메세지 전송
					if(bConnect)
						send_message();
				}
			}
		};
		
		
		jtf_message.addKeyListener(adapter);
		
	}

	protected void send_message() {
		// TODO Auto-generated method stub
		String message = jtf_message.getText().trim();
		if(message.isEmpty()) {
			jtf_message.setText("");
			
			return;
		}
		
		try {
			
			//전송할 메시지 포장 :        "MSG#카카오#안녕"
			String send_data = String.format("MSG#%s#%s\n", user_name,message);
			client.getOutputStream().write(send_data.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//이전값 지우기 
		jtf_message.setText("");
		
	}

	private void init_input() {
		// TODO Auto-generated method stub
		//순13_1 (아래 패널을 사용할거야 )
		//GridLayout는 사이즈가 고정이라서
		//BorderLayout으로 사이즈를 지정할거 거든
		JPanel p = new JPanel(new BorderLayout());
		
		//순14_1(메세지 = 메세지 필드 만들어서 넣어줘)
		jtf_message = new JTextField();
		jtf_message.setFont(font);//폰트설정해줘

		//순14_2
		jbt_connect = new JButton("연결");
		jbt_connect.setFont(font);
		jbt_connect.setPreferredSize(new Dimension(120,0));
		
		//순14_3 (보여줘 위치는 여기야) 
		p.add(jtf_message,"Center");
		p.add(jbt_connect,"East");
		
		//순14_4 (이건... 뭐드라_)
		this.add(p,"South");
		
		
		//순15_1 
		//연결버튼 이벤트
		jbt_connect.addActionListener(e ->{on_button_cnnect();});
		
		
	}

	private void on_button_cnnect() {
		// TODO Auto-generated method stub
		//순15_2
		bConnect = !bConnect; // 토클
		
		if(bConnect) {
			//서버연결
			
			try {
				//순17_3 (예외처리)
				client = new Socket("localhost",8000);
				
				//메1_2 : 데이터처리
				//입장메시지 전송 : IN#대화명\n -> IN#카카오\n
				String send_data= String.format("IN#%s\n", user_name);
				//메1_3
				client.getOutputStream().write(send_data.getBytes());
				
				//메시지수신
				read_message();
				
				
				
		
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//순17_5 
				bConnect = false;
				e.printStackTrace();
			}
			
			
			
		}else {
			//끊기
			try {
				//순17_4 (예외처리)
				client.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//버튼캡션 변경
		jbt_connect.setText(bConnect ? "끊기" : "연결");
		
	}

	private void read_message() {
		// TODO Auto-generated method stub
		try {
			InputStreamReader isr = new InputStreamReader(client.getInputStream());
			br					  = new BufferedReader(isr);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//별도 쓰레드 할당 메시지 수신대기 시킨다.
		new Thread() {
			
			public void run() {
				
				while(true) {
					
					try {
						String readData = br.readLine();
						if(readData==null)break;
						
						//데이터처리
						//readData = "IN#대화명"
						//readData = "OUT#대화명"
						//String send_data = "LIST#카카오1#카카오2#카카오\n"
						String [] msg_array = readData.split("#");
						//                         0        1
						//String [] mag_array = ["IN" , "카카오"];
						//String [] mag_array = ["OUT" , "카카오"];
						//String [] mag_array = ["LIST" , "카카오"];
						
						if(msg_array[0].equals("IN")) {
							//입장시
							
							String mesaage = String.format("[%s]님 입장하셨습니다.", msg_array[1]);
							display_message(mesaage);
							
						}else if (msg_array[0].equals("OUT")) {
							//퇴장시
							String mesaage = String.format("[%s]님 퇴장하셨습니다.", msg_array[1]);
							display_message(mesaage);
						}else if (msg_array[0].equals("LIST")) {
							//접속자목록
							display_user_list(msg_array);
						}else if (msg_array[0].equals("MSG")) {
							String message = String.format("[%s]님의 말 :%s\r\n", msg_array[1],msg_array[2]);
							display_message(message);
							
						}
						
						
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
						//서버측에서 비정상종료시
						break;
					}
					
				}//end : while
			}//end : run()
		}.start();
	}//end : read_message()

	protected void display_user_list(String[] msg_array) {
		// TODO Auto-generated method stub
		//String send_data = "LIST#카카오1#카카오2#카카오\n"
		msg_array[0] ="[현재인원]";
		jlist_user.setListData(msg_array);
	}

	private void init_user_list() {
		// TODO Auto-generated method stub
		jlist_user = new JList<String>();
		
		JScrollPane jsp = new JScrollPane(jlist_user);
		
		jsp.setPreferredSize(new Dimension(120, 0));
		
		this.add(jsp, "East");
		
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
	
	private void display_message(String message) {
		// TODO Auto-generated method stub
		// (내용 올려줄꺼야)
		jta_display.append(message);
		jta_display.append("\r\n");
		
		//(항상 최근 추가된 글을 화면에 보이도록 처리...)
		int position =jta_display.getDocument().getLength();
		jta_display.setCaretPosition(position);
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MultiClient();
	}
	
	
	
	
	
	

}

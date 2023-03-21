package mymain.udp;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UDPTest_Broadcast extends JFrame {

	
	JTextArea  jta_display;//출력창
	
	JTextField jtf_address;//IP 주소창
	JTextField jtf_message;//입력창
	
	String user_name = "코난";//대화명
	
	DatagramSocket client;
	
	
	Font font = new Font("굴림체", Font.BOLD, 20);
	
	public UDPTest_Broadcast() {
		// TODO Auto-generated constructor stub
		super("Broadcast연습");

		//출력창 초기화
		init_display();
		
		//입력창 초기화
		init_input();
		
		//키이벤트 초기화
		init_key_event();
		
		//소켓초기화
		init_socket();
		
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

	private void init_socket() {
		// TODO Auto-generated method stub
		try {
			// IP vs Port
			// IP 	: 컴퓨터를 식별용도
			// Port : 컴퓨터내의 프로그램을 식별하기 위한 용도
			// 포트를 할당받아서 소켓을 생성
			// port :  0 ~ 65535번까지 사용가능
			//		   1024이하는 대부분 예약포트
			//		   ftp:21 /  telnet:23 / http:80
			client = new DatagramSocket(5000);
			
			//쓰레드 생성/구동
			//익명클레스 
			Thread t = new Thread() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					//데이터 수신대기 
					while(true) {
						
						read_message();
						
					}
				}
				
			};
			t.start();
			
			
			
			
			
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

	protected void read_message() {
		// TODO Auto-generated method stub
		
		try {
			
			byte [] read_buff = new byte[512];
			//데이터 수산에는 버퍼만 필요함
			DatagramPacket dp = new DatagramPacket(read_buff, read_buff.length);
			
			//데이터 수신
			client.receive(dp); //데이터가 수신버퍼에 들어오면 읽어온다(데이타가 없으면 대기상태)
			
			InetAddress ia = dp.getAddress();
			
			//받은데이터 읽어오기
			byte [] read_baytes =dp.getData();
			
			//byte [] String변환
			String read_data = new String(read_baytes).trim(); //read_data = "홍길동#안녕하세요"
			
			System.out.printf("[%s] : %s\n",ia.getHostAddress(), read_data);
			
			
			//대화명#메시지 분리 : split
			String [] data_array = read_data.split("#");
			//							대화명		메시지
			//String [] data_array = {"홍길동" , "안녕하세요"};
			
			
			
			
			//출력창에 출력
			String display_message = String.format("[%s]님 말씀\r\n  %s\r\n", data_array[0], data_array[1] );

			jta_display.append(display_message);
			
			//현재 텍스트의 길이를 구한다.
			int position = jta_display.getDocument().getLength();
			//Caret의 위치를 맨 마지막으로 설정
			jta_display.setCaretPosition(position);
			
			jtf_message.setText("");//입력창 지우기
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void init_key_event() {
		// TODO Auto-generated method stub
		
		//추상클래스
		KeyAdapter adapter = new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int key = e.getKeyCode();
				
				if(key == KeyEvent.VK_ENTER){
					send_message();
				}
				
			}
			
		};
		
		//메세지창에서 키가 눌리면
		jtf_message.addKeyListener(adapter);
		
		
		
		
		
	}
	//keyPressed = enter key method
	protected void send_message() {
		// TODO Auto-generated method stub
		
		//메세지창에 입력된 내용을 읽어온다. ->공백제거
		String message = jtf_message.getText().trim();
		
		if(message.isEmpty()) {
			
			jtf_message.setText("");//입력창 지우기
			
			return;
		}
		
		try {
			//전송해야될 데이터를 포장 -> 네트워크로 전송
			String send_data = String.format("%s#%s",user_name,message);
			//전송지 주소
			String ip = jtf_address.getText();
			InetAddress ia = InetAddress.getByName(ip);
			
			//DatagramPacket으로 포장
			
			//String -> byte [] 변환 
			byte [] send_bytes = send_data.getBytes();
			DatagramPacket dp = new DatagramPacket(send_bytes, send_bytes.length, ia, 5000);
			
			//전송
			client.send(dp);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//출력창 : 출력내용 테스트
		/*
		String display_message = String.format("[%s]님 말씀\r\n  %s\r\n", user_name, message );

		jta_display.append(display_message);
		
		//현재 텍스트의 길이를 구한다.
		int position = jta_display.getDocument().getLength();
		//Caret의 위치를 맨 마지막으로 설정
		jta_display.setCaretPosition(position);
		
		jtf_message.setText("");//입력창 지우기
		*/
		
		
	}

	private void init_input() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel(new GridLayout(2, 1));
		
		//주소창
		jtf_address = new JTextField("255.255.255.255");
		//메세시창
		jtf_message = new JTextField();
		
		p.add(jtf_address);
		p.add(jtf_message);
		
		//폰트적용
		jtf_address.setFont(font);
		jtf_message.setFont(font);
		
		
		this.add(p,"South");

	}

	private void init_display() {
		// TODO Auto-generated method stub
		jta_display = new JTextArea();
		
		JScrollPane jsp = new JScrollPane(jta_display);
		
		jsp.setPreferredSize(new Dimension(400, 400));
		
		this.add(jsp);//Center
		
		//폰트지정
		jta_display.setFont(font);
		
		//읽기전용
		jta_display.setEditable(false);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UDPTest_Broadcast();
	}

}

package mymain.udp;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UDPTest_Multicast_t extends JFrame {

	
	JTextArea  jta_display;//출력창
	
	JTextField jtf_address;//IP 주소창
	JTextField jtf_message;//입력창
	
	
	JList<String> jlist_join;//가입목록 보여줄 컴포넌트
	List<String>  join_list = new ArrayList<String>();//데이터가 저장
	
	
	String user_name = "홍길동";//대화명
	
	MulticastSocket client;
	
	
	
	Font font = new Font("굴림체", Font.BOLD, 16);
	
	public UDPTest_Multicast_t() {
		// TODO Auto-generated constructor stub
		super("Multicast 연습");

		//출력창 초기화
		init_display();
		
		//입력창 초기화
		init_input();
		
		//가입목록창 초기화
		init_join_list();
		
		
		
		//키이벤트 초기화
		init_key_event();
		
		//소켓초기화
		init_socket();
		
		
		
		
		//위치            x     y 
		this.setLocation(900, 100);

		//크기        W    H  
		//this.setSize(400, 300);
		pack();

		//보여주기
		this.setVisible(true);

		//종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_join_list() {
		// TODO Auto-generated method stub
		
		
		jlist_join = new JList<String>();
		
		jlist_join.setPreferredSize(new Dimension(120, 0));
		
		this.add(jlist_join,"East");
		
		jlist_join.setFont(font);
		
		/*
		 * String [] addr = {"224.0.0.1","224.0.0.2","224.0.0.3"};
		 * jlist_join.setListData(addr);
		 */
		
	}

	private void init_socket() {
		// TODO Auto-generated method stub
		
		try {
			
			// IP vs Port
			// IP   : 컴퓨터를 식별용도
			// Port : 컴퓨터내의 프로그램을 식별하기 위한 용도
			//포트를  할당받아서 소켓을 생성
			//port : 0~65535번까지 사용가능
			//       1024이하는 대부분 예약포트  
			//       ftp : 21  telnet : 23    http: 80  
			
			client = new MulticastSocket(6000);
			
			
			//쓰레드 생성/구동
			Thread t = new Thread() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					//데이터 수신대기
					while(true) {
						
						//데이터 수신대기->처리
						read_message();
						
					}
				}
			};
			
			t.start();
				
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	protected void read_message() {
		// TODO Auto-generated method stub
		
		try {
			
			byte [] read_buff = new byte[512];
			//데이터 수신시에는 버퍼만 필요함
			DatagramPacket dp = new DatagramPacket(read_buff, read_buff.length);
			
			//데이터 수신
			client.receive(dp); //데이터가 수신버퍼에 들어오면 읽어온다(데이터가 없으면 대기상태)
			
			//전송자 주소
			InetAddress ia = dp.getAddress();
			
			
			//받은데이터 읽어오기
			byte [] read_bytes = dp.getData();
			
			//byte[] -> String변환
			String read_data = new String(read_bytes).trim(); // read_data="홍길동#안녕하세요"
			
			//모니터링
			System.out.printf("[%s] : %s\n", ia.getHostAddress(), read_data);
			
			
			//대화명#메시지 분리: split
			String [] data_array = read_data.split("#");
			//                          대화명       메시지
			//                            0             1
			//String [] data_array = { "홍길동" , "안녕하세요"};
			
			//출력창에 출력
			
			String display_message = String.format("[%s]님 말씀:\r\n  %s\r\n",
			                                       data_array[0],   data_array[1]   
			);
			jta_display.append(display_message);
			
			//현재 텍스트의 길이를 구한다
			int position = jta_display.getDocument().getLength();
			//Caret의 위치를 맨 마지막으로 설정
			jta_display.setCaretPosition(position);
			 
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private void init_key_event() {
		// TODO Auto-generated method stub
		
		KeyAdapter adapter = new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int key = e.getKeyCode();
				
				if(key == KeyEvent.VK_ENTER) {
					send_message();
				}
				
			}
		};
		
		//키이벤트 등록
		jtf_message.addKeyListener(adapter);
		
	}

	protected void send_message() {
		// TODO Auto-generated method stub
		
		//메시지창에 입력된 내용을 읽어온다 -> 공백제거
		String message = jtf_message.getText().trim();
		
		if(message.isEmpty()) {
			jtf_message.setText("");//입력창 지우기
			return;
		}
		
		try {
			
			//전송해야될 데이터를 포장-> 네트워크로 전송
			//     send_data = "홍길동#안녕하세요"            
			String send_data = String.format("%s#%s", user_name, message);
			//전송지 주소
			String ip = jtf_address.getText();
			InetAddress  ia = InetAddress.getByName(ip);
			
			//DatagramPacket으로 포장
			
			//String -> byte [] 변환
			byte [] send_bytes = send_data.getBytes();
			DatagramPacket dp = new DatagramPacket(send_bytes, send_bytes.length, ia, 6000);
					
			//전송
			client.send(dp);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//출력창 : 출력내용 테스트
		/*
		String display_message = String.format("[%s]님 말씀:\r\n  %s\r\n",
				                             user_name,          message    
				);
		jta_display.append(display_message);
		
		//현재 텍스트의 길이를 구한다
		int position = jta_display.getDocument().getLength();
		//Caret의 위치를 맨 마지막으로 설정
		jta_display.setCaretPosition(position);
		*/
		
		
		jtf_message.setText("");//입력창 지우기
	}

	private void init_input() {
		// TODO Auto-generated method stub
		JPanel  p = new JPanel(new GridLayout(4, 1));
		
		//1번째줄 : 주소창
		jtf_address = new JTextField("224.0.0.1"); //multicast주소
		
		//2번째줄 : 부서버튼4개
		// 총무부:224.0.0.1  인사부:224.0.0.2  경리부:224.0.0.3  영업부:224.0.0.4
		JPanel p2 = new JPanel(new GridLayout(1, 5));
		JButton jbt_dept1 = new JButton("총무부");
		JButton jbt_dept2 = new JButton("인사부");
		JButton jbt_dept3 = new JButton("경리부");
		JButton jbt_dept4 = new JButton("영업부");
		JButton jbt_dept5 = new JButton("전체");
		
		p2.add(jbt_dept1);
		p2.add(jbt_dept2);
		p2.add(jbt_dept3);
		p2.add(jbt_dept4);
		p2.add(jbt_dept5);
			
		//각부서버튼 클릭시
		jbt_dept1.addActionListener( e->{ jtf_address.setText("224.0.0.1");  });
		jbt_dept2.addActionListener( e->{ jtf_address.setText("224.0.0.2");  });
		jbt_dept3.addActionListener( e->{ jtf_address.setText("224.0.0.3");  });
		jbt_dept4.addActionListener( e->{ jtf_address.setText("224.0.0.4");  });
		jbt_dept5.addActionListener( e->{ jtf_address.setText("255.255.255.255");  });
		//jtf_address.setText("224.0.0.1");
		
		
		
		//3번째줄 : 버튼2개
		JPanel p1 = new JPanel(new GridLayout(1, 2));
		JButton jbt_join  = new JButton("가입");
		JButton jbt_leave = new JButton("탈퇴");
		
		jbt_join.setFont(font);
		jbt_leave.setFont(font);
		
		p1.add(jbt_join);
		p1.add(jbt_leave);
		
		
		
		//버튼이벤트
		//  lambda식
		jbt_join.addActionListener( e->{ on_button_join(); });
		
		//  Anoymous로 처리
		jbt_leave.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				on_button_leave();
			}
		} );
		
		
		
		//메시지창
		jtf_message = new JTextField();
		
		p.add(jtf_address);
		p.add(p2);
		p.add(p1);
		p.add(jtf_message);
		
		//폰트적용
		jtf_address.setFont(font);
		jtf_message.setFont(font);
		
		this.add(p,"South");
	}

	
	// on_xxxx() : callback메소드(자동호출되는 함수)
	private void on_button_leave() {
		// TODO Auto-generated method stub
		
		//JList목록중에서 선택값 얻어오기
		String ip = jlist_join.getSelectedValue();
		if(ip==null) {
			
			JOptionPane.showMessageDialog(this, "탈퇴할 그룹주소를 선택하세요!!");
			return;
		}
		
		//System.out.println(ip);
		try {
			

			//탈퇴여부 확인                                        message              title     button종류
			int result = JOptionPane.showConfirmDialog(this, "정말 탈퇴하시겠습니까?","그룹탈퇴", JOptionPane.YES_NO_OPTION);
			
			//System.out.println(result);
			
			if(result != JOptionPane.YES_OPTION) return;
			
			
			InetAddress ia = InetAddress.getByName(ip);
			client.leaveGroup(ia);//탈퇴
			//join_list에서 ip값 제거
			join_list.remove(ip);
			show_join_list();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
	}

	private void on_button_join() {
		// TODO Auto-generated method stub
		//가입할 주소 읽어오기
		String ip = jtf_address.getText().trim();
		
		if(ip.isEmpty()) {
			
			JOptionPane.showMessageDialog(this, "가입할 주소를 입력하세요!!");
			jtf_address.setText("");//이전값 지우기
			jtf_address.requestFocus();
			return;
		}
		
		
		try {
			
			if(join_list.contains(ip)) {
				JOptionPane.showMessageDialog(this, "이미 가입된 주소입니다!!");
				return;
			}
			
			
			//ip->InetAddress
			InetAddress ia = InetAddress.getByName(ip);// "224.0.0.1"->InetAddress
			client.joinGroup(ia);//그룹가입
			
			join_list.add(ip);//가입주소를 저장
			
			show_join_list();//가입목록 보여주기
					
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		
	}

	private void show_join_list() {
		// TODO Auto-generated method stub
		//ArrayList -> Array형식의 데이터를 추출
		String []  join_array = new String[join_list.size()];
		join_list.toArray(join_array);
		
		jlist_join.setListData(join_array);
		
		
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
		new UDPTest_Multicast();
	}

}

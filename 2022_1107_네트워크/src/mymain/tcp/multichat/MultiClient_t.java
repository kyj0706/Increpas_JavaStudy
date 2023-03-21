package mymain.tcp.multichat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiClient_t extends JFrame {

	
	
	JTextArea  jta_display;
	JList<String> jlist_user;
	
	JTextField jtf_message;
	JButton    jbt_connect;
	
	boolean bConnect = false;//연결상태
	
	Socket  client;
	BufferedReader br;
	String  user_name = "카카오";
	
	
	//그림판정보
	JPanel grimPan;  //화면상 그림판
	Image  memPan;   //메모리상 그림판
	
	int   line_thick = 5;//선굵기
	Color line_color = Color.blue;//선색상
	
		
	
	Font font = new Font("굴림체", Font.BOLD, 16);
	
	public MultiClient_t() {
		// TODO Auto-generated constructor stub
		super("멀티 클라이언트");

		//출력창 초기화
		init_display();
		
		//메시지창 초기화
		init_input();
		
		//그림판 초기화
		init_grimpan();
		
		//마우스 이벤트
		init_mouse_event();
		
		//접속자 목록창 초기화
		init_user_list();
		
		//키이벤트 초기화
		init_key_event();
		
		//위치            x     y 
		this.setLocation(600, 100);

		//크기        W    H  
		//this.setSize(400, 300);
		pack();

		//크기조절불가
		setResizable(false);
		//보여주기
		this.setVisible(true);

		//종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//그림판과 호환되는 메모리상 그림판생성
		//주의) 화면상의 그림판이 화면상에 완벽하게 보겨진후에 작업을 해야된다
		memPan = grimPan.createImage(400, 400);
		
		
		
		

	}

	private void init_mouse_event() {
		// TODO Auto-generated method stub
		MouseAdapter adapter = new MouseAdapter() {

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				//super.mouseDragged(e);
				
				//연결되어있지 않으면 끝내라
				if(bConnect==false) return;
							
				
				//마우스의 위치
				Point pt = e.getPoint();
				
				
				
				try {
					
					//네트워크로 그리기정보 전송
					// 전송패킷 :  "DRAW#x#y#thick#color\n"
					int color = line_color.getRGB();
					String send_data = String.format("DRAW#%d#%d#%d#%d\n", 
							                            pt.x, pt.y, line_thick,color    
							);
					client.getOutputStream().write(send_data.getBytes());
					
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
				
				//메모리그림판에 그리기 도구를 얻어온다
				/*
				Graphics g = memPan.getGraphics();
				g.setColor(line_color);
				g.fillOval(pt.x - line_thick/2 , pt.y - line_thick/2, line_thick, line_thick);
				grimPan.repaint();//grimPan-> paintComponent(g) 간접호출
				*/
			}
			
		};
		
		
		grimPan.addMouseMotionListener(adapter);
	}

	private void init_grimpan() {
		// TODO Auto-generated method stub
		
		grimPan = new JPanel() {
			
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				//super.paintComponent(g);
				//메모리 그림판 내용을 복사해온다
				
				g.drawImage(memPan, 0, 0, this);
				
				
			}
		};
		
		grimPan.setPreferredSize(new Dimension(400, 400));
		
		this.add(grimPan, "West");
				
	}

	private void init_key_event() {
		// TODO Auto-generated method stub
		
		KeyAdapter adapter = new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					//연결된 상태면 메시지 전송
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
			
			//전송할 메시지 포장:  "MSG#홍길동#안녕하세요\n"
			String send_data = String.format("MSG#%s#%s\n", user_name, message);
			client.getOutputStream().write(send_data.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//이전 입력값 지우기
		jtf_message.setText("");
	}

	private void init_input() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel(new BorderLayout());
		
		jtf_message = new JTextField();
		jtf_message.setFont(font);
		
		jbt_connect = new JButton("연결");
		jbt_connect.setFont(font);
		jbt_connect.setPreferredSize(new Dimension(120, 0));
		
		
		//그림판 메뉴
		JPanel p1 = new JPanel(new GridLayout(1, 3));
		p1.setPreferredSize(new Dimension(400, 0));
		
		//1.선굵기
		Integer [] thick_array = { 5,10,15,20,25,30,35,40,45,50 };
		JComboBox<Integer> jcb_line_thick = new JComboBox<Integer>(thick_array);
		jcb_line_thick.setFont(font);
		p1.add(jcb_line_thick);
		
		//2.선색상
		JButton jbt_line_color = new JButton("선색상");
		jbt_line_color.setFont(font);
		p1.add(jbt_line_color);
		
		//3.지우기
		JButton jbt_clear = new JButton("지우기");
		jbt_clear.setFont(font);
		p1.add(jbt_clear);
		
		
		p.add(jtf_message, "Center");
		p.add(jbt_connect , "East");
		p.add(p1,"West");
		
		this.add(p,"South");
		
		
		//연결버튼 이벤트
		jbt_connect.addActionListener( e->{  on_button_connect();  });
		
		//그리기메뉴 이벤트
		jbt_line_color.addActionListener( e->{ on_button_line_color();  });
		jbt_clear.addActionListener( e->{ on_button_clear();  });
		
		//콤보박스
		jcb_line_thick.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				//System.out.println(e);
				//Change된상태값이 선택이면...
				if(e.getStateChange() == ItemEvent.SELECTED) 
				{
					line_thick = (int) jcb_line_thick.getSelectedItem();
					//System.out.println(line_thick);
				}
				
			}
		});
		
		
	}

	private void on_button_clear() {
		// TODO Auto-generated method stub
		//메모리상의 그림판을 지우기
		Graphics g = memPan.getGraphics();
		
		g.clearRect(0, 0, 400, 400);
		
		grimPan.repaint();
		
		
	}

	private void on_button_line_color() {
		// TODO Auto-generated method stub
		
		Color color = JColorChooser.showDialog(this, "선색상을 선택하세요", line_color);
		
		//System.out.println(color);
		
		//색상선택후 확인버튼클릭시
		if(color!=null)
			line_color = color;
		
	}

	private void on_button_connect() {
		// TODO Auto-generated method stub
		//Toggle처리
		bConnect  = !bConnect;
		
		if(bConnect) {
			//서버연결
			
			try {
				
				//client = new Socket("localhost", 8000);
				client = new Socket("192.168.0.23", 8000);
				
				//입장메시지 전송 : IN#대화명\n -> "IN#홍길동\n"
				String send_data = String.format("IN#%s\n", user_name);
				client.getOutputStream().write(send_data.getBytes());
											
				//메시지 수신
				read_message();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				bConnect = false;
				e.printStackTrace();
			}
			
			
		}else {
			//끊기
			
			try {
				
				client.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		//버튼 캡션 변경
		jbt_connect.setText(bConnect ? "끊기" : "연결");
		
		
		
	}

	private void read_message() {
		// TODO Auto-generated method stub
		
		
	    try {
			InputStreamReader isr = new InputStreamReader(client.getInputStream());
			br                    = new BufferedReader(isr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    //별도 쓰레드 할당 메시지 수신대기 시킨다
	    new Thread() {
	    	
	    	public void run() {
	    		
	    		while(true) {
                   
	    			try {
						String readData = br.readLine();
						if(readData==null)break;
						
						
						//데이터처리
						//readData = "IN#대화명"
						//readData = "OUT#대화명"
						//readData = "LIST#길동1#길동2#길동3#"
						//readData = "MSG#홍길동#안녕하세요"
						//readData = "DRAW#10#20#15#-1"
						
						
						String [] msg_array = readData.split("#");
						//                          0          1 
						// String [] msg_array = { "IN"   , "홍길동" };
						// String [] msg_array = { "OUT"  , "홍길동" };
						// String [] msg_array = { "LIST" , "길동1"  , "길동2" , "길동3"  };
						// String [] msg_array = { "MSG"  , "홍길동" , "안녕하세요" };
						
						//                           0        1     2      3       4 
						// String [] msg_array = { "DRAW"  ,"10" , "20"  ,"15"  , "-1" };
						 
						if(msg_array[0].equals("IN")) {
							//입장시
							
							String message = String.format("[%s]님 입장하셨습니다", msg_array[1]);
							display_message(message);
							
						}else if(msg_array[0].equals("OUT")) {
							
							//퇴장시
							String message = String.format("[%s]님 퇴장하셨습니다", msg_array[1]);
							display_message(message);
							
						}else if(msg_array[0].equals("LIST")) {
							
							// String [] msg_array  = { "LIST"  , "길동1" , "길동2" , "길동3"  };
							// String [] user_array = { "길동1" , "길동2" , "길동3"  };
							String [] user_array = new String[msg_array.length-1];
							
							System.arraycopy(msg_array, 1, user_array, 0, user_array.length);
							
							//접속자 목록
							display_user_list(user_array);
							
						}else if(msg_array[0].equals("MSG")) {
							
							String message = String.format("[%s]님 말씀:\r\n   %s", msg_array[1], msg_array[2]);
							
							display_message(message);
							
						}else if(msg_array[0].equals("DRAW")) {
							//                                   x      y    thick    color  
							//                          0        1      2      3       4 
							// String [] msg_array = { "DRAW"  ,"10" , "20"  ,"15"  , "-1" };
							// 여기서 네트워크로 들어온 정보를 이용해서 그리기...
							
							int x = 0;
							int y = 0;
							int thick=0;
							int color=-1;
							
							
							try {
								
								x     = Integer.parseInt(msg_array[1]);
								y     = Integer.parseInt(msg_array[2]);
								thick = Integer.parseInt(msg_array[3]);
								color = Integer.parseInt(msg_array[4]);
								
								//그리기
								Color c = new Color(color);
								
								Graphics g = memPan.getGraphics();
								g.setColor(c);;
								g.fillOval(x-thick/2, y-thick/2, thick, thick);
								
								grimPan.repaint();
								
								
							} catch (NumberFormatException e) {
								// TODO Auto-generated catch block
								//e.printStackTrace();
							}
							
							
						}
						
						
						
						
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
						//서버측에서 비정상종료시
						break;
					}
	    			
	    		}//end-while
	    		
	    		//###마무리처리###
	    		
	    		//1.연결상태 : 비연결
	    		bConnect = false;
	    		//2.연결버튼 캡션변경
	    		jbt_connect.setText("연결");
	    		//3.접속자목록 초기화(모두지우기)
	    		display_user_list(new String[0]);
	    		
	    		
	    		
	    		
	    		
	    		
	    	}//end-run()
	    	
	    }.start();
	    
	    
	    
	}

	protected void display_user_list(String[] msg_array) {
		// TODO Auto-generated method stub
		//String [] msg_array = { "LIST" , "길동1"  , "길동2" , "길동3"  };
		//msg_array[0] ="==[접속자목록]==";
		
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
		jta_display.append(message);
		jta_display.append("\r\n");
		
		//항상 최근추가된 글을 화면에 보이도록 처리...
		int position = jta_display.getDocument().getLength();
		jta_display.setCaretPosition(position);
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MultiClient_t();
	}

}

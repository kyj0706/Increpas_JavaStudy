package mymain;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class 공굴리기 extends JFrame {

	//그림판의 크기
	public static final int GRIMEPAN_W = 600;
	public static final int GRIMEPAN_H = 400;
	
	
	JPanel grimPan;
	
	//공의 정보
	int ball_radius=20;
	int ball_x = GRIMEPAN_W / 2;
	int ball_y = GRIMEPAN_H / 2;
	
	Color ball_color = Color.RED;
	
	//공의 방향정보
	boolean bRight = true; //좌우
	boolean bDown  = true; //상하
	int     gan    =  5;   //이동간격  
	
	
	Timer timer = null;
		
	public 공굴리기() {
		// TODO Auto-generated constructor stub
		super("공굴리기연습");

		//그림판 초기화
		init_grimpan();
		
		//타이머 초기화
		init_timer();
		
		//키보드이벤트 초기화
		init_key_event();
		
		//위치            x     y 
		this.setLocation(300, 200);

		//크기        W    H  
		//this.setSize(400, 300);
		
        //자식윈도우를 프레임이 감싼다		
		pack();
		
        //크기조절불가
		this.setResizable(false);
		
		//보여주기
		this.setVisible(true);

		//종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_key_event() {
		// TODO Auto-generated method stub
		
		//KeyAdapter는 KeyListener내의 추상메소드를 이미 재정의 해놓은 클래스
		KeyAdapter adapter = new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				//super.keyPressed(e);
				
				//System.out.println(e);	
				
				//눌린 키값
				int key = e.getKeyCode();
				
				//Virtual Key 상수선언 : VK_ 
				//방향키 : VK_LEFT VK_UP VK_RIGHT VK_DOWN
				//+ / -  : VK_ADD VK_SUBTRACT
				//알파벳 : VK_A  ~ VK_Z
				
				//좌우
//				if(key==KeyEvent.VK_LEFT) {
//					bRight = false;
//				}else if (key == KeyEvent.VK_RIGHT) {
//					bRight=true;	
//				}
//				
//				//위아래
//				if(key==KeyEvent.VK_UP) {	
//					bDown = false;
//				}else if (key == KeyEvent.VK_DOWN) {
//					bDown=true;	
//				}
				
				//커져작아져
//				if(key==KeyEvent.VK_ADD) {	
//					ball_radius+=5 ;
//				}else if (key == KeyEvent.VK_SUBTRACT) {
//					ball_radius-=5;	
//				}
				
				//색깔아 변해라
//				if(key==KeyEvent.VK_LEFT) {
//					bRight = false;
//					ball_color = Color.RED;
//				}else if (key == KeyEvent.VK_RIGHT) {
//					bRight=true;
//					ball_color = Color.green;
//				}else if (key == KeyEvent.VK_UP) {
//					bDown = false;
//					ball_color = Color.BLUE;
//				}else if (key == KeyEvent.VK_DOWN) {
//					bDown=true;	
//					ball_color = Color.black;
//					
//				}
				
				switch (key) {
				case KeyEvent.VK_LEFT:
					bRight = false;
					break;
				case KeyEvent.VK_RIGHT:
					bRight = true;
					break;
				case KeyEvent.VK_UP:
					bDown = false;
					break;
				case KeyEvent.VK_DOWN:
					bDown = true;
					break;
				case KeyEvent.VK_ADD:
					ball_radius+=5 ;
					break;
				case KeyEvent.VK_SUBTRACT:
					ball_radius-=5;
					break;
				case KeyEvent.VK_SHIFT:
					ball_radius=20;
					break;
					
					
					
				case KeyEvent.VK_R:
					ball_color = Color.RED;
					break;
				case KeyEvent.VK_G:
					ball_color = Color.green;
					break;
				case KeyEvent.VK_B:
					ball_color = Color.BLUE;
					break;
				
				

				default:
					break;
				}
				
				
			}
			
		};
		
		this.addKeyListener(adapter);
		
	}

	private void init_timer() {
		// TODO Auto-generated method stub
		
		//timer이벤트를 처리하기 위한 ActionListener의 익명객체 생성
		ActionListener timer_listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("---");
				
				process();
				
				grimPan.repaint();//paintComponent 간접호출
				
				
			}
		};
		
		//                1/1000  이벤트처리(호출)객체  
		timer = new Timer(  10  , timer_listener);
		
		//타이머 구동
		timer.start();
		
	}

	protected void process() {
		// TODO Auto-generated method stub
		
		//공움직이기
		move_ball();
		
		
		
	}

	private void move_ball() {
		// TODO Auto-generated method stub
		
		//좌우이동
		if(bRight)
			ball_x = ball_x + gan;
		else
			ball_x = ball_x - gan;
		
		//상하이동
		if(bDown)
			ball_y = ball_y + gan;
		else
			ball_y = ball_y - gan;
		
				
		
		
		
		//우측벽에 닿았냐?
		if( (ball_x + ball_radius) > GRIMEPAN_W ) {
			
			//공을 오른쪽벽에 붙인다
			ball_x = GRIMEPAN_W - ball_radius;
			
			bRight = false;
		}else if( (ball_x - ball_radius) < 0 ) { //왼쪽벽에 닿았냐?
			
			//공을 왼쪽벽에 붙인다
			ball_x = ball_radius;
			
			bRight = true;
		}
		
		//아래벽에 닿아았으면
		if( (ball_y+ball_radius) > GRIMEPAN_H) {
			
			ball_y = GRIMEPAN_H - ball_radius;
			bDown = false;
			
		}else if( (ball_y-ball_radius) < 0 ) {
			
			ball_y = ball_radius;
			
			bDown = true;
		}
		
		
		
		
	}

	private void init_grimpan() {
		// TODO Auto-generated method stub
		
		//객체생성과 동시에 재정의하면 익명클래스
		grimPan = new JPanel() {
			
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				//super.paintComponent(g);
				
				//이전화면 지우기
				g.clearRect(0, 0, GRIMEPAN_W, GRIMEPAN_H);
				
				
				//공그리기
				g.setColor(ball_color);
				
				g.fillOval(ball_x - ball_radius, 
						   ball_y - ball_radius, 
						   ball_radius*2, 
						   ball_radius*2);
				
			}
			
		};
		
		//그림판 크기 지정
		grimPan.setPreferredSize(new Dimension(GRIMEPAN_W, GRIMEPAN_H));
		
		this.add(grimPan);//BorderLayout시 위치생략하면 기본 Center
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 공굴리기();
	}

}

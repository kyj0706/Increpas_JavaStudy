package mymain;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class _02_ThreadTest2 extends JFrame {

	
	JProgressBar jpb_red;
	JProgressBar jpb_green;
	JProgressBar jpb_blue;
	
	//각쓰레드의 구동상태정보
	boolean bRedRunning   = true;
	boolean bGreenRunning = true;
	boolean bBlueRunning  = true;
	
	Thread t_red,t_green,t_blue;
	
	
	//Red를 진행시킬 쓰레드 선언
	class RedThread extends Thread
	{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true) {
				
				//현재진행된 값 얻어오기
				int val = jpb_red.getValue();
				
				val++;
				
				//현재값이 최대값보다 크면
				if(val > jpb_red.getMaximum()) val = 0;
				
				jpb_red.setValue(val);
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}//end-while
		}//end-run
	}//end-RedThread
	
	
	//Green를 진행시킬 쓰레드 선언
	class GreenThread extends Thread
	{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true) {
				
				//현재진행된 값 얻어오기
				int val = jpb_green.getValue();
				
				val+=2;
				
				//현재값이 최대값보다 크면
				if(val > jpb_green.getMaximum()) val = 0;
				
				jpb_green.setValue(val);
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}//end-while
		}//end-run
	}//end-GreenThread
	
	
	//Green를 진행시킬 쓰레드 선언
	class BlueThread extends Thread
	{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true) {
				
				//현재진행된 값 얻어오기
				int val = jpb_blue.getValue();
				
				val+=3;
				
				//현재값이 최대값보다 크면
				if(val > jpb_blue.getMaximum()) val = 0;
				
				jpb_blue.setValue(val);
				
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}//end-while
		}//end-run
	}//end-BlueThread
	
	
	public _02_ThreadTest2() {
		// TODO Auto-generated constructor stub
		super("쓰레드연습");
		
		// 배치방법 변경
		this.setLayout(new GridLayout(3, 1));
		
		
		//프로그레스바 생성
		jpb_red = new JProgressBar();//수평 0~100범위
		jpb_red.setForeground(Color.red);
		jpb_red.setValue(10);
		
		jpb_green = new JProgressBar();
		jpb_green.setForeground(Color.green);
		jpb_green.setValue(30);
		
		jpb_blue = new JProgressBar();
		jpb_blue.setForeground(Color.blue);
		jpb_blue.setValue(50);
		
		//추가
		this.add(jpb_red);
		this.add(jpb_green);
		this.add(jpb_blue);
		
		
		//Thread생성 및 구동
		t_red = new RedThread();
		t_red.start();
		
		t_green = new GreenThread();
		t_green.start();
		
		t_blue = new BlueThread();
		t_blue.start();
		
		//키보드 이벤트 초기화
		init_key_event();
		
		

		//위치            x     y 
		this.setLocation(300, 200);

		//크기        W    H  
		this.setSize(400, 150);

		//보여주기
		this.setVisible(true);

		//종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_key_event() {
		// TODO Auto-generated method stub
		KeyAdapter adapter = new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				//눌린키값 얻어오기
				int key = e.getKeyCode();
				
				// R  G  B
				if(key == KeyEvent.VK_1) {
					
					//Toggle방식 : true<->false
					bRedRunning = !bRedRunning;
					
					if(bRedRunning) {
						//재가동
						t_red.resume();//재개
					}else {
						//대기
						t_red.suspend();//
					}
					
				}else if(key == KeyEvent.VK_2) {
					
					//Toggle방식 : true<->false
					bGreenRunning = !bGreenRunning;
					
					if(bGreenRunning) {
						//재가동
						t_green.resume();//재개
					}else {
						//대기
						t_green.suspend();//
					}
					
					
				}else if(key == KeyEvent.VK_3) {
					
					//Toggle방식 : true<->false
					bBlueRunning = !bBlueRunning;
					
					if(bBlueRunning) {
						//재가동
						t_blue.resume();//재개
					}else {
						//대기
						t_blue.suspend();//
					}
					
					
				}
				
				
				
				
			}
		};
		
		
		this.addKeyListener(adapter);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _02_ThreadTest2();
	}

}

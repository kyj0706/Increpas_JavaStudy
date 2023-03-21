package mymain;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _03_Thread_Block_Sync extends JFrame {

	JButton  jbt_red;
	JButton  jbt_yellow;
	JButton  jbt_blue;
	
	Thread t_red;
	Thread t_yellow;
	Thread t_blue;
	
	//동기화 관리객체로 사용
	Object syncObj = new Object();
	
//--신호등을 켜는 Runnable객체를 선언(내부클래스)
	class SignalRunnable extends Object implements Runnable
	{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			String name = Thread.currentThread().getName();
			//System.out.println(name);
			while(true) {
				
				if(name.equals("R")) {
					
					
					synchronized (syncObj) 
					{
						jbt_red.setBackground(Color.red);
						jbt_yellow.setBackground(Color.gray);
						jbt_blue.setBackground(Color.gray);
						
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					
				}else if(name.equals("Y")) {
					
					synchronized (syncObj) 
					{
						jbt_red.setBackground(Color.gray);
						jbt_yellow.setBackground(Color.yellow);
						jbt_blue.setBackground(Color.gray);
						
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				}else if(name.equals("B")) {
					
					synchronized (syncObj) 
					{
						jbt_red.setBackground(Color.gray);
						jbt_yellow.setBackground(Color.gray);
						jbt_blue.setBackground(Color.blue);
						
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				
				
			}//end-while
			
		}//end-run
		
	}
	
	
	
	
	public _03_Thread_Block_Sync() {
		// TODO Auto-generated constructor stub
		super("쓰레드 동기화");
		
		//배치방법 변경
		this.setLayout(new GridLayout(1, 3));
		
		//신호등 버튼 생성 배치
		jbt_red = new JButton();
		jbt_red.setBackground(Color.red);
		
		jbt_yellow = new JButton();
		jbt_yellow.setBackground(Color.yellow);
		
		jbt_blue = new JButton();
		jbt_blue.setBackground(Color.blue);
		
		
		//추가
		this.add(jbt_red);
		this.add(jbt_yellow);
		this.add(jbt_blue);
		
		
		//각 신호등를 켜는 쓰레드 생성/동작
		Runnable r = new SignalRunnable();
		
		t_red    = new Thread(r, "R");
		t_yellow = new Thread(r, "Y");
		t_blue   = new Thread(r, "B");
		
		//구동
		t_red.start();
		t_yellow.start();
		t_blue.start();
		
		//위치            x     y 
		this.setLocation(300, 200);

		//크기        W    H  
		this.setSize(300, 125);

		//보여주기
		this.setVisible(true);

		//종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _03_Thread_Block_Sync();
	}

}

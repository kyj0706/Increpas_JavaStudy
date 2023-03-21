package mymain;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _04_Thread_Method_Sync extends JFrame {

	JButton  jbt_red;
	JButton  jbt_yellow;
	JButton  jbt_blue;
	
	Thread t_red;
	Thread t_yellow;
	Thread t_blue;
	
	
//--��ȣ���� �Ѵ� Runnable��ü�� ����(����Ŭ����)
	class SignalRunnable extends Object implements Runnable
	{
		
		//�޼ҵ� ������ ����ȭ ��� ( �������)
		synchronized void redOn() {
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
		
		synchronized void yellowOn() {
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
		
		synchronized void blueOn() {
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
		
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			String name = Thread.currentThread().getName();
			//System.out.println(name);
			while(true) {
				
				if(name.equals("R")) {
					
					redOn();
					
				}else if(name.equals("Y")) {
					
					yellowOn();
					
				}else if(name.equals("B")) {
					
					blueOn();
					
				}
				
				
			}//end-while
			
		}//end-run
		
	}
	
	
	
	
	public _04_Thread_Method_Sync() {
		// TODO Auto-generated constructor stub
		super("������ ����ȭ");
		
		//��ġ��� ����
		this.setLayout(new GridLayout(1, 3));
		
		//��ȣ�� ��ư ���� ��ġ
		jbt_red = new JButton();
		jbt_red.setBackground(Color.red);
		
		jbt_yellow = new JButton();
		jbt_yellow.setBackground(Color.yellow);
		
		jbt_blue = new JButton();
		jbt_blue.setBackground(Color.blue);
		
		
		//�߰�
		this.add(jbt_red);
		this.add(jbt_yellow);
		this.add(jbt_blue);
		
		
		//�� ��ȣ� �Ѵ� ������ ����/����
		Runnable r = new SignalRunnable();
		
		t_red    = new Thread(r, "R");
		t_yellow = new Thread(r, "Y");
		t_blue   = new Thread(r, "B");
		
		//����
		t_red.start();
		t_yellow.start();
		t_blue.start();
		
		//��ġ            x     y 
		this.setLocation(300, 200);

		//ũ��        W    H  
		this.setSize(300, 125);

		//�����ֱ�
		this.setVisible(true);

		//����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new _04_Thread_Method_Sync();
	}

}

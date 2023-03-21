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
	
	//���������� ������������
	boolean bRedRunning   = true;
	boolean bGreenRunning = true;
	boolean bBlueRunning  = true;
	
	Thread t_red,t_green,t_blue;
	
	
	//Red�� �����ų ������ ����
	class RedThread extends Thread
	{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true) {
				
				//��������� �� ������
				int val = jpb_red.getValue();
				
				val++;
				
				//���簪�� �ִ밪���� ũ��
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
	
	
	//Green�� �����ų ������ ����
	class GreenThread extends Thread
	{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true) {
				
				//��������� �� ������
				int val = jpb_green.getValue();
				
				val+=2;
				
				//���簪�� �ִ밪���� ũ��
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
	
	
	//Green�� �����ų ������ ����
	class BlueThread extends Thread
	{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true) {
				
				//��������� �� ������
				int val = jpb_blue.getValue();
				
				val+=3;
				
				//���簪�� �ִ밪���� ũ��
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
		super("�����忬��");
		
		// ��ġ��� ����
		this.setLayout(new GridLayout(3, 1));
		
		
		//���α׷����� ����
		jpb_red = new JProgressBar();//���� 0~100����
		jpb_red.setForeground(Color.red);
		jpb_red.setValue(10);
		
		jpb_green = new JProgressBar();
		jpb_green.setForeground(Color.green);
		jpb_green.setValue(30);
		
		jpb_blue = new JProgressBar();
		jpb_blue.setForeground(Color.blue);
		jpb_blue.setValue(50);
		
		//�߰�
		this.add(jpb_red);
		this.add(jpb_green);
		this.add(jpb_blue);
		
		
		//Thread���� �� ����
		t_red = new RedThread();
		t_red.start();
		
		t_green = new GreenThread();
		t_green.start();
		
		t_blue = new BlueThread();
		t_blue.start();
		
		//Ű���� �̺�Ʈ �ʱ�ȭ
		init_key_event();
		
		

		//��ġ            x     y 
		this.setLocation(300, 200);

		//ũ��        W    H  
		this.setSize(400, 150);

		//�����ֱ�
		this.setVisible(true);

		//����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_key_event() {
		// TODO Auto-generated method stub
		KeyAdapter adapter = new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				//����Ű�� ������
				int key = e.getKeyCode();
				
				// R  G  B
				if(key == KeyEvent.VK_1) {
					
					//Toggle��� : true<->false
					bRedRunning = !bRedRunning;
					
					if(bRedRunning) {
						//�簡��
						t_red.resume();//�簳
					}else {
						//���
						t_red.suspend();//
					}
					
				}else if(key == KeyEvent.VK_2) {
					
					//Toggle��� : true<->false
					bGreenRunning = !bGreenRunning;
					
					if(bGreenRunning) {
						//�簡��
						t_green.resume();//�簳
					}else {
						//���
						t_green.suspend();//
					}
					
					
				}else if(key == KeyEvent.VK_3) {
					
					//Toggle��� : true<->false
					bBlueRunning = !bBlueRunning;
					
					if(bBlueRunning) {
						//�簡��
						t_blue.resume();//�簳
					}else {
						//���
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

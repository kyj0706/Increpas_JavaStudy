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

public class �������� extends JFrame {

	//�׸����� ũ��
	public static final int GRIMEPAN_W = 600;
	public static final int GRIMEPAN_H = 400;
	
	
	JPanel grimPan;
	
	//���� ����
	int ball_radius=20;
	int ball_x = GRIMEPAN_W / 2;
	int ball_y = GRIMEPAN_H / 2;
	
	Color ball_color = Color.RED;
	
	//���� ��������
	boolean bRight = true; //�¿�
	boolean bDown  = true; //����
	int     gan    =  5;   //�̵�����  
	
	
	Timer timer = null;
		
	public ��������() {
		// TODO Auto-generated constructor stub
		super("�������⿬��");

		//�׸��� �ʱ�ȭ
		init_grimpan();
		
		//Ÿ�̸� �ʱ�ȭ
		init_timer();
		
		//Ű�����̺�Ʈ �ʱ�ȭ
		init_key_event();
		
		//��ġ            x     y 
		this.setLocation(300, 200);

		//ũ��        W    H  
		//this.setSize(400, 300);
		
        //�ڽ������츦 �������� ���Ѵ�		
		pack();
		
        //ũ�������Ұ�
		this.setResizable(false);
		
		//�����ֱ�
		this.setVisible(true);

		//����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_key_event() {
		// TODO Auto-generated method stub
		
		//KeyAdapter�� KeyListener���� �߻�޼ҵ带 �̹� ������ �س��� Ŭ����
		KeyAdapter adapter = new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				//super.keyPressed(e);
				
				//System.out.println(e);	
				
				//���� Ű��
				int key = e.getKeyCode();
				
				//Virtual Key ������� : VK_ 
				//����Ű : VK_LEFT VK_UP VK_RIGHT VK_DOWN
				//+ / -  : VK_ADD VK_SUBTRACT
				//���ĺ� : VK_A  ~ VK_Z
				
				//�¿�
//				if(key==KeyEvent.VK_LEFT) {
//					bRight = false;
//				}else if (key == KeyEvent.VK_RIGHT) {
//					bRight=true;	
//				}
//				
//				//���Ʒ�
//				if(key==KeyEvent.VK_UP) {	
//					bDown = false;
//				}else if (key == KeyEvent.VK_DOWN) {
//					bDown=true;	
//				}
				
				//Ŀ���۾���
//				if(key==KeyEvent.VK_ADD) {	
//					ball_radius+=5 ;
//				}else if (key == KeyEvent.VK_SUBTRACT) {
//					ball_radius-=5;	
//				}
				
				//����� ���ض�
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
		
		//timer�̺�Ʈ�� ó���ϱ� ���� ActionListener�� �͸�ü ����
		ActionListener timer_listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//System.out.println("---");
				
				process();
				
				grimPan.repaint();//paintComponent ����ȣ��
				
				
			}
		};
		
		//                1/1000  �̺�Ʈó��(ȣ��)��ü  
		timer = new Timer(  10  , timer_listener);
		
		//Ÿ�̸� ����
		timer.start();
		
	}

	protected void process() {
		// TODO Auto-generated method stub
		
		//�������̱�
		move_ball();
		
		
		
	}

	private void move_ball() {
		// TODO Auto-generated method stub
		
		//�¿��̵�
		if(bRight)
			ball_x = ball_x + gan;
		else
			ball_x = ball_x - gan;
		
		//�����̵�
		if(bDown)
			ball_y = ball_y + gan;
		else
			ball_y = ball_y - gan;
		
				
		
		
		
		//�������� ��ҳ�?
		if( (ball_x + ball_radius) > GRIMEPAN_W ) {
			
			//���� �����ʺ��� ���δ�
			ball_x = GRIMEPAN_W - ball_radius;
			
			bRight = false;
		}else if( (ball_x - ball_radius) < 0 ) { //���ʺ��� ��ҳ�?
			
			//���� ���ʺ��� ���δ�
			ball_x = ball_radius;
			
			bRight = true;
		}
		
		//�Ʒ����� ��ƾ�����
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
		
		//��ü������ ���ÿ� �������ϸ� �͸�Ŭ����
		grimPan = new JPanel() {
			
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				//super.paintComponent(g);
				
				//����ȭ�� �����
				g.clearRect(0, 0, GRIMEPAN_W, GRIMEPAN_H);
				
				
				//���׸���
				g.setColor(ball_color);
				
				g.fillOval(ball_x - ball_radius, 
						   ball_y - ball_radius, 
						   ball_radius*2, 
						   ball_radius*2);
				
			}
			
		};
		
		//�׸��� ũ�� ����
		grimPan.setPreferredSize(new Dimension(GRIMEPAN_W, GRIMEPAN_H));
		
		this.add(grimPan);//BorderLayout�� ��ġ�����ϸ� �⺻ Center
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ��������();
	}

}

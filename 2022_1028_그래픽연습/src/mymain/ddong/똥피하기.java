package mymain.ddong;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class �����ϱ� extends JFrame {

	JPanel grimPan;
	
	Timer timer; 
	
	DDongManager ddongManager = new DDongManager();
	
	Me me = new Me();
	
	CollisionManager collsionManager = new CollisionManager(me, ddongManager);
		
	ExplosionManager explosionManager = new ExplosionManager();
	
	SmurfManager smurfManager = new SmurfManager();
		
	BulletManager bulletManager = new BulletManager();
	
	
	public �����ϱ�() {
		// TODO Auto-generated constructor stub
		super("�����ϱ�");

		explosionManager.make_explosion(-100, -100);
		
		//�˸Ŵ���->���߸Ŵ��� ����
		ddongManager.setExplosionManager(explosionManager);
		
		//��->�Ѿ˰���������
		me.setBulletManager(bulletManager);
		
		//��
	    init_me();	
		
		//�׸��� �ʱ�ȭ
		init_grimpan();
		
		//Ÿ�̸� �ʱ�ȭ
		init_timer();
		
		//Ű���� �̺�Ʈ
		init_key_event();
		
		//���콺 �̺�Ʈ
		init_mouse_event();
		
		
		//��ġ            x     y 
		this.setLocation(300, 200);

		//ũ��        W    H  
		//this.setSize(400, 300);
		
		pack();//�ڽ������� �ֺ����� Frame�� ���ζ�...
		
		setResizable(false);//ũ�������Ұ���

		//�����ֱ�
		this.setVisible(true);

		//����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_mouse_event() {
		// TODO Auto-generated method stub
		
		grimPan.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				Point pt = e.getPoint();
				
				//���߿��� ����
			    explosionManager.make_explosion(pt.x, pt.y);
				//smurfManager.make_smurf(pt.x, pt.y);
				
			}
			
		});
		
	}

	private void init_key_event() {
		// TODO Auto-generated method stub
		
		KeyAdapter adapter = new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int key = e.getKeyCode();
				
				if(key==KeyEvent.VK_LEFT) {
					
					me.key_state = me.key_state | Key.LEFT;
					
					
				}else if(key==KeyEvent.VK_RIGHT) {
					
					me.key_state = me.key_state | Key.RIGHT;
					
				}else if(key==KeyEvent.VK_SPACE) {
					
					
					me.key_state = me.key_state | Key.SPACE;
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				int key = e.getKeyCode();
				
				if(key==KeyEvent.VK_LEFT) {
					
					me.key_state = me.key_state ^ Key.LEFT;
					
					
				}else if(key==KeyEvent.VK_RIGHT) {
					
					me.key_state = me.key_state ^ Key.RIGHT;
					
				}else if(key==KeyEvent.VK_SPACE) {
					
					
					me.key_state = me.key_state ^ Key.SPACE;
				}
			}
			
		};
		
		this.addKeyListener(adapter);
		
		
	}

	private void init_me() {
		// TODO Auto-generated method stub
		me.pos.x = MyConstant.GRIMEPAN_W/2 - Me.ME_W/2;
		me.pos.y = MyConstant.GRIMEPAN_H - Me.ME_H - 5;
		me.pos.width = Me.ME_W;
		me.pos.height= Me.ME_H;
		me.color = Color.BLACK;
	}

	private void init_timer() {
		// TODO Auto-generated method stub
		ActionListener timer_listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				//�ʴ� 100ȸ ȣ��(100fps)
				process();
				grimPan.repaint();//grimPan��ü�� paintComponent(g) ����ȣ��ȴ�
			}
		};
		
		//                1/1000(milisecond)  
		timer = new Timer( 10, timer_listener);
		
		//timer����
		timer.start();
		
	}

	protected void process() {
		// TODO Auto-generated method stub
		
		//�� �����
		ddongManager.make_ddong();
		
		setTitle(ddongManager.ddong_list.size()+"(��)");
		
		//�� �̵���Ű��
		ddongManager.move_all();
		
		//�� �����̱�
		me.move();
		
		//smurfManager.move_all();
		
		bulletManager.move_all();
		
		//���߿��� index�̵�
		explosionManager.move_all();
		
		//�浹üũ
		if(collsionManager.collison()) {
			
			System.out.println("--�浹 : ��!!--");
			
		}
		
		
	}

	private void init_grimpan() {
		// TODO Auto-generated method stub
		
		grimPan = new JPanel() {
			
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				super.paintComponent(g);
				
				//�� �׸���
				ddongManager.draw_all(g);
				
				
				//�� �׸���
				me.draw(g);
				//smurfManager.draw_all(g);
				
				//���߿��� �׸���
				explosionManager.draw_all(g);
				
				bulletManager.draw_all(g);
			}
			
			
		};
		
		grimPan.setPreferredSize(new Dimension(MyConstant.GRIMEPAN_W, MyConstant.GRIMEPAN_H));
		
		this.add(grimPan);//Center �ִ´�
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new �����ϱ�();
	}

}

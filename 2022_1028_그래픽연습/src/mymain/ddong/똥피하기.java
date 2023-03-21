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

public class 똥피하기 extends JFrame {

	JPanel grimPan;
	
	Timer timer; 
	
	DDongManager ddongManager = new DDongManager();
	
	Me me = new Me();
	
	CollisionManager collsionManager = new CollisionManager(me, ddongManager);
		
	ExplosionManager explosionManager = new ExplosionManager();
	
	SmurfManager smurfManager = new SmurfManager();
		
	BulletManager bulletManager = new BulletManager();
	
	
	public 똥피하기() {
		// TODO Auto-generated constructor stub
		super("똥피하기");

		explosionManager.make_explosion(-100, -100);
		
		//똥매니저->폭발매니저 참조
		ddongManager.setExplosionManager(explosionManager);
		
		//나->총알관리자참조
		me.setBulletManager(bulletManager);
		
		//나
	    init_me();	
		
		//그림판 초기화
		init_grimpan();
		
		//타이머 초기화
		init_timer();
		
		//키보드 이벤트
		init_key_event();
		
		//마우스 이벤트
		init_mouse_event();
		
		
		//위치            x     y 
		this.setLocation(300, 200);

		//크기        W    H  
		//this.setSize(400, 300);
		
		pack();//자식윈도우 주변으로 Frame을 감싸라...
		
		setResizable(false);//크기조절불가능

		//보여주기
		this.setVisible(true);

		//종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_mouse_event() {
		// TODO Auto-generated method stub
		
		grimPan.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				Point pt = e.getPoint();
				
				//폭발영상 생성
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
				
				//초당 100회 호출(100fps)
				process();
				grimPan.repaint();//grimPan객체의 paintComponent(g) 간접호출된다
			}
		};
		
		//                1/1000(milisecond)  
		timer = new Timer( 10, timer_listener);
		
		//timer구동
		timer.start();
		
	}

	protected void process() {
		// TODO Auto-generated method stub
		
		//똥 만들기
		ddongManager.make_ddong();
		
		setTitle(ddongManager.ddong_list.size()+"(개)");
		
		//똥 이동시키기
		ddongManager.move_all();
		
		//나 움직이기
		me.move();
		
		//smurfManager.move_all();
		
		bulletManager.move_all();
		
		//폭발영상 index이동
		explosionManager.move_all();
		
		//충돌체크
		if(collsionManager.collison()) {
			
			System.out.println("--충돌 : 꽝!!--");
			
		}
		
		
	}

	private void init_grimpan() {
		// TODO Auto-generated method stub
		
		grimPan = new JPanel() {
			
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				super.paintComponent(g);
				
				//똥 그리기
				ddongManager.draw_all(g);
				
				
				//나 그리기
				me.draw(g);
				//smurfManager.draw_all(g);
				
				//폭발영상 그리기
				explosionManager.draw_all(g);
				
				bulletManager.draw_all(g);
			}
			
			
		};
		
		grimPan.setPreferredSize(new Dimension(MyConstant.GRIMEPAN_W, MyConstant.GRIMEPAN_H));
		
		this.add(grimPan);//Center 넣는다
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 똥피하기();
	}

}

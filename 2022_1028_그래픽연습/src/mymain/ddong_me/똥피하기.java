package mymain.ddong_me;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class 똥피하기 extends JFrame {
	
	JPanel grimPan;
	
	Timer timer;
	
	DDongManager ddongManager = new DDongManager();
	IMG_Manager imgManager = new IMG_Manager();
	
	
	// 기본생성자
	public 똥피하기() {
		// TODO Auto-generated constructor stub

		super("똥피하기");

		//그림판초기화(준비)
		init_grimpan();
		
		//타이머초기화(준비)
		init_timer();
		
		
		
		// 위치 x y
		this.setLocation(300, 200);

		// 크기 W H
		//this.setSize(400, 300);
		
		pack();//자식윈도우 주변으로 Frame을 감싸라 
		//크기조절불가
		setResizable(false);
		
		// 보여주기
		this.setVisible(true);

		// 종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	
	//타이머메소드
	private void init_timer() {
		// TODO Auto-generated method stub
		//익명객체
		ActionListener timer_listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				//초당 100회 호출
				process();
				
				grimPan.repaint();//grimPan객체의 paintCompnnt(g)를 간접호출
				
			}
		};
		
		
		
		timer = new Timer(10, timer_listener);
		
		//타이머 구동
		timer.start();
		
	}


	protected void process() {
		// TODO Auto-generated method stub
		
		//똥만들어라
		ddongManager.make_ddong();
		
		//똥이동시키기
		ddongManager.move_all();
		
		//스머프만들어라
		
		imgManager.move_Smurf();
		
	}


	//그림판메소드
	private void init_grimpan() {
		// TODO Auto-generated method stub
		grimPan = new JPanel() {
			
			
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				//super.paintComponent(g);
				
				g.drawImage(ddongManager.img_back, 0, 0, this);
				//ddongManager.img_move();
				
				//똥그리기
				ddongManager.draw_all(g);
				
				imgManager.move_Smurf(g);
				
				
			}
			
			
			
		};
		
		grimPan.setPreferredSize(new Dimension(MyConstant.GRIMEPAN_W, MyConstant.GRIMEPAN_H));
		
		this.add(grimPan);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new 똥피하기();

	}

}

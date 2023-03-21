package mymain;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class 눈알돌리기 extends JFrame {

	//그림판의 크기
	public static final int GRIMEPAN_W = 500;
	public static final int GRIMEPAN_H = 470;
	
	
	static Image img_back;
	
	static {
		
		img_back = Toolkit.getDefaultToolkit().getImage("으농.png");
		
	}
	
	
	
	JPanel grimPan;
	
	//눈의 좌표
	Point  eye_left  = new Point(); //왼쪽눈
	Point  eye_right = new Point(); //오른쪽눈
	int    eye_radius;//눈의 반지름
	
	//눈알의 좌표
	Point eyeball_left  = new Point();
	Point eyeball_right = new Point();
	int   eyeball_radius;//눈알의 반지름
	
	
	public 눈알돌리기() {
		// TODO Auto-generated constructor stub
		super("눈알돌리기");

		//그림판 초기화
		init_grimpan();
		
		//눈좌표 초기화
		init_eye_position();
		
		//눈알좌표 초기화
		init_eyeball_position();
		
		
		//마우스이벤트 초기화
		init_mouse_event();
		
		
		
		//위치            x     y 
		this.setLocation(1000, 150);

		//크기        W    H  
		//this.setSize(400, 300);
		pack();//자식윈도우 주변으로 Frame을 감싸라...
		
		//크기변경불가
		this.setResizable(false);

		//보여주기
		this.setVisible(true);

		//종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_mouse_event() {
		// TODO Auto-generated method stub
		
		//MouseListener & MouseMotionListener내의 추상메소드가 이미 재정의 되어있다
		//사용자는 선택적으로 필요한 메소드만 재정의해서 사용할 수 있다 
		MouseAdapter adapter = new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				//super.mousePressed(e);
				//System.out.println(e);
				
				//눌린버튼 위치 얻어오기
				Point pt = e.getPoint();
				//System.out.println(pt);
				
				move_eyeball_left_position(pt); //왼쪽눈알 위치
				move_eyeball_right_position(pt);//오른쪽눈알 위치
				
				grimPan.repaint();// paintComponent(g) 간접호출
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				//super.mouseReleased(e);
				init_eyeball_position();
				
				grimPan.repaint();//다시그려라...
				
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				//super.mouseDragged(e);
				
				//눌린버튼 위치 얻어오기
				Point pt = e.getPoint();
				//System.out.println(pt);
				
				move_eyeball_left_position(pt); //왼쪽눈알 위치
				move_eyeball_right_position(pt);//오른쪽눈알 위치
				
				grimPan.repaint();// paintComponent(g) 간접호출
				
				
			}
		    
			
			
		};
		
		
		grimPan.addMouseListener(adapter);      //pressed / released
		grimPan.addMouseMotionListener(adapter);//dragged
		
		
		
	}

	protected void move_eyeball_right_position(Point pt) {
		// TODO Auto-generated method stub
		//마우스위치 - 눈의중심좌표의 차를 구한다
		int x = pt.x - eye_right.x;
		int y = pt.y - eye_right.y;
		//빗변길이 구하기
		double r = Math.sqrt(x*x + y*y);
		//빗변의 전체길이에 대한 작은 빗변의 길이의 비율
		double rate = eyeball_radius/r;
		
		eyeball_right.x = (int) (eye_right.x + rate*x);
		eyeball_right.y = (int) (eye_right.y + rate*y);
	}

	protected void move_eyeball_left_position(Point pt) {
		// TODO Auto-generated method stub
		//마우스위치 - 눈의중심좌표의 차를 구한다
		int x = pt.x - eye_left.x;
		int y = pt.y - eye_left.y;
		//빗변길이 구하기
		double r = Math.sqrt(x*x + y*y);
		//빗변의 전체길이에 대한 작은 빗변의 길이의 비율
		double rate = eyeball_radius/r;
		
		eyeball_left.x = (int) (eye_left.x + rate*x);
		eyeball_left.y = (int) (eye_left.y + rate*y);
				
		
	}

	private void init_eyeball_position() {
		// TODO Auto-generated method stub
		//왼쪽눈알=왼쪽눈
		eyeball_left.x = eye_left.x;
		eyeball_left.y = eye_left.y;
		
		//오른쪽눈알=오른쪽눈
		eyeball_right.x = eye_right.x;
		eyeball_right.y = eye_right.y;
		
	}

	private void init_eye_position() {
		// TODO Auto-generated method stub
		//왼쪽눈 위치 초기화
		eye_left.x = 105;//GRIMEPAN_W / 4;
		eye_left.y = 177;//GRIMEPAN_H / 2;
		
		//오른쪽눈 위치 초기화
		eye_right.x = 224;//GRIMEPAN_W / 4 * 3;
		eye_right.y = 176;//GRIMEPAN_H / 2;
		
		//눈의 반지름
		eye_radius = 50;//GRIMEPAN_W/4 - 20;
		
		//눈알의 반지름
		eyeball_radius = eye_radius/2;
		
	}

	private void init_grimpan() {
		// TODO Auto-generated method stub
		
		//방법1 : 로컬내부클래스
		/*
			class GrimPan extends JPanel
			{
			   //재정의
			   paintComponent()...
			}
			grimPan = new GrimPan();
		*/
		
		//방법2 : 익명(Anonymous)내부클래스
		grimPan = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				//super.paintComponent(g);
				
				//이전화면 지우기->나중에 배경그림으로 대체
				//g.clearRect(0, 0, GRIMEPAN_W, GRIMEPAN_H);
				g.drawImage(img_back, 0, 0, this);
				
				//눈그리기
				/*
				g.drawOval(eye_left.x - eye_radius , //x
						   eye_left.y - eye_radius , //y
						   eye_radius*2,             //width 
						   eye_radius*2);            //height
				
				g.drawOval(eye_right.x - eye_radius ,//x
						   eye_right.y - eye_radius ,//y
						   eye_radius*2,             //width 
						   eye_radius*2);            //height
				*/
				
				//눈동자색상지정
				g.setColor(Color.BLACK);
				
				//눈알그리기
				g.fillOval(eyeball_left.x - eyeball_radius,//x
						   eyeball_left.y - eyeball_radius,//y
						   eyeball_radius*2,               //width   
						   eyeball_radius*2                //height
						);
				
				g.fillOval(eyeball_right.x - eyeball_radius,//x
						   eyeball_right.y - eyeball_radius,//y
						   eyeball_radius*2,                //width   
						   eyeball_radius*2                 //height
						);
			
				
			}
		};
		
		
		//그림판의 크기를 예약한다
		grimPan.setPreferredSize(new Dimension(GRIMEPAN_W, GRIMEPAN_H));
		
		//그림판을 중앙에 배치
		this.add(grimPan, "Center");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 눈알돌리기();
	}

}

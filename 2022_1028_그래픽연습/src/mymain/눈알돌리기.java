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

public class ���˵����� extends JFrame {

	//�׸����� ũ��
	public static final int GRIMEPAN_W = 500;
	public static final int GRIMEPAN_H = 470;
	
	
	static Image img_back;
	
	static {
		
		img_back = Toolkit.getDefaultToolkit().getImage("����.png");
		
	}
	
	
	
	JPanel grimPan;
	
	//���� ��ǥ
	Point  eye_left  = new Point(); //���ʴ�
	Point  eye_right = new Point(); //�����ʴ�
	int    eye_radius;//���� ������
	
	//������ ��ǥ
	Point eyeball_left  = new Point();
	Point eyeball_right = new Point();
	int   eyeball_radius;//������ ������
	
	
	public ���˵�����() {
		// TODO Auto-generated constructor stub
		super("���˵�����");

		//�׸��� �ʱ�ȭ
		init_grimpan();
		
		//����ǥ �ʱ�ȭ
		init_eye_position();
		
		//������ǥ �ʱ�ȭ
		init_eyeball_position();
		
		
		//���콺�̺�Ʈ �ʱ�ȭ
		init_mouse_event();
		
		
		
		//��ġ            x     y 
		this.setLocation(1000, 150);

		//ũ��        W    H  
		//this.setSize(400, 300);
		pack();//�ڽ������� �ֺ����� Frame�� ���ζ�...
		
		//ũ�⺯��Ұ�
		this.setResizable(false);

		//�����ֱ�
		this.setVisible(true);

		//����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_mouse_event() {
		// TODO Auto-generated method stub
		
		//MouseListener & MouseMotionListener���� �߻�޼ҵ尡 �̹� ������ �Ǿ��ִ�
		//����ڴ� ���������� �ʿ��� �޼ҵ常 �������ؼ� ����� �� �ִ� 
		MouseAdapter adapter = new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				//super.mousePressed(e);
				//System.out.println(e);
				
				//������ư ��ġ ������
				Point pt = e.getPoint();
				//System.out.println(pt);
				
				move_eyeball_left_position(pt); //���ʴ��� ��ġ
				move_eyeball_right_position(pt);//�����ʴ��� ��ġ
				
				grimPan.repaint();// paintComponent(g) ����ȣ��
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				//super.mouseReleased(e);
				init_eyeball_position();
				
				grimPan.repaint();//�ٽñ׷���...
				
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				//super.mouseDragged(e);
				
				//������ư ��ġ ������
				Point pt = e.getPoint();
				//System.out.println(pt);
				
				move_eyeball_left_position(pt); //���ʴ��� ��ġ
				move_eyeball_right_position(pt);//�����ʴ��� ��ġ
				
				grimPan.repaint();// paintComponent(g) ����ȣ��
				
				
			}
		    
			
			
		};
		
		
		grimPan.addMouseListener(adapter);      //pressed / released
		grimPan.addMouseMotionListener(adapter);//dragged
		
		
		
	}

	protected void move_eyeball_right_position(Point pt) {
		// TODO Auto-generated method stub
		//���콺��ġ - �����߽���ǥ�� ���� ���Ѵ�
		int x = pt.x - eye_right.x;
		int y = pt.y - eye_right.y;
		//�������� ���ϱ�
		double r = Math.sqrt(x*x + y*y);
		//������ ��ü���̿� ���� ���� ������ ������ ����
		double rate = eyeball_radius/r;
		
		eyeball_right.x = (int) (eye_right.x + rate*x);
		eyeball_right.y = (int) (eye_right.y + rate*y);
	}

	protected void move_eyeball_left_position(Point pt) {
		// TODO Auto-generated method stub
		//���콺��ġ - �����߽���ǥ�� ���� ���Ѵ�
		int x = pt.x - eye_left.x;
		int y = pt.y - eye_left.y;
		//�������� ���ϱ�
		double r = Math.sqrt(x*x + y*y);
		//������ ��ü���̿� ���� ���� ������ ������ ����
		double rate = eyeball_radius/r;
		
		eyeball_left.x = (int) (eye_left.x + rate*x);
		eyeball_left.y = (int) (eye_left.y + rate*y);
				
		
	}

	private void init_eyeball_position() {
		// TODO Auto-generated method stub
		//���ʴ���=���ʴ�
		eyeball_left.x = eye_left.x;
		eyeball_left.y = eye_left.y;
		
		//�����ʴ���=�����ʴ�
		eyeball_right.x = eye_right.x;
		eyeball_right.y = eye_right.y;
		
	}

	private void init_eye_position() {
		// TODO Auto-generated method stub
		//���ʴ� ��ġ �ʱ�ȭ
		eye_left.x = 105;//GRIMEPAN_W / 4;
		eye_left.y = 177;//GRIMEPAN_H / 2;
		
		//�����ʴ� ��ġ �ʱ�ȭ
		eye_right.x = 224;//GRIMEPAN_W / 4 * 3;
		eye_right.y = 176;//GRIMEPAN_H / 2;
		
		//���� ������
		eye_radius = 50;//GRIMEPAN_W/4 - 20;
		
		//������ ������
		eyeball_radius = eye_radius/2;
		
	}

	private void init_grimpan() {
		// TODO Auto-generated method stub
		
		//���1 : ���ó���Ŭ����
		/*
			class GrimPan extends JPanel
			{
			   //������
			   paintComponent()...
			}
			grimPan = new GrimPan();
		*/
		
		//���2 : �͸�(Anonymous)����Ŭ����
		grimPan = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				//super.paintComponent(g);
				
				//����ȭ�� �����->���߿� ���׸����� ��ü
				//g.clearRect(0, 0, GRIMEPAN_W, GRIMEPAN_H);
				g.drawImage(img_back, 0, 0, this);
				
				//���׸���
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
				
				//�����ڻ�������
				g.setColor(Color.BLACK);
				
				//���˱׸���
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
		
		
		//�׸����� ũ�⸦ �����Ѵ�
		grimPan.setPreferredSize(new Dimension(GRIMEPAN_W, GRIMEPAN_H));
		
		//�׸����� �߾ӿ� ��ġ
		this.add(grimPan, "Center");
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ���˵�����();
	}

}

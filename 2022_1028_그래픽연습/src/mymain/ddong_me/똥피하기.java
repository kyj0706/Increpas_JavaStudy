package mymain.ddong_me;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class �����ϱ� extends JFrame {
	
	JPanel grimPan;
	
	Timer timer;
	
	DDongManager ddongManager = new DDongManager();
	IMG_Manager imgManager = new IMG_Manager();
	
	
	// �⺻������
	public �����ϱ�() {
		// TODO Auto-generated constructor stub

		super("�����ϱ�");

		//�׸����ʱ�ȭ(�غ�)
		init_grimpan();
		
		//Ÿ�̸��ʱ�ȭ(�غ�)
		init_timer();
		
		
		
		// ��ġ x y
		this.setLocation(300, 200);

		// ũ�� W H
		//this.setSize(400, 300);
		
		pack();//�ڽ������� �ֺ����� Frame�� ���ζ� 
		//ũ�������Ұ�
		setResizable(false);
		
		// �����ֱ�
		this.setVisible(true);

		// ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	
	//Ÿ�̸Ӹ޼ҵ�
	private void init_timer() {
		// TODO Auto-generated method stub
		//�͸�ü
		ActionListener timer_listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				//�ʴ� 100ȸ ȣ��
				process();
				
				grimPan.repaint();//grimPan��ü�� paintCompnnt(g)�� ����ȣ��
				
			}
		};
		
		
		
		timer = new Timer(10, timer_listener);
		
		//Ÿ�̸� ����
		timer.start();
		
	}


	protected void process() {
		// TODO Auto-generated method stub
		
		//�˸�����
		ddongManager.make_ddong();
		
		//���̵���Ű��
		ddongManager.move_all();
		
		//������������
		
		imgManager.move_Smurf();
		
	}


	//�׸��Ǹ޼ҵ�
	private void init_grimpan() {
		// TODO Auto-generated method stub
		grimPan = new JPanel() {
			
			
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				//super.paintComponent(g);
				
				g.drawImage(ddongManager.img_back, 0, 0, this);
				//ddongManager.img_move();
				
				//�˱׸���
				ddongManager.draw_all(g);
				
				imgManager.move_Smurf(g);
				
				
			}
			
			
			
		};
		
		grimPan.setPreferredSize(new Dimension(MyConstant.GRIMEPAN_W, MyConstant.GRIMEPAN_H));
		
		this.add(grimPan);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new �����ϱ�();

	}

}

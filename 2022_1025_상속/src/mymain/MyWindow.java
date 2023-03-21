package mymain;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

//AWT(Abstract Window Toolkit) : ��� �������� �����س��� Ŭ��������

public class MyWindow extends JFrame {

	// �ػ� ������ ����
	int screen_width, screen_heigth;

	// �⺻������ : �ʱ�ȭ���
	public MyWindow() {
		// TODO Auto-generated constructor stub
		// System.out.println("--MyWindow()--");
		super("���� ó�� ���� ������");

		// ������ �ػ� ���ϱ�
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		screen_width = d.width;
		screen_heigth = d.height;

		System.out.printf("W:%d  H:%d\n", screen_width, screen_heigth);

		// JFreme : BorderLayout(�׵θ����� ��ġ)
		JButton jbt_north = new JButton("���ʹ�ư");
		JButton jbt_south = new JButton("���ʹ�ư");
		JButton jbt_esst = new JButton("���ʹ�ư");
		JButton jbt_west = new JButton("���ʹ�ư");
		JButton jbt_center = new JButton("�߾ӹ�ư");

		super.add(jbt_north, "North");
		super.add(jbt_south, BorderLayout.SOUTH);
		super.add(jbt_esst, BorderLayout.EAST);
		super.add(jbt_west, BorderLayout.WEST);
		super.add(jbt_center, BorderLayout.CENTER);

		// ���ʹ�ư ������ (Lambda��)
		jbt_esst.addActionListener(e -> {
			move_rigth();
		});
		jbt_west.addActionListener(e -> {
			move_left();
		});
		jbt_north.addActionListener(e -> {
			move_top();
		});
		jbt_south.addActionListener(e -> {
			move_bottom();
		});

		jbt_center.addActionListener(e -> {
			move_center();
		});

		// ��ġ x y
		super.setLocation(300, 200);

		// ũ�� �� ����
		super.setSize(400, 300);
		// ũ�������Ұ�
		super.setResizable(false);
		// ��������� �޸𸮻� ���������

		// ȭ����� ��Ÿ����(�������)
		super.setVisible(true);

		// ����
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void move_center() {
		// TODO Auto-generated method stub
		Point pt = this.getLocation();

		pt.x = (screen_width - 400) / 2;
		pt.y = (screen_heigth - 300) / 2;

		this.setLocation(pt);

	}

	private void move_bottom() {
		// TODO Auto-generated method stub
		Point pt = this.getLocation();
		pt.y = screen_heigth - 300;
		this.setLocation(pt);

	}

	private void move_top() {
		// TODO Auto-generated method stub
		Point pt = this.getLocation();
		pt.y = screen_heigth - 1080;
		this.setLocation(pt);

	}

	private void move_left() {
		// TODO Auto-generated method stub
		Point pt = this.getLocation();
		pt.x = screen_width - 1920;
		this.setLocation(pt);

	}

	private void move_rigth() {
		// TODO Auto-generated method stub
		// ���� ��ġ ���Ѵ�.
		Point pt = this.getLocation();

		// ��ǥ����
		pt.x = screen_width - 400;

		// ��ġ�� �ű��.
		this.setLocation(pt);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MyWindow();

	}

}

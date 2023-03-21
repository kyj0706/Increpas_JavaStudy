package mymain;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;

//AWT(Abstract Window Toolkit) : 모든 윈도우기능 설계해놓은 클래스집합

public class MyWindow extends JFrame {

	// 해상도 저잘항 변수
	int screen_width, screen_heigth;

	// 기본생성자 : 초기화기능
	public MyWindow() {
		// TODO Auto-generated constructor stub
		// System.out.println("--MyWindow()--");
		super("내가 처음 만들어본 윈도우");

		// 윈도우 해상도 구하기
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		screen_width = d.width;
		screen_heigth = d.height;

		System.out.printf("W:%d  H:%d\n", screen_width, screen_heigth);

		// JFreme : BorderLayout(테두리기준 배치)
		JButton jbt_north = new JButton("북쪽버튼");
		JButton jbt_south = new JButton("남쪽버튼");
		JButton jbt_esst = new JButton("동쪽버튼");
		JButton jbt_west = new JButton("서쪽버튼");
		JButton jbt_center = new JButton("중앙버튼");

		super.add(jbt_north, "North");
		super.add(jbt_south, BorderLayout.SOUTH);
		super.add(jbt_esst, BorderLayout.EAST);
		super.add(jbt_west, BorderLayout.WEST);
		super.add(jbt_center, BorderLayout.CENTER);

		// 동쪽버튼 눌리면 (Lambda식)
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

		// 위치 x y
		super.setLocation(300, 200);

		// 크기 폭 높이
		super.setSize(400, 300);
		// 크기조절불가
		super.setResizable(false);
		// 여기까지면 메모리상에 만들어진거

		// 화면상태 나타내라(보여줘라)
		super.setVisible(true);

		// 종료
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
		// 현재 위치 구한다.
		Point pt = this.getLocation();

		// 좌표보정
		pt.x = screen_width - 400;

		// 위치를 옮긴다.
		this.setLocation(pt);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MyWindow();

	}

}

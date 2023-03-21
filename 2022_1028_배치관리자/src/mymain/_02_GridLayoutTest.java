package mymain;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _02_GridLayoutTest extends JFrame {

	//기본생성자
	public _02_GridLayoutTest() {
		// TODO Auto-generated constructor stub

		super("GridLayout연습");
		
		//순1_1
		//배치방법 변경
		//GridLayout : 행 우선으로 채워진다.
		//							  행  열 좌우 위아래
		this.setLayout(new GridLayout(3, 4,  5, 5));
		
		//순1_2
		this.add(new JButton("버튼1"));
		this.add(new JButton("버튼2"));
		this.add(new JButton("버튼3"));
		this.add(new JButton("버튼4"));
		this.add(new JButton("버튼5"));
		this.add(new JButton("버튼6"));
		this.add(new JButton("버튼7"));
		this.add(new JButton("버튼8"));
		this.add(new JButton("버튼9"));
		this.add(new JButton("버튼10"));
		this.add(new JButton("버튼11"));
		this.add(new JButton("버튼12"));
		
		//위치
		this.setLocation(300, 200);
		//크기
		this.setSize(400, 300);
		//보여주기
		this.setVisible(true);
		//종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _02_GridLayoutTest();

	}

}


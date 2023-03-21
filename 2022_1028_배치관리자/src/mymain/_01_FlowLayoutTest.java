package mymain;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _01_FlowLayoutTest extends JFrame {

	//기본생성자
	public _01_FlowLayoutTest() {
		// TODO Auto-generated constructor stub

		super("FlowLayout연습");
		
		
		//순1
		//배치방법변경 : BorderLayout -> FlowLayout(변경됨)
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 15,25));
		
		
		//this는 누구냐 객체 자신이다.
		this.add(new JButton("버튼1"));
		this.add(new JButton("버튼2"));
		this.add(new JButton("버튼3"));
		this.add(new JButton("버튼4"));
		this.add(new JButton("버튼5"));
		this.add(new JButton("버튼6"));
		this.add(new JButton("버튼7"));
		this.add(new JButton("버튼8"));
		this.add(new JButton("버튼9"));
		
		
		
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

		new _01_FlowLayoutTest();

	}

}

package mymain;

import javax.swing.JFrame;

//순서1에 자동생성
public class MyMain_WindowEvent extends JFrame {
	
	//기본생성자
	public MyMain_WindowEvent() {
		// TODO Auto-generated constructor stub
		
		super("윈도우 이벤트 연습");
		//위치
		this.setLocation(300, 200);
		//크기
		this.setSize(400, 300);
		//보여주기
		this.setVisible(true);
		//종료
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		//이벤트 처리객체인데
		//윈도우 이벤트를 처리할 준비가 되어있는 이벤트 처리객체.
		MyWindowEventListener listener = new MyWindowEventListener();
		
		//윈도우 이벤트 등록
		//Delegation Model(위임이벤트모델)
		//이벤트소스.addxxxListener(처리객체)
		this.addWindowListener(listener);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//순서1
		new MyMain_WindowEvent();

	}

}

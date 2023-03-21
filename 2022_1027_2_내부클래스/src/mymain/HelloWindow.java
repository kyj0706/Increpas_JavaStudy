package mymain;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HelloWindow extends JFrame {

	// 순2_1
	JButton jbt_kor;
	JButton jbt_eng;
	JButton jbt_jpn;
	JButton jbt_chn;
	JButton jbt_ger;
	JButton jbt_fra;
	
	//순3_2
	//멤버로써의 내부클래스(버튼이벤트 처리객체)
	class KorButtenEventListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//System.out.println(e);
			
			//null이 뭐냐 ?  내 모니터가 window의 기준으로??? 중앙에서 출력해준다 ?
			//
			//JOptionPane.showMessageDialog(null, "한국어 : 안녕하세요!!");
			//this를 쓰면안된다 ? 쓸거면이렇게
			JOptionPane.showMessageDialog(HelloWindow.this, "한국어 : 안녕하세요!!");
		}
		
	}
	
	
	// 기본생성자
	public HelloWindow() {
		// TODO Auto-generated constructor stub

		super("내부클래스-이벤트처리");

		// 순1
		// 배치방법 지정               행 열
		this.setLayout(new GridLayout(6, 1));

		// 순2_2
		// 버튼생성 ->추가
		this.add(jbt_kor = new JButton("한국어 인사말"));
		this.add(jbt_eng = new JButton("영  어 인사말"));
		this.add(jbt_jpn = new JButton("일본어 인사말"));
		this.add(jbt_chn = new JButton("중국어 인사말"));
		this.add(jbt_ger = new JButton("독일어 인사말"));
		this.add(jbt_fra = new JButton("프랑스 인사말"));
		
		//순3_1
		//이벤트 등록
		//한국어인사말(멤버로써 내부클래스 이용)
		jbt_kor.addActionListener(new KorButtenEventListener());
		
		//순4_2
		//지역변수 (local variable)
		int a;
		
		//순4_1
		//이벤트 등록 
		//영어인사말(로컬 내부클래스 이용)
		//로컬 내부클래스는 implements 자동완성이 안된다.
		class EngButtonEventListener implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(HelloWindow.this, "영  어 : Hi Hello Everyone!!");
				
			}
			
		}
		
		//순4_3
		jbt_eng.addActionListener(new EngButtonEventListener());
		
		//순5_1
		//이벤트 등록 
		//일본어인사말(익명(anonymous) 내부클래스 이용)
		//로컬 내부클래스는 implements 자동완성이 안된다.
		ActionListener jpn_listener =new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(HelloWindow.this, "일본어 : 오겡끼데스까");
				
				
			}
		};
		//순5_2
		jbt_jpn.addActionListener(jpn_listener);
		
		
		
		
		//순6_1 익명내무클래스 (줄이기)
		jbt_ger.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JOptionPane.showMessageDialog(HelloWindow.this, "독일어 : 할로!");
			}
		});
		
		
		
		//순7_1 중국어 인사말 (lambda식)
		jbt_chn.addActionListener( e->{
			JOptionPane.showMessageDialog(HelloWindow.this, "중국어 : 니하오!");
			
		});
		
		
		
		

		// 위치
		this.setLocation(300, 200);
		// 크기
		this.setSize(400, 300);
		// 보여주기
		this.setVisible(true);
		// 종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new HelloWindow();

	}

}

package mymain;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class _01_GraphicsTest extends JFrame {

	// 이미지 추력
	static Image img_back; // 배경이미지
	static Image img_character; // 캐릭터이미지

	static {

		// 방법1)
		img_back = Toolkit.getDefaultToolkit().getImage("C:\\Work\\javaStudy\\img\\back_2.jpg");

		// 방법2)
		img_character = new ImageIcon("ch_1.jpg").getImage();

	}

	Font font = new Font("굴림체", Font.BOLD, 30);

	// 그림판(도화지)
	class GrimPan extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			// System.out.println("=draw=");
			// g.drawString("이 내용은 안지워져",10,50);

			// Graphics : 그리기 도구(붓,펫)

			// 배경이미지그리기
			g.drawImage(img_back, 0, 0, this);
			

			// String 출력하기
			g.setFont(font); // 폰트저장

			// 그림자
			g.setColor(Color.BLACK);// 색상지정
			g.drawString("Graphic 연습", 100 + 2, 50 + 2);

			g.setColor(Color.RED);// 색상지정
			g.drawString("Graphic 연습", 100, 50);

			// 도형출력
			// 사각형
			g.drawRect(10, 100, 100, 100); // 테두리만
			g.fillRect(120, 100, 100, 100);// 체워서

			g.drawRoundRect(230, 100, 100, 100, 30, 30);
			g.fillRoundRect(340, 100, 100, 100, 30, 30);

			// 원
			g.setColor(Color.BLUE);

			g.drawOval(10, 210, 100, 100);
			g.fillOval(120, 210, 100, 100);

			// 선

			for (int i = 0; i < 256; i++) {

				Color color = new Color(i, 0, i,130);

				g.setColor(color);

				g.drawLine(10 + i, 320, 400, 400 + i);

			}
			
			//이미지그리기
			//이미지 그리기
			g.drawImage(img_character, 500, 100, this);
			
			//g.drawImage(img_character, 740, 100,740+120,100+150, 0,0,233,303, this);
			
		}
	}

	// 기본생성자
	public _01_GraphicsTest() {
		// TODO Auto-generated constructor stub

		super("Graphics연습");

		GrimPan grimPan = new GrimPan();

		this.add(grimPan, "Center");

		// 위치
		this.setLocation(300, 200);
		// 크기
		this.setSize(960, 650);
		// 보여주기
		this.setVisible(true);
		// 종료
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 도화지에 그릴 그리기 도구 추출
		Graphics g = grimPan.getGraphics();

		g.drawString("안녕하세요", 10, 50);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _01_GraphicsTest();

	}

}

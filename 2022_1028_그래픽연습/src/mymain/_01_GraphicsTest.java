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

	// �̹��� �߷�
	static Image img_back; // ����̹���
	static Image img_character; // ĳ�����̹���

	static {

		// ���1)
		img_back = Toolkit.getDefaultToolkit().getImage("C:\\Work\\javaStudy\\img\\back_2.jpg");

		// ���2)
		img_character = new ImageIcon("ch_1.jpg").getImage();

	}

	Font font = new Font("����ü", Font.BOLD, 30);

	// �׸���(��ȭ��)
	class GrimPan extends JPanel {
		@Override
		protected void paintComponent(Graphics g) {
			// TODO Auto-generated method stub
			super.paintComponent(g);
			// System.out.println("=draw=");
			// g.drawString("�� ������ ��������",10,50);

			// Graphics : �׸��� ����(��,��)

			// ����̹����׸���
			g.drawImage(img_back, 0, 0, this);
			

			// String ����ϱ�
			g.setFont(font); // ��Ʈ����

			// �׸���
			g.setColor(Color.BLACK);// ��������
			g.drawString("Graphic ����", 100 + 2, 50 + 2);

			g.setColor(Color.RED);// ��������
			g.drawString("Graphic ����", 100, 50);

			// �������
			// �簢��
			g.drawRect(10, 100, 100, 100); // �׵θ���
			g.fillRect(120, 100, 100, 100);// ü����

			g.drawRoundRect(230, 100, 100, 100, 30, 30);
			g.fillRoundRect(340, 100, 100, 100, 30, 30);

			// ��
			g.setColor(Color.BLUE);

			g.drawOval(10, 210, 100, 100);
			g.fillOval(120, 210, 100, 100);

			// ��

			for (int i = 0; i < 256; i++) {

				Color color = new Color(i, 0, i,130);

				g.setColor(color);

				g.drawLine(10 + i, 320, 400, 400 + i);

			}
			
			//�̹����׸���
			//�̹��� �׸���
			g.drawImage(img_character, 500, 100, this);
			
			//g.drawImage(img_character, 740, 100,740+120,100+150, 0,0,233,303, this);
			
		}
	}

	// �⺻������
	public _01_GraphicsTest() {
		// TODO Auto-generated constructor stub

		super("Graphics����");

		GrimPan grimPan = new GrimPan();

		this.add(grimPan, "Center");

		// ��ġ
		this.setLocation(300, 200);
		// ũ��
		this.setSize(960, 650);
		// �����ֱ�
		this.setVisible(true);
		// ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ��ȭ���� �׸� �׸��� ���� ����
		Graphics g = grimPan.getGraphics();

		g.drawString("�ȳ��ϼ���", 10, 50);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _01_GraphicsTest();

	}

}

package mymain;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _01_FlowLayoutTest extends JFrame {

	//�⺻������
	public _01_FlowLayoutTest() {
		// TODO Auto-generated constructor stub

		super("FlowLayout����");
		
		
		//��1
		//��ġ������� : BorderLayout -> FlowLayout(�����)
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 15,25));
		
		
		//this�� ������ ��ü �ڽ��̴�.
		this.add(new JButton("��ư1"));
		this.add(new JButton("��ư2"));
		this.add(new JButton("��ư3"));
		this.add(new JButton("��ư4"));
		this.add(new JButton("��ư5"));
		this.add(new JButton("��ư6"));
		this.add(new JButton("��ư7"));
		this.add(new JButton("��ư8"));
		this.add(new JButton("��ư9"));
		
		
		
		//��ġ
		this.setLocation(300, 200);
		//ũ��
		this.setSize(400, 300);
		//�����ֱ�
		this.setVisible(true);
		//����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new _01_FlowLayoutTest();

	}

}

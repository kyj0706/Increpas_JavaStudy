package mymain;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _02_GridLayoutTest extends JFrame {

	//�⺻������
	public _02_GridLayoutTest() {
		// TODO Auto-generated constructor stub

		super("GridLayout����");
		
		//��1_1
		//��ġ��� ����
		//GridLayout : �� �켱���� ä������.
		//							  ��  �� �¿� ���Ʒ�
		this.setLayout(new GridLayout(3, 4,  5, 5));
		
		//��1_2
		this.add(new JButton("��ư1"));
		this.add(new JButton("��ư2"));
		this.add(new JButton("��ư3"));
		this.add(new JButton("��ư4"));
		this.add(new JButton("��ư5"));
		this.add(new JButton("��ư6"));
		this.add(new JButton("��ư7"));
		this.add(new JButton("��ư8"));
		this.add(new JButton("��ư9"));
		this.add(new JButton("��ư10"));
		this.add(new JButton("��ư11"));
		this.add(new JButton("��ư12"));
		
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

		new _02_GridLayoutTest();

	}

}


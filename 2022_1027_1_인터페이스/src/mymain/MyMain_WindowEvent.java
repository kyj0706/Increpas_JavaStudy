package mymain;

import javax.swing.JFrame;

//����1�� �ڵ�����
public class MyMain_WindowEvent extends JFrame {
	
	//�⺻������
	public MyMain_WindowEvent() {
		// TODO Auto-generated constructor stub
		
		super("������ �̺�Ʈ ����");
		//��ġ
		this.setLocation(300, 200);
		//ũ��
		this.setSize(400, 300);
		//�����ֱ�
		this.setVisible(true);
		//����
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		//�̺�Ʈ ó����ü�ε�
		//������ �̺�Ʈ�� ó���� �غ� �Ǿ��ִ� �̺�Ʈ ó����ü.
		MyWindowEventListener listener = new MyWindowEventListener();
		
		//������ �̺�Ʈ ���
		//Delegation Model(�����̺�Ʈ��)
		//�̺�Ʈ�ҽ�.addxxxListener(ó����ü)
		this.addWindowListener(listener);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����1
		new MyMain_WindowEvent();

	}

}

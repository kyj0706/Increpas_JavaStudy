package mymain;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class HelloWindow extends JFrame {

	// ��2_1
	JButton jbt_kor;
	JButton jbt_eng;
	JButton jbt_jpn;
	JButton jbt_chn;
	JButton jbt_ger;
	JButton jbt_fra;
	
	//��3_2
	//����ν��� ����Ŭ����(��ư�̺�Ʈ ó����ü)
	class KorButtenEventListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//System.out.println(e);
			
			//null�� ���� ?  �� ����Ͱ� window�� ��������??? �߾ӿ��� ������ش� ?
			//
			//JOptionPane.showMessageDialog(null, "�ѱ��� : �ȳ��ϼ���!!");
			//this�� ����ȵȴ� ? ���Ÿ��̷���
			JOptionPane.showMessageDialog(HelloWindow.this, "�ѱ��� : �ȳ��ϼ���!!");
		}
		
	}
	
	
	// �⺻������
	public HelloWindow() {
		// TODO Auto-generated constructor stub

		super("����Ŭ����-�̺�Ʈó��");

		// ��1
		// ��ġ��� ����               �� ��
		this.setLayout(new GridLayout(6, 1));

		// ��2_2
		// ��ư���� ->�߰�
		this.add(jbt_kor = new JButton("�ѱ��� �λ縻"));
		this.add(jbt_eng = new JButton("��  �� �λ縻"));
		this.add(jbt_jpn = new JButton("�Ϻ��� �λ縻"));
		this.add(jbt_chn = new JButton("�߱��� �λ縻"));
		this.add(jbt_ger = new JButton("���Ͼ� �λ縻"));
		this.add(jbt_fra = new JButton("������ �λ縻"));
		
		//��3_1
		//�̺�Ʈ ���
		//�ѱ����λ縻(����ν� ����Ŭ���� �̿�)
		jbt_kor.addActionListener(new KorButtenEventListener());
		
		//��4_2
		//�������� (local variable)
		int a;
		
		//��4_1
		//�̺�Ʈ ��� 
		//�����λ縻(���� ����Ŭ���� �̿�)
		//���� ����Ŭ������ implements �ڵ��ϼ��� �ȵȴ�.
		class EngButtonEventListener implements ActionListener
		{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(HelloWindow.this, "��  �� : Hi Hello Everyone!!");
				
			}
			
		}
		
		//��4_3
		jbt_eng.addActionListener(new EngButtonEventListener());
		
		//��5_1
		//�̺�Ʈ ��� 
		//�Ϻ����λ縻(�͸�(anonymous) ����Ŭ���� �̿�)
		//���� ����Ŭ������ implements �ڵ��ϼ��� �ȵȴ�.
		ActionListener jpn_listener =new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(HelloWindow.this, "�Ϻ��� : ���۳�������");
				
				
			}
		};
		//��5_2
		jbt_jpn.addActionListener(jpn_listener);
		
		
		
		
		//��6_1 �͸���Ŭ���� (���̱�)
		jbt_ger.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				JOptionPane.showMessageDialog(HelloWindow.this, "���Ͼ� : �ҷ�!");
			}
		});
		
		
		
		//��7_1 �߱��� �λ縻 (lambda��)
		jbt_chn.addActionListener( e->{
			JOptionPane.showMessageDialog(HelloWindow.this, "�߱��� : ���Ͽ�!");
			
		});
		
		
		
		

		// ��ġ
		this.setLocation(300, 200);
		// ũ��
		this.setSize(400, 300);
		// �����ֱ�
		this.setVisible(true);
		// ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new HelloWindow();

	}

}

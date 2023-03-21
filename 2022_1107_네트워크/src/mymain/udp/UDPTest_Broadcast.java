package mymain.udp;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UDPTest_Broadcast extends JFrame {

	
	JTextArea  jta_display;//���â
	
	JTextField jtf_address;//IP �ּ�â
	JTextField jtf_message;//�Է�â
	
	String user_name = "�ڳ�";//��ȭ��
	
	DatagramSocket client;
	
	
	Font font = new Font("����ü", Font.BOLD, 20);
	
	public UDPTest_Broadcast() {
		// TODO Auto-generated constructor stub
		super("Broadcast����");

		//���â �ʱ�ȭ
		init_display();
		
		//�Է�â �ʱ�ȭ
		init_input();
		
		//Ű�̺�Ʈ �ʱ�ȭ
		init_key_event();
		
		//�����ʱ�ȭ
		init_socket();
		
		//��ġ            x     y 
		this.setLocation(300, 200);

		//ũ��        W    H  
		//this.setSize(400, 300);
		pack();

		//�����ֱ�
		this.setVisible(true);

		//����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_socket() {
		// TODO Auto-generated method stub
		try {
			// IP vs Port
			// IP 	: ��ǻ�͸� �ĺ��뵵
			// Port : ��ǻ�ͳ��� ���α׷��� �ĺ��ϱ� ���� �뵵
			// ��Ʈ�� �Ҵ�޾Ƽ� ������ ����
			// port :  0 ~ 65535������ ��밡��
			//		   1024���ϴ� ��κ� ������Ʈ
			//		   ftp:21 /  telnet:23 / http:80
			client = new DatagramSocket(5000);
			
			//������ ����/����
			//�͸�Ŭ���� 
			Thread t = new Thread() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					//������ ���Ŵ�� 
					while(true) {
						
						read_message();
						
					}
				}
				
			};
			t.start();
			
			
			
			
			
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	

	protected void read_message() {
		// TODO Auto-generated method stub
		
		try {
			
			byte [] read_buff = new byte[512];
			//������ ���꿡�� ���۸� �ʿ���
			DatagramPacket dp = new DatagramPacket(read_buff, read_buff.length);
			
			//������ ����
			client.receive(dp); //�����Ͱ� ���Ź��ۿ� ������ �о�´�(����Ÿ�� ������ ������)
			
			InetAddress ia = dp.getAddress();
			
			//���������� �о����
			byte [] read_baytes =dp.getData();
			
			//byte [] String��ȯ
			String read_data = new String(read_baytes).trim(); //read_data = "ȫ�浿#�ȳ��ϼ���"
			
			System.out.printf("[%s] : %s\n",ia.getHostAddress(), read_data);
			
			
			//��ȭ��#�޽��� �и� : split
			String [] data_array = read_data.split("#");
			//							��ȭ��		�޽���
			//String [] data_array = {"ȫ�浿" , "�ȳ��ϼ���"};
			
			
			
			
			//���â�� ���
			String display_message = String.format("[%s]�� ����\r\n  %s\r\n", data_array[0], data_array[1] );

			jta_display.append(display_message);
			
			//���� �ؽ�Ʈ�� ���̸� ���Ѵ�.
			int position = jta_display.getDocument().getLength();
			//Caret�� ��ġ�� �� ���������� ����
			jta_display.setCaretPosition(position);
			
			jtf_message.setText("");//�Է�â �����
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void init_key_event() {
		// TODO Auto-generated method stub
		
		//�߻�Ŭ����
		KeyAdapter adapter = new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int key = e.getKeyCode();
				
				if(key == KeyEvent.VK_ENTER){
					send_message();
				}
				
			}
			
		};
		
		//�޼���â���� Ű�� ������
		jtf_message.addKeyListener(adapter);
		
		
		
		
		
	}
	//keyPressed = enter key method
	protected void send_message() {
		// TODO Auto-generated method stub
		
		//�޼���â�� �Էµ� ������ �о�´�. ->��������
		String message = jtf_message.getText().trim();
		
		if(message.isEmpty()) {
			
			jtf_message.setText("");//�Է�â �����
			
			return;
		}
		
		try {
			//�����ؾߵ� �����͸� ���� -> ��Ʈ��ũ�� ����
			String send_data = String.format("%s#%s",user_name,message);
			//������ �ּ�
			String ip = jtf_address.getText();
			InetAddress ia = InetAddress.getByName(ip);
			
			//DatagramPacket���� ����
			
			//String -> byte [] ��ȯ 
			byte [] send_bytes = send_data.getBytes();
			DatagramPacket dp = new DatagramPacket(send_bytes, send_bytes.length, ia, 5000);
			
			//����
			client.send(dp);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//���â : ��³��� �׽�Ʈ
		/*
		String display_message = String.format("[%s]�� ����\r\n  %s\r\n", user_name, message );

		jta_display.append(display_message);
		
		//���� �ؽ�Ʈ�� ���̸� ���Ѵ�.
		int position = jta_display.getDocument().getLength();
		//Caret�� ��ġ�� �� ���������� ����
		jta_display.setCaretPosition(position);
		
		jtf_message.setText("");//�Է�â �����
		*/
		
		
	}

	private void init_input() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel(new GridLayout(2, 1));
		
		//�ּ�â
		jtf_address = new JTextField("255.255.255.255");
		//�޼���â
		jtf_message = new JTextField();
		
		p.add(jtf_address);
		p.add(jtf_message);
		
		//��Ʈ����
		jtf_address.setFont(font);
		jtf_message.setFont(font);
		
		
		this.add(p,"South");

	}

	private void init_display() {
		// TODO Auto-generated method stub
		jta_display = new JTextArea();
		
		JScrollPane jsp = new JScrollPane(jta_display);
		
		jsp.setPreferredSize(new Dimension(400, 400));
		
		this.add(jsp);//Center
		
		//��Ʈ����
		jta_display.setFont(font);
		
		//�б�����
		jta_display.setEditable(false);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UDPTest_Broadcast();
	}

}

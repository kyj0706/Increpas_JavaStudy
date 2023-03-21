package mymain.udp;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class UDPTest_Multicast extends JFrame {

	
	JTextArea  jta_display;//���â
	
	JTextField jtf_address;//IP �ּ�â
	JTextField jtf_message;//�Է�â
	
	JList<String> jlist_join;//���Ը�� ������ ������Ʈ
	List<String> join_list = new ArrayList<String>();//�����Ͱ�����
	
	JList<String> jlust_dep;//�μ���� ������ ������Ʈ
	
	String user_name = "ll";//��ȭ��
	
	MulticastSocket client;
	
	
	Font font = new Font("����ü", Font.BOLD, 16);
	
	public UDPTest_Multicast() {
		// TODO Auto-generated constructor stub
		super("Broadcast����");

		//���â �ʱ�ȭ
		init_display();
		
		//�Է�â �ʱ�ȭ
		init_input();
		
		//���Ը��â �ʱ�ȭ
		init_join_list();
		
		init_department_list();
		
		
		//Ű�̺�Ʈ �ʱ�ȭ
		init_key_event();
		
		//�����ʱ�ȭ
		init_socket();
		
		//��ġ            x     y 
		this.setLocation(2000, 200);

		//ũ��        W    H  
		//this.setSize(400, 300);
		pack();

		//�����ֱ�
		this.setVisible(true);

		//����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_department_list() {
		// TODO Auto-generated method stub
		
		
		
	}

	private void init_join_list() {
		// TODO Auto-generated method stub
		
		jlist_join = new JList<String>();
		
		jlist_join.setPreferredSize(new Dimension(120, 0));
		
		this.add(jlist_join,"East");
		
		jlist_join.setFont(font);
		
		
		
		//�̷��� �� �� �ִ� ���� ����
		/*
		String [] addr = {"224.0.0.1","224.0,0,2","224.0.0.3"};
		jlist_join.setListData(addr);
		*/
		
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
			client = new MulticastSocket(6000);
			
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
			
			
			
			
			
			
		} catch (Exception e) {
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
			DatagramPacket dp = new DatagramPacket(send_bytes, send_bytes.length, ia, 6000);
			
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
		JPanel p = new JPanel(new GridLayout(4, 1));
		
		
		//1��° �� �ּ�â
		jtf_address = new JTextField("224.0.0.1");
		
		
		//2��°�� : �μ���ư 4��
		//�Ѻι� :244.0.0.1  �λ��:224.0.0.2   �渮�� : 224.0.0.3   ������ : 224.0.0.4
		JPanel p2 = new JPanel(new GridLayout(1,4));
		JButton jbt_c = new JButton("�ѹ�");
		JButton jbt_i = new JButton("�λ�");
		JButton jbt_m = new JButton("�渮");
		JButton jbt_y = new JButton("����");
		
		jbt_c.setFont(font);
		jbt_i.setFont(font);
		jbt_m.setFont(font);
		jbt_y.setFont(font);
		
		
		//jtf_address.setText("224.0.0.1");
		//jtf_address.setText("224.0.0.2");
		//jtf_address.setText("224.0.0.3");
		//jtf_address.setText("224.0.0.4");
		
		
		
		p2.add(jbt_c);
		p2.add(jbt_i);
		p2.add(jbt_m);
		p2.add(jbt_y);
		
		jbt_c.addActionListener(e ->{on_dmt_join_c();}); //���ٽ�
		jbt_i.addActionListener(e ->{on_dmt_join_i();}); //���ٽ�
		jbt_m.addActionListener(e ->{on_dmt_join_m();}); //���ٽ�
		jbt_y.addActionListener(e ->{on_dmt_join_y();}); //���ٽ�
		
		
		
		
		//3��° �� ��ư2��
		JPanel p1 = new JPanel(new GridLayout(1, 2));
		JButton jbt_join = new JButton("����");
		JButton jbt_leave = new JButton("Ż��");
		
		jbt_join.setFont(font);
		jbt_leave.setFont(font);
		
		p1.add(jbt_join);
		p1.add(jbt_leave);
		
		
		//��ư�̺�Ʈ
		// lambda��
		jbt_join.addActionListener(e ->{on_button_join();}); //���ٽ�
		
		// anonymous(�͸�)
		jbt_leave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				on_button_leave();
				
			}
		});
		
		
		
		//�޼���â
		jtf_message = new JTextField();
		
		p.add(jtf_address);
		p.add(p1);
		p.add(p2);
		p.add(jtf_message);
		//��Ʈ����
		jtf_address.setFont(font);
		jtf_message.setFont(font);
		
		
		this.add(p,"South");

	}
	//����
	private void on_dmt_join_y() {
		// TODO Auto-generated method stub
		jtf_address.setText("224.0.0.4");
		
		String message = jtf_message.getText().trim();
		jtf_address = new JTextField("224.0.0.4");
		String ip = jtf_address.getText();
		String y = "������";
		if(message.isEmpty()) {
			
			jtf_message.setText("");//�Է�â �����
			
			return;
		}
		try {
			InetAddress ia = InetAddress.getByName(ip);
			
			String send_data = String.format("[%s]%s#%s",y,user_name,message);
			
			//String -> byte [] ��ȯ 
			byte [] send_bytes = send_data.getBytes();
			DatagramPacket dp = new DatagramPacket(send_bytes, send_bytes.length, ia, 6000);
			
			//����
			client.send(dp);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//�渮
	private void on_dmt_join_m() {
		// TODO Auto-generated method stub
		String message = jtf_message.getText().trim();
		
		jtf_address = new JTextField("224.0.0.3");
		
		String ip = jtf_address.getText();
		if(message.isEmpty()) {
			
			jtf_message.setText("");//�Է�â �����
			
			return;
		}
		try {
			InetAddress ia = InetAddress.getByName(ip);
			
			String send_data = String.format("%s#%s",user_name,message);
			
			//String -> byte [] ��ȯ 
			byte [] send_bytes = send_data.getBytes();
			DatagramPacket dp = new DatagramPacket(send_bytes, send_bytes.length, ia, 6000);
			
			//����
			client.send(dp);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//�λ�
	private void on_dmt_join_i() {
		// TODO Auto-generated method stub
		String message = jtf_message.getText().trim();
		
		jtf_address = new JTextField("224.0.0.2");
		
		String ip = jtf_address.getText();
		if(message.isEmpty()) {
			
			jtf_message.setText("");//�Է�â �����
			
			return;
		}
		try {
			InetAddress ia = InetAddress.getByName(ip);
			
			String send_data = String.format("%s#%s",user_name,message);
			
			//String -> byte [] ��ȯ 
			byte [] send_bytes = send_data.getBytes();
			DatagramPacket dp = new DatagramPacket(send_bytes, send_bytes.length, ia, 6000);
			
			//����
			client.send(dp);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//�ѹ�
	private void on_dmt_join_c() {
		// TODO Auto-generated method stub
		String message = jtf_message.getText().trim();
		
		jtf_address = new JTextField("224.0.0.1");
		
		String ip = jtf_address.getText();
		if(message.isEmpty()) {
			
			jtf_message.setText("");//�Է�â �����
			
			return;
		}
		try {
			InetAddress ia = InetAddress.getByName(ip);
			
			String send_data = String.format("%s#%s",user_name,message);
			
			//String -> byte [] ��ȯ 
			byte [] send_bytes = send_data.getBytes();
			DatagramPacket dp = new DatagramPacket(send_bytes, send_bytes.length, ia, 6000);
			
			//����
			client.send(dp);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	//on_xxxx() : callback �޼ҵ� (�ڵ�ȣ��Ǵ� �Լ�)
	private void on_button_leave() {
		// TODO Auto-generated method stub
		//JList ����߿��� ���ð� ������
		String ip = jlist_join.getSelectedValue();
		if(ip==null) {
			JOptionPane.showConfirmDialog(this, "Ż���� �׷��ּҸ� �����ϼ���");
			
			return;
		}
	
		 //System.out.println(ip);
		try {
			
			//Ż�𿩺� Ȯ��											����(message)    ����(title)    button����
			int result = JOptionPane.showConfirmDialog(this, "���� Ż���Ͻðڽ��ϱ�", "�׷�Ż��", JOptionPane.YES_NO_OPTION);
			//if(result == JOptionPane.NO_OPTION || result == JOptionPane.CLOSED_OPTION) return;
			if(result != JOptionPane.YES_OPTION) return;
			
			InetAddress ia = InetAddress.getByName(ip);
			client.leaveGroup(ia);//Ż��
			//join_list���� ip���� ����
			join_list.remove(ip);
			show_join_list();
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	

	private void on_button_join() {
		// TODO Auto-generated method stub
		//������ �ּ� �о����
		String ip = jtf_address.getText().trim();
		
		if(ip.isEmpty()) {
			JOptionPane.showMessageDialog(this,"������ �ּҸ� �Է����ּ���");
			jtf_address.setText("");//������ �����
			jtf_address.requestFocus();
			return;
		}
		
		try {
			
			if(join_list.contains(ip)) {
				JOptionPane.showMessageDialog(this,"�̹� ���Ե� �ּ��Դϴ�.");
				return;
			}
			
			
			
			
			//ip -> InetAddress�� ���� (�� ?? ���߿� ������)
			InetAddress ia = InetAddress.getByName(ip); // "244.0.0.1" -> InetAddress
			client.joinGroup(ia);//�׷찡��
			
			join_list.add(ip);//�����ּ� ����
			
			show_join_list();//���� ��� �����ֱ�
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

	private void show_join_list() {
		// TODO Auto-generated method stub
		//ArrayList -> Array������ �����͸� ����
		String [] join_array = new String[join_list.size()];
		join_list.toArray(join_array);
		
		jlist_join.setListData(join_array);
		
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
		new UDPTest_Multicast();
	}

}

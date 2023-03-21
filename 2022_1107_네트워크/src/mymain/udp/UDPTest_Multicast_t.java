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

public class UDPTest_Multicast_t extends JFrame {

	
	JTextArea  jta_display;//���â
	
	JTextField jtf_address;//IP �ּ�â
	JTextField jtf_message;//�Է�â
	
	
	JList<String> jlist_join;//���Ը�� ������ ������Ʈ
	List<String>  join_list = new ArrayList<String>();//�����Ͱ� ����
	
	
	String user_name = "ȫ�浿";//��ȭ��
	
	MulticastSocket client;
	
	
	
	Font font = new Font("����ü", Font.BOLD, 16);
	
	public UDPTest_Multicast_t() {
		// TODO Auto-generated constructor stub
		super("Multicast ����");

		//���â �ʱ�ȭ
		init_display();
		
		//�Է�â �ʱ�ȭ
		init_input();
		
		//���Ը��â �ʱ�ȭ
		init_join_list();
		
		
		
		//Ű�̺�Ʈ �ʱ�ȭ
		init_key_event();
		
		//�����ʱ�ȭ
		init_socket();
		
		
		
		
		//��ġ            x     y 
		this.setLocation(900, 100);

		//ũ��        W    H  
		//this.setSize(400, 300);
		pack();

		//�����ֱ�
		this.setVisible(true);

		//����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_join_list() {
		// TODO Auto-generated method stub
		
		
		jlist_join = new JList<String>();
		
		jlist_join.setPreferredSize(new Dimension(120, 0));
		
		this.add(jlist_join,"East");
		
		jlist_join.setFont(font);
		
		/*
		 * String [] addr = {"224.0.0.1","224.0.0.2","224.0.0.3"};
		 * jlist_join.setListData(addr);
		 */
		
	}

	private void init_socket() {
		// TODO Auto-generated method stub
		
		try {
			
			// IP vs Port
			// IP   : ��ǻ�͸� �ĺ��뵵
			// Port : ��ǻ�ͳ��� ���α׷��� �ĺ��ϱ� ���� �뵵
			//��Ʈ��  �Ҵ�޾Ƽ� ������ ����
			//port : 0~65535������ ��밡��
			//       1024���ϴ� ��κ� ������Ʈ  
			//       ftp : 21  telnet : 23    http: 80  
			
			client = new MulticastSocket(6000);
			
			
			//������ ����/����
			Thread t = new Thread() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					//������ ���Ŵ��
					while(true) {
						
						//������ ���Ŵ��->ó��
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
			//������ ���Žÿ��� ���۸� �ʿ���
			DatagramPacket dp = new DatagramPacket(read_buff, read_buff.length);
			
			//������ ����
			client.receive(dp); //�����Ͱ� ���Ź��ۿ� ������ �о�´�(�����Ͱ� ������ ������)
			
			//������ �ּ�
			InetAddress ia = dp.getAddress();
			
			
			//���������� �о����
			byte [] read_bytes = dp.getData();
			
			//byte[] -> String��ȯ
			String read_data = new String(read_bytes).trim(); // read_data="ȫ�浿#�ȳ��ϼ���"
			
			//����͸�
			System.out.printf("[%s] : %s\n", ia.getHostAddress(), read_data);
			
			
			//��ȭ��#�޽��� �и�: split
			String [] data_array = read_data.split("#");
			//                          ��ȭ��       �޽���
			//                            0             1
			//String [] data_array = { "ȫ�浿" , "�ȳ��ϼ���"};
			
			//���â�� ���
			
			String display_message = String.format("[%s]�� ����:\r\n  %s\r\n",
			                                       data_array[0],   data_array[1]   
			);
			jta_display.append(display_message);
			
			//���� �ؽ�Ʈ�� ���̸� ���Ѵ�
			int position = jta_display.getDocument().getLength();
			//Caret�� ��ġ�� �� ���������� ����
			jta_display.setCaretPosition(position);
			 
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private void init_key_event() {
		// TODO Auto-generated method stub
		
		KeyAdapter adapter = new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int key = e.getKeyCode();
				
				if(key == KeyEvent.VK_ENTER) {
					send_message();
				}
				
			}
		};
		
		//Ű�̺�Ʈ ���
		jtf_message.addKeyListener(adapter);
		
	}

	protected void send_message() {
		// TODO Auto-generated method stub
		
		//�޽���â�� �Էµ� ������ �о�´� -> ��������
		String message = jtf_message.getText().trim();
		
		if(message.isEmpty()) {
			jtf_message.setText("");//�Է�â �����
			return;
		}
		
		try {
			
			//�����ؾߵ� �����͸� ����-> ��Ʈ��ũ�� ����
			//     send_data = "ȫ�浿#�ȳ��ϼ���"            
			String send_data = String.format("%s#%s", user_name, message);
			//������ �ּ�
			String ip = jtf_address.getText();
			InetAddress  ia = InetAddress.getByName(ip);
			
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
		String display_message = String.format("[%s]�� ����:\r\n  %s\r\n",
				                             user_name,          message    
				);
		jta_display.append(display_message);
		
		//���� �ؽ�Ʈ�� ���̸� ���Ѵ�
		int position = jta_display.getDocument().getLength();
		//Caret�� ��ġ�� �� ���������� ����
		jta_display.setCaretPosition(position);
		*/
		
		
		jtf_message.setText("");//�Է�â �����
	}

	private void init_input() {
		// TODO Auto-generated method stub
		JPanel  p = new JPanel(new GridLayout(4, 1));
		
		//1��°�� : �ּ�â
		jtf_address = new JTextField("224.0.0.1"); //multicast�ּ�
		
		//2��°�� : �μ���ư4��
		// �ѹ���:224.0.0.1  �λ��:224.0.0.2  �渮��:224.0.0.3  ������:224.0.0.4
		JPanel p2 = new JPanel(new GridLayout(1, 5));
		JButton jbt_dept1 = new JButton("�ѹ���");
		JButton jbt_dept2 = new JButton("�λ��");
		JButton jbt_dept3 = new JButton("�渮��");
		JButton jbt_dept4 = new JButton("������");
		JButton jbt_dept5 = new JButton("��ü");
		
		p2.add(jbt_dept1);
		p2.add(jbt_dept2);
		p2.add(jbt_dept3);
		p2.add(jbt_dept4);
		p2.add(jbt_dept5);
			
		//���μ���ư Ŭ����
		jbt_dept1.addActionListener( e->{ jtf_address.setText("224.0.0.1");  });
		jbt_dept2.addActionListener( e->{ jtf_address.setText("224.0.0.2");  });
		jbt_dept3.addActionListener( e->{ jtf_address.setText("224.0.0.3");  });
		jbt_dept4.addActionListener( e->{ jtf_address.setText("224.0.0.4");  });
		jbt_dept5.addActionListener( e->{ jtf_address.setText("255.255.255.255");  });
		//jtf_address.setText("224.0.0.1");
		
		
		
		//3��°�� : ��ư2��
		JPanel p1 = new JPanel(new GridLayout(1, 2));
		JButton jbt_join  = new JButton("����");
		JButton jbt_leave = new JButton("Ż��");
		
		jbt_join.setFont(font);
		jbt_leave.setFont(font);
		
		p1.add(jbt_join);
		p1.add(jbt_leave);
		
		
		
		//��ư�̺�Ʈ
		//  lambda��
		jbt_join.addActionListener( e->{ on_button_join(); });
		
		//  Anoymous�� ó��
		jbt_leave.addActionListener( new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				on_button_leave();
			}
		} );
		
		
		
		//�޽���â
		jtf_message = new JTextField();
		
		p.add(jtf_address);
		p.add(p2);
		p.add(p1);
		p.add(jtf_message);
		
		//��Ʈ����
		jtf_address.setFont(font);
		jtf_message.setFont(font);
		
		this.add(p,"South");
	}

	
	// on_xxxx() : callback�޼ҵ�(�ڵ�ȣ��Ǵ� �Լ�)
	private void on_button_leave() {
		// TODO Auto-generated method stub
		
		//JList����߿��� ���ð� ������
		String ip = jlist_join.getSelectedValue();
		if(ip==null) {
			
			JOptionPane.showMessageDialog(this, "Ż���� �׷��ּҸ� �����ϼ���!!");
			return;
		}
		
		//System.out.println(ip);
		try {
			

			//Ż�𿩺� Ȯ��                                        message              title     button����
			int result = JOptionPane.showConfirmDialog(this, "���� Ż���Ͻðڽ��ϱ�?","�׷�Ż��", JOptionPane.YES_NO_OPTION);
			
			//System.out.println(result);
			
			if(result != JOptionPane.YES_OPTION) return;
			
			
			InetAddress ia = InetAddress.getByName(ip);
			client.leaveGroup(ia);//Ż��
			//join_list���� ip�� ����
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
			
			JOptionPane.showMessageDialog(this, "������ �ּҸ� �Է��ϼ���!!");
			jtf_address.setText("");//������ �����
			jtf_address.requestFocus();
			return;
		}
		
		
		try {
			
			if(join_list.contains(ip)) {
				JOptionPane.showMessageDialog(this, "�̹� ���Ե� �ּ��Դϴ�!!");
				return;
			}
			
			
			//ip->InetAddress
			InetAddress ia = InetAddress.getByName(ip);// "224.0.0.1"->InetAddress
			client.joinGroup(ia);//�׷찡��
			
			join_list.add(ip);//�����ּҸ� ����
			
			show_join_list();//���Ը�� �����ֱ�
					
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		
	}

	private void show_join_list() {
		// TODO Auto-generated method stub
		//ArrayList -> Array������ �����͸� ����
		String []  join_array = new String[join_list.size()];
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

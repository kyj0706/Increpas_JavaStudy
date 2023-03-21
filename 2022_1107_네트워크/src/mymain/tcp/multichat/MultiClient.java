package mymain.tcp.multichat;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiClient extends JFrame {

	
	
	JTextArea  jta_display;
	JList<String> jlist_user;
	
	//��12 �ʿ��Ѱ� ����
	JTextField jtf_message;
	JButton    jbt_connect;
	
	
	
	//��15_3
	boolean bConnect =false;//������� ����Ұž� 
	
	//��17_1 (���ϼ���)
	Socket client;
	//��17_2 (���δ����� �޾ƿ������ؼ� ����IO)
	BufferedReader br;
	
	//��1_1
	String user_name="īī��";
	
	Font font = new Font("����ü", Font.BOLD, 16);
	
	public MultiClient() {
		// TODO Auto-generated constructor stub
		super("��Ƽ Ŭ���̾�Ʈ");

		//���â �ʱ�ȭ
		init_display();
		
		//�����ڼ�â �ʱ�ȭ
		init_input();
		
		//������ ���â �ʱ�ȭ
		init_user_list();
		
		//Ű�̺�Ʈ�ʱ�ȭ
		init_key_event();
		
		//��ġ            x     y 
		this.setLocation(900, 200);

		//ũ��        W    H  
		//this.setSize(400, 300);
		pack();

		//�����ֱ�
		this.setVisible(true);

		//����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_key_event() {
		// TODO Auto-generated method stub
		
		//�͸�Ŭ���� (�̸����� ������ ��ü ����)
		KeyAdapter adapter = new KeyAdapter() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					//����� ���¸� �޼��� ����
					if(bConnect)
						send_message();
				}
			}
		};
		
		
		jtf_message.addKeyListener(adapter);
		
	}

	protected void send_message() {
		// TODO Auto-generated method stub
		String message = jtf_message.getText().trim();
		if(message.isEmpty()) {
			jtf_message.setText("");
			
			return;
		}
		
		try {
			
			//������ �޽��� ���� :        "MSG#īī��#�ȳ�"
			String send_data = String.format("MSG#%s#%s\n", user_name,message);
			client.getOutputStream().write(send_data.getBytes());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//������ ����� 
		jtf_message.setText("");
		
	}

	private void init_input() {
		// TODO Auto-generated method stub
		//��13_1 (�Ʒ� �г��� ����Ұž� )
		//GridLayout�� ����� �����̶�
		//BorderLayout���� ����� �����Ұ� �ŵ�
		JPanel p = new JPanel(new BorderLayout());
		
		//��14_1(�޼��� = �޼��� �ʵ� ���� �־���)
		jtf_message = new JTextField();
		jtf_message.setFont(font);//��Ʈ��������

		//��14_2
		jbt_connect = new JButton("����");
		jbt_connect.setFont(font);
		jbt_connect.setPreferredSize(new Dimension(120,0));
		
		//��14_3 (������ ��ġ�� �����) 
		p.add(jtf_message,"Center");
		p.add(jbt_connect,"East");
		
		//��14_4 (�̰�... �����_)
		this.add(p,"South");
		
		
		//��15_1 
		//�����ư �̺�Ʈ
		jbt_connect.addActionListener(e ->{on_button_cnnect();});
		
		
	}

	private void on_button_cnnect() {
		// TODO Auto-generated method stub
		//��15_2
		bConnect = !bConnect; // ��Ŭ
		
		if(bConnect) {
			//��������
			
			try {
				//��17_3 (����ó��)
				client = new Socket("localhost",8000);
				
				//��1_2 : ������ó��
				//����޽��� ���� : IN#��ȭ��\n -> IN#īī��\n
				String send_data= String.format("IN#%s\n", user_name);
				//��1_3
				client.getOutputStream().write(send_data.getBytes());
				
				//�޽�������
				read_message();
				
				
				
		
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//��17_5 
				bConnect = false;
				e.printStackTrace();
			}
			
			
			
		}else {
			//����
			try {
				//��17_4 (����ó��)
				client.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//��ưĸ�� ����
		jbt_connect.setText(bConnect ? "����" : "����");
		
	}

	private void read_message() {
		// TODO Auto-generated method stub
		try {
			InputStreamReader isr = new InputStreamReader(client.getInputStream());
			br					  = new BufferedReader(isr);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//���� ������ �Ҵ� �޽��� ���Ŵ�� ��Ų��.
		new Thread() {
			
			public void run() {
				
				while(true) {
					
					try {
						String readData = br.readLine();
						if(readData==null)break;
						
						//������ó��
						//readData = "IN#��ȭ��"
						//readData = "OUT#��ȭ��"
						//String send_data = "LIST#īī��1#īī��2#īī��\n"
						String [] msg_array = readData.split("#");
						//                         0        1
						//String [] mag_array = ["IN" , "īī��"];
						//String [] mag_array = ["OUT" , "īī��"];
						//String [] mag_array = ["LIST" , "īī��"];
						
						if(msg_array[0].equals("IN")) {
							//�����
							
							String mesaage = String.format("[%s]�� �����ϼ̽��ϴ�.", msg_array[1]);
							display_message(mesaage);
							
						}else if (msg_array[0].equals("OUT")) {
							//�����
							String mesaage = String.format("[%s]�� �����ϼ̽��ϴ�.", msg_array[1]);
							display_message(mesaage);
						}else if (msg_array[0].equals("LIST")) {
							//�����ڸ��
							display_user_list(msg_array);
						}else if (msg_array[0].equals("MSG")) {
							String message = String.format("[%s]���� �� :%s\r\n", msg_array[1],msg_array[2]);
							display_message(message);
							
						}
						
						
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
						//���������� �����������
						break;
					}
					
				}//end : while
			}//end : run()
		}.start();
	}//end : read_message()

	protected void display_user_list(String[] msg_array) {
		// TODO Auto-generated method stub
		//String send_data = "LIST#īī��1#īī��2#īī��\n"
		msg_array[0] ="[�����ο�]";
		jlist_user.setListData(msg_array);
	}

	private void init_user_list() {
		// TODO Auto-generated method stub
		jlist_user = new JList<String>();
		
		JScrollPane jsp = new JScrollPane(jlist_user);
		
		jsp.setPreferredSize(new Dimension(120, 0));
		
		this.add(jsp, "East");
		
	}

	

	private void init_display() {
		// TODO Auto-generated method stub
		jta_display =  new JTextArea();
		
		JScrollPane jsp = new JScrollPane(jta_display);
		
		jsp.setPreferredSize(new Dimension(400, 400));
		
		this.add(jsp,"Center");
		
		jta_display.setFont(font);
		
		//�б�����
		jta_display.setEditable(false);
		
	}
	
	private void display_message(String message) {
		// TODO Auto-generated method stub
		// (���� �÷��ٲ���)
		jta_display.append(message);
		jta_display.append("\r\n");
		
		//(�׻� �ֱ� �߰��� ���� ȭ�鿡 ���̵��� ó��...)
		int position =jta_display.getDocument().getLength();
		jta_display.setCaretPosition(position);
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MultiClient();
	}
	
	
	
	
	
	

}

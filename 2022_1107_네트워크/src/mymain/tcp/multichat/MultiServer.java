package mymain.tcp.multichat;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiServer extends JFrame {

	//��1 (�ʿ��Ѱ� ����)
	JTextArea 	jta_display;
	JTextField  jtf_user_count;//
	JList<String> jlist_user;
	
	//��16_1 (���������� ����ô�)
	ServerSocket server;
	
	//��18_10 : ���ӵ� ������ ���� ������ ���
	List<ReadThread> socketList= new ArrayList<ReadThread>();
	
	//��3_1 :�����ڸ�� ���� 
	List<String> userList = new ArrayList<String>();
	
	//��1_1 : ����ȭ ������ü
	Object syncObj = new Object();
	
	//��3(��Ʈ����)
	Font font = new Font("����ü", Font.BOLD, 16);
	

	
	//�⺻������
	public MultiServer() {
		// TODO Auto-generated constructor stub

		super("��Ƽ����");

		//(�ʱ�ȭ[�غ�])
		//��1_1 : ���â�ʱ�ȭ 
		init_display();
		//��1_2 :�����ڼ�â �ʱ�ȭ
		init_user_count();
		//��1_3�����ڸ��â �ʱ�ȭ
		init_user_list();
		
		//��16_2: ������ �ʱ�ȭ
		init_server();
		
		
		//��ġ            x     y
		this.setLocation(300, 200);

		//ũ��        W     H
		//this.setSize(400, 300);
		
		//��2 (�ڽ��� window ����)
		pack();
		

		//�����ֱ�
		this.setVisible(true);

		//����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_server() {
		// TODO Auto-generated method stub
		
		
		
		try {
			//��16_3 (�Է��� ����ó��)
			server = new ServerSocket(8000);
			
			//���� ������ �Ҵ��ؼ� ��ñ�Ŵ�.
			//��16_5 (�͸����� ������ش�) �ϲ۵���
			//�� ? ���� �� �Ұ� ���� �׳� ������ �ϸ� �Ǵϱ�
			new Thread() {
				public void run() {
					//��16_6 -> 16_4�� ������ �� �ϲۿ��� �Ҵ��� �ִ°Ŵ�
					while(true) {
						try {
							//���Ӵ�� -> �ڼ�Ĺ������ ��û���� ����
							Socket chrid = server.accept();
							
							//��18_11
							ReadThread rt = new ReadThread(chrid);
							rt.start();
							socketList.add(rt);

							//��19_1 : (�����ڼ��� ���)
							display_user_count();
							
							
							//�������� Ȯ�ο� 
							//InetAddress ia = chrid.getInetAddress();
							//System.out.printf("[%s]�� �����û\n",ia);
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}.start();
			
			//���������
			//��16_7(������ �����Ǵ��� �������� (����ڿ���)
			display_message("���� ������...");
			
			
			//��16_4 (�̷��� �ϸ� main���� �Ͻ�Ű�� ��~~�� ������̴� �׷��� ȭ�鵵 �ȶ��)
			//�� ? �ƴ� ���°� ���ݾ� .... ���϶�� ? main�� �ľ��ϽŴ�.
			//�׷��� �۾��ڸ� �ϳ� ������ ���� (��!! ���� !!) 16_5��
//			while(true) {
//				
//				Socket chrid = server.accept();//ť���� ?
//			}
//			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void display_user_count() {
		// TODO Auto-generated method stub
		//��19_2 : user count �մϴ�.
		jtf_user_count.setText(socketList.size()+"");
		
	}

	private void display_message(String message) {
		// TODO Auto-generated method stub
		//��16_8 (���� �÷��ٲ���)
		jta_display.append(message);
		jta_display.append("\r\n");
		
		//��16_9 (�׻� �ֱ� �߰��� ���� ȭ�鿡 ���̵��� ó��...)
		int position =jta_display.getDocument().getLength();
		jta_display.setCaretPosition(position);
		
	}

	private void init_user_list() {
		// TODO Auto-generated method stub
		//��11_1 (user�� ����Ʈ ����Ұž�
		jlist_user = new JList<String>();
		//��11_2
		JScrollPane jsp = new JScrollPane(jlist_user);//(�������� ȭ���� �þ�� ��ũ������)
		jsp.setPreferredSize(new Dimension(120, 0));//(����Ҳ� new ������� �̰ž�)
		this.add(jsp,"East");// (�־��� �����ʿ�)
		
	}

	private void init_user_count() {
		// TODO Auto-generated method stub
		//��9_1 (�Ʒ� �г��� ����Ұž� 1�ٿ� 3����)
		JPanel p = new JPanel(new GridLayout(1,3));
		
		//��10_1 (JPanel �����Ѱ� ��ġ ��Ƽ� ����ž�)
		JLabel jlb_title1 = new JLabel("�����ڼ�:",JLabel.RIGHT);
		jlb_title1.setFont(font); //��Ʈ��������
		
		jtf_user_count = new JTextField("0");//����ī��Ʈ �Ұ� ������� ������ 0�̾�
		jtf_user_count.setFont(font);//��Ʈ��������
		jtf_user_count.setHorizontalAlignment(JTextField.CENTER);// �������� ������ݾ� ����� ����
		
		JLabel jlb_title2 = new JLabel("(��)");
		jlb_title1.setFont(font);
		
		//��10_2 (������ ������ �̷���)[add������ �ٸ��� �������� ������ �ٲ��.]
		p.add(jlb_title1);
		p.add(jtf_user_count);
		p.add(jlb_title2);
		
		
		
		//��9_2 (�־��� ����[�Ʒ����ٰ�])
		this.add(p,"South");
		
	}

	private void init_display() {
		// TODO Auto-generated method stub
		//��5 (������ <-�Է�â ����[����])
		jta_display = new JTextArea();
		//��6_1 (�������� ȭ���� �þ�� ��ũ������)
		JScrollPane jsp = new JScrollPane(jta_display);
		//��6_2 (����Ҳ� new ������� �̰ž�)
		jsp.setPreferredSize(new Dimension(400, 400));
		//��6_3 (��ġ�� �߰��̾�)
		this.add(jsp,"Center");
		//��7(������ ������ ��Ʈ�� �����ؼ� ������)
		jta_display.setFont(font);
		//��8 (�б⸸ ���� ����¾ȵ�)
		jta_display.setEditable(false);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new MultiServer();

	}
	
	//--���ž����� ����Ŭ������ ����
		//��18_1 (����Ŭ������ ���) 
		//�� ? �� ����ϱ� ���� ???
		class ReadThread extends Thread
		{
			//��18_2
			Socket child;
			BufferedReader br;
			
			
			
			//��18_4 ������
			public ReadThread(Socket child) {
				super();
				this.child = child;
				
				try {
					//��18_5(����ó��)
					InputStreamReader isr = new InputStreamReader(child.getInputStream());
					//��18_6
					br					  = new BufferedReader(isr);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				
			}
			
			//��18_3
			@Override
			public void run() {
			// TODO Auto-generated method stub
				while(true) {
					
					//��18_7
					try {
						String readData = br.readLine();//1���δ����� �ޱ�
						//��18_8
						if(readData==null) {
							//System.out.println("--[��������]--");
							break;
						}
						//��2_1 ������ �ް� ó��
						//������ ó��
						String [] msg_array = readData.split("#");
						//readData = "IN#īī��" :
						//                        0      1
						//String [] msg_array =["IN","īī��"];
						
						//��2_2 [0]�� IN�� �¾� ???
						if(msg_array[0].equals("IN")) {
							
							//��1_2
							synchronized (syncObj) 
							{
							
							//��3_2 : ���� IN�� ������ 
							//������Ͽ� �߰���
							userList.add(msg_array[1]);
							
							//��4_1 : ������ ����� ��������Ʈ�� ���
							display_user_list();
							
							send_message_all(readData+"\n");
							
							//���� ������ ����� ��� Ŭ���̾�Ʈ���� ����
							send_user_list_all();
							
							}
						}else if (msg_array[0].equals("MSG")) {
							
							synchronized (syncObj) 
							{
							//��������ڿ��� ����
							send_message_all(readData+"\n");
							}
						}
							
						
						
						
					} catch (IOException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
						//System.out.println("--[����������]--");
						break;
					}
					
					
				}//end : while
				
				//��1_3
				synchronized(syncObj) 
				{
				
					//��20_1
					//�����Ȳ
					int index = socketList.indexOf(this); //ArrayList�� ����� index���Ѵ�.
					socketList.remove(index);
					display_user_count();
					
					//��4_3
					//������Ͽ��� �������� ����
					String del_user_name =userList.get(index);//������ ������ ���´�.
					userList.remove(index);
					display_user_list();
				
					//���������� ���ӵ� ��� Ŭ���̾�Ʈ���� ����
					String send_data = String.format("OUT#%s\n", del_user_name);
					
					send_message_all(send_data);
					
					//���� ������ ����� ��� Ŭ���̾�Ʈ���� ����
					send_user_list_all();
				
				}
				
			}//end: run()
			
		}//end : ReadThread

		public void display_user_list() {
			// TODO Auto-generated method stub
			//��4_2 : ������ ����� �迭�� ��Ƽ� ����մϴ�.
			String [] user_array = new String [userList.size()];
			userList.toArray(user_array);
			jlist_user.setListData(user_array);
		}

		public void send_user_list_all() {
			// TODO Auto-generated method stub
			//String send_data = "LIST#īī��1#īī��2#īī��\n"
			
			
			StringBuffer sb = new StringBuffer("LIST#");
			
			for(String user_name : userList) {
				
				sb.append(user_name);
				sb.append("#");
			}
			sb.append("\n");
			
			String send_data = sb.toString();
			
			//System.out.print(send_data);
			
			send_message_all(send_data);
			
			
		}

		public void send_message_all(String send_data) {
			// TODO Auto-generated method stub
			for(ReadThread rt : socketList) {
				try {
					rt.child.getOutputStream().write(send_data.getBytes());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
		}
		
	

}


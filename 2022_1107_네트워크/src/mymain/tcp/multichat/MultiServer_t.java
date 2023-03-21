package mymain.tcp.multichat;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

public class MultiServer_t extends JFrame {

	
	
	JTextArea  jta_display;
	JTextField jtf_user_count;
	JList<String> jlist_user;
	
	ServerSocket  server;
	
	List<ReadThread> socketList = new ArrayList<ReadThread>();//���ӵ� ���������� ��������
	List<String>     userList   = new ArrayList<String>();    //�����ڸ������
	
	//����ȭ ������ü
	Object syncObj = new Object();
	
	
	
	Font font = new Font("����ü", Font.BOLD, 16);
	
	public MultiServer_t() {
		// TODO Auto-generated constructor stub
		super("��Ƽ����_t");

		//���â �ʱ�ȭ
		init_display();
		
		//�����ڼ�â �ʱ�ȭ
		init_user_count();
		
		//������ ���â �ʱ�ȭ
		init_user_list();
		
		//�����ʱ�ȭ
		init_server();
		
		
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

	private void init_server() {
		// TODO Auto-generated method stub
		
		
		try {
			server = new ServerSocket(8000);
			
			//���� ������ �Ҵ��ؼ� ����Ų��
			new Thread() {
				
				public void run() {
					
					while(true) {
						
						try {
							//���Ӵ�� -> �ڼ��ϻ����� ��û���� ����
							Socket child = server.accept();
							
							
							ReadThread rt = new ReadThread(child);
							rt.start();
							
							socketList.add(rt);
							//�����ڼ��� ���
							display_user_count();
							
							//InetAddress ia = child.getInetAddress();
							//System.out.printf("[%s]�� �����û\n", ia.getHostAddress());
							
							
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				
			}.start();
			
			//���������
			display_message("���� ������...");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	protected void display_user_count() {
		// TODO Auto-generated method stub
		jtf_user_count.setText( socketList.size() + "" );
	}

	private void display_message(String message) {
		// TODO Auto-generated method stub
		jta_display.append(message);
		jta_display.append("\r\n");
		
		//�׻� �ֱ��߰��� ���� ȭ�鿡 ���̵��� ó��...
		int position = jta_display.getDocument().getLength();
		jta_display.setCaretPosition(position);
			
		
	}

	private void init_user_list() {
		// TODO Auto-generated method stub
		jlist_user = new JList<String>();
		
		JScrollPane jsp = new JScrollPane(jlist_user);
		
		jsp.setPreferredSize(new Dimension(120, 0));
		
		this.add(jsp, "East");
		
	}

	private void init_user_count() {
		// TODO Auto-generated method stub
		
		JPanel p = new JPanel(new GridLayout(1, 3));
		
		JLabel jlb_title1 = new JLabel("�����ڼ�:", JLabel.RIGHT);
		jlb_title1.setFont(font);
		
		jtf_user_count = new JTextField("0");
		jtf_user_count.setFont(font);
		jtf_user_count.setHorizontalAlignment(JTextField.CENTER);
		
		JLabel jlb_title2 = new JLabel("(��)");
		jlb_title2.setFont(font);
		
		p.add(jlb_title1);
		p.add(jtf_user_count);
		p.add(jlb_title2);
				
		
		this.add(p, "South");
		
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MultiServer_t();
	}
	
//---���ž����� ����Ŭ������ ����
	class ReadThread extends Thread
	{
		Socket child;
		BufferedReader br;
		
	
		public ReadThread(Socket child) {
			super();
			this.child = child;
			
			try {
				//InputStream -> InputStreamReader -> BufferedReader
				InputStreamReader isr = new InputStreamReader(child.getInputStream());
				br                    = new BufferedReader(isr); 
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}



		@Override
		public void run() {
		// TODO Auto-generated method stub
		    while(true) {
		    	
		    	try {
					
		    		String readData = br.readLine();//1���δ����� �ޱ�
		    		
					if(readData==null) {
						//System.out.println("--��������--");
						break;
					}
					
					//�����
					display_message(readData);
					
					//�弳������ filter
					String [] bad_string={"����","���۳�","���ϳ�"};
					
					for(String bad : bad_string) {
						
						readData = readData.replaceAll(bad, "***");
					}
					
					/* �����Ű�� 
					 	if(readData.contains("����")) {
						child.close(); //����
						break;
					}*/
					
					
					
					
					
					//������ ó��
					String [] msg_array = readData.split("#");
					
					// readData = "IN#ȫ�浿"; 
					// readData = "MSG#ȫ�浿#�ȳ��ϼ���"; 
					//                            0       1            2   
					// String [] msg_array  = { "IN"  , "ȫ�浿" };
					// String [] msg_array  = { "MSG" , "ȫ�浿" ,"�ȳ��ϼ���"};
					
					//����޽�����
					if(msg_array[0].equals("IN")) {
						
						synchronized (syncObj) 
						{
							//�����ڸ��� ������� �߰�
							userList.add(msg_array[1]);
							//������ ����� ��������Ʈ�� ���
							display_user_list();
							
							send_message_all(readData+"\n");
							
							//���� ������ ����� ��� Ŭ���̾�Ʈ���� ����
							send_user_list_all();
						}
					}else if(msg_array[0].equals("MSG")) {
						
						synchronized (syncObj) 
						{
							//��������ڿ��� ����
							send_message_all(readData+"\n");
						}
						
					}else if(msg_array[0].equals("DRAW")) {
						
						synchronized (syncObj) 
						{
							//��������ڿ��� ����
							send_message_all(readData+"\n");
						}
						
					}
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
					//System.out.println("--����������--");
					break;
				}
		    	
		    }//end-while
		    
		 
		    synchronized (syncObj) 
		    {
			    //�����Ȳ
			    int index = socketList.indexOf(this);//ArrayList�� ����� index���Ѵ�
			    socketList.remove(index);
			    display_user_count();
			    
			    //������Ͽ��� �������� ����
			    String del_user_name = userList.get(index);//������ ������ ���´�
			    userList.remove(index);
			    display_user_list();
			    
			    //���������� ���ӵ� ��� Ŭ���̾�Ʈ���� ����
			    String send_data = String.format("OUT#%s\n", del_user_name);
			    
			    send_message_all(send_data);
			    
			    //���� ������ ����� ��� Ŭ���̾�Ʈ���� ����
				send_user_list_all();
			    
			    
			    
		    }
		    
		}//end-run() 
		
	}//end-ReadThread	

	
	public void display_user_list() {
		// TODO Auto-generated method stub
		String []  user_array = new String[userList.size()];
		userList.toArray(user_array);
		jlist_user.setListData(user_array);
				
	}

	public void send_user_list_all() {
		// TODO Auto-generated method stub
		//String send_data = "LIST#�浿1#�浿2#�浿3#\n"
		
		StringBuffer sb = new StringBuffer("LIST#");
		
		for(String user_name : userList) {
			
			sb.append(user_name);
			sb.append("#");
		}
		
		sb.append("\n");
		
		String send_data = sb.toString();
		
		//System.out.print(send_data);
		//��������� ������ڿ��� ����
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

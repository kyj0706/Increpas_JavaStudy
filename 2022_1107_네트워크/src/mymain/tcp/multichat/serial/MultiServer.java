package mymain.tcp.multichat.serial;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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

	JTextArea jta_display;
	JTextField jtf_user_count;
	JList<String> jlist_user;

	ServerSocket server;

	List<ReadThread> socketList = new ArrayList<ReadThread>();// ���ӵ� ���������� ��������
	List<String> userList = new ArrayList<String>(); // �����ڸ������

	// ����ȭ ������ü
	Object syncObj = new Object();

	Font font = new Font("����ü", Font.BOLD, 16);

	public MultiServer() {
		// TODO Auto-generated constructor stub
		super("��Ƽ����");

		// ���â �ʱ�ȭ
		init_display();

		// �����ڼ�â �ʱ�ȭ
		init_user_count();

		// ������ ���â �ʱ�ȭ
		init_user_list();

		// �����ʱ�ȭ
		init_server();

		// ��ġ x y
		this.setLocation(300, 200);

		// ũ�� W H
		// this.setSize(400, 300);
		pack();

		// �����ֱ�
		this.setVisible(true);

		// ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private void init_server() {
		// TODO Auto-generated method stub

		try {
			server = new ServerSocket(8500);

			// ���� ������ �Ҵ��ؼ� ����Ų��
			new Thread() {

				public void run() {

					while (true) {

						try {
							// ���Ӵ�� -> �ڼ��ϻ����� ��û���� ����
							Socket child = server.accept();

							ReadThread rt = new ReadThread(child);
							rt.start();

							socketList.add(rt);
							// �����ڼ��� ���
							display_user_count();

							// InetAddress ia = child.getInetAddress();
							// System.out.printf("[%s]�� �����û\n", ia.getHostAddress());

						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}

			}.start();

			// ���������
			display_message("���� ������...");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void display_user_count() {
		// TODO Auto-generated method stub
		jtf_user_count.setText(socketList.size() + "");
	}

	private void display_message(String message) {
		// TODO Auto-generated method stub
		jta_display.append(message);
		jta_display.append("\r\n");

		// �׻� �ֱ��߰��� ���� ȭ�鿡 ���̵��� ó��...
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
		jta_display = new JTextArea();

		JScrollPane jsp = new JScrollPane(jta_display);

		jsp.setPreferredSize(new Dimension(400, 400));

		this.add(jsp, "Center");

		jta_display.setFont(font);

		// �б�����
		jta_display.setEditable(false);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MultiServer();
	}

//---���ž����� ����Ŭ������ ����
	class ReadThread extends Thread {
		Socket child;
		// BufferedReader br;

		ObjectInputStream ois;
		ObjectOutputStream oos;

		public ReadThread(Socket child) {
			super();
			this.child = child;

			try {
				// Client ���� �ݴ�� ObjectStream�� ����
				// �ݴ�� �ϴ� ���� ���� �ָ� �� ?�̶�� �ұ�? �ƴ� ���� ���� �����ϱ�
				ois = new ObjectInputStream(child.getInputStream()); // ����Stream
				oos = new ObjectOutputStream(child.getOutputStream()); // ����Stream

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			while (true) {

				try {

					// Client������ ��ü�� �����Ѱ� -> ��ü�� ���� (������ȭ)
					Data data = (Data) ois.readObject();

					if (data == null) {
						System.out.println("--��������--");
						break;
					}

					// ����ʹ� ���� �Ұ� ����.
					display_message(data.toString());

					// �弳�� ���� filter
					String[] bad_string = { "����", "���۳�", "���ϳ�" };

					for (String bad : bad_string) {
						if (data.message != null)
							data.message = data.message.replaceAll(bad, "***");
					}

					// ������ ó��

					// ����޽�����
					if (data.protocol == Data.IN) {

						synchronized (syncObj) {
							// �����ڸ��� ������� �߰�
							userList.add(data.user_name);
							// ������ ����� ��������Ʈ�� ���
							display_user_list();

							send_message_all(data);

							// ���� ������ ����� ��� Ŭ���̾�Ʈ���� ����
							send_user_list_all();
						}
					} else if (data.protocol == Data.MSG) {

						synchronized (syncObj) {
							// ��������ڿ��� ����
							send_message_all(data);
						}

					} else if (data.protocol == Data.DRAW) {

						synchronized (syncObj) {
							// ��������ڿ��� ����
							send_message_all(data);
						}

					}

				} catch (Exception e) {
					// TODO Auto-generated catch block
					// e.printStackTrace();
					System.out.println("--����������--");
					break;
				}

			} // end-while

			synchronized (syncObj) {
				// �����Ȳ
				int index = socketList.indexOf(this);// ArrayList�� ����� index���Ѵ�
				socketList.remove(index);
				display_user_count();

				// ������Ͽ��� �������� ����
				String del_user_name = userList.get(index);// ������ ������ ���´�
				userList.remove(index);
				display_user_list();

				// ���������� ���ӵ� ��� Ŭ���̾�Ʈ���� ����
				// String send_data = String.format("OUT#%s\n", del_user_name);
				// send_message_all(send_data);
				Data data = new Data();
				data.protocol = Data.OUT;
				data.user_name = del_user_name;
				send_message_all(data);

				// ���� ������ ����� ��� Ŭ���̾�Ʈ���� ����
				send_user_list_all();

			}

		}// end-run()

	}// end-ReadThread

	public void display_user_list() {
		// TODO Auto-generated method stub
		String[] user_array = new String[userList.size()];
		userList.toArray(user_array);
		jlist_user.setListData(user_array);

	}

	public void send_user_list_all() {
		// TODO Auto-generated method stub

		Data data = new Data();
		data.protocol = Data.LIST;
		// collection�� ����ȭ�� ���۽ÿ��� �����۽� ���� ���ο� ��ü�� �����ؼ� ����.
		data.userList = new ArrayList<String>(userList);

		// ��������� ������ڿ��� ����
		send_message_all(data);

	}

	public void send_message_all(Data data) {
		// TODO Auto-generated method stub
		for (ReadThread rt : socketList) {

			try {
				rt.oos.writeObject(data);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}

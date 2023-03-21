package mymain.tcp.multichat.serial;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MultiClient extends JFrame {

	JTextArea jta_display;
	JList<String> jlist_user;

	JTextField jtf_message;
	JButton jbt_connect;

	boolean bConnect = false;// �������

	Socket client;
	String user_name = "ȫ�浿";

	// ��ü����ȭ ó�� ��ü ->��ü�� ����ȭ ��Ű�� ��ü
	ObjectOutputStream oos;
	ObjectInputStream ois;

	// �׸�������
	JPanel grimPan; // ȭ��� �׸���
	Image memPan; // �޸𸮻� �׸���

	int line_thick = 5;// ������
	Color line_color = Color.blue;// ������

	Font font = new Font("����ü", Font.BOLD, 16);

	public MultiClient() {
		// TODO Auto-generated constructor stub
		super("��Ƽ Ŭ���̾�Ʈ");

		// ���â �ʱ�ȭ
		init_display();

		// �޽���â �ʱ�ȭ
		init_input();

		// �׸��� �ʱ�ȭ
		init_grimpan();

		// ���콺 �̺�Ʈ
		init_mouse_event();

		// ������ ���â �ʱ�ȭ
		init_user_list();

		// Ű�̺�Ʈ �ʱ�ȭ
		init_key_event();

		// ��ġ x y
		this.setLocation(600, 100);

		// ũ�� W H
		// this.setSize(400, 300);
		pack();

		// ũ�������Ұ�
		setResizable(false);
		// �����ֱ�
		this.setVisible(true);

		// ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// �׸��ǰ� ȣȯ�Ǵ� �޸𸮻� �׸��ǻ���
		// ����) ȭ����� �׸����� ȭ��� �Ϻ��ϰ� �������Ŀ� �۾��� �ؾߵȴ�
		memPan = grimPan.createImage(400, 400);

	}

	private void init_mouse_event() {
		// TODO Auto-generated method stub
		MouseAdapter adapter = new MouseAdapter() {

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				// super.mouseDragged(e);

				// ����Ǿ����� ������ ������
				if (bConnect == false)
					return;

				// ���콺�� ��ġ
				Point pt = e.getPoint();

				try {

					// ��Ʈ��ũ�� �׸������� ����

					Data data = new Data();
					data.protocol = Data.DRAW;
					data.pt = pt;
					data.line_color = line_color;
					data.line_thick = line_thick;

					oos.writeObject(data);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				// �޸𸮱׸��ǿ� �׸��� ������ ���´�
				/*
				 * Graphics g = memPan.getGraphics(); g.setColor(line_color); g.fillOval(pt.x -
				 * line_thick/2 , pt.y - line_thick/2, line_thick, line_thick);
				 * grimPan.repaint();//grimPan-> paintComponent(g) ����ȣ��
				 */
			}

		};

		grimPan.addMouseMotionListener(adapter);
	}

	private void init_grimpan() {
		// TODO Auto-generated method stub

		grimPan = new JPanel() {

			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				// super.paintComponent(g);
				// �޸� �׸��� ������ �����ؿ´�

				g.drawImage(memPan, 0, 0, this);

			}
		};

		grimPan.setPreferredSize(new Dimension(400, 400));

		this.add(grimPan, "West");

	}

	private void init_key_event() {
		// TODO Auto-generated method stub

		KeyAdapter adapter = new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					// ����� ���¸� �޽��� ����
					if (bConnect)
						send_message();
				}
			}
		};

		jtf_message.addKeyListener(adapter);

	}

	protected void send_message() {
		// TODO Auto-generated method stub
		String message = jtf_message.getText().trim();
		if (message.isEmpty()) {
			jtf_message.setText("");
			return;
		}

		try {

			// ������ �޽��� ����: "MSG#ȫ�浿#�ȳ��ϼ���\n"
			// String send_data = String.format("MSG#%s#%s\n", user_name, message);
			// client.getOutputStream().write(send_data.getBytes());
			Data data = new Data();
			data.protocol = Data.MSG;
			data.user_name = user_name;
			data.message = message;

			oos.writeObject(data);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ���� �Է°� �����
		jtf_message.setText("");
	}

	private void init_input() {
		// TODO Auto-generated method stub
		JPanel p = new JPanel(new BorderLayout());

		jtf_message = new JTextField();
		jtf_message.setFont(font);

		jbt_connect = new JButton("����");
		jbt_connect.setFont(font);
		jbt_connect.setPreferredSize(new Dimension(120, 0));

		// �׸��� �޴�
		JPanel p1 = new JPanel(new GridLayout(1, 3));
		p1.setPreferredSize(new Dimension(400, 0));

		// 1.������
		Integer[] thick_array = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
		JComboBox<Integer> jcb_line_thick = new JComboBox<Integer>(thick_array);
		jcb_line_thick.setFont(font);
		p1.add(jcb_line_thick);

		// 2.������
		JButton jbt_line_color = new JButton("������");
		jbt_line_color.setFont(font);
		p1.add(jbt_line_color);

		// 3.�����
		JButton jbt_clear = new JButton("�����");
		jbt_clear.setFont(font);
		p1.add(jbt_clear);

		p.add(jtf_message, "Center");
		p.add(jbt_connect, "East");
		p.add(p1, "West");

		this.add(p, "South");

		// �����ư �̺�Ʈ
		jbt_connect.addActionListener(e -> {
			on_button_connect();
		});

		// �׸���޴� �̺�Ʈ
		jbt_line_color.addActionListener(e -> {
			on_button_line_color();
		});
		jbt_clear.addActionListener(e -> {
			on_button_clear();
		});

		// �޺��ڽ�
		jcb_line_thick.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				// System.out.println(e);
				// Change�Ȼ��°��� �����̸�...
				if (e.getStateChange() == ItemEvent.SELECTED) {
					line_thick = (int) jcb_line_thick.getSelectedItem();
					// System.out.println(line_thick);
				}

			}
		});

	}

	private void on_button_clear() {
		// TODO Auto-generated method stub
		// �޸𸮻��� �׸����� �����
		Graphics g = memPan.getGraphics();

		g.clearRect(0, 0, 400, 400);

		grimPan.repaint();

	}

	private void on_button_line_color() {
		// TODO Auto-generated method stub

		Color color = JColorChooser.showDialog(this, "�������� �����ϼ���", line_color);

		// System.out.println(color);

		// �������� Ȯ�ι�ưŬ����
		if (color != null)
			line_color = color;

	}

	private void on_button_connect() {
		// TODO Auto-generated method stub
		// Toggleó��
		bConnect = !bConnect;

		if (bConnect) {
			// ��������

			try {

				// client = new Socket("localhost", 8000);
				client = new Socket("localhost", 8500);

				// ����ȭ-> �����ϸ� ���� �հ� �ؾ��� ��
				// ����ȭ ��ü ����
				oos = new ObjectOutputStream(client.getOutputStream()); // ����Stream
				ois = new ObjectInputStream(client.getInputStream()); // ����Stream

				// ����޽��� ����
				// ����
				Data data = new Data();
				data.protocol = Data.IN;
				data.user_name = user_name;

				// ������ ����
				oos.writeObject(data);

				// �޽��� ����
				read_message();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				bConnect = false;
				e.printStackTrace();
			}

		} else {
			// ����

			try {

				client.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		// ��ư ĸ�� ����
		jbt_connect.setText(bConnect ? "����" : "����");

	}

	private void read_message() {
		// TODO Auto-generated method stub

		// ���� ������ �Ҵ� �޽��� ���Ŵ�� ��Ų��
		new Thread() {

			public void run() {

				while (true) {

					try {
						Data data = (Data) ois.readObject();

						if (data == null)
							break;

						// ������ó��

						if (data.protocol == Data.IN) {
							// �����

							String message = String.format("[%s]�� �����ϼ̽��ϴ�", data.user_name);
							display_message(message);

						} else if (data.protocol == Data.OUT) {

							// �����
							String message = String.format("[%s]�� �����ϼ̽��ϴ�", data.user_name);
							display_message(message);

						} else if (data.protocol == Data.LIST) {

							// �迭�� ����غ��ô�. (ĸ��ȭ ������)
							String[] user_array = new String[data.userList.size()];
							// ArrayLust ->Array
							data.userList.toArray(user_array);

							// ������ ���
							display_user_list(user_array);

						} else if (data.protocol == Data.MSG) {

							String message = String.format("[%s]�� ����:\r\n   %s", data.user_name, data.message);

							display_message(message);

						} else if (data.protocol == Data.DRAW) {

							// �׸���

							Graphics g = memPan.getGraphics();
							g.setColor(data.line_color);
							g.fillOval(data.pt.x - data.line_thick / 2, data.pt.y - data.line_thick / 2,
									data.line_thick, data.line_thick);

							grimPan.repaint();

						}

					} catch (Exception e) {
						// TODO Auto-generated catch block
						// e.printStackTrace();
						// ���������� �����������
						break;
					}

				} // end-while

				// ###������ó��###

				// 1.������� : �񿬰�
				bConnect = false;
				// 2.�����ư ĸ�Ǻ���
				jbt_connect.setText("����");
				// 3.�����ڸ�� �ʱ�ȭ(��������)
				display_user_list(new String[0]);

			}// end-run()

		}.start();

	}

	protected void display_user_list(String[] user_array) {
		// TODO Auto-generated method stub

		jlist_user.setListData(user_array);

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
		jta_display = new JTextArea();

		JScrollPane jsp = new JScrollPane(jta_display);

		jsp.setPreferredSize(new Dimension(400, 400));

		this.add(jsp, "Center");

		jta_display.setFont(font);

		// �б�����
		jta_display.setEditable(false);

	}

	private void display_message(String message) {
		// TODO Auto-generated method stub
		jta_display.append(message);
		jta_display.append("\r\n");

		// �׻� �ֱ��߰��� ���� ȭ�鿡 ���̵��� ó��...
		int position = jta_display.getDocument().getLength();
		jta_display.setCaretPosition(position);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MultiClient();
	}

}

package S_test;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.font.ImageGraphicAttribute;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.Timer;

public class s_������window extends JFrame implements ActionListener{
	
	JPanel grimPan;
	
	
	
	
	
//	public List<Image> sm_list = new ArrayList<Image>();
//	
//	public List<Image> getSm_list() {
//		Image [] img_Ch = {
//				Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_1.png"),
//				Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_2.png"),
//				Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_3.png"),
//				Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_4.png"),
//				Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_5.png"),
//				Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_6.png"),
//				Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_7.png"),
//				Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_8.png"),
//				Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_9.png"),
//				Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_10.png"),
//				Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_11.png"),
//				Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_12.png")
//			
//		   	};
//		
//		
//		
//		
//		return sm_list;
//	}
	
	
	
	static Image img [] = {
			Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_1.png"),
			Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_2.png")
			
	};
	
	
	
	
	
	
	
	
	//�⺻������
	public s_������window() {
		// TODO Auto-generated constructor stub

		super("������ �����̱�");
		
		init_grimpan();
		
		init_img();
		
		//��ġ            x     y
		this.setLocation(300, 200);

		//ũ��        W     H
		this.setSize(400, 300);

		//�����ֱ�
		this.setVisible(true);

		//����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}




	public void init_img() {
		// TODO Auto-generated method stub
		this.setLayout(new BorderLayout());
		
		
		
	}




	//�׸���
	private void init_grimpan() {
		// TODO Auto-generated method stub
		grimPan = new JPanel() {
			
			@Override
			protected void paintComponent(Graphics g) {
				// TODO Auto-generated method stub
				//super.paintComponent(g);
				
				
				
				
				
			}
			
		};
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new s_������window();

	}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}


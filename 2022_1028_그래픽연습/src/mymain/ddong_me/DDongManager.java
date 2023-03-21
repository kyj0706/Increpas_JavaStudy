package mymain.ddong_me;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class DDongManager {

	public static final int DDONG_INTERVAL = 50;
	
	
	public List<DDong> ddong_list = new ArrayList<DDong>();
	
	int ddong_interval = DDONG_INTERVAL;//������������
	
	
	Random random = new Random();
	
	Color [] color_array = {  
			                  Color.red, 
			                  Color.green, 
			                  Color.blue,
			                  Color.yellow,
			                  Color.cyan,
			                  Color.magenta 
			               };
	
	
	//���ȭ��
	Image img_back= Toolkit.getDefaultToolkit().getImage("back_2.jpg");
	
	
	public void make_ddong() {
		
		
		if(ddong_interval==DDONG_INTERVAL)
		{
			//�˸����
			DDong ddong = new DDong();
			
			//��ġ ũ�� �ʱ�ȭ
			ddong.pos.x = random.nextInt(MyConstant.GRIMEPAN_W)-DDong.DDONG_W/2;
			ddong.pos.y = -DDong.DDONG_H;
			ddong.pos.width = DDong.DDONG_W;
			ddong.pos.height= DDong.DDONG_H;
			
			//�̵��ӵ�
			ddong.speed = random.nextInt(3) + 1; // 1~3
			
			//������
			int color_index = random.nextInt(color_array.length);
			ddong.color = color_array[color_index];
					
			
			//���߰��ϱ�
			ddong_list.add(ddong);
		}
		
		ddong_interval--;
		if(ddong_interval<0)
			ddong_interval = DDONG_INTERVAL;
		
		
		
	}
	
	public void draw_all(Graphics g) {
		
		for(DDong ddong : ddong_list) {
			ddong.draw(g);
		}
	}
	
	public void move_all() {
		
		for(int i=0;i<ddong_list.size();i++) {
			
			DDong ddong = ddong_list.get(i);
			
			if(ddong.move()==true) {
				//ȭ�� �Ʒ��� �������� ��Ͽ��� ������
				ddong_list.remove(i);
				return;
			}
		}
	}
	

	
	
}

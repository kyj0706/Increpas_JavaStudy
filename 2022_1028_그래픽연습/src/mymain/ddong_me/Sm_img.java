package mymain.ddong_me;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

public class Sm_img extends Item {


	ArrayList<Image> Smurf_list = new ArrayList<Image>();

	static {
		Image Smurf_1 = Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_1.png");
		Image Smurf_2 = Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_2.png");
		Image Smurf_3 = Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_3.png");
		Image Smurf_4 = Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_4.png");
		Image Smurf_5 = Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_5.png");
		Image Smurf_6 = Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_6.png");
		Image Smurf_7 = Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_7.png");
		Image Smurf_8 = Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_8.png");
		Image Smurf_9 = Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_9.png");
		Image Smurf_10 = Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_10.png");
		Image Smurf_11 = Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_11.png");
		Image Smurf_12 = Toolkit.getDefaultToolkit().getImage("img_Smurf\\Smurf_12.png");

	};

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.fillRect(pos.x, pos.y, pos.width, pos.height);
	}

	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		return false;
	}

}

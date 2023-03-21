package mymain.ddong_me;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class IMG_Manager {
	
	
	public List<Sm_img> sm_list = new ArrayList<Sm_img>();
	
	
	public void move_Smurf() {
		// TODO Auto-generated method stub
		
		for(int i=0; i<sm_list.size(); i++) {
			Sm_img sm_img = sm_list.get(i);
		}
		
	}


	public void move_Smurf(Graphics g) {
		// TODO Auto-generated method stub
		for(Sm_img sm_img : sm_list) {
			sm_img.draw(g);
		}
	}

	
}

package mymain.ddong;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class SmurfManager {
	
	public List<Smurf> smurf_list = new ArrayList<Smurf>();
	
	
	public void make_smurf(int x, int y) {
		// TODO Auto-generated method stub
		Smurf smurf = new Smurf();
		
		
		smurf.pos.x = x = Smurf.W/2;
		smurf.pos.y = y = Smurf.H/2;
		
		
		
		//smurf.pos.x =MyConstant.GRIMEPAN_W/2 - Smurf.W/2;
		//smurf.pos.y =MyConstant.GRIMEPAN_H - Smurf.H -5;
		//smurf.pos.width =Smurf.W;
		//smurf.pos.height=Smurf.H;
		
		smurf_list.add(smurf);
	}
	
	public void draw_all(Graphics g) {
		
		for(Smurf smurf : smurf_list) {
			smurf.draw(g);
		}
	}
	
	public void move_all() {
		for(int i=0; i<smurf_list.size(); i++ ) {
			Smurf smurf = smurf_list.get(i);
			if(smurf.move()) {
				smurf_list.remove(i);
			}
		}
	}

		
		
		
		
		


}

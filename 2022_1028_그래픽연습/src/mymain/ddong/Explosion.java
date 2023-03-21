package mymain.ddong;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Explosion extends Item{

	public  static int W = 128;
	public  static int H = 128;
	
	static Image [] explosion_array = new Image[27];
	static {
		
		for(int i=0;i<explosion_array.length;i++) {
			
			String filename = String.format("images/exp/exp_%d.png", i+1);
			explosion_array[i] = Toolkit.getDefaultToolkit().getImage(filename);
		}
	}
	
	int index = 0;
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(explosion_array[index],  pos.x , pos.y ,null);
	}

	
	static final int INDEX_INTERVAL = 2;
	int index_interval = INDEX_INTERVAL;
	
	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		
		if(index_interval == INDEX_INTERVAL) {
		   index++;
		}
		
		index_interval--;
		if(index_interval < 0)
			index_interval = INDEX_INTERVAL;
		
		
		return (index>=explosion_array.length);
	}

}

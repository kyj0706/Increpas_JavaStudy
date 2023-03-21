package mymain.ddong;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Smurf extends Item {
	
	public static int W = 81;
	public static int H =126;
	
	static Image [] smurf_array = new Image[12];
	static {
		for(int i=0; i<smurf_array.length; i++) {
			String filename = String.format("images/smurf/Smurf_%d.png", i+1);
			System.out.println(filename);
			smurf_array[i] = Toolkit.getDefaultToolkit().getImage(filename);
		}
		
	}
	
	int index = 0;	
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(smurf_array[index], pos.x, pos.y, null);
		
	}

	static final int INDEX_INTERVAL=2;
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
		
		
		return (index>=smurf_array.length);
	}

}

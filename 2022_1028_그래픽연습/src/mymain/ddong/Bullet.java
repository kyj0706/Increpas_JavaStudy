package mymain.ddong;

import java.awt.Graphics;

public class Bullet extends Item {

	public static final int BULLET_W = 5;
	public static final int BULLET_H = 5;
	
	int speed=5;
	
	
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.fillRect(pos.x, pos.y, pos.width, pos.height);
	}

	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		
		pos.y = pos.y -speed;		
		
		return (pos.y < 0);
	}

}

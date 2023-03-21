package mymain.ddong;

import java.awt.Graphics;

public class Me extends Item {

	public static final int ME_W = 30;
	public static final int ME_H = 40;
	
	
	BulletManager bulletManager;
	
	public int key_state = 0;
	
	public void setBulletManager(BulletManager bulletManager) {
		this.bulletManager = bulletManager;
	}
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
        
        g.fillRect(pos.x, pos.y, pos.width, pos.height);
	}

	int gan = 5;
	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		if((key_state & Key.LEFT)  == Key.LEFT) {
			
			pos.x -= gan;
			
		}else if((key_state & Key.RIGHT)==Key.RIGHT) {
			
			pos.x += gan;
		}
		
		
		//SPACEÅ°¸¸ ´­·È³Ä?
		if((key_state & Key.SPACE)==Key.SPACE) {
			
			System.out.println("--ÃÑ¾Ë:»Ð»Ð--");
			
			bulletManager.make_bullet(pos.x + Me.ME_W/2, pos.y);
			
		}
		
		
		return false;
	}

}

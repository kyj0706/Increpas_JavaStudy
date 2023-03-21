package mymain.ddong;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class BulletManager {

	public List<Bullet> bullet_list = new ArrayList<Bullet>();
	
	
	public void make_bullet(int x,int y) {
		
		Bullet bullet = new Bullet();
		
		//총알위치초기화
		bullet.color = Color.red;
		
		bullet.pos.x = x -Bullet.BULLET_W;
		bullet.pos.y = y -Bullet.BULLET_H;
		
		
		
		bullet_list.add(bullet);
		
	}
	
	public void draw_all(Graphics g) {
		
		for(Bullet bullet : bullet_list) {
			bullet.draw(g);
		}
	}
	
	public void move_all() {
		
	}
	
}

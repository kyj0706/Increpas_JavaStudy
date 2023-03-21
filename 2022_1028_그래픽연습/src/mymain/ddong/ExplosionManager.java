package mymain.ddong;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class ExplosionManager {

	public List<Explosion> explosion_list = new ArrayList<Explosion>();
	
	
	public void make_explosion(int x,int y) {
		
		Explosion explosion = new Explosion();
		//위치
		explosion.pos.x = x - Explosion.W / 2;
		explosion.pos.y = y - Explosion.H / 2;
		
		explosion_list.add(explosion);
	}
	
	public void draw_all(Graphics g) {
		
		for(Explosion explosion : explosion_list) {
			explosion.draw(g);
		}
	}
	
	public void move_all() {
		
		for(int i=0;i<explosion_list.size();i++) {
			
			Explosion explosion = explosion_list.get(i);
			
			if(explosion.move()) {//폭발영상 모두 돌았으면..
				
				explosion_list.remove(i);
			}
			
		}
		
	}
	
	
	
}

package mymain.ddong_me;

import java.awt.Graphics;

public class DDong extends Item {

	//똥의크기 
	public static final int DDONG_W =80;
	public static final int DDONG_H =20;
	
	
	//똥의 하강속도
	public int speed =2;
	
	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		
		g.fillRect(pos.x, pos.y, pos.width, pos.height);
		
		

	}

	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		
		pos.y = pos.y+speed;
		
		return (pos.y>MyConstant.GRIMEPAN_H);//화면 아래로 내려갔냐 ?
	}

	
	
}

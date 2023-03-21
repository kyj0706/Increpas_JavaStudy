package mymain.ddong_me;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public abstract class Item {

	//4각형 정보를 관리하는 객체
	public Rectangle pos = new Rectangle();
	
	public Color color = Color.red;
	
	public abstract void draw(Graphics g);
	
	public abstract boolean move();
	
	public Image img;
	
}

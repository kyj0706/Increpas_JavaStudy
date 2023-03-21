package mymain.ddong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class Item {

	//4���� ������ �����ϴ� ��ü
	public Rectangle pos = new Rectangle();
	
	public Color color = Color.red;
	
	public abstract void draw(Graphics g);
	
	public abstract boolean move();
	 
	
}

package mymain;

import myutil.Circle;
import myutil.Nemo;
import myutil.Shape;
import myutil.Triangle;

public class MyMain_Shape {
	
	static void draw(Shape [] draw_array) {
		for(Shape draw : draw_array) {
			draw.draw();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape[] shape_array = {new Triangle(), new Nemo(), new Circle()};
		
		draw(shape_array);
		
		
	}

}

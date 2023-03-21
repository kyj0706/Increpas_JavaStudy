package mymain;


import myutil.AnimalTest;

public class Animal_AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ÀÌ¸§ ÄÚ»Ô¼Ò
		
		

		//³ªÀÌ 3»ì
		
		//AnimalTest animal = new AnimalTest(true, 3, "Å«»Ô¼Ò");
		AnimalTest animal = new AnimalTest();
		
		//°´Ã¼ Á¤º¸ ´ã±â
		animal.getName(3, "Å«»Ô¼Ò");
		animal.getLive(true);
		animal.display();
		
		//°´Ã¼ ¼öÁ¤ 
		String name = "ÆØ±Ï";
		boolean live = false;
		animal.setName(name);
		
		//Ãâ·Â
		animal.display();
		
		
		
		
		
		
		

	}

}

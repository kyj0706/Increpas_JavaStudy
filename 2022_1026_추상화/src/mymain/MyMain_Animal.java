package mymain;

import myutil.Animal;
import myutil.Cat;
import myutil.Dog;
import myutil.Pig;

public class MyMain_Animal {
	
	//eat
	static void cay(Animal[] cry_array) {
		for(int i=0; i<cry_array.length; i++) {
			Animal ani_cry = cry_array[i];
			
			
			ani_cry.cry();
		}
	}
	
	static void eat(Animal[] eat_array) {
		for(Animal ani_e : eat_array) {
			ani_e.eat();
		}
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Animal[] animal_array = {new Dog(), new Cat(), new Pig()};
		
		System.out.println("¿ï¾î");
		cay(animal_array);
		System.out.println("¸Ô¾î");
		eat(animal_array);
		
	}

}

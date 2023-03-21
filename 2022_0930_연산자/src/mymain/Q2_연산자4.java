package mymain;

import java.util.Scanner;

public class Q2_¿¬»êÀÚ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double c;//¼·¾¾
		double f;//È­¾¾
		
		Scanner scanner = new Scanner(System.in);
		
		 System.out.print("¼·¾¾¿Âµµ¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
	        c = scanner.nextDouble();
	        f =  (c *1.8)+32;
	        
	        System.out.printf("¼·¾¾ :%.1f(C)¸¦ È­¾¾·Î º¯È¯ÇÏ¸é %.1f(F)°¡ µÈ´Ù. \n" ,c ,f );
	        
	        //System.out.printf("È­¾¾ :%.1f(F)¸¦ È­¾¾·Î º¯È¯ÇÏ¸é %f(C)°¡ µÈ´Ù. " ,f );
		System.out.print("È­¾¾¿Âµµ¸¦ ÀÔ·ÂÇÏ¼¼¿ä : ");
			f = scanner.nextDouble();
			c = (f - 32) / 1.8;
			
			System.out.printf("È­¾¾: %.1f(F)¸¦ ¼·¾¾·Î º¯È¯ÇÏ¸é ¾à %.14f(C)°¡ µÈ´Ù.",f,c);
		
		
		scanner.close();
	}

}

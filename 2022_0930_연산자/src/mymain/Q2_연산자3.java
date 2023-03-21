package mymain;

import java.util.Scanner;

public class Q2_연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수선언
		int feet;
		double cm,inch;
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("======[문제3]=======");
		//feet & inch = > cm 환산
		System.out.print("feet 입력 :");
		feet = scanner.nextInt();
		
		
		inch = 12*feet;
		cm = inch *2.54;
		
		
		
		
		
		
		
		System.out.printf("%d피트 %.1f인치 %.2fcm이다.\n" ,feet,inch,cm);
		
		
		
		
		scanner.close();

	}

}

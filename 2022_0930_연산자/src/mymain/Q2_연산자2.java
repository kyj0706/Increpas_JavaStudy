package mymain;

import java.util.Scanner;

public class Q2_연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수 선언
		int feet;
		double cm,inch;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("======[문제2]=======");
		//cm를 feet & inch 환산
		
		System.out.print("cm 입력 :");
		cm = scanner.nextDouble();
		
		inch = cm / 2.54;
		feet = (int)inch/12;
		inch = inch-(feet*12);
		System.out.printf("%.2fcm는 %d피트 %.1f인치이다.\n" ,cm,feet,inch);
		
		
	
		
		
		scanner.close();
	}

}

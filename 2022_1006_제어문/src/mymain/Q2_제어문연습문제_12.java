package mymain;

import java.util.Scanner;

public class Q2_제어문연습문제_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double r =0.0;//실수
		int n =0;//정수
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("실수를 입렵하세요.>>");
		r =scanner.nextDouble();
		
		System.out.print("정수를 입렵하세요.>>");
		n = scanner.nextInt();
		
	
		r= Math.pow(r, n);
		
		
		System.out.printf("%.1f",r);
		
		
		
		scanner.close();

	}

}

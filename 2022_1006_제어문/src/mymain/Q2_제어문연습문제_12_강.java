package mymain;

import java.util.Scanner;

public class Q2_제어문연습문제_12_강 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		double r;
		int n;
		double result =1.0;
		

		System.out.printf("실수를 입력하세요>>");
		r = scanner.nextDouble();
		
		System.out.printf("정수를 입력하세요>>");
		n = scanner.nextInt();
		
		// r' s n승을 구해라
		
		for(int i=0; i<n; i++) {//반복횟수
			
			
			result =result* r;
		}
		
		
		//순서1 내가 계산한 값
		System.out.println("내가 계산한값 :"+result);
		
		//Java API를 통해서 계산된값
		System.out.println("API를 통한 값 :" +Math.pow(r, n));
		
		scanner.close();

	}

}

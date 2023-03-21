package mymain;

import java.util.Scanner;

public class Q2_제어문연습문제_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수, 연산자(+, -, *, / 중의 하나), 정수를 입력받아 해당 연산자에 대한 결과를 구하여 
		//출력하는 프로그램을 if~else 문으로 작성하자.(단, 0으로 나눌 경우 불능임을 출력하자.
		
		Scanner scanner = new Scanner(System.in);
		
		int num_1, num_2;
		String oper;
		
		
		System.out.print("두 정수와 +,-,*,/중 하나의 연산자를 입력하세요 >>>\n");
		
		num_1 = scanner.nextInt();
		num_2 = scanner.nextInt();
		oper = scanner.next();
		
		if(oper.equals("+")) {
			System.out.printf("%d + %d = %d",num_1,num_2,num_1+num_2);
			
		}else if (oper.equals("-")) {
			System.out.printf("%d - %d = %d",num_1,num_2,num_1-num_2);
		
		}else if (oper.equals("*")) {
			System.out.printf("%d * %d = %d",num_1,num_2,num_1*num_2);
			
		
		}else if (oper.equals("/")) {
			System.out.printf("%d / %d = %d",num_1,num_2,num_1/num_2);
			
		}else {
			System.out.println("틀린 연산자");
		}
		
		
		
		
		scanner.close();

	}

}

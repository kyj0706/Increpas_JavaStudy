package mymain;

import java.util.Scanner;

public class Q2_제어문연습문제if_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int num_1, num_2, num_3; // 숫자입력
		int min;// 작은수 결과 
		
		
		System.out.print("세 개의 정수를 입력하세요 >>>");
		
		num_1 = scanner.nextInt();
		num_2 = scanner.nextInt();
		num_3 = scanner.nextInt();
		
		min =(num_1>num_2) ? num_1: num_2;
		min =(num_3>min) ? min : num_3;
		
		
		if(num_1==min) {
			
		}else if (num_2==min) {
			
		}else if (num_3==min) {
			
		}else  {
			System.out.printf("세 개의 정수 중에서 가장 작은 값 : %d\n" );
		}
		System.out.printf("수 :%d %d %d\n", num_1,num_2,num_3);
		
		
		
		
		scanner.close();
		
	}

}

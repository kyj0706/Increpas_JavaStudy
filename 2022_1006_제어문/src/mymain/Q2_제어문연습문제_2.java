package mymain;

import java.util.Scanner;

public class Q2_제어문연습문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//세개의 정수를 입력받아 가장 작은 값을 구하는 프로그램을 작성해 보자
		
		
		Scanner scanner = new Scanner(System.in);
		
		int num_1 ,num_2, num_3;
		int res_1;//두수의 비교
		int res_2;//비교한 결과 또 비교 ?
		
		System.out.print("세 개의 정수를 입력하세요. >>");
		
		num_1 = scanner.nextInt();
		num_2 = scanner.nextInt();
		num_3 = scanner.nextInt();
		
		res_1 = (num_1 < num_2) ? num_1 : num_2;
		res_2 = num_3<res_1 ? num_3 :res_1;
		
		
		//if로 ? 
		
		
		
		
		
		System.out.printf("수 : %d  %d  %d\n",num_1,num_2, num_3);
		System.out.printf("세 개의 정수 중에서 가장 작은 값 : %d\n" ,res_2);
		
		
		
		
		
		
		
		
		
		
		scanner.close();
		

	}

}

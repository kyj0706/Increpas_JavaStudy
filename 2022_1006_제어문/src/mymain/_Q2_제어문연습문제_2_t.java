package mymain;

import java.util.Scanner;

public class _Q2_제어문연습문제_2_t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		//3개의 정수를 입력받을 변수
		int su1,su2,su3;
		int small;//가장작은값 저장할 변수
		
		System.out.print("세개의 정수를 입력>>");
		su1 = scanner.nextInt();
		su2 = scanner.nextInt();
		su3 = scanner.nextInt();
		
		System.out.printf("수 : %d %d %d\n", su1,su2,su3);
		
		//3수중에 가장 작은수구하기
		small = (su1 > su2) ? su2 : su1; //2수를 먼저 비교
		
		small = (su3 > small) ? small : su3; //나머지 1개수 비교
		
		System.out.printf("세수중에 가장 작은수 [%d] 입니다\n", small);
		
		scanner.close();
		
		
	}

}

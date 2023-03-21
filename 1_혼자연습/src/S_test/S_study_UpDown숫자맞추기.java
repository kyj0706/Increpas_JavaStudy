package S_test;

import java.util.Random;
import java.util.Scanner;

public class S_study_UpDown숫자맞추기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//컴퓨터가 1~100 중 랜덤 숫자 하나를 정합니다. 이 숫자를 맞춰주세요.
		//1~100 숫자 입력:50 DOWN
		
		//변수선언
		int num; //숫자입력
		int res; //저장변수
		
		Random random = new Random();
		//키보드입력
		Scanner scanner = new Scanner(System.in);
		
		
		res = (int) (Math.random() * 99+1);
		
		while(true) {
			System.out.print("1~100 숫자 입력:");
			num = scanner.nextInt();
			if(res < num) {
				System.out.print("Down");
			}else if (res > num) {
				System.out.print("Up");
			}else {
				System.out.printf("[%d]번만에 성공\n 축하",res+1);
				break;
			}
			res++;
			System.out.printf("\n[%d]번째 시도중\n",res);
		

		}
		scanner.close();
		//입력종료
	}
}

package mymain;

import java.util.Scanner;

public class _02_산술연산자예제 {
	
	//순서3
	public static final int WON_50000 = 50000;
	public static final int WON_10000 = 10000;
	public static final int WON_5000 = 5000;
	public static final int WON_1000 = 1000;
	public static final int WON_500 = 500;
	public static final int WON_100 = 100;
	public static final int WON_50 = 50;
	public static final int WON_10 = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드로부터 금액을 입력 받습니다.
		
		//순서1
		Scanner scanner = new Scanner(System.in);
		
		//순서2
		int money;
		int im_money; // 임시변수
		
		//순서4 변수선언
		// 권종별 갯수를 저장할 변수
		int won_50000 = 0;
		int won_10000 = 0;
		int won_5000 = 0;
		int won_1000 = 0;
		int won_500 = 0;
		int won_100 = 0;
		int won_50 = 0;
		int won_10 = 0;
		
		//순서1_1
		System.out.print("금액을 입력하세요 :");
		money = scanner.nextInt();
		
		//순서6
		// 임시변수에 저장
		im_money = money;
		
		//순서7
		//권종별 수량계산
		won_50000 =im_money / WON_50000;
		
		//순서8
		//잔액계산
		im_money = im_money % WON_50000;
		
		//순서9 안한거 해보세요 ~ 
		won_10000 =im_money / WON_10000;
		im_money = im_money % WON_10000;
	
		won_5000 =im_money / WON_5000;
		im_money = im_money % WON_5000;
		
		won_1000 =im_money / WON_1000;
		im_money = im_money % WON_1000;
		
		won_500 =im_money / WON_500;
		im_money = im_money % WON_500;
		
		won_100 =im_money / WON_100;
		im_money = im_money % WON_100;
		
		won_50 =im_money / WON_50;
		im_money = im_money % WON_50;
		
		won_10 =im_money / WON_10;
		im_money = im_money % WON_10;
		

		//순서5
		// 출력
		System.out.printf("---[금액 : %d원]의 권종별 갯수---\n", money, won_50000);
		System.out.printf("%5d원권 : %d(매)\n ", WON_50000, won_50000);
		System.out.printf("%5d원권 : %d(매)\n ", WON_10000, won_10000);
		System.out.printf("%5d원권 : %d(매)\n ", WON_5000, won_5000);
		System.out.printf("%5d원권 : %d(매)\n ", WON_1000, won_1000);
		System.out.printf("%5d원권 : %d(개)\n ", WON_500, won_500);
		System.out.printf("%5d원권 : %d(개)\n ", WON_100, won_100);
		System.out.printf("%5d원권 : %d(개)\n ", WON_50, won_50);
		System.out.printf("%5d원권 : %d(개)\n ", WON_10, won_10);

		scanner.close();

	}

}

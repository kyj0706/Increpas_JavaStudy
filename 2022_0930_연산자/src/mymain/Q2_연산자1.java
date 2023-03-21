package mymain;

import java.util.Scanner;

public class Q2_연산자1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//문제1
		//변수선언
		int My_Money; 	//지불금액
		int Coffee; 	//음료
		int Count; 		//수량
		int Vat;		//부가세
		int total;		//총액
		int re_Money;   //남은금액
		
		//입력부
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("======[문제1]=======");
		//지불입력
		System.out.print("지불한 돈	:");
		My_Money =scanner.nextInt();
		//커피입력
		System.out.print("커피금액 	:");
		Coffee = scanner.nextInt();
		//수량입력
		System.out.printf("수량		:");
		Count = scanner.nextInt();
		
		//부가세
		Vat = (int) ((Coffee*0.1) *Count);
		
		//삼품총액
		total = Coffee * Count;
		
		//거스름돈
		re_Money = My_Money - (total+Vat); 
		
		
		System.out.printf("지불한돈		:%d\n",My_Money);
		System.out.printf("커피금액		:%d\n",Coffee);
		System.out.printf("수량			:%d\n",Count);
		System.out.printf("부가세			:%d\n",Vat);
		System.out.printf("삼품총액		:%d\n",total);
		System.out.printf("거스름돈		:%d\n",re_Money);
		

		//입력종료
		scanner.close();
	}

}

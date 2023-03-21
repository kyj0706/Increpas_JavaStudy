package mymain;

import java.util.Scanner;

public class Q2_연산자1_강사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//변수선언
		int money; 	//지불금액
		int cafe_moka= 3500; 	//음료
		int count; 		//수량
		int vat;		//부가세
		int total;		//총액
		int re_Money;   //남은금액
		
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.print("금액");
		money = scanner.nextInt();
		
		System.out.print("수량");
		count = scanner.nextInt();
		
		//계산(부가세/총액/잔액)
		vat = (cafe_moka *count)/10;
		total =cafe_moka*count+vat;
		re_Money =money-total;
		
		
		System.out.println("-------[영수증]-----");
		System.out.printf("지불한돈		:%d\n",money);
		System.out.printf("커피금액		:%d\n",cafe_moka);
		System.out.printf("수량			:%d\n",count);
		System.out.printf("부가세			:%d\n",vat);
		System.out.printf("삼품총액		:%d\n",total);
		System.out.printf("잔액			:%d\n",re_Money);
		
		scanner.close();
	}

}

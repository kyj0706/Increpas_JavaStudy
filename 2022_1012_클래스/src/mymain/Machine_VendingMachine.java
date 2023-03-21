package mymain;

import java.util.Scanner;

import myutil.VendingMachine;

public class Machine_VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력
		Scanner scanner = new Scanner(System.in);
		int money; //자판기 입력금액
		int drink; //선택음료
		
		String yn = "y";//계속여부
		
		VendingMachine vendingMachine = new VendingMachine();
		
		while(true) {
			
			System.out.print("금액:");
			money = scanner.nextInt();
			
			System.out.print("음료선택(1.콜라 2.쥬스 3.사이다 4.우유):");
			drink = scanner.nextInt();
			
			
			//자판기에 값을 넘겨준다
			vendingMachine.insertCoin(money);
			vendingMachine.selectDrink(drink);
			
			//자판기 처리결과 출력
			vendingMachine.displayResult();
			
			
			
			//계속여부
			System.out.print("계속?(y/n):");
			yn = scanner.next();
			
			//y가 아니면 끝내라..
			if(!yn.equalsIgnoreCase("Y"))break;
			
		}//end while
		
		System.out.println("---End---");
			
		
		
		scanner.close();
	}

}
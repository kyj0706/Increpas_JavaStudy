package myutil;

public class VendingMachine {

	// 음료단가
	public static final int COLA 	= 500;
	public static final int JUICE 	= 800;
	public static final int CYDER 	= 600;
	public static final int MILK 	= 400;

	// 음료종류
	public static final int DRINK_COLA 		= 1;
	public static final int DRINK_JUICE	 	= 2;
	public static final int DRINK_CYDER	 	= 3;
	public static final int DRINK_MILK 		= 4;

	int money;
	int drink;

	// 돈
	public void insertCoin(int money) {

		this.money = money;
	}

	// 음료선택
	public void selectDrink(int drink) {

		
		// System.out.println(drink);

		this.drink = drink;
	}

	public void displayResult() {

		while(true) {
			switch (drink) {
			case 1:
				if(money>=COLA) {
					System.out.println("콜라(" + COLA + ")");
					money = money - COLA;
					System.out.println("거스름돈:" + money);	
				}else {
					System.out.println("잔액부족");
				}
				break;
			case 2:
				if(money>=JUICE) {
					System.out.println("쥬스(" + JUICE + ")");
					money = money - JUICE;
					System.out.println("거스름돈:" + money);					
				}else {
					System.out.println("잔액부족");
				}
				break;
			case 3:
				if(money>=CYDER) {
					System.out.println("사이다(" + CYDER + ")");
					money = money - CYDER;
					System.out.println("거스름돈:" + money);
				}else {
					System.out.println("잔액부족");
				}
				break;
			case 4:
				if(money>=MILK) {
					System.out.println("우유(" + MILK + ")");
					money = money - MILK;
					System.out.println("거스름돈:" + money);
				}else {
					System.out.println("잔액부족");
				}
				
				break;

			default:
				
				
				break;

			}
			
			if(drink >=1 && drink <=4) break;
			System.out.println("음료는 1~4번중에 선택하세요");
			
			
		}
			

	}

}

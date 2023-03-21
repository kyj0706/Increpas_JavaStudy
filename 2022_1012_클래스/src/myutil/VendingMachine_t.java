package myutil;

public class VendingMachine_t {

	// 음료단가
	public static final int COLA = 500;
	public static final int JUICE = 800;
	public static final int CYDER = 600;
	public static final int MILK = 400;

	// 음료종류
	public static final int DRINK_COLA = 1;
	public static final int DRINK_JUICE = 2;
	public static final int DRINK_CYDER = 3;
	public static final int DRINK_MILK = 4;
	
	//전역변수(인스턴스변수)
	//객체가 만들어지면 사용하기 위함
	int money;
	int drink;

	// 돈
	public void insertCoin(int money) {

		this.money = money;
	}

	// 음료선택
	public void selectDrink(int drink) {


		this.drink = drink;
	}
	
	//결과_t
	public void displayResult() {

		if (drink == DRINK_COLA) {
			if(COLA>money) {
				System.out.println("금액이부족합니다.");
				return;
			}
			
			//잔액계산
			int remain_money = money - COLA;
			
			System.out.println("----[결과]----");
			System.out.printf("받은금액 : %d\n", money);
			System.out.printf("선택음료 : 콜라(%d원)\n", COLA);
			System.out.printf("거스름돈 : %d\n", remain_money);
			
		}else if(drink==DRINK_JUICE) {
			if(JUICE>money) {
				System.out.println("금액이부족합니다.");
				return;
			}
			
			//잔액계산
			int remain_money = money - JUICE;
			
			System.out.println("----[결과]----");
			System.out.printf("받은금액 : %d\n", money);
			System.out.printf("선택음료 : 쥬스(%d원)\n", JUICE);
			System.out.printf("거스름돈 : %d\n", remain_money);
			
		}else if(drink==DRINK_CYDER) {
			if(CYDER>money) {
				System.out.println("금액이부족합니다.");
				return;
			}
			
			//잔액계산
			int remain_money = money - CYDER;
			
			System.out.println("----[결과]----");
			System.out.printf("받은금액 : %d\n", money);
			System.out.printf("선택음료 : 쥬스(%d원)\n", CYDER);
			System.out.printf("거스름돈 : %d\n", remain_money);
			
		}else if(drink==DRINK_MILK) {
			if(MILK>money) {
				System.out.println("금액이부족합니다.");
				return;
			}
			
			//잔액계산
			int remain_money = money - MILK;
			
			System.out.println("----[결과]----");
			System.out.printf("받은금액 : %d\n", money);
			System.out.printf("선택음료 : 쥬스(%d원)\n", MILK);
			System.out.printf("거스름돈 : %d\n", remain_money);
			
		}

	}

}

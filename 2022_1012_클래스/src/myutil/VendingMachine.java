package myutil;

public class VendingMachine {

	// ����ܰ�
	public static final int COLA 	= 500;
	public static final int JUICE 	= 800;
	public static final int CYDER 	= 600;
	public static final int MILK 	= 400;

	// ��������
	public static final int DRINK_COLA 		= 1;
	public static final int DRINK_JUICE	 	= 2;
	public static final int DRINK_CYDER	 	= 3;
	public static final int DRINK_MILK 		= 4;

	int money;
	int drink;

	// ��
	public void insertCoin(int money) {

		this.money = money;
	}

	// ���ἱ��
	public void selectDrink(int drink) {

		
		// System.out.println(drink);

		this.drink = drink;
	}

	public void displayResult() {

		while(true) {
			switch (drink) {
			case 1:
				if(money>=COLA) {
					System.out.println("�ݶ�(" + COLA + ")");
					money = money - COLA;
					System.out.println("�Ž�����:" + money);	
				}else {
					System.out.println("�ܾ׺���");
				}
				break;
			case 2:
				if(money>=JUICE) {
					System.out.println("�꽺(" + JUICE + ")");
					money = money - JUICE;
					System.out.println("�Ž�����:" + money);					
				}else {
					System.out.println("�ܾ׺���");
				}
				break;
			case 3:
				if(money>=CYDER) {
					System.out.println("���̴�(" + CYDER + ")");
					money = money - CYDER;
					System.out.println("�Ž�����:" + money);
				}else {
					System.out.println("�ܾ׺���");
				}
				break;
			case 4:
				if(money>=MILK) {
					System.out.println("����(" + MILK + ")");
					money = money - MILK;
					System.out.println("�Ž�����:" + money);
				}else {
					System.out.println("�ܾ׺���");
				}
				
				break;

			default:
				
				
				break;

			}
			
			if(drink >=1 && drink <=4) break;
			System.out.println("����� 1~4���߿� �����ϼ���");
			
			
		}
			

	}

}

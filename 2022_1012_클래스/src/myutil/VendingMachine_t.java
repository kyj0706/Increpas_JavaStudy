package myutil;

public class VendingMachine_t {

	// ����ܰ�
	public static final int COLA = 500;
	public static final int JUICE = 800;
	public static final int CYDER = 600;
	public static final int MILK = 400;

	// ��������
	public static final int DRINK_COLA = 1;
	public static final int DRINK_JUICE = 2;
	public static final int DRINK_CYDER = 3;
	public static final int DRINK_MILK = 4;
	
	//��������(�ν��Ͻ�����)
	//��ü�� ��������� ����ϱ� ����
	int money;
	int drink;

	// ��
	public void insertCoin(int money) {

		this.money = money;
	}

	// ���ἱ��
	public void selectDrink(int drink) {


		this.drink = drink;
	}
	
	//���_t
	public void displayResult() {

		if (drink == DRINK_COLA) {
			if(COLA>money) {
				System.out.println("�ݾ��̺����մϴ�.");
				return;
			}
			
			//�ܾװ��
			int remain_money = money - COLA;
			
			System.out.println("----[���]----");
			System.out.printf("�����ݾ� : %d\n", money);
			System.out.printf("�������� : �ݶ�(%d��)\n", COLA);
			System.out.printf("�Ž����� : %d\n", remain_money);
			
		}else if(drink==DRINK_JUICE) {
			if(JUICE>money) {
				System.out.println("�ݾ��̺����մϴ�.");
				return;
			}
			
			//�ܾװ��
			int remain_money = money - JUICE;
			
			System.out.println("----[���]----");
			System.out.printf("�����ݾ� : %d\n", money);
			System.out.printf("�������� : �꽺(%d��)\n", JUICE);
			System.out.printf("�Ž����� : %d\n", remain_money);
			
		}else if(drink==DRINK_CYDER) {
			if(CYDER>money) {
				System.out.println("�ݾ��̺����մϴ�.");
				return;
			}
			
			//�ܾװ��
			int remain_money = money - CYDER;
			
			System.out.println("----[���]----");
			System.out.printf("�����ݾ� : %d\n", money);
			System.out.printf("�������� : �꽺(%d��)\n", CYDER);
			System.out.printf("�Ž����� : %d\n", remain_money);
			
		}else if(drink==DRINK_MILK) {
			if(MILK>money) {
				System.out.println("�ݾ��̺����մϴ�.");
				return;
			}
			
			//�ܾװ��
			int remain_money = money - MILK;
			
			System.out.println("----[���]----");
			System.out.printf("�����ݾ� : %d\n", money);
			System.out.printf("�������� : �꽺(%d��)\n", MILK);
			System.out.printf("�Ž����� : %d\n", remain_money);
			
		}

	}

}

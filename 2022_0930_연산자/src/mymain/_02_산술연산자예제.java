package mymain;

import java.util.Scanner;

public class _02_��������ڿ��� {
	
	//����3
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
		// Ű����κ��� �ݾ��� �Է� �޽��ϴ�.
		
		//����1
		Scanner scanner = new Scanner(System.in);
		
		//����2
		int money;
		int im_money; // �ӽú���
		
		//����4 ��������
		// ������ ������ ������ ����
		int won_50000 = 0;
		int won_10000 = 0;
		int won_5000 = 0;
		int won_1000 = 0;
		int won_500 = 0;
		int won_100 = 0;
		int won_50 = 0;
		int won_10 = 0;
		
		//����1_1
		System.out.print("�ݾ��� �Է��ϼ��� :");
		money = scanner.nextInt();
		
		//����6
		// �ӽú����� ����
		im_money = money;
		
		//����7
		//������ �������
		won_50000 =im_money / WON_50000;
		
		//����8
		//�ܾװ��
		im_money = im_money % WON_50000;
		
		//����9 ���Ѱ� �غ����� ~ 
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
		

		//����5
		// ���
		System.out.printf("---[�ݾ� : %d��]�� ������ ����---\n", money, won_50000);
		System.out.printf("%5d���� : %d(��)\n ", WON_50000, won_50000);
		System.out.printf("%5d���� : %d(��)\n ", WON_10000, won_10000);
		System.out.printf("%5d���� : %d(��)\n ", WON_5000, won_5000);
		System.out.printf("%5d���� : %d(��)\n ", WON_1000, won_1000);
		System.out.printf("%5d���� : %d(��)\n ", WON_500, won_500);
		System.out.printf("%5d���� : %d(��)\n ", WON_100, won_100);
		System.out.printf("%5d���� : %d(��)\n ", WON_50, won_50);
		System.out.printf("%5d���� : %d(��)\n ", WON_10, won_10);

		scanner.close();

	}

}

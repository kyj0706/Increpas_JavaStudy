package S_test;

import java.util.Scanner;

import Object.Deck;

public class s_study_CardGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		Deck d = new Deck();

		loop1: while (true) {

			d.menu_print();

			int choice = scan.nextInt();

			// 0���� Ȯ��

			switch (choice) {
			case 1:// 1.ī�� 1�� ���3
				System.out.println("�̰� ���� ī�� ����");
				int num = scan.nextInt();
				d.print_1card(num);
				break;
			case 2:// 2.ī�� 5�� ���
				d.print_5card();
				break;
			case 3:// 3.ī�� 52�� ���
				d.print_52card();
				break;
			case 4:// 4.ī�� ����
				d.shuffle_me();
				d.shuffle_com();
				break;
			case 5:// 5.ī��7���� ���Ͱ� ��ǻ�� ���� ��½�Ű�� �޼ҵ� �ۼ��غ�����.
					// MyCard : 7��ī��
					// ��ǻ��Card : 7��ī��
					// ��� ������
				d.print_my7card();
				d.print_com7card();
				
				// d.print_com7card();

				break;
			case 0:// 0.����
				System.out.println("���α׷� ����");
				break loop1;

			}

		}
		scan.close();

	}

}
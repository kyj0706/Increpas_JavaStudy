package mymain;

import java.util.Scanner;

import myutil.Lotto;

public class MyMain_Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		String yn = "y";

		int[] user_no = new int[6];

		Lotto lotto = new Lotto();

		// ��÷����
		lotto.make_win_no();

		outter: while (true) {

			System.out.print("�ζ� 6�ڸ� �Է�:");

			for (int i = 0; i < user_no.length; i++) {
				user_no[i] = scanner.nextInt();
				if (user_no[i] > 45) {
					System.out.printf("1~45���� �����Է� [�߸��Է�[%d]]\n", user_no[i]);
					continue outter;

				}

			}

			// user_no[0] = scanner.nextInt();
			// user_no[1] = scanner.nextInt();
			// user_no[2] = scanner.nextInt();
			// user_no[3] = scanner.nextInt();
			// user_no[4] = scanner.nextInt();
			// user_no[5] = scanner.nextInt();

			// �ζ� ��ü���� user_no�� �ѱ��
			lotto.setUser_no(user_no);

			// ������
			lotto.display();

			System.out.print("��?(y/n):");
			yn = scanner.next();

			if (!yn.equalsIgnoreCase("Y"))
				break;

		} // end: while

		System.out.println("---End---");

		scanner.close();

	}

}

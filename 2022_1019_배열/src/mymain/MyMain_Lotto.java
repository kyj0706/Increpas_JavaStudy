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

		// 추첨실행
		lotto.make_win_no();

		outter: while (true) {

			System.out.print("로또 6자리 입력:");

			for (int i = 0; i < user_no.length; i++) {
				user_no[i] = scanner.nextInt();
				if (user_no[i] > 45) {
					System.out.printf("1~45사이 숫자입력 [잘못입력[%d]]\n", user_no[i]);
					continue outter;

				}

			}

			// user_no[0] = scanner.nextInt();
			// user_no[1] = scanner.nextInt();
			// user_no[2] = scanner.nextInt();
			// user_no[3] = scanner.nextInt();
			// user_no[4] = scanner.nextInt();
			// user_no[5] = scanner.nextInt();

			// 로또 객체에게 user_no를 넘긴다
			lotto.setUser_no(user_no);

			// 결과출력
			lotto.display();

			System.out.print("또?(y/n):");
			yn = scanner.next();

			if (!yn.equalsIgnoreCase("Y"))
				break;

		} // end: while

		System.out.println("---End---");

		scanner.close();

	}

}

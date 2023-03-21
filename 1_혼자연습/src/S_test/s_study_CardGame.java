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

			// 0인지 확인

			switch (choice) {
			case 1:// 1.카드 1장 출력3
				System.out.println("뽑고 싶은 카드 선택");
				int num = scan.nextInt();
				d.print_1card(num);
				break;
			case 2:// 2.카드 5장 출력
				d.print_5card();
				break;
			case 3:// 3.카드 52장 출력
				d.print_52card();
				break;
			case 4:// 4.카드 섞기
				d.shuffle_me();
				d.shuffle_com();
				break;
			case 5:// 5.카드7장을 내것과 컴퓨터 것을 출력시키는 메소드 작성해보세요.
					// MyCard : 7장카드
					// 컴퓨터Card : 7장카드
					// 모양 같은지
				d.print_my7card();
				d.print_com7card();
				
				// d.print_com7card();

				break;
			case 0:// 0.종료
				System.out.println("프로그램 종료");
				break loop1;

			}

		}
		scan.close();

	}

}
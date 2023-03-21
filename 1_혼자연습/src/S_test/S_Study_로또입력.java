package S_test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class S_Study_로또입력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		String yn = "y"; // 진행 여부

		int lotto_input[] = new int[6]; // 번호 입력
		Random random = new Random();// 랜덤 수
		int lotto[] = new int[6]; // 로또 번호 배열
		// int count = 0; // 맞춘거 수 있으면 카운트

		while (true) {

			// 6개 숫자 입력
			System.out.print("1~45사이숫자 입력 : ");
			for (int j = 0; j < lotto.length; j++) {
				
					lotto_input[j] = scanner.nextInt();
					
				
				
			} // end_for_j

			// 다른 번호 ?

			// 당첨번호 돌리기
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = random.nextInt(45) + 1;
				// 중복 거르기
				for (int k = 0; k < i; k++) {
					if (lotto[i] == lotto[k]) {
						i--;
						break;
					} // end_if
				} // end_for_k
			} // end_for_i

		
			
			

			System.out.print("다른 번호 입력?(y/n)");
			yn = scanner.next();
			if (!yn.equalsIgnoreCase("Y"))
				break;

		} // end_while

		// 맞춘개수

		// 등수

		System.out.println("------[입력번호]------");
		System.out.println(Arrays.toString(lotto_input));
		System.out.println("------[당첨번호]------");
		System.out.println(Arrays.toString(lotto));
		System.out.println("------[맞춘개수]------");
		System.out.println("------[  등수  ]------");

		scanner.close();

	}

}

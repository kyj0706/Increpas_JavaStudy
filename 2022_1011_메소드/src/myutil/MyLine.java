package myutil;

public class MyLine {

	// 1.Call by Name
	public static void draw_line() {
		// void : 값이 없을을 나타내는 상징적인 자료형
		System.out.println("------------------------------");
		// 메소드의 구색을 맞추기 위해 넣어라 !!
		return;// 자신을 호출한 곳으로 돌아가라(생략가능)
	}

	// 2.Call by Value : 메소드호출시 값(인자)을 값이 전달.
	// Method Overload(중복메소드)
	// 메소드명을 동일하나 호출인자정보가 틀린메소드
	public static void draw_line(int len) {

		for (int i = 0; i < len; i++) {
			System.out.print('-');
		}
		System.out.println();// 줄바꾸기
	}

	public static void draw_line(char ch, int len) {

		for (int i = 0; i < len; i++) {
			System.out.print(ch);
		}
		System.out.println();// 줄바꾸기
	}

	// 문제
	// 내가 한거 ....
	public static void draw_line1(char ch_1, int len_1, char ch_2, int len_2, int total_len_2) {

		for (int k = 0; k <= total_len_2; k++) {

			for (int i = 0; i < len_1; i++) {
				System.out.print(ch_1);

				for (int j = 0; j < len_2; j++) {
					System.out.print(ch_2);

				} // for_len2
			} // for_len1
		} // for_total_len2

		System.out.println();// 줄바꾸기
		return;

	}

	public static void draw_line2(char ch_1, int len_1, char ch_2, int len_2, int total_len_2) {

		
		for(int i=0; i<total_len_2;i++) {
			if(i%(len_1+len_2)<len_1) {
				System.out.print(ch_1);
			}else {
				System.out.print(ch_2);
			}
		}
		System.out.println();
		
		
		return;

	}

	// 감사ver
	public static void draw_line(char ch1, int len1, char ch2, int len2, int total_len) {

		while (true) {

			// 패턴1출력
			for (int i = 0; i < len1; i++) {
				System.out.print(ch1);
				total_len--;
				if (total_len == 0) {
					System.out.println();// 줄바꾸기
					return;
				}
			}

			// 패턴2
			for (int i = 0; i < len2; i++) {
				System.out.print(ch2);
				total_len--;
				if (total_len == 0) {
					System.out.println();
					return;
				}
			}

		}

	}

}

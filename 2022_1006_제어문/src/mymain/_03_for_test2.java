package mymain;

public class _03_for_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 규칙적으로 존재하는 데이터를 출력해봅시다.
		// 알파펫 출력합니다.
		// 순서1
		// 방법은 많다
		System.out.println("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

		// 순서2
		// 강사님 ACSII로
		for (int i = 65; i <= 90; i++) {

			System.out.print(i); //이렇게 하면 숫자가 나올거다.

			//System.out.printf("%c", i);// 출력 서식을 포멧한다.
		}

		System.out.println();// 줄바꾸기
		// ===================위 아래 비교=====================

		// 순서3
		// 'A' = 65 'Z' =90 이라고 굳이 할 필요는 없다
		// 'A' 상수로 처리해도 된다.
		// 여기서 문제
		// 'A'는 문자형 char 이다 byte 차이로 들어간다 int가 (4by) > char(2by)
		for (int i = 'A'; i <= 'Z'; i++) {

			// System.out.print(i); //이렇게 하면 숫자가 나올거다.

			System.out.printf("%c", i);// 출력 서식을 포멧한다.
		}

		System.out.println();// 줄바꾸기

		// 순서4
		for (int i = 0; i < 26; i++) { // i = 0 1 2 3 .....25
			System.out.printf("%c", 'A' + i);

		}
		System.out.println();// 줄바꾸기

		// 순서5
		// AbCdEfG... 대소문자로 출력하고 싶음
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.printf("%c", i);// 대문자
			System.out.printf("%c", i + 32);// 소문자
		}

		System.out.println();

		// 순서6
		for (int i = 'A'; i <= 'Z'; i++) {
			if (i % 2 == 1) {
				System.out.printf("%c", i);// 대문자
			} else {
				System.out.printf("%c", i + 32);
			}

		}
		System.out.println();// 줄바꾸기

		// 순서7
		// 문제
		// AbcDef 대소소대소소
		for (int i = 0; i < 26; i++) {
			if (i % 3 == 0) {
				System.out.printf("%c", 'A' + i);
			} else {
				System.out.printf("%c", 'A' + i + 32);
			}

		}
		System.out.println();

		
		  //순서8 //문제 
		for(int i=0; i<26; i++) 
		{ 
			System.out.printf("%c",'A'+i); 
			if(i%3==2) {
				System.out.print('-');
		
			}
		  }
		  
		 
		System.out.println();

		//대소문자 3칸씩 띄어 - 넣기
		for (int i = 0; i < 26; i++) {
			if (i % 3 == 0) {
				System.out.printf("%c", 'A' + i);
			} else {
				System.out.printf("%c", 'A' + i + 32);
			}
			if(i%3==2) {
				System.out.print('-');
			}

		}
		 
	}

}

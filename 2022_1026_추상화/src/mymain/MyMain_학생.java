package mymain;

import myutil.고등학생;
import myutil.중학생;
import myutil.초등학생;
import myutil.학생;

public class MyMain_학생 {

	static void 어머니왈(학생[] stunet_array) {

		// 방법1) 첨자이용
		for (int i = 0; i < stunet_array.length; i++) {

			학생 student = stunet_array[i];

			// 다형성 (Polymorphism)
			// => 명령은 동일하나 처리동작은 객체마다 서로 다르다..
			student.공부한다();
		}
	}

	static void 어머니왈2(학생[] stunet_array) {

		// 방법2) 개선루프
		for (학생 student : stunet_array) {
			// 다형성 (Polymorphism)
			// => 명령은 동일하나 처리동작은 객체마다 서로 다르다..
			student.공부한다();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// up_casting으로 학생이란 배열로 0 1 2
		// 학생배열이 만들어져 있는거 값을 아직이다.
		학생[] student_array = { new 초등학생(), new 중학생(), new 고등학생() };

		어머니왈(student_array);

		System.out.println("==================================");

		// 개선루프
		// 0 1 2 3
		int[] nr = { 1, 2, 3, 4 };
		System.out.println("--[첨자이용]--");
		for (int i = 0; i < nr.length; i++) {
			System.out.println(nr[i]);
		}

		// JDK 5.0 이후부터 가능
		System.out.println("--[개선loop]--");
		for (int n : nr) {
			System.out.println(n);
		}

	}

}

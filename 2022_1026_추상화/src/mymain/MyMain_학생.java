package mymain;

import myutil.����л�;
import myutil.���л�;
import myutil.�ʵ��л�;
import myutil.�л�;

public class MyMain_�л� {

	static void ��ӴϿ�(�л�[] stunet_array) {

		// ���1) ÷���̿�
		for (int i = 0; i < stunet_array.length; i++) {

			�л� student = stunet_array[i];

			// ������ (Polymorphism)
			// => ����� �����ϳ� ó�������� ��ü���� ���� �ٸ���..
			student.�����Ѵ�();
		}
	}

	static void ��ӴϿ�2(�л�[] stunet_array) {

		// ���2) ��������
		for (�л� student : stunet_array) {
			// ������ (Polymorphism)
			// => ����� �����ϳ� ó�������� ��ü���� ���� �ٸ���..
			student.�����Ѵ�();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// up_casting���� �л��̶� �迭�� 0 1 2
		// �л��迭�� ������� �ִ°� ���� �����̴�.
		�л�[] student_array = { new �ʵ��л�(), new ���л�(), new ����л�() };

		��ӴϿ�(student_array);

		System.out.println("==================================");

		// ��������
		// 0 1 2 3
		int[] nr = { 1, 2, 3, 4 };
		System.out.println("--[÷���̿�]--");
		for (int i = 0; i < nr.length; i++) {
			System.out.println(nr[i]);
		}

		// JDK 5.0 ���ĺ��� ����
		System.out.println("--[����loop]--");
		for (int n : nr) {
			System.out.println(n);
		}

	}

}

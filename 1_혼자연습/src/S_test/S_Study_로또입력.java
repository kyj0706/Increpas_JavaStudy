package S_test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class S_Study_�ζ��Է� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		String yn = "y"; // ���� ����

		int lotto_input[] = new int[6]; // ��ȣ �Է�
		Random random = new Random();// ���� ��
		int lotto[] = new int[6]; // �ζ� ��ȣ �迭
		// int count = 0; // ����� �� ������ ī��Ʈ

		while (true) {

			// 6�� ���� �Է�
			System.out.print("1~45���̼��� �Է� : ");
			for (int j = 0; j < lotto.length; j++) {
				
					lotto_input[j] = scanner.nextInt();
					
				
				
			} // end_for_j

			// �ٸ� ��ȣ ?

			// ��÷��ȣ ������
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = random.nextInt(45) + 1;
				// �ߺ� �Ÿ���
				for (int k = 0; k < i; k++) {
					if (lotto[i] == lotto[k]) {
						i--;
						break;
					} // end_if
				} // end_for_k
			} // end_for_i

		
			
			

			System.out.print("�ٸ� ��ȣ �Է�?(y/n)");
			yn = scanner.next();
			if (!yn.equalsIgnoreCase("Y"))
				break;

		} // end_while

		// ���ᰳ��

		// ���

		System.out.println("------[�Է¹�ȣ]------");
		System.out.println(Arrays.toString(lotto_input));
		System.out.println("------[��÷��ȣ]------");
		System.out.println(Arrays.toString(lotto));
		System.out.println("------[���ᰳ��]------");
		System.out.println("------[  ���  ]------");

		scanner.close();

	}

}

package mymain;

public class _03_for_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��Ģ������ �����ϴ� �����͸� ����غ��ô�.
		// ������ ����մϴ�.
		// ����1
		// ����� ����
		System.out.println("ABCDEFGHIJKLMNOPQRSTUVWXYZ");

		// ����2
		// ����� ACSII��
		for (int i = 65; i <= 90; i++) {

			System.out.print(i); //�̷��� �ϸ� ���ڰ� ���ðŴ�.

			//System.out.printf("%c", i);// ��� ������ �����Ѵ�.
		}

		System.out.println();// �ٹٲٱ�
		// ===================�� �Ʒ� ��=====================

		// ����3
		// 'A' = 65 'Z' =90 �̶�� ���� �� �ʿ�� ����
		// 'A' ����� ó���ص� �ȴ�.
		// ���⼭ ����
		// 'A'�� ������ char �̴� byte ���̷� ���� int�� (4by) > char(2by)
		for (int i = 'A'; i <= 'Z'; i++) {

			// System.out.print(i); //�̷��� �ϸ� ���ڰ� ���ðŴ�.

			System.out.printf("%c", i);// ��� ������ �����Ѵ�.
		}

		System.out.println();// �ٹٲٱ�

		// ����4
		for (int i = 0; i < 26; i++) { // i = 0 1 2 3 .....25
			System.out.printf("%c", 'A' + i);

		}
		System.out.println();// �ٹٲٱ�

		// ����5
		// AbCdEfG... ��ҹ��ڷ� ����ϰ� ����
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.printf("%c", i);// �빮��
			System.out.printf("%c", i + 32);// �ҹ���
		}

		System.out.println();

		// ����6
		for (int i = 'A'; i <= 'Z'; i++) {
			if (i % 2 == 1) {
				System.out.printf("%c", i);// �빮��
			} else {
				System.out.printf("%c", i + 32);
			}

		}
		System.out.println();// �ٹٲٱ�

		// ����7
		// ����
		// AbcDef ��ҼҴ�Ҽ�
		for (int i = 0; i < 26; i++) {
			if (i % 3 == 0) {
				System.out.printf("%c", 'A' + i);
			} else {
				System.out.printf("%c", 'A' + i + 32);
			}

		}
		System.out.println();

		
		  //����8 //���� 
		for(int i=0; i<26; i++) 
		{ 
			System.out.printf("%c",'A'+i); 
			if(i%3==2) {
				System.out.print('-');
		
			}
		  }
		  
		 
		System.out.println();

		//��ҹ��� 3ĭ�� ��� - �ֱ�
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

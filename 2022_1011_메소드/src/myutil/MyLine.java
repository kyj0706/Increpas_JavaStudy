package myutil;

public class MyLine {

	// 1.Call by Name
	public static void draw_line() {
		// void : ���� ������ ��Ÿ���� ��¡���� �ڷ���
		System.out.println("------------------------------");
		// �޼ҵ��� ������ ���߱� ���� �־�� !!
		return;// �ڽ��� ȣ���� ������ ���ư���(��������)
	}

	// 2.Call by Value : �޼ҵ�ȣ��� ��(����)�� ���� ����.
	// Method Overload(�ߺ��޼ҵ�)
	// �޼ҵ���� �����ϳ� ȣ������������ Ʋ���޼ҵ�
	public static void draw_line(int len) {

		for (int i = 0; i < len; i++) {
			System.out.print('-');
		}
		System.out.println();// �ٹٲٱ�
	}

	public static void draw_line(char ch, int len) {

		for (int i = 0; i < len; i++) {
			System.out.print(ch);
		}
		System.out.println();// �ٹٲٱ�
	}

	// ����
	// ���� �Ѱ� ....
	public static void draw_line1(char ch_1, int len_1, char ch_2, int len_2, int total_len_2) {

		for (int k = 0; k <= total_len_2; k++) {

			for (int i = 0; i < len_1; i++) {
				System.out.print(ch_1);

				for (int j = 0; j < len_2; j++) {
					System.out.print(ch_2);

				} // for_len2
			} // for_len1
		} // for_total_len2

		System.out.println();// �ٹٲٱ�
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

	// ����ver
	public static void draw_line(char ch1, int len1, char ch2, int len2, int total_len) {

		while (true) {

			// ����1���
			for (int i = 0; i < len1; i++) {
				System.out.print(ch1);
				total_len--;
				if (total_len == 0) {
					System.out.println();// �ٹٲٱ�
					return;
				}
			}

			// ����2
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

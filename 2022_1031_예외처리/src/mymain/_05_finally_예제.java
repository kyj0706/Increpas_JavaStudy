package mymain;

import java.io.FileReader;
import java.io.IOException;

public class _05_finally_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr = null;
		int count = 0;

		try {
			// ���ڵ�
			fr = new FileReader("a.txt");

			while (true) {

				int ch = fr.read();// IOException

				// ������ ���̸� ������
				if (ch == -1)
					break;

				System.out.printf("%c", ch);

				Thread.sleep(500);

			}

		} catch (Exception e) {
			// TODO: handle exception
			// ����ó��
			e.printStackTrace();

		} finally {

			// Ư������ try catch ����Ű = Alt +Shift + z
			// Unhandled exception type IOException => IO = input / ouput

			try {
				// ȭ���� ���������� �ݾƶ�.
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}

package mymain.input;

import java.io.FileInputStream;
import java.io.InputStream;

public class _02_FileInputTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		InputStream is = new FileInputStream("a.txt");

		while (true) {

			int ch = is.read(); // ȭ�Ϸκ��� 1byte�о����
			if (ch == -1) //File EOF�� -1��ȯ
				break; // Ctrl+Z
			System.out.printf("%c", ch);

		} // end : while

		// ����ó�� �� ��
		is.close();// File�� ���� �� �� ������ �ݾƶ� !!

	}

}

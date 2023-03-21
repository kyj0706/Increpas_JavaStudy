package mymain.input;

import java.io.InputStream;
import java.net.URL;

public class _03_NetworkInputTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String str_url = "https://www.naver.com/";

		// Uniform Resource Locator(�������� �ڿ��� ��ġ�� �˷��ִ� �ּ�)
		URL url = new URL(str_url);

		InputStream is = url.openStream();// �ش��ּҷ� ����

		while (true) {

			int ch = is.read(); // ��Ʈ��ũ�κ��� 1byte�о����
			if (ch == -1) // EOF�� -1��ȯ
				break; // Ctrl+Z
			System.out.printf("%c", ch);

		} // end : while

	}

}

package mymain.input;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class _03_NetworkInputTest_Reader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String str_url = "https://www.naver.com/";
		
		
		
		
		
		// Uniform Resource Locator(�������� �ڿ��� ��ġ�� �˷��ִ� �ּ�)
		URL url = new URL(str_url);

		InputStream is = url.openStream();// �ش��ּҷ� ����
		
		//���ڷ� �ޱ� ���ؼ� Reader Filter
		InputStreamReader isr = new InputStreamReader(is,"utf-8");

		while (true) {

			int ch = isr.read(); // ��Ʈ��ũ�κ��� 1byte�о����
			if (ch == -1) // EOF�� -1��ȯ
				break; // Ctrl+Z
			System.out.printf("%c", ch);

		} // end : while

	}

}

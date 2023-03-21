package mymain.input;

import java.io.InputStream;
import java.net.URL;

public class _03_NetworkInputTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String str_url = "https://www.naver.com/";

		// Uniform Resource Locator(웹서버의 자원의 위치를 알려주는 주소)
		URL url = new URL(str_url);

		InputStream is = url.openStream();// 해당주소로 연결

		while (true) {

			int ch = is.read(); // 네트워크로부터 1byte읽어오기
			if (ch == -1) // EOF면 -1반환
				break; // Ctrl+Z
			System.out.printf("%c", ch);

		} // end : while

	}

}

package mymain.input;

import java.io.FileInputStream;
import java.io.InputStream;

public class _02_FileInputTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		InputStream is = new FileInputStream("a.txt");

		while (true) {

			int ch = is.read(); // 화일로부터 1byte읽어오기
			if (ch == -1) //File EOF면 -1반환
				break; // Ctrl+Z
			System.out.printf("%c", ch);

		} // end : while

		// 버릇처럼 할 것
		is.close();// File을 열고 난 후 끝나면 닫아라 !!

	}

}

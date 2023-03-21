package mymain;

import java.io.FileReader;
import java.io.IOException;

public class _05_finally_예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReader fr = null;
		int count = 0;

		try {
			// 본코드
			fr = new FileReader("a.txt");

			while (true) {

				int ch = fr.read();// IOException

				// 파일의 끝이면 끝내라
				if (ch == -1)
					break;

				System.out.printf("%c", ch);

				Thread.sleep(500);

			}

		} catch (Exception e) {
			// TODO: handle exception
			// 예외처리
			e.printStackTrace();

		} finally {

			// 특정영역 try catch 단축키 = Alt +Shift + z
			// Unhandled exception type IOException => IO = input / ouput

			try {
				// 화일이 열려있으면 닫아라.
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}

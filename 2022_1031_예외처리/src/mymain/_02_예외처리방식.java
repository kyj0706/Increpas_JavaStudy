package mymain;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class _02_예외처리방식 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = 1, res;

		String str = "abc";

		int[] mr = { 1, 2, 3 };

		try {
			// 본코드작성

			// 오류내용을 JAM 던져준다
			// 예상오류내용을 JVM이 던져준다.
			// java에서 이렇게 직접적으로 하지 않는다.. 어떻게 던지고 잡는지 확인하기 위한용도
			if (b == 0)
				throw new ArithmeticException("0으로 나눌수 없습니다."); // 던진다 ~
			res = a / b;

			// 오류내용을 JAM 던져준다
			if (str == null)
				throw new NullPointerException("str 은 null 입니다.");
			int len = str.length();

			
			int index = 2;
			// 오류내용을 JAM 던져준다
			if (index >= mr.length)
				throw new ArrayIndexOutOfBoundsException("첨자범위를 벗어 났습니다.");
			mr[index] = 10;
			
			//일반적 예외 
			//throw new  InterruptedException()
			//조건이 발생하면 진행
			Thread.sleep(1000);
			
			FileReader fr = new FileReader("a.txt");
			
			

		} catch (ArithmeticException e) { // 받았다 ~
			// TODO: handle exception
			// 특별한 경우를 제외하고는 모니터링 용도

			// 에외구문작성
			e.printStackTrace(); // 에러추적

		} catch (NullPointerException e) {

			e.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e) {

			e.printStackTrace();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("---정상종료---");
	}

}

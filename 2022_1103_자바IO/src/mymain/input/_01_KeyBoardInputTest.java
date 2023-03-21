package mymain.input;

import java.io.IOException;
import java.io.InputStream;

public class _01_KeyBoardInputTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//키보드 표준장치명
		InputStream is = System.in;
		
		System.out.println("값을 입력하세요(종료:Ctrl+Z)");
		
		
		while(true) {
			
			int ch = is.read(); //키보드버퍼로부터 1byte읽어오기
			if(ch==-1) break;  //Ctrl+Z
			System.out.printf("%c",ch);
			
			
		}//end : while
	}

}

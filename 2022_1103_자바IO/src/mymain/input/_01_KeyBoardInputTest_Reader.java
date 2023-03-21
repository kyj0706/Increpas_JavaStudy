package mymain.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class _01_KeyBoardInputTest_Reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//키보드 표준장치명
		InputStream is = System.in;
		
		//문자스트림으로 필터를 씌운다
		InputStreamReader isr = new InputStreamReader(is);
		
		System.out.println("값을 입력하세요(종료:Ctrl+Z)");
		
		
		while(true) {
			
			int ch = isr.read(); //키보드버퍼로부터 1byte읽어오기
								 //InputStream -> InputStreamReader
								 //     byte   ->    char
			if(ch==-1) break;  //Ctrl+Z
			System.out.printf("%c",ch);
			
			
		}//end : while
	}

}

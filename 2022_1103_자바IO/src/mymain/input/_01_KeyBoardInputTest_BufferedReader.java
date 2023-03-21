package mymain.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class _01_KeyBoardInputTest_BufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//키보드 표준장치명
		InputStream is = System.in;
		
		//문자스트림으로 필터를 씌운다
		InputStreamReader isr = new InputStreamReader(is,"utf-8");
		
		BufferedReader br = new BufferedReader(isr);
		
		
		
		System.out.println("값을 입력하세요(종료:Ctrl+Z)");
		
		
		while(true) {
			
			String data = br.readLine();
			
			if(data==null) break;
			
			System.out.println(data);
			
		}//end : while
	}

}

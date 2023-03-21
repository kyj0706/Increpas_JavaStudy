package mymain.input;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class _03_NetworkInputTest_BufferedReader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String str_url = "https://www.naver.com/";

		// Uniform Resource Locator(웹서버의 자원의 위치를 알려주는 주소)
		URL url = new URL(str_url);

		InputStream is = url.openStream();// 해당주소로 연결
		
		// 문자로 받기 위해서 Reader Filter
		InputStreamReader isr = new InputStreamReader(is, "utf-8");
		
		//BufferedReader Filter
		BufferedReader br = new BufferedReader(isr);

		while (true) {

			String data = br.readLine();//1 line단위로 받는다.
			
			if(data==null) break;
				
			System.out.println(data);
			
			
			Thread.sleep(1000);
			

		} // end : while

	}

}

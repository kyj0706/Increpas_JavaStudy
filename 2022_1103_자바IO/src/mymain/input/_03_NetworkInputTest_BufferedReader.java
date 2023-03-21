package mymain.input;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class _03_NetworkInputTest_BufferedReader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String str_url = "https://www.naver.com/";

		// Uniform Resource Locator(�������� �ڿ��� ��ġ�� �˷��ִ� �ּ�)
		URL url = new URL(str_url);

		InputStream is = url.openStream();// �ش��ּҷ� ����
		
		// ���ڷ� �ޱ� ���ؼ� Reader Filter
		InputStreamReader isr = new InputStreamReader(is, "utf-8");
		
		//BufferedReader Filter
		BufferedReader br = new BufferedReader(isr);

		while (true) {

			String data = br.readLine();//1 line������ �޴´�.
			
			if(data==null) break;
				
			System.out.println(data);
			
			
			Thread.sleep(1000);
			

		} // end : while

	}

}

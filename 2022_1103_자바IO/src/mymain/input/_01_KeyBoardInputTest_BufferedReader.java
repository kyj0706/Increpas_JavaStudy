package mymain.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class _01_KeyBoardInputTest_BufferedReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Ű���� ǥ����ġ��
		InputStream is = System.in;
		
		//���ڽ�Ʈ������ ���͸� �����
		InputStreamReader isr = new InputStreamReader(is,"utf-8");
		
		BufferedReader br = new BufferedReader(isr);
		
		
		
		System.out.println("���� �Է��ϼ���(����:Ctrl+Z)");
		
		
		while(true) {
			
			String data = br.readLine();
			
			if(data==null) break;
			
			System.out.println(data);
			
		}//end : while
	}

}

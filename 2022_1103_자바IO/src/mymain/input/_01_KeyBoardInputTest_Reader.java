package mymain.input;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class _01_KeyBoardInputTest_Reader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Ű���� ǥ����ġ��
		InputStream is = System.in;
		
		//���ڽ�Ʈ������ ���͸� �����
		InputStreamReader isr = new InputStreamReader(is);
		
		System.out.println("���� �Է��ϼ���(����:Ctrl+Z)");
		
		
		while(true) {
			
			int ch = isr.read(); //Ű������۷κ��� 1byte�о����
								 //InputStream -> InputStreamReader
								 //     byte   ->    char
			if(ch==-1) break;  //Ctrl+Z
			System.out.printf("%c",ch);
			
			
		}//end : while
	}

}

package mymain.input;

import java.io.IOException;
import java.io.InputStream;

public class _01_KeyBoardInputTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Ű���� ǥ����ġ��
		InputStream is = System.in;
		
		System.out.println("���� �Է��ϼ���(����:Ctrl+Z)");
		
		
		while(true) {
			
			int ch = is.read(); //Ű������۷κ��� 1byte�о����
			if(ch==-1) break;  //Ctrl+Z
			System.out.printf("%c",ch);
			
			
		}//end : while
	}

}

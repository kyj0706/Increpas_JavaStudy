package S_test;

import java.io.IOException;

public class S_Study_while_test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int ch;
		String end = "����";
		int count= 0;
		
		
		System.out.println("���ڸ� �Է��ϼ���(����:Ctrl+Z)");
		 
		
		while(true) {
			
			//Ű���� ���۷κ��� 1byte�о����
			ch=System.in.read();
			
			
			//�������� : ctrl + Z
			if(ch==-1 && end=="����") break; //break <- ���� �ݺ����� ����(Ż��)�Ѵ�.
			
			count++;
			//�о�� ���� ���
			System.out.printf("%c", ch);
			
			
		}
		
		System.out.printf("�ݺ�Ƚ����:%d(ȸ)\n",count);
		
		System.out.println("--Edn---");

	}

}

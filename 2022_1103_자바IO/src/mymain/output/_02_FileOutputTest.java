package mymain.output;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class _02_FileOutputTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		OutputStream os = new FileOutputStream("b.txt");
		
		//�������(����) ���ϱ���
		
		os.write(65);
		os.write('\n');
		
		//�ȳ��ϼ���
		String msg = "�ȳ��ϼ���\n";
		os.write(msg.getBytes());
		
		
		//123���
		int n = 123;
		os.write(String.valueOf(n).getBytes());
		
		os.write('\n');
	
		os.write(String.valueOf(true).getBytes());
		
		os.write('\n');
		
		//filter
		//OutputSteam -> PrintStream Filler
		PrintStream out = new PrintStream(os, true);
		
		String name = "ȫ�浿";
		int age = 20;
		
		//ȭ��
		out.printf("�̸� : %s\n",name);
		out.printf("���� : %d\n",age);
		
		//Monitor
		System.out.printf("�̸� : %s\n",name);
		System.out.printf("���� : %d\n",age);
		
		
		os.flush();
		
		
		
		
		
		os.close();
	}

}

package mymain.output;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class _02_FileOutputTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		OutputStream os = new FileOutputStream("b.txt");
		
		//문자출력(저장) 파일기준
		
		os.write(65);
		os.write('\n');
		
		//안녕하세요
		String msg = "안녕하세요\n";
		os.write(msg.getBytes());
		
		
		//123출력
		int n = 123;
		os.write(String.valueOf(n).getBytes());
		
		os.write('\n');
	
		os.write(String.valueOf(true).getBytes());
		
		os.write('\n');
		
		//filter
		//OutputSteam -> PrintStream Filler
		PrintStream out = new PrintStream(os, true);
		
		String name = "홍길동";
		int age = 20;
		
		//화일
		out.printf("이름 : %s\n",name);
		out.printf("나이 : %d\n",age);
		
		//Monitor
		System.out.printf("이름 : %s\n",name);
		System.out.printf("나이 : %d\n",age);
		
		
		os.flush();
		
		
		
		
		
		os.close();
	}

}

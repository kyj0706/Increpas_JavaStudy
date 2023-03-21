package S_test;

import java.io.IOException;

public class S_Study_while_test2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int ch;
		String end = "종료";
		int count= 0;
		
		
		System.out.println("문자를 입력하세요(종료:Ctrl+Z)");
		 
		
		while(true) {
			
			//키보드 버퍼로부터 1byte읽어오기
			ch=System.in.read();
			
			
			//강제종료 : ctrl + Z
			if(ch==-1 && end=="종료") break; //break <- 현재 반복문을 졸료(탈출)한다.
			
			count++;
			//읽어온 문자 출력
			System.out.printf("%c", ch);
			
			
		}
		
		System.out.printf("반복횟수는:%d(회)\n",count);
		
		System.out.println("--Edn---");

	}

}

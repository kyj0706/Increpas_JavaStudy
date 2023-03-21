package mymain;

import java.io.IOException;

public class _04_while_test2_keyboard {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//순서1
		// 키보드 버퍼로 부터 1byte를 가지고 온다 
		// ABC 라면 ASCII코드에 의해 => 65, 66 , 67
		// 65읽어 => 65삭제 => 66읽어 
		
		// 질문1)
		// while 를 몇번 돌았냐?
		// I am Tom (enter) =>  10번이라는거다 .
		// 왜??? 문자1byte + 공백1byte+ 제어(\r \n)도 각1byte 이기 때문에
		
		// 강조1)
		// 반복횟수는 개발자가 알수가 없다 => 왜 ? 사용자가 어떻게 쓸줄 알고 ;;;
		
		// 당황)
		// 이클립스는 ctrl + z를 제대로 안될수도 있다 .. 그래서 터미널로 해보는게 
		int ch;
		int count= 0;
		
		
		System.out.println("문자를 입력하세요(종료:Ctrl+Z)");
		
		
		while(true) {
			
			//키보드 버퍼로부터 1byte읽어오기
			ch=System.in.read();
			
			
			//강제종료 : ctrl + Z
			if(ch==-1) break; //break <- 현재 반복문을 졸료(탈출)한다.
			
			count++;
			//읽어온 문자 출력
			System.out.printf("%c", ch);
			
			
		}
		
		System.out.printf("반복횟수는:%d(회)\n",count);
		
		System.out.println("--Edn---");
			

	}

}

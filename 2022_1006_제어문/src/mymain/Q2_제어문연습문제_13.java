package mymain;

import java.io.IOException;

public class Q2_제어문연습문제_13 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		int ch;
		int white_cou=0;
		int num_cou= 0; //숫자
		int chr_cou=0; //문자
		int etc_cou =0; //기타
		
		System.out.println("데이터를 입력하세요. 끝내려면 [Ctrl]+z를 누르세요.");
		
		
		
		
		while(true) {
			
			
			//키보드 읽어오기
			ch=System.in.read();
		
				
			
			if(ch==-1) break;
			
		
			
			//종료
		
			
			
			System.out.printf("%c",ch);
			
		}
		System.out.printf("알바벳 문자 	: %d\n",chr_cou);
		System.out.printf("숫자 		:\n");
		System.out.printf("화이트 문자 	:\n");
		System.out.printf("특수 기호 	:\n");
		
		System.out.println("--종료되었습니다--");
		
		
		
		
		
		//scanner.close();
	}

}

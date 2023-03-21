package mymain;

import java.io.IOException;

public class Q2_제어문연습문제_13_강 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("데이터를 입력하세요. 끝내려면 [Ctrl]+z를 누르세요.");
		
		int alpha_count=0; //알파벳갯수
		int number_count=0;//숫자갯수
		int white_count=0;//화이트문자개수
		int etc_count=0; //기타
		
		
		int ch;		
		while(true) {
			
			ch= System.in.read();//키보드버퍼 
			
			
			
			if(ch==-1) break;//종료
			
			//알파벳 체크 (대문자로 변환시켜서 비교)
			if(Character.toUpperCase(ch)>='A' && Character.toUpperCase(ch)<='Z')
				alpha_count++;
			else if(ch>='0'&& ch<='9')
				number_count++;
			else if(ch==32 || ch=='\t' || ch=='\n' || ch=='\r')
				white_count++;
			else
				etc_count++;
			
			
				
				
			System.out.printf("%c",ch);
		}
			System.out.printf("알파벳 문자 	:%d\n",alpha_count);
			System.out.printf("숫자 문자 	:%d\n",number_count);
			System.out.printf("화이트 문자 	:%d\n",white_count);
			System.out.printf("특수 기호 	:%d\n",etc_count);
	}

}

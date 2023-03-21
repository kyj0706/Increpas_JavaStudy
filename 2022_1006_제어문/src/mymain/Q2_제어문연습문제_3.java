package mymain;

import java.util.Scanner;

public class Q2_제어문연습문제_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		char ch;
		System.out.print("문자 1개를 입력하세요>>");
		//     0123
		//    "ABCD"
		ch = scanner.next().charAt(0);//문자열중에서 첫번째문자 얻어오기
		
		if( ch>='A' && ch<='Z')
		   System.out.printf("대문자 [%c]입니다\n", ch);
		else if( ch>='a' && ch<='z' )
			System.out.printf("소문자 [%c]입니다\n", ch);
		else if( ch>='0' && ch<='9' )
			System.out.printf("숫자문자 [%c]입니다\n", ch);
		else if( ch==' ' || ch=='\t' || ch=='\r' || ch=='\n')
			System.out.println("화이트 문자입니다");
		else
			System.out.printf("기타 문자 [%c]입니다\n", ch);
		
		
		scanner.close();
	}

}

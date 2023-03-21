package mymain;

import java.util.Scanner;

public class Q2_제어문연습문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문자를 입력받아 그문자를 이니셜로 각 나라 명 출력하는 프로그램을 
		//if~ els 문으로 작성해보도록 하자
		
		
		Scanner scanner = new Scanner(System.in );
		
		char ch;//문자1개 입력
		System.out.print("문자 한개를 입력하세요>>");
		
		ch = scanner.next().charAt(0);
		
		if(ch=='a' || ch =='A') {
			System.out.println("Africa");

		}else if (ch=='b' || ch =='B') {
			System.out.println("Brazil");
		
		}else if (ch=='c' || ch =='C') {
			System.out.println("Canada");
			
		}else if (ch=='d' || ch =='D') {
			System.out.println("Denmark");
			
		}else {
			System.out.println("아직 D까지 밖에 없음");
		}
		
		
		
		
		
		//System.out.printf("%c",ch);
		
		
		
		
		
		scanner.close();

	}

}

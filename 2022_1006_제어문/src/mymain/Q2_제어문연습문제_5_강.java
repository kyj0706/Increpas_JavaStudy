package mymain;

import java.util.Scanner;

public class Q2_제어문연습문제_5_강 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("문자 한 개를 입력하세요");
		int ch = scanner.next().charAt(0);
		
		
		if(ch=='a' || ch=='A') {
			System.out.println("America");
		}else if(ch=='b' || ch=='B') {
			System.out.println("Brazil");
		}else if(Character.toUpperCase(ch)=='C'){ //대소문자 자동변환 toUpperCase
			System.out.println("Canada");
		}else if(Character.toUpperCase(ch)=='D'){ //대소문자 자동변환 toUpperCase
			System.out.println("Denmark");
		}else if(Character.toUpperCase(ch)=='E'){ //대소문자 자동변환 toUpperCase
			System.out.println("Espania");
			
		}else {
			System.out.println("[A~Z]만 입력해주세요, 아직 E까지만 있습니다.");
		}
		
		
		scanner.close();

	}

}

package mymain;

import java.util.Scanner;

public class _02_switch_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//입력선언1
		Scanner scanner = new Scanner(System.in);
		
		//변수선언2
		String data;	//과일명
		String res;		//결과저장
		
		//입력3
		System.out.print("과일명:");
		data = scanner.next(); //문자열 입력받기 
		
		//과일에 따른 맛을 결과변수에 넣는다4
		//switch(변수 또는 수식)5
		
		switch(data)
		{
			case "포도" 	: res = "달다";		break;
			case "수박" 	: res = "시원하다"; break;
			case "딸기" 	: res = "맛있다."; 	break;
			case "참외" 	: res = "알아둬";	break;
			default			: res = "무슨맛";
			
		}
		
		System.out.printf("[%s]는 [%s]\n" ,data,res);
		
		
		
		
		
		//입력종료
		scanner.close();

	}

}

package mymain;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int width = 100; //폭
		int height = 50; //높이
		int area; //면적

				
		//키보드로부터 입력받는 객체 선언
		//System.in		: System class내의 표준 입력객체
		//System.out	: System class내의 표준 출력객체
		Scanner scanner = new Scanner(System.in); //키보드 입력받기 [그냥 외우라고 한다.]
		
		System.out.println("폭 :"); 
		width = scanner.nextInt(); //정수 입력받기
		
		System.out.println("높이? :"); 
		height = scanner.nextInt();//정수 입력받기
		
		//면적계산
		area = width * height;
		
		System.out.printf("폭:%d 높이:%d 사각형의면적은:%d", width,height,area);
		
		
		
		/*
		 * int width; //폭 int height; //높이 int area; //면적
		 */		 		
		
		//(굳이 안해도 생관은 없다) 차피 프로그램이 끝나면 끝나는거니깐
		scanner.close();//스캐너를 닫아준다.
		
		  //면적계산
		  
		  
		  
		  
		 
		  
		 
		
		
	
		
		

	}

}

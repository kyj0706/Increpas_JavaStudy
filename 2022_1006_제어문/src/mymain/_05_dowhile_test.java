package mymain;

import java.util.Scanner;

public class _05_dowhile_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1회성 프로그램 
		
		//순서1
		//입력부
		Scanner scanner = new Scanner(System.in);
		
		//순서2
		int dan;//구구단수
		String yn = "y"; //진행y
		
		//순서3
		//실행순서1
		do  
		{
			
				System.out.print("단?");
				dan = scanner.nextInt();
			
			//순서7
			//dan : 2~9사이값?
				
			// if(dan<2 || dan>9) 동일
			if( !(dan >=2 && dan<=9) ) {
				System.out.println("단의 값은 2~9사이만 입력하세요");
				continue;//현재 명령 종료시키고 다음으로 진행해라 돌고나서 다시 처음 부터 
			
			}//if_end
			
			//구구단 출력
			System.out.printf("---[%d]단 보기---\n",dan);
			
			
			
			//순서4
			//구구단for문
			for(int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %2d\n",dan, i ,dan*i);
				
				
			}//for_end
			
			//순서5
			//또할래 ?
			System.out.print("또?(y/n)");
			//scanner는 문자열 1개만 받는다 ?  =>일단 재정리
			// "y" "Y" 대소문자 뭘로 할건데 ? => 처리해야한다.
			yn =scanner.next();//문자열 입력받기 "y", "Y"
			
			//문자열 비교는 equals 사용한다.
			// yn=="y" (X)  yn.equals("y") (O)
			
		}//do_end
		
		//순서6
		//실행순서2
		while(yn.equals("y") || yn.equals("Y"));
		
		
		System.out.println("---End---");
		
		
		
		
		
		//입력종료
		scanner.close();

	}

}

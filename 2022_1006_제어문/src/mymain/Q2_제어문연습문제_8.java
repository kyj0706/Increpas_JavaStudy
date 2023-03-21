package mymain;

public class Q2_제어문연습문제_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수가 주어졌을 경우 1부터 그 정수까지의 합을 구하여 
		//다음과 같이 출력하는 프로그램을 
		//작성해 보자.
		
		int num =10;
		int sum =0 ;
	
		
		System.out.println("n           1부터 n까지의 합");
		System.out.println("============================");
		
		
		for (int i=1; i<=num; i++) {
			
			sum = sum+i;
			
		
			System.out.printf("%2d%18d\n" ,i , sum);
			
		}
		
	}

}

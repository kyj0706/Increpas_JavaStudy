package mymain;

public class Q2_제어문연습문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7. for 문을 사용하여 0부터 5까지의 제곱과 
		//세제곱을 구해서 출력하는 프로그램을 작성해 보자.
		
		int num = 0;
		
		int res_1=0;
		int res_2=0;
		
		
		System.out.println("정수값   제곱   세제곱");
		System.out.println("======================");
		
		for(int i=0; i<=5; i++) {
			
			num = i;
			res_1 = (int) Math.pow(num, 2);
			res_2 = (int) Math.pow(num, 3);
			
			System.out.printf("%d%11d%11d\n",num,res_1,res_2);
			//System.out.printf("%d\n",res_2);
			
			
			
		}

	}

}

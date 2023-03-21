package mymain;

public class Q2_제어문연습문제_9_강 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//팩토리알 => 경우의수
		//합구하는 거랑 같은거다
		
		int n= 45;
		
		double result=1.0;
		
		
		//factorial :
		// 5! = 5*4*3*2*1
		
		for(int i=n; i>=1; i--) { //i = 5 4 3 2 1
			
			result = result * i;
			
		}
		System.out.printf("%d!=%.0f\n",n ,result);
		
	}

}

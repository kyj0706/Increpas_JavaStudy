package mymain;

public class Q2_제어문연습문제_7_강 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("정수값   제곱   세제곱");
		System.out.println("======================");
		
		
		
		for(int n=0; n<=5;  n++) {
			
			//System.out.printf("%d%11d%11d\n", n, n*n, n*n*n);// 직관적

			
				
			//Math.pow(a,b) <- a's b 승
			System.out.printf("%d%11d%11d\n", n, (int)Math.pow(n, 2), (int)Math.pow(n, 3));
		}

	}

}

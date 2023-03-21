package mymain;

public class Q2_제어문연습문제_10_강 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = 1;
		for(int i=1; i<=10; i++) {
			
			if(i%2==0) // 짝수이면 
			result = result*i;
		}
		System.out.printf("1부터 10까지의 짝수의 곱 : %d\n",result);

	}

}

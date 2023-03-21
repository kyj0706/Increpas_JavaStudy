package mymain;

public class Q2_제어문연습문제_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 10까지의 짝수의 곱을 구하는 프로그램을 작성해 보자.

		int num = 1;
		

		for (int i = 1; i <=10; i++) {
			
			
			if(i%2==0) { 
				System.out.println(i);
				num= num*i;
				
			}			

		}
		System.out.printf("1부터 10까지의 짝수의 곱 : %d",num);

	}

}

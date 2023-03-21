package mymain;

import myutil.MyInteger;

public class _05_이진논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이진논리연산자 : &(And)			: 2개 모두 참이면
		//					^(Exclusive Or) : 값이 서로 틀린거
		//					|(OR)			: 2개중 1개가 참이면 
		
		//변수선언
		int a =7 , b =5;
		
		//순서1 (2진수 확인)
		System.out.printf("[%32s] : %d\n", MyInteger.toBinaryString(a),a);
		System.out.printf("[%32s] : %d\n", MyInteger.toBinaryString(b),b);

		//순서2 
		//&(And)
		System.out.printf("[%32s] : %d & %d\n", MyInteger.toBinaryString(a&b),a,b);
		
		//순서3
		//|(Exclusive Or)
		System.out.printf("[%32s] : %d | %d\n", MyInteger.toBinaryString(a|b),a,b);
		
		//순서4
		//^(OR)
		System.out.printf("[%32s] : %d ^ %d\n", MyInteger.toBinaryString(a^b),a,b);
		
	}

}

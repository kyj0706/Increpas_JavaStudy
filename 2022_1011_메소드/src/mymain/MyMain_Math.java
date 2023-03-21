package mymain;

import myutil.MyMath;

public class MyMain_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10 ,y=20, z=100 ,res;
		int m=3;
		
		
		
		//Java API	: Math class <= 수학적계산 기능을 갖는 클래스
		// 			: max.overload되어있다.(인자정보가 틀린메소드)

		//2수중 큰수
		res = Math.max(x, y);
		System.out.printf("%d,%d중 큰수는 %d\n",x,y,res);
		
		//3수중 큰수
		res=MyMath.max(x, y, z);
		System.out.printf("%d,%d %d중 큰수는 %d\n",x,y,z,res);
		
		//n까지 합
		res =MyMath.hap(x);
		System.out.printf("1~%d까지의 합은 = %d 입니다.\n",x,res);
		
		//짝수의 합
		res =MyMath.hap_even(x);
		System.out.printf("%d까지 짝수의 합은 =%d\n",x,res);
		
		//홀수의 합
		res =MyMath.hap_odd(x);
		System.out.printf("%d까지 홀수의 합은 =%d\n",x ,res);
		
		//n까지의 수중 m의 배수의 합
		x=100;
		res =MyMath.hap(x, m);
		System.out.printf("%d까지의 수중 %d의 배수의 합은 =%d\n",x,m,res);
		
		//소수 출력
		System.out.printf("%d의 소수는 : ",x);
		MyMath.display_prime(x);
		
		//소수 출력_t
		System.out.println();
		MyMath.display_prime_t(x);
		
		
		

		
	}

}

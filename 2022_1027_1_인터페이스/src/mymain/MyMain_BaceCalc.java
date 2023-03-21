package mymain;

import myutil.BaseCalc;
import myutil.BaseCalcImpl;

public class MyMain_BaceCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//이렇게 되면 에러가 난다 에러문구를 확인하자
		// 에러문구 : The final field BaseCalc.PI cannot be assigned 
		//	 => 대입이 안되...
		//BaseCalc.PI = 3.141592;
		
		//이렇게 쓰면 문제는 없다.
		System.out.println(BaseCalc.PI);
		
		
		//인터페이스 = new  클래스
		//사용명세서  		설계서
		BaseCalc calc = new BaseCalcImpl();
		
		int a = 10 , b=5, res;
		
		res =calc.plus(a, b);
		System.out.printf("%d + %d = %d\n", a ,b, res);
		
		res =calc.multiply(a, b);
		System.out.printf("%d * %d = %d\n", a ,b, res);

	}

}

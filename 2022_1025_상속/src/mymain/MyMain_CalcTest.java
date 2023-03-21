package mymain;

import myutil.AdvanceClac;
import myutil.BaseCalc;

public class MyMain_CalcTest {

	// up_casting(영역축소)
	// 기능을 빌려줄께 ->제한적으로
	static void use_basecalc(BaseCalc bc) { //up_casting
		// 언제생성되는가 : 생성되었을때
		// BaseCalc bc 에는 = ac가 담겨있다
		// 왜 ? main에서 보내줘내 줬으니깐

		int x = 10, y = 5, res;
		res = bc.minus(x, y);
		System.out.printf("use basecalc : %d - %d = %d\n", x, y, res);

	}

	static void use_object(Object ob) { //up_casting
		// 언제생성되는가 : 생성되었을때
		// use_object ob 에는 = ac가 담겨있다
		// 왜 ? main에서 보내줘내 줬으니깐
		
		int n= 10, res;
				
		//이러면 안된다. 왜 ? 내가 준 영역은 1인데 왜 3까지 ?
		//res = ob.hap(n);
		
		//donw_casting(영역의 확장)
		// . 도트 연산자가 더 빠르다 괄호보다   . > ()
		res = ((AdvanceClac)ob).hap(n);
		
		//같은 뜻
		/*
		AdvanceClac ac = (AdvanceClac)ob;
		res = ac.hap(n);
		*/
		
		System.out.printf("use_object : %d까지의 합=%d\n",n,res);

	}

	// 소유자는 이녀석이다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdvanceClac ac = new AdvanceClac();

		// 필요한거 보내주께~
		use_basecalc(ac);

		use_object(ac);

		int a = 10, b = 3, res;

		System.out.println("--[main]--");
		res = ac.plus(a, b);
		System.out.printf("%d + %d = %d\n", a, b, res);

		res = ac.hap(a);
		System.out.printf("%d까지의 합 = %d\n", a, res);

		double result = ac.pow(a, b);
		System.out.printf("%d의 %d승= %.0f\n", a, b, result);

	}

}

package myutil;

public class MyMath {

	// 수학적인 기능을 흉내 내보자 ~~

	// 기본생성자
	// 오버로드 용도로 외부에서 사용 못하게 하기 위함 .
	// 왜 static으로 사용할 건데 객체를 계속 생성하면 메모리 낭비가 심하기 때문
	private MyMath() {
		// TODO Auto-generated constructor stub
	}

	// 절대값 구하기
	public static int abs(int n) {

		return (n < 0) ? -n : n;
	}

	// 문제 승수 구하기
	public static double pow(double n, double m) {

		double res = 1.0;
		for (int i = 1; i <= m; i++) {

			res = res * n;

		}

		return res;
	}

	// 재귀호출을 이용한 합구하기
	public static int recurive_hap(int n) {
		if (n == 1)
			return 1;

		return n + recurive_hap(n - 1);
	}

	// 재귀호출하고 결관는 같다.
	public static int hap(int n) {

		int res = 0;
		for (int i = 1; i <= n; i++) {
			res += i;
		}

		return res;
	}
	
	
	//문제 
	//원래 이건데 
	public static double factorial(int n) {

		double result = 1.0;

		for (int i = n; i > 0; i--)
			result = result * i;

		return result;
	}

	// 4! = 4*3*2*1
	// 재귀호출을 이용한 factorial구하기
	public static double recursive_factorial(int n) {
		if (n==1)
			return 1.0;
		return  n * recursive_factorial(n - 1);
	}

}

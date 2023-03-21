package mymain;

public class Q2_연산자4_강사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//섭씨 => 화씨
		double c1 = 38.0;
		double f1;
		
		f1 = 9.0/5.0*c1 +32.0;
		//f1 = 9/5*c1 +32; 이렇게 하면 연산순위가 틀어진다.
		// 우선순위  /  *  +
		//그래서 1.8이 나와야 하는데 1이 나온다.
		
		System.out.printf("섭시 %.1f(C)를 화씨로 변환하면 %.1f(F)입니다.\n", c1,f1);
		
		
		//화씨 =>섭시
		
		double f2 = 150.0;
		double c2;
		
		c2 = 5.0/9.0*(f2 -32.0);

		System.out.printf("화씨 %.1f(F)를 화씨로 변환하면 %.14f(C)입니다.\n", f2,c2);
	}

}

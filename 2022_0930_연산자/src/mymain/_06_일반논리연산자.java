package mymain;

public class _06_일반논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 일반논리연산자 : && ||
		// 우선순위 : && > ||

		// A && B : A , B 모두 참일 때 참
		// A || B : A , B 또는 참일 때 참

		// 순서1
		// AND(&&)
		// 그냥 찍어보는거
		// false가 하나라도 있으면 false
		// 즉 같지않으면 다 false
		System.out.println("---[&&]---");
		System.out.printf("true  && true 	: %b\n", (true  && true));
		System.out.printf("true  && false 	: %b\n", (true  && false));
		System.out.printf("false && true 	: %b\n", (false && true));
		System.out.printf("false && false 	: %b\n", (false && false));

		
		//순서2
		//|| (OR)
		System.out.println("---[||]---");
		System.out.printf("true  || true 	: %b\n", (true  || true));
		System.out.printf("true  || false 	: %b\n", (true  || false));
		System.out.printf("false || true 	: %b\n", (false || true));
		System.out.printf("false || false 	: %b\n", (false || false));
	
	}

}

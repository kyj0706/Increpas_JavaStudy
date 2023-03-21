package mymain;

public class _03_논리형자료형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 논리형 자료형 : boolean
		// 상수 	: true(참) or false(거짓)
		// 출력서식 : %b(소문자) %B(대문)
		
		//순서1
		boolean bOk = 3 > 2; 
		
		System.out.printf("3 > 2 => %b\n", bOk);
		System.out.printf("3 > 2 => %b(%B)\n", bOk ,bOk);
		
		
		//등호연산자 설명 
		//서로의 정보가 달라서 flase 가 나오긴한다.
		//문자열을 이렇게 하면 안된다. equals이걸로 해야한다.
		//그냥 비교 해보는 상황이라 해본다 .
		//제어문 if for를 통해서 연산자로 비교를 하지만 지금은 배우지 않았으니깐 여기까지 이다.
		
		bOk = "파리" == "새";
		System.out.printf("파리가 새냐 => %b\n",bOk);

	}

}

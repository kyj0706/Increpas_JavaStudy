package mymain;

public class _01_자료형정수형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//출력방법
		//1. println(내용) 			: 내용출력 후 줄 바꾸기 (ln : line next =줄바꾸기)
		//2. print(내용) 			: 내용만 출력
			//->print fomat 대로 출력해라 라는 의미 
		
		//3. printf("출력서식", 값) : 출력서식대로 값을 넣어서 출력해라.
		
		
		//================
		//순서 2번
		System.out.print("==나이출력하는 프로그램==\n"); //\n : new line = 줄바꾸기
		//print는 줄바꾸기가 안된다는걸 설명 
		//그럼에도 하고 싶으면 \n을 하면 된다는것을 보여준다.
		
		//순서 1번
		int age = 20;
		System.out.printf("내 나이는 %d살\n", age);
		
		//================
		//순서3
		//정수형이란	: 소수점이 없는 수 = 고정소숫점
		
		//정수형자료형	: bate, short, int(기본형), long
		
		//상수표현		: 1 0 <- 기본형이 int 이기 때문에 4byte의 메모리는 할당한다.
		//				: 1L 0L <- long 형 8byte를 할당한다.
		
		/*
		 * System.out.println(1); // 4byte System.out.println(1+1);//출력은 되는데 이게 어디에 표현되냐
		 * -> 메모리에 표현이 된다.
		 * 
		 * System.out.println(1L);//8byte
		 */		
		
		//==================
		//순서4
		//출력서식		: %d <- decimal(10진수 출력서식)
		//				: %o <- octal(8진수 출력서식)
		//				: %x <- hexa(16진수 출력서식)
		
		
		
		
		//상수 = 변하지 않는 수
		//순서4-4
		final int WIDTH = 1000; //final이 있으면 상수를 설명 !!강조!!
		//WIDTH = 2000; // 값을 변경할 수 없음을 설명
		//Eclipse 는 친절하게도 에러를 1차로 걸러주고 실행해도 에러를 보여준다는 것을 보여준다.
		//에러문구 : The final local variable WIDTH cannot be assigned. 결과보여준다. 
		// final variable(상수를 ) cannot 대입할 수 없습니다 .=> 직독직해 해준다.
		
		//변수 = 변하는수
		int n = 100;
		System.out.printf("10진수	: %d\n", n);//10진수 출력 
		System.out.printf(" 8진수	: 0%o\n", n);//8진수 출력
		System.out.printf("16진수	: 0x%x\n", n);//16진수 출력
		
		
		//순서4-3
		n = 1000; //값을 변경합니다.
		
		
		//순서4-2
		//한번에 해봅시다.  1  2   3     1  2  3
		System.out.printf("%d %o %x\n" , n, n, n);
		
		//순서4-1
		//각 진수를 10진수로 출력
		System.out.printf("0144-> %d\n", 0144); //8진수
		System.out.printf("0x64-> %d\n", 0x64); //16진수
		
		//순서4-5
		//자릿수 지정 출력
		int m = 123;
		// %nd = n <-전체자릿수
		//[](브라켓) = 자릿수 사이를 쉽게 파악&확보하기 위해
		System.out.printf("[%10d]\n", m);//Right정렬
		System.out.printf("[%-10d]\n", m);//Left정렬
		
		System.out.printf("[%010d]\n", m);//빈자리는 0으로 채워라 Right 만 가능 
		
		//그냥해보는거 하지도 않지만..
		System.out.printf("[%2d]\n", m);// 출력자릿수 > 전체자릿수 = 전체자릿수 무시
		
		
	}

}

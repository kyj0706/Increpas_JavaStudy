package mymain;

import myutil.MyInteger;//여기에 있는 것을 불러줘 ~ 

public class _01_단항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//단항연산자 : ~ ! ++ -- (type):강제형변환  -(부호)
		
		
		// ~ (tilde)	:	이진 논리 Not연산자 (1보수)
		//10을 2진수로
		int n = 10;
		
		System.out.printf("[%32s]\n", Integer.toBinaryString(n) );
		System.out.printf("[%32s]\n\n", Integer.toBinaryString(~n) );
		
		System.out.println("0이 없어서 불편~~ 내가 만든다 근데 아직 신경쓰지마 ");
		//0이 없으니깐 불편~~~ 그럼 내가 만든다 ?
		System.out.printf("[%32s]\n", MyInteger.toBinaryString(n) );
		System.out.printf("[%32s]\n", MyInteger.toBinaryString(~n) );
		
		
		// ! (Not)	:	일반논리 Not 연산자 => 반대결과
		System.out.printf("!true : %b\n", !true);
		System.out.printf("!false : %b\n", !false);
		
		
		int a = 3;
		int b = 2;
		boolean bOk;
		
		bOk = a > b;
		
		System.out.printf("%d > %d :%b\n",a, b, bOk);
		
		bOk = !(b > a);
		System.out.printf("!(%d > %d) : %b\n", a, b ,bOk);

		
		
		//221004 (화)
		//증가감연산자 	: ++ --
		//형식 			: ++변수	전위형
		//				  변수++	후위형
		
		//순서1 예제
		
		int m = 10;
		
		
		//1. 전&후위형 연산자는 단독으로 사용시에는 동일한 결과이다.
		//2. 독립적으로 상용 될때는 (사실 의미가... 없다)
		++m; // m = m +1	: 자신의 값을 1 증가 시킨다.  => m+1 한거를 m으로 줘라.
			// 대입연산자의 우선순위는 맨 끝이다.
		m++; // m = m +1	:
		
		// 다른수식과 사용시에는
		// 전위형 : 다른연산자 보다 우선처리
		// 후위형 : 모든연산이 종료된후에 나중에 처리

		int x= 10, y=5 ,z;
		z = ++x + y++;  //1)++x 2)z=x+y 3)결과 4)y++ 순서
		// ++x(실행) -> x+y -> z -> 결과(16) -> y++  세부순서
		System.out.printf("x=%d y=%d z=%d\n", x,y ,z);

		--x; // x=x-1 : 자신의값을 1 감소
		
		
		//순서2
		//부호연산자 : -(부호연산자) [부호를 바꾸는 것이다.
		x= -10; // 절대값을 표현 ? 
		
		System.out.printf("|%d|=%d\n", x, -x);
		
		//Toggle이라한다. [반복으로 값을 바꾸는것을 말한다.
		//true <-> false  1 <-> -1  
		int sign = 1; 
		sign = -sign; //-sign <= (-1)*sing
		
		sign = -sign; //
		
		
		//형변환연산자 : (type) <-강제형변환
		
		/*
		  형변환(Type Conversion)
		  1. 자동형변환 (묵시적형변환)
		  	1)대입시 : 좌변항측에 맞춰진다. (좌변항 > 우변항)
		  		참고) 대입 vs 초기화
		  			1_1) 초기화 	: int a = 10; <- 변수 선언과 동시에 값을 대입
		  			1_2) 대입&치환 	: int b;
		  							  b = 10; <- 기존변수에 값을 넣는다.
		  	
		  	2)연산시 : 자료형이 큰쪽으로 변환
		  
		  //순서8
		  2. 강제형변환 (명시적형변환)
		  	형식 : |(type) 값
		  
		 */
		
		//순서9
		//증감연산자의 복습
		// 1보수이다 / 1 or 0 표현 
		// ~ ! ++ -- (cast) -(부호연산자)
		
		
		
		//순서3
		//[대입시] 자동형변환
		double d= 10; //10(int) -> 10.0[double] 로 자동형변환 됨 
		
		//순서7 정리
		//[연산시] 자동현반환 : 자료현이 큰쪽으로 변화
		/*
		 	byte  + byte	-> int
		 	short +	short	-> int
		 	byte  +	int		-> int
		 	byte  + long	-> long
		 	
		 	int   + float 	-> float
		 	long  + float	-> float
		 	int   + double 	-> double
		 */
		
		
		
		//순서5
		//그럼 이건 범위는 맞는데 왜 안되냐 ? 
		//에러문구 보여줌 
		byte b1 = 1, b2 =2, b3;
		//b3 = b1+ b2; //b3에 값을 넣는데  b1+b2 결과가 int값이다 보니  
		
		//해결 
		//b3 = (byte)b1 + b2; //기본이 byte라 의미가 없다
		b3 = (byte)(b1 + b2); //그래서 이렇게 한번더 묶어서 
		
		//순서6(해보기) short 도 같다.
		short s1 = 1, s2=2,s3;
		//에러 문구x 표시 눌러보자 이클립스의 기능
		//s3 = s1 + s2
		s3 = (short) (s1 + s2); 
		//참고(그냥 들어라)
		//레지스트리(임시저장소에 저장된 값을 가지고온다 int 형으로 
		//그래서 형태가 다르다 ? 
		
		
		
		
		//순서4
		//타입 설명 
		//강제형변환 미리설명 (대입시 형변환의 반대경우)
		//float f = 10.0; // float(4byte) = double(8byte) : float데이터가 작기 때문에 안된다 . 
		
		//강제형변환 (그래서 강제로라도 하겠다).
		float f = (float)10.0; // float(4byte) = double(8byte) : float데이터가 작기 때문에 안된다 . 
		
		
		
		
		
		
	}

}

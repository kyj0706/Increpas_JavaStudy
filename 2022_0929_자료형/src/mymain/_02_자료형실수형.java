package mymain;


public class _02_자료형실수형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 실수 : 소숫점이 있는수(부동소숫점)
		// 실수자료형	: float, double(기본형)
		// 실수 상수	: 1.0(double)
		//				: 1.0F(float)
		
		
		//결과는 같다. 다만 크기차이가 있음을 설명 
		//정수형의 반대이다 라고 ?? 
		/*
		 * System.out.println(0.0);//는 무슨형인지 질문, 몇 byte가 되는지 질문 (double, 8byte)
		 * System.out.println(0.0F);//float 4byte
		 */
		
		
		//출력서식	: %f 		<- 소숫점 6자리까지 출력(기본)
		//			: %e or %E	<- 소숫점 6자리까지 출력(대소문자 상관없다.)
		//			: %g 		<- 자릿수가 작은쪽을 선택해서 출력(어떻게 출력될지는 아~~무도 모른다)
		
		
		//순서3
		//실수상수
		final double PI =3.141592; //상수에 대입되는 값을 (literal)리터럴이라고 부르고 3.14가아니라 PI가 상수인거다.
		//PI = 3.141592; ->안된다.!!
		
		//순서1
		double d = 12.3456;
		System.out.printf("%f\n", d);
		System.out.printf("%e\n", d);
		System.out.printf("%E\n", d);
		System.out.printf("%g\n", d);
		
		//순서2
		//자릿수를 지정해서 출력
		//%m.nf	: m<-전체자릿수 확보 n<-소숫점이하 자릿수
		System.out.printf("[%10.2f]\n" ,d);//Right 정렬
		System.out.printf("[%010.2f]\n" ,d);//Right 정렬 + 빈공간을 0으로 채워라.
		System.out.printf("[%-10.2f]\n" ,d);//Left 정렬
		
		
		//해보기
		//전체 자리수 6이나 확보된 자릿수가 5개라면 남은 수는 반올림 된다 설명 
		System.out.printf("[%5.3f]\n", d);
		
		//즉 전체 자리수가 의미없는 경우 -> 전채자릿수는 생략한다.
		System.out.printf("[%.1f]\n" ,d);
		
		
		//220930
		//순서1 [실수]
		//정밀도 확인
		double	d1 = 1.2345689012345678901234567890;
		float	f1 = 1.2345689012345678901234567890F;
		
		System.out.printf("%.20f\n" , d1);
		System.out.printf("%.20f\n" , f1);
		
		
		//순서2
		//각 자료형 범위 산출
		System.out.println("===[각 자료형의 범위]===");
		System.out.printf("byte		: %d ~ %d\n", Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.printf("short	: %d ~ %d\n", Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf("int		: %d ~ %d\n", Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf("long 	: %d ~ %d\n", Long.MIN_VALUE, Long.MAX_VALUE);
		System.out.printf("float 	: %e ~ %e\n", Float.MIN_VALUE, Float.MAX_VALUE);
		System.out.printf("double 	: %e ~ %e\n", Double.MIN_VALUE, Double.MAX_VALUE);
		
		
		
	}

}

class  명명법
{

	class 내부클래스
	{
	}
	/*
	사용자 정의 명칭 명명법: 식별자(identitier)에 대한 이름을 부여하는 방법
										클래스명 / 메소드명 / 변수명 /상수명 등등등 .... 

	예약어 (Reserver Word) : 미리 만들어 놓은 명령
	*/
	
	//메소드
	public static void greeting(){
		System.out.println("안녕");
	}



	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		greeting(); //메소드 호출

		System.out.println("-----[명명법 부여시 주의사항]-----");
		System.out.println("[1. 숫자로 시작하면 안된다.]");
		//int kor = 90;  // 가능 
		//int 1kor = 90; //틀린  

		System.out.println("[2. 중간에 공백 띄우면 안된다.]");
		//int kor 1 = 90; // 틀린

		System.out.println("[3.특수문자는 사용 못한다.(단. _(user score) 랑 $는 허용 가능]");
		System.out.println("[특수문자 정의 : 키보드상에서 영문/숫자/한글을 제외한 모든 문자]");
		//int sale% = 30; // 틀린
		//int ___= 10;  <-  snake 표기법 사용시 -> int kor_1 = 10:  정상적 사용법
		//int $$$ = 10; <- 내부 클래스표현시 사용


		System.out.println("[4.예약어는 사용 못한다.]");
		//int public  = 100000;  //틀린 
		//public int pay = 10000; // 가능

		
		System.out.println("---[명명법 표기법]---");
		System.out.println("1. Pascal 표기법(클래스명 부여시) : 대문자로 시작 / 2개이상의 단어의 조합시 매단어 첫글자는 대문자");
		System.out.println("	class MyProfileInfo => My + Profile + Info "); 
		
		System.out.println("2. Camel(낙타) 표기법(변수/메소드명 사용시) : 첫글자는 소문자로 시작 두개이상 / 2개이상의 단어의 조합시 매단어 첫글자는 대문자");
		System.out.println("	int myYearPayment = 100000000; => my + Year + Payment");//낙타 등 모양 처럼 생겼다고 해서.
		
		System.out.println("3. Snake 표기법 : 2개이상의 단어의 조합시 _로 연결한다.");
		System.out.println("	int my_year_payment = 100000000; => my + year + payment");
		System.out.println("	int my_Year_Payment = 100000000; => my + year + payment");//이렇게 쓰기도 한다.
		
		System.out.println("4. 헝가리언 표기법(변수) : 자료형의 특징 변수에 표현한다.");
		System.out.println("	boolean bOk=true;		int nVal =10;		int pValue = &n;(C언어 포인터변수)");


		System.out.println("----[클래스명 명명법(권고사항)]----");
		System.out.println("1. 파스칼 표기법 사용한다.");
		System.out.println("2. 파스칼 표기법 + Snake표기법 사용할 수 있다. => class My_Profile_Info");


		System.out.println("----[변수/메소드명 명명법(권고사항)]----");
		System.out.println("1. Camel 표기법 사용한다.");
		System.out.println("2. Camel 표기법 + Snake 표기법 사용한다. => my_Profile_Info" );


		System.out.println("----[상수명 명명법(권고)]----");
		System.out.println("1. 모든 명친을 대문자로 기록");
		System.out.println("2. 2개이상의 단어가 사용되면 Snake 표기법으로 연결한다. ");

		System.out.println( Integer.MIN_VALUE);

		//변수 : 값을 변경 할 수 있는 수
		int n = 10;
		n = 100; 

		//상수 : 값을 변경 할 수 없다.
		final double PI = 3.14;
		//PI = 3.141592; // 틀림

		System.out.println(n);
		
		
		

	}
}

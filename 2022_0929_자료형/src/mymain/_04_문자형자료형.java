package mymain;

public class _04_문자형자료형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문자형 자료형 : char
		//상수 			: '한'	'A'		'韓'
		//출력서식		: %c	
		
		//알아야할것
		//ASCII( American Standard Code for Information Interchange)
		//키보드상에 있는 문자를 숫자로 표기해 둔 것 
		//문자를 제어하는 경우가 있을 수 있다 그래서 몇가지는 알고 있어야 한다.
		
		//==========================================
		//0~31		: 통신 및 제어 문자
		//31~126	: 일반문자
		//'A' = 65 	'a' = 97  차이 32 [대소문자 바꿀 때 + - 하면된다]
		//'0' = 48 	'1' = 49
		//'공백' = 32
		
		//순서1
		//여기다 값을 기록 할 수 있다
		//인간 표현은 A라 하지만 컴퓨터는 65로 인식한다.
		
		//char ch = 'A';
		char ch = 65;//65라고도 할수 있다.
		System.out.printf("ch=%c\n", ch);
		
		//순서2
		ch = 'a';
		System.out.printf("ch=%c\n", ch);
		
		//순서3
		//한글은 어떻게 ? 
		ch = '한';
		System.out.printf("ch=%c\n", ch);
		//ASCII 코드가 뭐야 ~ ?? 
		//이렇게 하면 에러난다 . 왜 ? 
		// %d는 정수 출력인데 왜  char에다? ....  포멧에러가 난다. d != java.lang.Character
		//System.out.printf("ch=%c(code:%d)\n", ch, ch);
		//그래서 (int)로 강제 형변환을 시킨다 .
		System.out.printf("ch=%c(code:%d)\n", ch, (int)ch);
		//코드를 안다면 이렇게 해도 된다는 말이다.
		System.out.printf("ch=%c\n", 54620);
		
		/* 해봐도 되고 안해도 되고 . 
		 * //그래서 내이름 char K = '김'; char Y = '영'; char J = '주';
		 * System.out.printf("김=code:%d\n",(int)K);
		 * System.out.printf("영=code:%d\n",(int)Y);
		 * System.out.printf("주=code:%d\n",(int)J);
		 */
		
		//제어문자(이런게 있다 ~~고 알고만 있으면된다.)
		//\n : new line(Enter) => 이것도 제어문자다 = 줄바꾸기 
		//\r : carrige return(Home) \r\n[같이쓴다] =>현재 라인에 마지막으로 가라
		//\t : tab
		//\b : left arrow [이클립스 불가 외부 터미널가능]
		//\f : line feed [테스트 불가]
		
		//순서4
		//문자열을 double quotation
		//문자 1개는 Single 퀘테이션
		System.out.println("A\nB\nC\n"); //\n
		System.out.println("A\tB\tC\t"); //\t
		System.out.println("ABC\b\bX\n"); //이클립스에서는 \b가 안된다. 터미널(외부)에서 실행된다. 결과= AXC
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

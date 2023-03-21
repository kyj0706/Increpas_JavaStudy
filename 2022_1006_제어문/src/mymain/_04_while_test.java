package mymain;

public class _04_while_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//순서4
		//for 문과  while 문을 구분지어 놓은이유
		//1. for 	: 반복횟수를 정확히 알때
		//2. while 	: 반복횟수를 모를때
		//    ex)키보드입력, 파일읽기
		
		
		
		//순서1
		//for문을 왜하느냐 반복 되는 형태를 다시 복습
		//for문의 형태는 익숙하니깐 어떤거냐 질문
		for(int i=0; i<3; i++) {
			System.out.print("안녕");
		}
		System.out.println();//줄바꾸기
		
		
		//순서2
		//for문을 이렇게 써도 된다.(for문 구조에서  초기; 조건; 증감으로도 가능하다 
		//증감식은 변수 a를 대체 가능하다. 
		//단 !! 증감식이 없기때문에 a<3을 비교할 것이 없어 무한루프 돈다
		//콘솔에서는 확인이 안된다 .너`~~무 빨리 돌아서(눈에 안보이는거)
		int a = 0;
		for (/*초기식생략*/ ; a<3; /*증감식 생력*/ ) {
			
			System.out.print("안녕");
			a++;
		}
		System.out.println();//줄바꾸기
		
		//순서3
		int n = 0;						//초기식
		while(n<3) { 					//조건식
			System.out.print("안녕");	//수행명령
			n++;						//증감식
		}
		

	}

}

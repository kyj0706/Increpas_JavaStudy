package mymain;

public class MyMain_static초기화 {
	
	//내가먼저 할꺼야 !! 이걸 
	//static 초기화
	//언제사용? : 데이터베이스, 게임(사운드,이미지) 
	static {//정적
		System.out.println("--0.아내 내가 먼저 실행되.!!");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//
		//질문1) 가장먼저 실행되는것이 무엇이냐 ?
		//답) JVM이 main을 가장 먼저 실행한다.
		
		System.out.println("--1.내가 제일 먼저 실행됩니다.");
	}

}

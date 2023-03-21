package mymain;

import java.io.FileReader;

public class _01_고전적방식예외처리 {
	
	public static void main(String[] args) {
		
		int a=10, b=0, res;
		
		//순1
		//이렇게 처리하면 문제가 될거다 라고 알려줘야함 
		//최종의 끝은 main method다 
		//고전적방식은 -> 되는 것만 하자 
		if(b!=0) {
			
			res = a/0;
		}
		
		//순2
		//참조변수 str : null의미 = 아무 객체도 참조하지 않는다.  객체는 만들어 졌는데 heap에 아무것도 없다 .! 
		String str = null;
		//length는 문자열에 대한 길이를 구하는거다 
		//근데 null은 heap에 아무것도 없는데 뭘하라는 거야 ? 라고 java가 알려준다
		if(str!=null) {//에러만 피한거 ?
			int len = str.length();
		}
		
		//순3
		//배열
		int [] mr = { 1,2,3};
		int index = 5;
		
		if(index>0 &&index < mr.length) {
			
			mr [index] = 10;
		}
		
		
		
		
		
		System.out.println("정상종료");
	}

}

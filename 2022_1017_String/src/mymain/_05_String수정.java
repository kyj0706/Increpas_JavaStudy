package mymain;

public class _05_String수정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= " aaa ";
		
		//null 아무값도 가지고 있지 않다.
		String msg = null;
		msg = s1.replaceAll("aa", "b");		
		System.out.printf("msg : %s\n" ,msg);
		
		
		//대문자로 변경
		msg = s1.toUpperCase();
		System.out.printf("msg : %s\n" ,msg);
		
		//공백제거
		msg = s1.trim();
		System.out.printf("[%s]->공백제거한 값은:[%s]\n",s1,msg);
		
		
		//String.valueOf(값) : 값 -> String으로 생성
		msg =String.valueOf(s1.length()); // 5-> 문자열 "5" 로 만든다
		msg = String.format("%d", s1.length()); //같다.
		
		
		System.out.printf("msg : [%s]\n",msg);
		

	}

}

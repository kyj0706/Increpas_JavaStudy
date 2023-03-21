package mymain;

public class _02_String불변적특징 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//초기의 값을 변하지 않는다.
		//새로운것이 생성되면 초기것은 사라진다.
		
		
		//암시적
		//String s1 = "I Love You";
		//명시적 (결과는 같다)
		String s1 = new String ("I Love You");
		
		//연산과정에서 새로운 String객체가 생성
		s1 = s1 + " Yun-A";

		System.out.println(s1);
		
		String s2 = "abcd";
		
		String s3 =s2.toUpperCase();//대문자로 변환 
		
		//대문자로 변하지 않는다.
		//왜 ?  s2를 가지고 새로운 객체를 만들기 때문이다.
		System.out.println(s2);
		//그래서  s3에 새로운 객체를 받고 s2 는 삭제.
		System.out.println(s3);
	}

}

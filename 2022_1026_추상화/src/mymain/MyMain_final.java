package mymain;

//final은 3가지가 있다.
//1.변수 : 상수
//2.메소드 : 더이상 Override 하지마
//3.클래스 : 더이상 상속 하지마

//========================================================

//1. final 변수 : 상수선언
//	 => 변수앞에 쓰면 상수를 선언하는거다.
//      =>상수:
//형식 : final double PI = 3.14 

class MyClass{
	//상수선언
	public static final double PI = 3.14;
}

//========================================================

//2. final 메소드 : 더이상 재정의(Override)하지 말아라
//형식 : final void 메소드(){}

class A{
	void sub() {}
}
class B extends A{
	@Override
	final void sub() {}
}
final class C extends B{
	//@Override
	//void sub() {}
}

//========================================================

//3. final 클래스 : 더이상 상속하지 말아라
//형식 : final Class A

//class D extends C{}


//========================================================

//3_2. String은 final class 이기때문에 에러가 난다.
//class MyString extends String() {}




public class MyMain_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MyClass.PI = 3.141592;

	}

}

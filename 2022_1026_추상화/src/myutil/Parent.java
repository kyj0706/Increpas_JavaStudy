package myutil;

public class Parent {
	
	//
	//순1 : method생성
	//순2 : sub() 와  sub(int)는 Overload(중복메소드)
	//순3 : 중복메소드는 단일클래스내에서만 존재
	public void sub() {
		
		System.out.println("--Parent.sub()--");
	}
	
	public void sub(int a ) {
		 
	}

}

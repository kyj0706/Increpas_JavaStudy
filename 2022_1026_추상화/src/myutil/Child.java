package myutil;

//순서4 : extends Parent 상속 연결
public class Child extends Parent {

	//순5	: Override(재정의)
	//			=> 부모가 갖는 메소드를 다시정의
	//			조건1) 메소드명 + 인자정보 모두 동리해야함
	//			조건2) 접근제한자는 크거나 같아야 한다.
	//			크기순) private < default < protected < public
	
	//순6_2 : 주석 //  /* */
	//목적  => 개발자를 위한 주석
	
	//순6_1 : @를 뭐라고 하느냐 ?
	//			=>Annotation
	//목적	=> 프로그램을 위한 주석 
	//		=> java의 JVM를 위한 주석
	
	
	@Override
	public void sub() {
		// TODO Auto-generated method stub
		//super.sub();
		System.out.println("--Child.sub()--");
	}
	
	
}

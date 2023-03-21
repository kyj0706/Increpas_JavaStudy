package myutil;

public interface BaseCalc {
	
	//interface내부 : 상수 / 추상메소드 / default 메소드(JDK1.8 later)
	
	
	//상수메소드
	//순1) 그냥해보는거
	double PI = 3.14; //왜 ? 뭐가 있길래 안되는지 보자
	//이유 : 이렇게 쓰더라도 아래처럼 인식을 한다는 말(상수처리된다.)
	public static final double PI2 =3.141592;
	
	
	//추상메소드
	int plus(int a, int b); //사용은 가능하다 
	//이유 : 이렇게 쓰더라도 아래처럼 인식을 한다는 말(추상화처리)
	public abstract int minus(int a, int b);
	
	
	//default 메소드
	//(JDK1.8 later)
	default int multiply(int a, int b) {return a*b;};
}

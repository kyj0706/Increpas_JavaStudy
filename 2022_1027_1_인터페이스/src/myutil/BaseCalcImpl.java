package myutil;

public class BaseCalcImpl implements BaseCalc{

	//인터페이스의 default 메소드는 선택사항이다.
	//왜 ? 인터페이스에서 구현이 되어있기 때문에.
	
	
	@Override
	public int plus(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int minus(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	

}

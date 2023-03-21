package myutil;

public class BaseCalc {

	public int plus(int a, int b) {

		return a + b;
	}

	public int minus(int a, int b) {

		return a - b;
	}

	public int multiplay(int a, int b) {

		return a * b;
	}
	
	public int divide(int a, int b) {
		
		return (b==0) ? 0: a/b;
	}

}

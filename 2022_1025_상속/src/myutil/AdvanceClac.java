package myutil;

public class AdvanceClac extends BaseCalc {

	
	//BaseCalc의 기능을 이용할 수 있다. (상속받았으니깐)
	
	//n까지의 합
	public int hap(int n) {
		
		int sum =0;
		for(int i=0; i<=n; i++) {
			//sum +=i;
			//이렇게 부모에게 받아서 사용가능하다.
			sum = super.plus(sum, i);
		}
		
		
		return sum;
	}
	
	
	//n's m승
	public double pow(int n, int m) {
		
		double result =1.0;
		
		for(int i=0; i<m; i++) {
			//result *= n;
			result = this.multiplay((int)result, n);
			
		}
		
		return result;
	}
	
}

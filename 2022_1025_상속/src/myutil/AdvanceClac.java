package myutil;

public class AdvanceClac extends BaseCalc {

	
	//BaseCalc�� ����� �̿��� �� �ִ�. (��ӹ޾����ϱ�)
	
	//n������ ��
	public int hap(int n) {
		
		int sum =0;
		for(int i=0; i<=n; i++) {
			//sum +=i;
			//�̷��� �θ𿡰� �޾Ƽ� ��밡���ϴ�.
			sum = super.plus(sum, i);
		}
		
		
		return sum;
	}
	
	
	//n's m��
	public double pow(int n, int m) {
		
		double result =1.0;
		
		for(int i=0; i<m; i++) {
			//result *= n;
			result = this.multiplay((int)result, n);
			
		}
		
		return result;
	}
	
}

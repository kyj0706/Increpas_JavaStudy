package mymain;

public class Q2_�����������_9_�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���丮�� => ����Ǽ�
		//�ձ��ϴ� �Ŷ� �����Ŵ�
		
		int n= 45;
		
		double result=1.0;
		
		
		//factorial :
		// 5! = 5*4*3*2*1
		
		for(int i=n; i>=1; i--) { //i = 5 4 3 2 1
			
			result = result * i;
			
		}
		System.out.printf("%d!=%.0f\n",n ,result);
		
	}

}

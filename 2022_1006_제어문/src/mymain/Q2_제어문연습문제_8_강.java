package mymain;

public class Q2_�����������_8_�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�־��� ���� �ٸ��� �ȴٸ� 
		//������ ����� �հ谡 ���� �ʴ´� .
		//�׷��� �̷������� �ϴ°� �����̴� .
		
		System.out.println("n           1���� n������ ��");
		System.out.println("============================");
		for(int n=1; n<=10; n++) {
			
			//n������ ���� ���ϴ� �� 

			int sum =0;//n�������� ������ ���� �ӽú���
			for(int i=1; i<=n; i++) {
				sum += i;
			}
			
			System.out.printf("%2d%20d\n",n,sum); 
			
			
		}
	}

}

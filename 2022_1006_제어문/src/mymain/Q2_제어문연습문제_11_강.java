package mymain;

public class Q2_�����������_11_�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ݺ���Ģ�� ã�ƶ�
		//��ȣ�� ���� : + - + -
		//�и� Ȧ���� ������
		//���ڴ� ���� 
		
		int n= 1000000000;
		double pi =0.0;
		int sign =1; // ��ȣ�����Ұ�
		
		
		
		for(int i=0; i<n; i++) {
			pi = pi+ sign*(4.0/(i*2L+1)); 
			
			//���������
			sign = -sign;
			
		}
		System.out.println(pi);

	}

}

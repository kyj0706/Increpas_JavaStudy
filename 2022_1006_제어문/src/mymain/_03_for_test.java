package mymain;

public class _03_for_test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//����1
		//���� : ������ ������� �ϴ°�
		//i�� 0~10���� �׷��� 11������ ���µ� 
		// 11<10�� false�ϱ�  ����� 10���� �ȴ�.
		
		//����4
		int sum =0; //i���� ������ ����
		
		
		for(int i=1; i<=10; i++) {
			
			//������
			//sum = sum +i;
			//�ٿ���
			sum += i;
			
			//============= i ��ȭ ���� ���� ����===========
			//System.out.print(i);
			
			
			//����3
			//if(i<10)
			//1���� 10���� ���غ��ô�.
			//����1
			//System.out.print('+');
			//else
			//����2
			//System.out.print('=');
			
			//����ó�� ������ ����
			//try catch �� �ؾ��Ѵ�.
			//�����̰� �Ǽ� ����� �Ǵ°��� �����ֱ� ����
			//Thread.sleep(1000); // 1/1000(��) ���
			//===============================================
		
		}
		//System.out.println(55); // �����ֱ�����
		System.out.println("sum�� ��� : "+sum);
	}

}

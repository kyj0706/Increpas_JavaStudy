package mymain;

public class MyMain_Method1 {
	
	//����1
	//�޼ҵ� (���� ȣ���Ѱ�)
	//�޼ҵ��� ������ 3���� �ȴ�.
	//�޼ҵ�� ���������̴�. 
	//return�� �Ǹ� �Ҹ��� �Ǳ� �����̴�. 
	//�׷� ���� ? int ��ȯ���� �����Ѵ�.  ��  a b c �� �������. �ٸ� int plus�� ���� �����Ѵ�.
	public static int plus(int a,int b) {
							// �޼ҵ��� �����ڴ� ȣ��� ����
							// int a =x 
							// int b =y
		//��������
		//����5
		int c= a+b;
		//����2
		return c;
		/*
		 	return 		: �ڽ��� ȣ���� ������ ���ư���(�����ض�)
		 	return ��	: �ڽ��� ȣ���� ������ ���� ���� ���ư���
		 */
	}
	
	
	//���θ޼ҵ� (JVM�� ���� �ڵ� ȣ��)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� ���������� ����ϱ� �����̴�.
		
		//����7
		// ���� main �޼ҵ� ���� �ֱ⶧����
		//��������
		int global_a =10;
		
		
		//����6
		{   
			//block������ ����� ������ ���� ����� �Ҹ�ȴ�.
			//��������(local variable)
			int local_a=10;
			global_a =100; //�̷��� �����ϴٴ� �ǹ�
		}
	
		//local_a =19; //���� ������������ �������� ������ ���� �����ε� �� �϶�� ? �ǹ�
		
		
		//����3
		int x=10, y=5, res;
		
		//����4
		// �̹� ����� ���� plus�� ȣ���ؼ� ����.
		//res = plus(x, y);
		
		res = MyMain_Method1.plus(x, y);//��Ȯ�� ǥ��
		
		
		System.out.printf("%d+%d=%d",x,y,res);
	}

}

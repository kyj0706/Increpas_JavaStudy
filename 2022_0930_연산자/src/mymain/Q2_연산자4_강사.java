package mymain;

public class Q2_������4_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� => ȭ��
		double c1 = 38.0;
		double f1;
		
		f1 = 9.0/5.0*c1 +32.0;
		//f1 = 9/5*c1 +32; �̷��� �ϸ� ��������� Ʋ������.
		// �켱����  /  *  +
		//�׷��� 1.8�� ���;� �ϴµ� 1�� ���´�.
		
		System.out.printf("���� %.1f(C)�� ȭ���� ��ȯ�ϸ� %.1f(F)�Դϴ�.\n", c1,f1);
		
		
		//ȭ�� =>����
		
		double f2 = 150.0;
		double c2;
		
		c2 = 5.0/9.0*(f2 -32.0);

		System.out.printf("ȭ�� %.1f(F)�� ȭ���� ��ȯ�ϸ� %.14f(C)�Դϴ�.\n", f2,c2);
	}

}

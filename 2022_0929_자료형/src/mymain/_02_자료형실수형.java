package mymain;


public class _02_�ڷ����Ǽ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �Ǽ� : �Ҽ����� �ִ¼�(�ε��Ҽ���)
		// �Ǽ��ڷ���	: float, double(�⺻��)
		// �Ǽ� ���	: 1.0(double)
		//				: 1.0F(float)
		
		
		//����� ����. �ٸ� ũ�����̰� ������ ���� 
		//�������� �ݴ��̴� ��� ?? 
		/*
		 * System.out.println(0.0);//�� ���������� ����, �� byte�� �Ǵ��� ���� (double, 8byte)
		 * System.out.println(0.0F);//float 4byte
		 */
		
		
		//��¼���	: %f 		<- �Ҽ��� 6�ڸ����� ���(�⺻)
		//			: %e or %E	<- �Ҽ��� 6�ڸ����� ���(��ҹ��� �������.)
		//			: %g 		<- �ڸ����� �������� �����ؼ� ���(��� ��µ����� ��~~���� �𸥴�)
		
		
		//����3
		//�Ǽ����
		final double PI =3.141592; //����� ���ԵǴ� ���� (literal)���ͷ��̶�� �θ��� 3.14���ƴ϶� PI�� ����ΰŴ�.
		//PI = 3.141592; ->�ȵȴ�.!!
		
		//����1
		double d = 12.3456;
		System.out.printf("%f\n", d);
		System.out.printf("%e\n", d);
		System.out.printf("%E\n", d);
		System.out.printf("%g\n", d);
		
		//����2
		//�ڸ����� �����ؼ� ���
		//%m.nf	: m<-��ü�ڸ��� Ȯ�� n<-�Ҽ������� �ڸ���
		System.out.printf("[%10.2f]\n" ,d);//Right ����
		System.out.printf("[%010.2f]\n" ,d);//Right ���� + ������� 0���� ä����.
		System.out.printf("[%-10.2f]\n" ,d);//Left ����
		
		
		//�غ���
		//��ü �ڸ��� 6�̳� Ȯ���� �ڸ����� 5����� ���� ���� �ݿø� �ȴ� ���� 
		System.out.printf("[%5.3f]\n", d);
		
		//�� ��ü �ڸ����� �ǹ̾��� ��� -> ��ä�ڸ����� �����Ѵ�.
		System.out.printf("[%.1f]\n" ,d);
		
		
		//220930
		//����1 [�Ǽ�]
		//���е� Ȯ��
		double	d1 = 1.2345689012345678901234567890;
		float	f1 = 1.2345689012345678901234567890F;
		
		System.out.printf("%.20f\n" , d1);
		System.out.printf("%.20f\n" , f1);
		
		
		//����2
		//�� �ڷ��� ���� ����
		System.out.println("===[�� �ڷ����� ����]===");
		System.out.printf("byte		: %d ~ %d\n", Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.printf("short	: %d ~ %d\n", Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf("int		: %d ~ %d\n", Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf("long 	: %d ~ %d\n", Long.MIN_VALUE, Long.MAX_VALUE);
		System.out.printf("float 	: %e ~ %e\n", Float.MIN_VALUE, Float.MAX_VALUE);
		System.out.printf("double 	: %e ~ %e\n", Double.MIN_VALUE, Double.MAX_VALUE);
		
		
		
	}

}

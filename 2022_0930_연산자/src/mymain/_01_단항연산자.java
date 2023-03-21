package mymain;

import myutil.MyInteger;//���⿡ �ִ� ���� �ҷ��� ~ 

public class _01_���׿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���׿����� : ~ ! ++ -- (type):��������ȯ  -(��ȣ)
		
		
		// ~ (tilde)	:	���� �� Not������ (1����)
		//10�� 2������
		int n = 10;
		
		System.out.printf("[%32s]\n", Integer.toBinaryString(n) );
		System.out.printf("[%32s]\n\n", Integer.toBinaryString(~n) );
		
		System.out.println("0�� ��� ����~~ ���� ����� �ٵ� ���� �Ű澲���� ");
		//0�� �����ϱ� ����~~~ �׷� ���� ����� ?
		System.out.printf("[%32s]\n", MyInteger.toBinaryString(n) );
		System.out.printf("[%32s]\n", MyInteger.toBinaryString(~n) );
		
		
		// ! (Not)	:	�Ϲݳ� Not ������ => �ݴ���
		System.out.printf("!true : %b\n", !true);
		System.out.printf("!false : %b\n", !false);
		
		
		int a = 3;
		int b = 2;
		boolean bOk;
		
		bOk = a > b;
		
		System.out.printf("%d > %d :%b\n",a, b, bOk);
		
		bOk = !(b > a);
		System.out.printf("!(%d > %d) : %b\n", a, b ,bOk);

		
		
		//221004 (ȭ)
		//������������ 	: ++ --
		//���� 			: ++����	������
		//				  ����++	������
		
		//����1 ����
		
		int m = 10;
		
		
		//1. ��&������ �����ڴ� �ܵ����� ���ÿ��� ������ ����̴�.
		//2. ���������� ��� �ɶ��� (��� �ǹ̰�... ����)
		++m; // m = m +1	: �ڽ��� ���� 1 ���� ��Ų��.  => m+1 �ѰŸ� m���� ���.
			// ���Կ������� �켱������ �� ���̴�.
		m++; // m = m +1	:
		
		// �ٸ����İ� ���ÿ���
		// ������ : �ٸ������� ���� �켱ó��
		// ������ : ��翬���� ������Ŀ� ���߿� ó��

		int x= 10, y=5 ,z;
		z = ++x + y++;  //1)++x 2)z=x+y 3)��� 4)y++ ����
		// ++x(����) -> x+y -> z -> ���(16) -> y++  ���μ���
		System.out.printf("x=%d y=%d z=%d\n", x,y ,z);

		--x; // x=x-1 : �ڽ��ǰ��� 1 ����
		
		
		//����2
		//��ȣ������ : -(��ȣ������) [��ȣ�� �ٲٴ� ���̴�.
		x= -10; // ���밪�� ǥ�� ? 
		
		System.out.printf("|%d|=%d\n", x, -x);
		
		//Toggle�̶��Ѵ�. [�ݺ����� ���� �ٲٴ°��� ���Ѵ�.
		//true <-> false  1 <-> -1  
		int sign = 1; 
		sign = -sign; //-sign <= (-1)*sing
		
		sign = -sign; //
		
		
		//����ȯ������ : (type) <-��������ȯ
		
		/*
		  ����ȯ(Type Conversion)
		  1. �ڵ�����ȯ (����������ȯ)
		  	1)���Խ� : �º������� ��������. (�º��� > �캯��)
		  		����) ���� vs �ʱ�ȭ
		  			1_1) �ʱ�ȭ 	: int a = 10; <- ���� ����� ���ÿ� ���� ����
		  			1_2) ����&ġȯ 	: int b;
		  							  b = 10; <- ���������� ���� �ִ´�.
		  	
		  	2)����� : �ڷ����� ū������ ��ȯ
		  
		  //����8
		  2. ��������ȯ (���������ȯ)
		  	���� : |(type) ��
		  
		 */
		
		//����9
		//������������ ����
		// 1�����̴� / 1 or 0 ǥ�� 
		// ~ ! ++ -- (cast) -(��ȣ������)
		
		
		
		//����3
		//[���Խ�] �ڵ�����ȯ
		double d= 10; //10(int) -> 10.0[double] �� �ڵ�����ȯ �� 
		
		//����7 ����
		//[�����] �ڵ�����ȯ : �ڷ����� ū������ ��ȭ
		/*
		 	byte  + byte	-> int
		 	short +	short	-> int
		 	byte  +	int		-> int
		 	byte  + long	-> long
		 	
		 	int   + float 	-> float
		 	long  + float	-> float
		 	int   + double 	-> double
		 */
		
		
		
		//����5
		//�׷� �̰� ������ �´µ� �� �ȵǳ� ? 
		//�������� ������ 
		byte b1 = 1, b2 =2, b3;
		//b3 = b1+ b2; //b3�� ���� �ִµ�  b1+b2 ����� int���̴� ����  
		
		//�ذ� 
		//b3 = (byte)b1 + b2; //�⺻�� byte�� �ǹ̰� ����
		b3 = (byte)(b1 + b2); //�׷��� �̷��� �ѹ��� ��� 
		
		//����6(�غ���) short �� ����.
		short s1 = 1, s2=2,s3;
		//���� ����x ǥ�� �������� ��Ŭ������ ���
		//s3 = s1 + s2
		s3 = (short) (s1 + s2); 
		//����(�׳� ����)
		//������Ʈ��(�ӽ�����ҿ� ����� ���� ������´� int ������ 
		//�׷��� ���°� �ٸ��� ? 
		
		
		
		
		//����4
		//Ÿ�� ���� 
		//��������ȯ �̸����� (���Խ� ����ȯ�� �ݴ���)
		//float f = 10.0; // float(4byte) = double(8byte) : float�����Ͱ� �۱� ������ �ȵȴ� . 
		
		//��������ȯ (�׷��� �����ζ� �ϰڴ�).
		float f = (float)10.0; // float(4byte) = double(8byte) : float�����Ͱ� �۱� ������ �ȵȴ� . 
		
		
		
		
		
		
	}

}

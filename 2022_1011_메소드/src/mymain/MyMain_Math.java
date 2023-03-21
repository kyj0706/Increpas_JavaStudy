package mymain;

import myutil.MyMath;

public class MyMain_Math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10 ,y=20, z=100 ,res;
		int m=3;
		
		
		
		//Java API	: Math class <= ��������� ����� ���� Ŭ����
		// 			: max.overload�Ǿ��ִ�.(���������� Ʋ���޼ҵ�)

		//2���� ū��
		res = Math.max(x, y);
		System.out.printf("%d,%d�� ū���� %d\n",x,y,res);
		
		//3���� ū��
		res=MyMath.max(x, y, z);
		System.out.printf("%d,%d %d�� ū���� %d\n",x,y,z,res);
		
		//n���� ��
		res =MyMath.hap(x);
		System.out.printf("1~%d������ ���� = %d �Դϴ�.\n",x,res);
		
		//¦���� ��
		res =MyMath.hap_even(x);
		System.out.printf("%d���� ¦���� ���� =%d\n",x,res);
		
		//Ȧ���� ��
		res =MyMath.hap_odd(x);
		System.out.printf("%d���� Ȧ���� ���� =%d\n",x ,res);
		
		//n������ ���� m�� ����� ��
		x=100;
		res =MyMath.hap(x, m);
		System.out.printf("%d������ ���� %d�� ����� ���� =%d\n",x,m,res);
		
		//�Ҽ� ���
		System.out.printf("%d�� �Ҽ��� : ",x);
		MyMath.display_prime(x);
		
		//�Ҽ� ���_t
		System.out.println();
		MyMath.display_prime_t(x);
		
		
		

		
	}

}

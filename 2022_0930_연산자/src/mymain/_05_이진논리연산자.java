package mymain;

import myutil.MyInteger;

public class _05_������������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������������ : &(And)			: 2�� ��� ���̸�
		//					^(Exclusive Or) : ���� ���� Ʋ����
		//					|(OR)			: 2���� 1���� ���̸� 
		
		//��������
		int a =7 , b =5;
		
		//����1 (2���� Ȯ��)
		System.out.printf("[%32s] : %d\n", MyInteger.toBinaryString(a),a);
		System.out.printf("[%32s] : %d\n", MyInteger.toBinaryString(b),b);

		//����2 
		//&(And)
		System.out.printf("[%32s] : %d & %d\n", MyInteger.toBinaryString(a&b),a,b);
		
		//����3
		//|(Exclusive Or)
		System.out.printf("[%32s] : %d | %d\n", MyInteger.toBinaryString(a|b),a,b);
		
		//����4
		//^(OR)
		System.out.printf("[%32s] : %d ^ %d\n", MyInteger.toBinaryString(a^b),a,b);
		
	}

}

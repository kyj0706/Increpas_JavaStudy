package mymain;

public class _06_�Ϲݳ������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �Ϲݳ������� : && ||
		// �켱���� : && > ||

		// A && B : A , B ��� ���� �� ��
		// A || B : A , B �Ǵ� ���� �� ��

		// ����1
		// AND(&&)
		// �׳� ���°�
		// false�� �ϳ��� ������ false
		// �� ���������� �� false
		System.out.println("---[&&]---");
		System.out.printf("true  && true 	: %b\n", (true  && true));
		System.out.printf("true  && false 	: %b\n", (true  && false));
		System.out.printf("false && true 	: %b\n", (false && true));
		System.out.printf("false && false 	: %b\n", (false && false));

		
		//����2
		//|| (OR)
		System.out.println("---[||]---");
		System.out.printf("true  || true 	: %b\n", (true  || true));
		System.out.printf("true  || false 	: %b\n", (true  || false));
		System.out.printf("false || true 	: %b\n", (false || true));
		System.out.printf("false || false 	: %b\n", (false || false));
	
	}

}

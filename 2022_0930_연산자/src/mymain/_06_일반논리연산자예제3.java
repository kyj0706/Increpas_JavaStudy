package mymain;

import java.util.Random;

public class _06_�Ϲݳ������ڿ���3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//|| (OR)
		//	���� : �����
		// ����1)10���̸� : ���(����)
		// ����2)65���̻� : ����(����)
		
		int age = 66; // ����

		
		//����2
		//�����߻���ü
		Random random = new Random();
		
		age = random.nextInt(100)+1;
			
		//����1
		if(age<10 || age>=65)
			System.out.printf("[%d]���� ����� �Դϴ�.\n", age);
		else
			System.out.printf("[%d]���� ����ڰ� �ƴմϴ�.\n", age);

	}

}

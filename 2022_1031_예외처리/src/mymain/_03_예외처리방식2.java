package mymain;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class _03_����ó�����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10, b = 1, res;

		String str = "abc";

		int[] mr = { 1, 2, 3 };

		try {
			// ���ڵ��ۼ�

			// ���������� JAM �����ش�
			// ������������� JVM�� �����ش�.
			// java���� �̷��� ���������� ���� �ʴ´�.. ��� ������ ����� Ȯ���ϱ� ���ѿ뵵
			if (b == 0)
				throw new ArithmeticException("0���� ������ �����ϴ�."); // ������ ~
			res = a / b;

			// ���������� JAM �����ش�
			if (str == null)
				throw new NullPointerException("str �� null �Դϴ�.");
			int len = str.length();

			
			int index = 2;
			// ���������� JAM �����ش�
			if (index >= mr.length)
				throw new ArrayIndexOutOfBoundsException("÷�ڹ����� ���� �����ϴ�.");
			mr[index] = 10;
			
			// ���������� JAM �����ش�
			//�Ϲ��� ���� 
			//throw new  InterruptedException() => main�� ó�� 
			//������ �߻��ϸ� ����
			Thread.sleep(1000);
			
			// ���������� JAM �����ش�
			//throw new FileNotFoundException() => main�� ó��
			FileReader fr = new FileReader("C:\\Work\\javaStudy\\txt\\b.txt");
			
			

		

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("---��������---");
	}

}

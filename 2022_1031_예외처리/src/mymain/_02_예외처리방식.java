package mymain;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class _02_����ó����� {

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
			
			//�Ϲ��� ���� 
			//throw new  InterruptedException()
			//������ �߻��ϸ� ����
			Thread.sleep(1000);
			
			FileReader fr = new FileReader("a.txt");
			
			

		} catch (ArithmeticException e) { // �޾Ҵ� ~
			// TODO: handle exception
			// Ư���� ��츦 �����ϰ�� ����͸� �뵵

			// ���ܱ����ۼ�
			e.printStackTrace(); // ��������

		} catch (NullPointerException e) {

			e.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e) {

			e.printStackTrace();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("---��������---");
	}

}

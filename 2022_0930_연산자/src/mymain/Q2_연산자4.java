package mymain;

import java.util.Scanner;

public class Q2_������4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double c;//����
		double f;//ȭ��
		
		Scanner scanner = new Scanner(System.in);
		
		 System.out.print("�����µ��� �Է��ϼ��� : ");
	        c = scanner.nextDouble();
	        f =  (c *1.8)+32;
	        
	        System.out.printf("���� :%.1f(C)�� ȭ���� ��ȯ�ϸ� %.1f(F)�� �ȴ�. \n" ,c ,f );
	        
	        //System.out.printf("ȭ�� :%.1f(F)�� ȭ���� ��ȯ�ϸ� %f(C)�� �ȴ�. " ,f );
		System.out.print("ȭ���µ��� �Է��ϼ��� : ");
			f = scanner.nextDouble();
			c = (f - 32) / 1.8;
			
			System.out.printf("ȭ��: %.1f(F)�� ������ ��ȯ�ϸ� �� %.14f(C)�� �ȴ�.",f,c);
		
		
		scanner.close();
	}

}

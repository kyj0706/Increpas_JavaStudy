package mymain;

import java.util.Scanner;

public class Q2_�����������_12_�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		double r;
		int n;
		double result =1.0;
		

		System.out.printf("�Ǽ��� �Է��ϼ���>>");
		r = scanner.nextDouble();
		
		System.out.printf("������ �Է��ϼ���>>");
		n = scanner.nextInt();
		
		// r' s n���� ���ض�
		
		for(int i=0; i<n; i++) {//�ݺ�Ƚ��
			
			
			result =result* r;
		}
		
		
		//����1 ���� ����� ��
		System.out.println("���� ����Ѱ� :"+result);
		
		//Java API�� ���ؼ� ���Ȱ�
		System.out.println("API�� ���� �� :" +Math.pow(r, n));
		
		scanner.close();

	}

}

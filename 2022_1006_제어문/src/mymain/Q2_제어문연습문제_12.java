package mymain;

import java.util.Scanner;

public class Q2_�����������_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double r =0.0;//�Ǽ�
		int n =0;//����
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�Ǽ��� �Է��ϼ���.>>");
		r =scanner.nextDouble();
		
		System.out.print("������ �Է��ϼ���.>>");
		n = scanner.nextInt();
		
	
		r= Math.pow(r, n);
		
		
		System.out.printf("%.1f",r);
		
		
		
		scanner.close();

	}

}

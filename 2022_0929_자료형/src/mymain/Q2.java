package mymain;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 1.Ű����� ���� �������� �Է¹޴´�.
		 	double radius:
		 
		 2.�����ؾߵ� ����
		 	���ѷ� = 2 * Math.PI * radius; 
		 	������ = ������*������*Math.PI;
		 	������ = 4/3*Math.PI* ������*������*������
		 */
		
		System.out.println("���� ǥ���� ���� ���ϱ�");
		
		Scanner scanner = new Scanner(System.in);
		
		
		//������(�Է�)
		System.out.print("������ :");
		double radius = scanner.nextDouble();
		//--------------------------------------
		
		//���ѷ�
		double circumference = 2 *Math.PI*radius; 
		
		//������
		double area =radius*radius*Math.PI;
		
		//������
		double volume =4.0/3*Math.PI*radius*radius*radius;
		
		//��¹��1
		System.out.println("===��¹��1===");
		System.out.println("������ : "+radius);
		System.out.printf("���ѷ� : %.1f%n",circumference);
        System.out.printf("ǥ���� : %.1f%n", area);
        System.out.printf("���� : %.1f%n", volume);
        
        //��¹�� 2
        System.out.println("===��¹��2====");
        System.out.printf("������: %.1f\n ���ѷ�: %.1f\n ǥ����: %.1f\n ����: %.1f\n", radius,circumference,area,volume);
		
        scanner.close();
		
		System.out.println(Math.PI);

	}

}

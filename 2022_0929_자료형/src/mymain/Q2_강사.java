package mymain;

import java.util.Scanner;

public class Q2_���� {

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
		
		double radius;			//������
		double circle_length;	//���ѷ�
		double circle_area;		//������
		double circle_volume;	//������
		
		Scanner scanner = new Scanner(System.in);
		
		//���� ������ �Է¹ޱ�
		System.out.print("������");
		radius =scanner.nextDouble();
		
		//���
		circle_length = 2 * Math.PI * radius;
		circle_area = radius*radius*Math.PI;
		circle_volume =4.0/3*Math.PI*radius*radius*radius;
		
		//���
		System.out.printf("���ѷ� : %.1f\n" ,circle_length);
		System.out.printf("������ : %.1f\n" ,circle_area);
		System.out.printf("������ : %.1f\n" ,circle_volume);
		
		
		scanner.close();
	}

}

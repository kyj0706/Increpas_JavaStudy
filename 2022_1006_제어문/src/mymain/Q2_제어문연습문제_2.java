package mymain;

import java.util.Scanner;

public class Q2_�����������_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ ������ �Է¹޾� ���� ���� ���� ���ϴ� ���α׷��� �ۼ��� ����
		
		
		Scanner scanner = new Scanner(System.in);
		
		int num_1 ,num_2, num_3;
		int res_1;//�μ��� ��
		int res_2;//���� ��� �� �� ?
		
		System.out.print("�� ���� ������ �Է��ϼ���. >>");
		
		num_1 = scanner.nextInt();
		num_2 = scanner.nextInt();
		num_3 = scanner.nextInt();
		
		res_1 = (num_1 < num_2) ? num_1 : num_2;
		res_2 = num_3<res_1 ? num_3 :res_1;
		
		
		//if�� ? 
		
		
		
		
		
		System.out.printf("�� : %d  %d  %d\n",num_1,num_2, num_3);
		System.out.printf("�� ���� ���� �߿��� ���� ���� �� : %d\n" ,res_2);
		
		
		
		
		
		
		
		
		
		
		scanner.close();
		

	}

}

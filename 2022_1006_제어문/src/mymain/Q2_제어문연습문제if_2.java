package mymain;

import java.util.Scanner;

public class Q2_�����������if_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int num_1, num_2, num_3; // �����Է�
		int min;// ������ ��� 
		
		
		System.out.print("�� ���� ������ �Է��ϼ��� >>>");
		
		num_1 = scanner.nextInt();
		num_2 = scanner.nextInt();
		num_3 = scanner.nextInt();
		
		min =(num_1>num_2) ? num_1: num_2;
		min =(num_3>min) ? min : num_3;
		
		
		if(num_1==min) {
			
		}else if (num_2==min) {
			
		}else if (num_3==min) {
			
		}else  {
			System.out.printf("�� ���� ���� �߿��� ���� ���� �� : %d\n" );
		}
		System.out.printf("�� :%d %d %d\n", num_1,num_2,num_3);
		
		
		
		
		scanner.close();
		
	}

}

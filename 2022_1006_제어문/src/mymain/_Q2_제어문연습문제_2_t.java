package mymain;

import java.util.Scanner;

public class _Q2_�����������_2_t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		//3���� ������ �Է¹��� ����
		int su1,su2,su3;
		int small;//���������� ������ ����
		
		System.out.print("������ ������ �Է�>>");
		su1 = scanner.nextInt();
		su2 = scanner.nextInt();
		su3 = scanner.nextInt();
		
		System.out.printf("�� : %d %d %d\n", su1,su2,su3);
		
		//3���߿� ���� ���������ϱ�
		small = (su1 > su2) ? su2 : su1; //2���� ���� ��
		
		small = (su3 > small) ? small : su3; //������ 1���� ��
		
		System.out.printf("�����߿� ���� ������ [%d] �Դϴ�\n", small);
		
		scanner.close();
		
		
	}

}

package mymain;

import java.util.Arrays;

import myutil.MyArrays;

public class _01_MyMain_Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1���� �迭����
		// ����1
		int[] mr;
		mr = new int[4];

		System.out.printf("mr's length=%d\n", mr.length);// �迭�� ���� Ȯ��

		// ����2
		// �迭�� ���(Element) -> ������ ������(������) ǥ��
		mr[0] = 1; // mr[0]�ؼ� -> mr�κ��� 0��° ������ ����
		mr[1] = 2;
		mr[2] = 3;
		mr[3] = 4;

		// ����3
		// �迭�� ����� ���ô�.
		for (int i = 0; i < mr.length; i++) {

			System.out.printf("mr[%d] = %d\n", i, mr[i]);

		}
		
		//����4
		// ���� API ��� : Arrays
		// ��簪�� 0���� ä���
		Arrays.fill(mr, 0);// ��簪�� 0���� ä��ڴ�.
		System.out.println("--[0���� ä���]--");
		for (int i = 0; i < mr.length; i++) {

			System.out.printf("mr[%d] = %d\n", i, mr[i]);

		}
		
		//����5_1 MyArrays method ������
		Arrays.fill(mr, 1);
		System.out.println("--[1���� ä���]--");
		
		//���� ���� display ���
		MyArrays.display_array(mr);
		
		//����6_1
		//���� �����غ� fill
		MyArrays.fill(mr, 5);
		System.out.println("--[�������� API�� 5���� ä���]--");
		
		MyArrays.display_array(mr); 
		
		//����7_1
		//���� API overload
		//Arrays.fill(mr, 1, 1+2, 0);
		//�� API
		MyArrays.fill(mr, 1, 1+2, 0);
		System.out.println("--[2.3]ĭ�� 0���� ä���");
		MyArrays.display_array(mr);
		
	}

}

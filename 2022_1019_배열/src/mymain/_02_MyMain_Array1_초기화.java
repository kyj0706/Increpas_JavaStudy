package mymain;

import myutil.MyArrays;

public class _02_MyMain_Array1_�ʱ�ȭ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����1 [���1]
		//1���� �迭 �ʱ�ȭ (��������� ���ÿ� ���� �ο�)
		//	�ʱ�ȭ�ÿ��� �迭�� �����κ��� �����մϴ�.
		// 						 0   1   2   3   4   <-index(÷��)
		int [] mr = new int[] { 1 , 2 , 3 , 4 , 5,};
		
		//����2 [���2]
		//���� ����� ���ÿ� ���� �ο��� �����ϴٴ� ����
		int [] nr = 		   { 5 , 4 , 3 , 2 , 1};
		
		
		//����3
		int [] ar;
		//�̰��� ���� �ʴ´� ������ �ƴ϶�  �����̱� ������
		//�̷������� ���Ÿ� ���1�� ���� ����Ѵ�.
		//ar = { 10,20,30,40,50};
		ar = new int[] { 10,20,30,40,50};
		
		System.out.println("---[�ʱ�ȭ�� �迭����]---");
		MyArrays.display_array(mr);
		MyArrays.display_array(nr);
		MyArrays.display_array(ar);
		
		
		
	}

}

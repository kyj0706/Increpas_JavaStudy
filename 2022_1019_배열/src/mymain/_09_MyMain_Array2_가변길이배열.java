package mymain;

import myutil.MyArrays2;

public class _09_MyMain_Array2_�������̹迭 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//�迭
		//�������� �迭 : 1�����迭�� ���̰� ���� �迭
		//�ʱ�ȭ �Ҷ���  new �� ������ �� �ִ�.
		//����1_1(����)
		int [][] mm = new int [3][4];
		
		//�������� �迭 : 1�����迭�� ���̰� �ٸ� �迭
		//new�� �����Ҽ� ����.
		//����2_1(����)
		int [][] mm1 = new int [3][]; 
		
		//����2_2
		//0�࿡ 1�����迭 �ִ´�.
		mm1[0] = new int [2];
		mm1[1] = new int [3];
		mm1[2] = new int [4];
		
		MyArrays2.set_array(mm1);
		System.out.println("--[�������� �迭]--");
		MyArrays2.display_array(mm1);
		
		
		
		//����2_3
		int [][] mm2 = 
		{
				{9,8,7,6},
				{5,4,3},
				{2,1},
				{0}
				
		};
		System.out.println("--[�������� �迭]--");
		MyArrays2.display_array(mm2);
		
	}

}

package mymain;

import myutil.MyArrays2;

public class _07_MyMain_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����1_1
		//2�����迭 ���� 
		//						�� ��
		int [][] mm = new int [3][4];
		/*
		           ��
		       0  1  2  3
		    0  
              		         
		 �� 1  
		  
		    2
		  
		 */
		
		//����1_2
		//1��°��(0��)
		mm[0][0] = 1;
		mm[0][1] = 2;
		mm[0][2] = 3;
		mm[0][3] = 4;
		
		//����1_3
		//2��°��(1��)
		mm[1][0] = 5;
		mm[1][1] = 6;
		mm[1][2] = 7;
		mm[1][3] = 8;
		
		//����1_4
		//3��°��(2��)
		mm[2][0] = 9;
		mm[2][1] = 10;
		mm[2][2] = 11;
		mm[2][3] = 12;
		
		//����1_5 ����� �غ��ô�.		
		System.out.println("--[�迭�� ���]--");
		MyArrays2.display_array(mm);
		
		//����3_2
		//�������
		MyArrays2.clear_array(mm);
		System.out.println("--[�迭�� �����]--");
		MyArrays2.display_array(mm);
		
		MyArrays2.set_array(mm);
		System.out.println("--[�迭�� ä���]--");
		MyArrays2.display_array(mm);

	}

}

package mymain;

import myutil.MyArrays2;

public class _08_MyMain_Array2_�ʱ�ȭ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����1
		//2���� �迭 �ʱ�ȭ 
		//�迭�ʱ�ȭ�ÿ��� �����κ� ����.
		int [][] mm = new int [][] {
									//   0 1 2  <-��
										{1,2,3},//0��
										{4,5,6} //1��
									};
									
		MyArrays2.display_array(mm);
		
		//����2_1
		//new int[][] �κл���
		int [][] block_t= {
								{1,1,1},
								{0,1,0},
								{0,1,0}
						   };
		int [][] block_l= {
								{1,0,0},
								{1,0,0},
								{1,1,1}
						   };
		int [][] block_box= {
								{1,1,1},
								{1,0,1},
								{1,1,1}
						   };
		
		
		System.out.println("[t Block]");
		MyArrays2.display_block(block_t);
		System.out.println("[l Block]");
		MyArrays2.display_block(block_l);
		System.out.println("[boc Block]");
		MyArrays2.display_block(block_box);
		
	}

}

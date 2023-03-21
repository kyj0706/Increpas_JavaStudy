package mymain;

import myutil.MyArrays2;

public class _08_MyMain_Array2_초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//순서1
		//2차원 배열 초기화 
		//배열초기화시에는 갯수부분 생략.
		int [][] mm = new int [][] {
									//   0 1 2  <-열
										{1,2,3},//0행
										{4,5,6} //1행
									};
									
		MyArrays2.display_array(mm);
		
		//순서2_1
		//new int[][] 부분생략
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

package mymain;

import myutil.MyArrays2;

public class _07_MyMain_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//순서1_1
		//2차원배열 선언 
		//						행 열
		int [][] mm = new int [3][4];
		/*
		           열
		       0  1  2  3
		    0  
              		         
		 행 1  
		  
		    2
		  
		 */
		
		//순서1_2
		//1번째줄(0행)
		mm[0][0] = 1;
		mm[0][1] = 2;
		mm[0][2] = 3;
		mm[0][3] = 4;
		
		//순서1_3
		//2번째줄(1행)
		mm[1][0] = 5;
		mm[1][1] = 6;
		mm[1][2] = 7;
		mm[1][3] = 8;
		
		//순서1_4
		//3번째줄(2행)
		mm[2][0] = 9;
		mm[2][1] = 10;
		mm[2][2] = 11;
		mm[2][3] = 12;
		
		//순서1_5 출력을 해봅시다.		
		System.out.println("--[배열값 출력]--");
		MyArrays2.display_array(mm);
		
		//순서3_2
		//값지우기
		MyArrays2.clear_array(mm);
		System.out.println("--[배열값 지우기]--");
		MyArrays2.display_array(mm);
		
		MyArrays2.set_array(mm);
		System.out.println("--[배열값 채우기]--");
		MyArrays2.display_array(mm);

	}

}

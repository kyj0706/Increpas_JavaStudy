package mymain;

import myutil.MyArrays2;

public class _09_MyMain_Array2_가변길이배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//배열
		//고정길이 배열 : 1차원배열의 길이가 같은 배열
		//초기화 할때는  new 를 생략할 수 있다.
		//순서1_1(선언)
		int [][] mm = new int [3][4];
		
		//가변길이 배열 : 1차원배열의 길이가 다른 배열
		//new를 생략할수 없다.
		//순서2_1(선언)
		int [][] mm1 = new int [3][]; 
		
		//순서2_2
		//0행에 1차원배열 넣는다.
		mm1[0] = new int [2];
		mm1[1] = new int [3];
		mm1[2] = new int [4];
		
		MyArrays2.set_array(mm1);
		System.out.println("--[가변길이 배열]--");
		MyArrays2.display_array(mm1);
		
		
		
		//순서2_3
		int [][] mm2 = 
		{
				{9,8,7,6},
				{5,4,3},
				{2,1},
				{0}
				
		};
		System.out.println("--[가변길이 배열]--");
		MyArrays2.display_array(mm2);
		
	}

}

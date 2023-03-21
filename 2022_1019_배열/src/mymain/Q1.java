package mymain;

import myutil.MyArrays2;
import myutil.MyTranslate;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] src = new int [5][5];
		
		MyArrays2.set_array(src);
		
		System.out.println("--[원본]--");
		MyArrays2.display_array(src);
		
		int [][] res_r90 = MyTranslate.rotate_rigth_90(src);
		System.out.println("--[Rotate_Rigth_90]--");
		MyArrays2.display_array(res_r90);
		
		int [][] res_L90= MyTranslate.rotate_left_90(src);
		System.out.println("--[Rotate_left_90]--");
		MyArrays2.display_array(res_L90);
		
		int [][] res_r180= MyTranslate.rotate_rigth_180(src);
		System.out.println("--[Rotate_Rigth_180 결과는 같다.]--");
		MyArrays2.display_array(res_r180);
		
		int [][] res_L180= MyTranslate.rotate_left_180(src);
		System.out.println("--[Rotate_left_180 결과는 같다.]--");
		MyArrays2.display_array(res_L180);
		
		int [][] res_r270= MyTranslate.rotate_rigth_270(src);
		System.out.println("--[Rotate_Rigth_270]--");
		MyArrays2.display_array(res_r270);
		
		int [][] res_L270= MyTranslate.rotate_left_270(src);
		System.out.println("--[Rotate_left_270]--");
		MyArrays2.display_array(res_L270);
		
		int [][] res_up_down= MyTranslate.rotate_up_down(src);
		System.out.println("--[Rotate_up_down]--");
		MyArrays2.display_array(res_up_down);
		
		int [][] res_diagonal1= MyTranslate.rotate_diagonal1(src);
		System.out.println("--[res_diagonal1]--");
		MyArrays2.display_array(res_diagonal1);
		
		int [][] res_diagonal2= MyTranslate.rotate_diagonal2(src);
		System.out.println("--[res_diagonal2]--");
		MyArrays2.display_array(res_diagonal2);
		
		
		
		
		
		
	}

}

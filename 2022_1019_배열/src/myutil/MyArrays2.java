package myutil;

public class MyArrays2 {

	// 순서2
	// 출력부분을 만들어 봅시다.
	public static void display_array(int[][] mm) {

		for (int i = 0; i < mm.length; i++) { // i 행첨자
			for (int k = 0; k < mm[i].length; k++) { // 열첨자

				System.out.printf("%3d", mm[i][k]);
			} // for_k_end
			System.out.println();
		} // for_i_end
	}// display_array{}_end

	// 순서3_1
	// 초기화
	public static void clear_array(int[][] mm) {

		for (int i = 0; i < mm.length; i++) {
			for (int k = 0; k < mm[i].length; k++) {

				mm[i][k] = 0;

			} // for_k = end
		} // for_i = end
	}// clear_array{}_end

	// 순서4_1
	// 채우기??
	public static void set_array(int[][] mm) {
		int count = 0;
		for (int i = 0; i < mm.length; i++) {
			for (int k = 0; k < mm[i].length; k++) {
				count++;
				mm[i][k] = count;
				// 이방법으로 해도 된다.
				// mm[i][k]= 4*i + k+1;

			}
		}

	}// set_array{}_end

	// 순서2_2 _08_MyMain_Array2_초기화
	public static void display_block(int[][] mm) {

		for (int i = 0; i < mm.length; i++) { // i 행첨자
			for (int k = 0; k < mm[i].length; k++) { // 열첨자
				if(mm[i][k]==1) 
					System.out.print("■");
				else
					System.out.print("  ");
				
			} // for_k_end
			System.out.println();
		} // for_i_end
	}// display_array{}_end

}

package myutil;

public class MyArrays2 {

	// ����2
	// ��ºκ��� ����� ���ô�.
	public static void display_array(int[][] mm) {

		for (int i = 0; i < mm.length; i++) { // i ��÷��
			for (int k = 0; k < mm[i].length; k++) { // ��÷��

				System.out.printf("%3d", mm[i][k]);
			} // for_k_end
			System.out.println();
		} // for_i_end
	}// display_array{}_end

	// ����3_1
	// �ʱ�ȭ
	public static void clear_array(int[][] mm) {

		for (int i = 0; i < mm.length; i++) {
			for (int k = 0; k < mm[i].length; k++) {

				mm[i][k] = 0;

			} // for_k = end
		} // for_i = end
	}// clear_array{}_end

	// ����4_1
	// ä���??
	public static void set_array(int[][] mm) {
		int count = 0;
		for (int i = 0; i < mm.length; i++) {
			for (int k = 0; k < mm[i].length; k++) {
				count++;
				mm[i][k] = count;
				// �̹������ �ص� �ȴ�.
				// mm[i][k]= 4*i + k+1;

			}
		}

	}// set_array{}_end

	// ����2_2 _08_MyMain_Array2_�ʱ�ȭ
	public static void display_block(int[][] mm) {

		for (int i = 0; i < mm.length; i++) { // i ��÷��
			for (int k = 0; k < mm[i].length; k++) { // ��÷��
				if(mm[i][k]==1) 
					System.out.print("��");
				else
					System.out.print("  ");
				
			} // for_k_end
			System.out.println();
		} // for_i_end
	}// display_array{}_end

}

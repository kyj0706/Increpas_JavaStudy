package myutil;

public class MyArrays {

	// ����5_1
	// static �޼ҵ�
	public static void display_array(int[] mr2) {

		System.out.print("[");

		for (int i = 0; i < mr2.length; i++) {

			System.out.printf("%3d", mr2[i]);
		}
		System.out.println("  ]");

	}// display_end

	// ����6_1
	public static void fill(int[] mr, int val) {

		for (int i = 0; i < mr.length; i++) {

			mr[i] = val;
		}

	}// fell_end

	// ����7_1
	public static void fill(int[] mr, int fromindex, int toindex, int val) {

		for (int i = fromindex; i < toindex; i++) {
			mr[i] = val;
		}

	}// fell_end

	// ����8_1
	// Selection Sort �̿��� �������� ����(Ascending)
	public static void array_sort_asc(int[] mr) {

		// ÷�ڸ� Selection���� ���
		for (int i = 0; i < mr.length - 1; i++) { // i�°���
			for (int k = i + 1; k < mr.length; k++) {// k�� ���°Ŵ�
				if (mr[i] > mr[k]) {
					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;

				} // if_end
			} // for_k_end
		} // for_i_end
	}// array_sort_asc_end

	// ����8_1
	// Selection Sort �̿��� �������� ����(Ascending)
	public static void array_sort_desc(int[] mr) {

		// ÷�ڸ� Selection���� ���
		for (int i = 0; i < mr.length - 1; i++) { // i�°���
			for (int k = i + 1; k < mr.length; k++) {// k�� ���°Ŵ�
				if (mr[i] < mr[k]) {
					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;

				} // if_end
			} // for_k_end
		} // for_i_end
	}// array_sort_desc_end

	//Ư������ �������� ����
	public static void array_sort_asc(int[] mr, int fromindex, int toindex) {

		// ÷�ڸ� Selection���� ���
		for (int i = fromindex; i < toindex-1; i++) { // i�°���
			for (int k = i + 1; k < toindex; k++) {// k�� ���°Ŵ�
				if (mr[i] > mr[k]) {
					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;

				} // if_end
			} // for_k_end
		} // for_i_end
	}// array_sort_asc_end
	
	//Ư������ �������� 
	public static void array_sort_desc(int[] mr, int fromindex, int toindex) {

		// ÷�ڸ� Selection���� ���
		for (int i = fromindex; i < toindex-1; i++) { // i�°���
			for (int k = i + 1; k < toindex; k++) {// k�� ���°Ŵ�
				if (mr[i] < mr[k]) {
					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;

				} // if_end
			} // for_k_end
		} // for_i_end
	}// array_sort_asc_end

}

package myutil;

public class MyArrays {

	// 순서5_1
	// static 메소드
	public static void display_array(int[] mr2) {

		System.out.print("[");

		for (int i = 0; i < mr2.length; i++) {

			System.out.printf("%3d", mr2[i]);
		}
		System.out.println("  ]");

	}// display_end

	// 순서6_1
	public static void fill(int[] mr, int val) {

		for (int i = 0; i < mr.length; i++) {

			mr[i] = val;
		}

	}// fell_end

	// 순서7_1
	public static void fill(int[] mr, int fromindex, int toindex, int val) {

		for (int i = fromindex; i < toindex; i++) {
			mr[i] = val;
		}

	}// fell_end

	// 순서8_1
	// Selection Sort 이용한 오름차순 정렬(Ascending)
	public static void array_sort_asc(int[] mr) {

		// 첨자를 Selection으로 사용
		for (int i = 0; i < mr.length - 1; i++) { // i는고정
			for (int k = i + 1; k < mr.length; k++) {// k가 도는거다
				if (mr[i] > mr[k]) {
					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;

				} // if_end
			} // for_k_end
		} // for_i_end
	}// array_sort_asc_end

	// 순서8_1
	// Selection Sort 이용한 내림차순 정렬(Ascending)
	public static void array_sort_desc(int[] mr) {

		// 첨자를 Selection으로 사용
		for (int i = 0; i < mr.length - 1; i++) { // i는고정
			for (int k = i + 1; k < mr.length; k++) {// k가 도는거다
				if (mr[i] < mr[k]) {
					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;

				} // if_end
			} // for_k_end
		} // for_i_end
	}// array_sort_desc_end

	//특정구간 오름차순 정렬
	public static void array_sort_asc(int[] mr, int fromindex, int toindex) {

		// 첨자를 Selection으로 사용
		for (int i = fromindex; i < toindex-1; i++) { // i는고정
			for (int k = i + 1; k < toindex; k++) {// k가 도는거다
				if (mr[i] > mr[k]) {
					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;

				} // if_end
			} // for_k_end
		} // for_i_end
	}// array_sort_asc_end
	
	//특정구간 내림차순 
	public static void array_sort_desc(int[] mr, int fromindex, int toindex) {

		// 첨자를 Selection으로 사용
		for (int i = fromindex; i < toindex-1; i++) { // i는고정
			for (int k = i + 1; k < toindex; k++) {// k가 도는거다
				if (mr[i] < mr[k]) {
					int im = mr[i];
					mr[i] = mr[k];
					mr[k] = im;

				} // if_end
			} // for_k_end
		} // for_i_end
	}// array_sort_asc_end

}

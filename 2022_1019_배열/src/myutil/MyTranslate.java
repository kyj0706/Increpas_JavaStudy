package myutil;

public class MyTranslate {

	// 90도 오른쪽회전
	public static int[][] rotate_rigth_90(int[][] src) {

		// 원본배열을 통해서 행/열의 갯수를 구한다.
		int rows = src.length; // 행의갯수
		int cols = src[0].length; // 열의갯수

		// 원본과 동일한 크기의 사본배열을 생성
		int[][] dest = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < cols; k++) {
				dest[i][k] = src[(rows - 1) - k][i];
			}
		}

		return dest;
	}// rotate_rigth_90_end

	// 180도 오른쪽회전
	public static int[][] rotate_rigth_180(int[][] src) {

		// 원본배열을 통해서 행/열의 갯수를 구한다.
		int rows = src.length; // 행의갯수
		int cols = src[0].length; // 열의갯수

		// 원본과 동일한 크기의 사본배열을 생성
		int[][] dest = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < cols; k++) {
				dest[i][k] = src[(rows - 1) - i][(cols - 1) - k];
			}
		}

		return dest;
	}// rotate_rigth_180_end

	// 270도 오른쪽회전
	public static int[][] rotate_rigth_270(int[][] src) {

		// 원본배열을 통해서 행/열의 갯수를 구한다.
		int rows = src.length; // 행의갯수
		int cols = src[0].length; // 열의갯수

		// 원본과 동일한 크기의 사본배열을 생성
		int[][] dest = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < cols; k++) {
				dest[i][k] = src[k][(cols - 1) - i];
			}
		}

		return dest;
	}// rotate_rigth_270_end

	// 90 왼쪽회전
	public static int[][] rotate_left_90(int[][] src) {

		// 원본배열을 통해서 행/열의 갯수를 구한다.
		int rows = src.length; // 행의갯수
		int cols = src[0].length; // 열의갯수

		// 원본과 동일한 크기의 사본배열을 생성
		int[][] dest = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < cols; k++) {
				dest[i][k] = src[k][(cols - 1) - i];
			}
		}

		return dest;
	}// rotate_left_90_end

	// 180 왼쪽회전
	public static int[][] rotate_left_180(int[][] src) {

		// 원본배열을 통해서 행/열의 갯수를 구한다.
		int rows = src.length; // 행의갯수
		int cols = src[0].length; // 열의갯수

		// 원본과 동일한 크기의 사본배열을 생성
		int[][] dest = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < cols; k++) {
				dest[i][k] = src[(cols - 1) - i][(rows - 1) - k];
			}
		}

		return dest;
	}// rotate_left_180_end

	// 270 왼쪽회전
	public static int[][] rotate_left_270(int[][] src) {

		// 원본배열을 통해서 행/열의 갯수를 구한다.
		int rows = src.length; // 행의갯수
		int cols = src[0].length; // 열의갯수

		// 원본과 동일한 크기의 사본배열을 생성
		int[][] dest = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < cols; k++) {
				dest[i][k] = src[(rows - 1) - k][i];
			}
		}

		return dest;
	} // rotate_left_270_end

	// up_down
	public static int[][] rotate_up_down(int[][] src) {

		// 원본배열을 통해서 행/열의 갯수를 구한다.
		int rows = src.length; // 행의갯수
		int cols = src[0].length; // 열의갯수

		// 원본과 동일한 크기의 사본배열을 생성
		int[][] dest = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < cols; k++) {
				dest[i][k] = src[(rows - 1) - i][k];
			}
		}

		return dest;
	} // rotate_up_down_end

	// diagonal1
	public static int[][] rotate_diagonal1(int[][] src) {

		// 원본배열을 통해서 행/열의 갯수를 구한다.
		int rows = src.length; // 행의갯수
		int cols = src[3].length; // 열의갯수

		// 원본과 동일한 크기의 사본배열을 생성
		int[][] dest = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < cols; k++) {
				dest[i][k] = src[k][i];
			}
		}

		return dest;
	} // rotate_diagonal1_end

	// diagonal1
	public static int[][] rotate_diagonal2(int[][] src) {

		// 원본배열을 통해서 행/열의 갯수를 구한다.
		int rows = src.length; // 행의갯수
		int cols = src[3].length; // 열의갯수

		// 원본과 동일한 크기의 사본배열을 생성
		int[][] dest = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			for (int k = 0; k < cols; k++) {
				dest[i][k] = src[(rows - 1) - k][(cols - 1) - i];
			}
		}

		return dest;
	} // rotate_diagonal1_end

}

package myutil;

public class Snail {

	// 방향 상수
	public static final int RIGTH = 1;
	public static final int DOWN = 2;
	public static final int LEFT = 3;
	public static final int UP = 4;

	int chasu;

	int[][] snail_array;

	// 방향정보 저장할 정보
	int direction;

	public void setChasu(int chasu) {
		this.chasu = chasu;

		// 달팽이 구성
		make_snail();
		//in_snail();

	}
	// 순서대로 달팽이

	private void make_snail() {
		// TODO Auto-generated method stub
		// 1.달팽이배열 생성
		snail_array = new int[chasu][chasu];

		direction = RIGTH; // 오른쪽 부터시작

		int row = 0;
		int col = -1;
		int su = 1;

		for (int i = 0; i < chasu * chasu; i++) {

			if (direction == RIGTH) {
				col++;
				if (col == chasu || snail_array[row][col] != 0) {
					row++;
					col--;

					direction = DOWN;
				}

			} else if (direction == DOWN) {
				row++;
				if (row == chasu || snail_array[row][col] != 0) {
					col--;
					row--;

					direction = LEFT;

				}

			} else if (direction == LEFT) {
				col--;
				if (col < 0 || snail_array[row][col] != 0) {
					row--;
					col++;

					direction = UP;
				}

			} else if (direction == UP) {
				row--;
				if (row < 0 || snail_array[row][col] != 0) {
					row++;
					col++;
					direction = RIGTH;

				}
			}

			snail_array[row][col] = su++;
		} // end : for

	}// end : make_snail()
	
	
	/*
	 * //안쪽에서 부터 private void in_snail() { // TODO Auto-generated method stub //
	 * 1.달팽이배열 생성 snail_array = new int[chasu][chasu];
	 * 
	 * direction = RIGTH; // 오른쪽 부터시작
	 * 
	 * int row = 0; int col = -1; int su = 1;
	 * 
	 * for (int i = 0; i < chasu * chasu; i++) {
	 * 
	 * if (direction == RIGTH) { col--; if (col == chasu || snail_array[row][col] !=
	 * 0) { row++; col--;
	 * 
	 * direction = DOWN; }
	 * 
	 * } else if (direction == DOWN) { row++; if (row == chasu ||
	 * snail_array[row][col] != 0) { col--; row--;
	 * 
	 * direction = LEFT;
	 * 
	 * }
	 * 
	 * } else if (direction == LEFT) { col--; if (col < 0 || snail_array[row][col]
	 * != 0) { row--; col++;
	 * 
	 * direction = UP; }
	 * 
	 * } else if (direction == UP) { row--; if (row < 0 || snail_array[row][col] !=
	 * 0) { row++; col++; direction = RIGTH;
	 * 
	 * } }
	 * 
	 * snail_array[row][col] = su++; } // end : for
	 * 
	 * }
	 */

	public void display() {

		for (int i = 0; i < chasu; i++) {

			for (int k = 0; k < chasu; k++) {

				System.out.printf("%4d", snail_array[i][k]);

			} // end: k
			System.out.println();// 줄바꾸기

		} // end: i

	}// end : display()

}

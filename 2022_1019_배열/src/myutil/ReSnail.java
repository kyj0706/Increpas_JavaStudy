package myutil;

public class ReSnail {

	// 방향 상수
	public static final int UP = 1;
	public static final int RIGTH = 2;
	public static final int DOWN = 3;
	public static final int LEFT = 4;

	int chasu;

	int[][] resnail_array;

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
		resnail_array = new int[chasu][chasu];

		direction = UP; // 오른쪽 부터시작

		int row = 0;
		int col = -1;
		int su = chasu*chasu-1;

		for (int i = 0; i < chasu * chasu; i++) {
			if(direction== UP) {
				row--;
				if(row<0|| resnail_array[row][col] != 0) {
					row--;
					col++;
					direction =RIGTH;
				}
			}else if (direction ==RIGTH) {
				col++;
				if(col<0|| resnail_array[row][col] != 0) {
					row++;
					col--;
					direction=DOWN;
				}
				
			
			}else if (direction==DOWN) {
				row++;
				if(col<0 || resnail_array[row][col] != 0) {
					col++;
					row--;
					direction =LEFT;
					
				}
				
			}else if (direction ==LEFT) {
				col--;
				if(row<0 || resnail_array[row][col] != 0) {
					col--;
					row--;
					direction=UP;
				}
			}

			
			resnail_array[row][col] = su--;
		} // end : for

	}// end : make_snail()
	
	
	

	public void display() {

		for (int i = 0; i < chasu; i++) {

			for (int k = 0; k < chasu; k++) {

				System.out.printf("%4d", resnail_array[i][k]);

			} // end: k
			System.out.println();// 줄바꾸기

		} // end: i

	}// end : display()

}

package myutil;

public class ReSnail {

	// ���� ���
	public static final int UP = 1;
	public static final int RIGTH = 2;
	public static final int DOWN = 3;
	public static final int LEFT = 4;

	int chasu;

	int[][] resnail_array;

	// �������� ������ ����
	int direction;

	public void setChasu(int chasu) {
		this.chasu = chasu;

		// ������ ����
		make_snail();
		//in_snail();

	}
	// ������� ������

	private void make_snail() {
		// TODO Auto-generated method stub
		// 1.�����̹迭 ����
		resnail_array = new int[chasu][chasu];

		direction = UP; // ������ ���ͽ���

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
			System.out.println();// �ٹٲٱ�

		} // end: i

	}// end : display()

}

package myutil;

public class MaBangJin {
	
	int chasu;
	
	//��������
	int [][] ma_array;
	
	//�ܺο��� ������ �ޱ� ���� �༮ 
	public void setChasu(int chasu) {
		this.chasu = chasu;
		
		//������ ����
		make_mabangjin();
	}
	
	//�޼Ұ� private�̴� ���θżҵ� �̴�.
	//�ȿ����� ����°Ŵ� .
	private void make_mabangjin() {
		// TODO Auto-generated method stub
		//1.������ �迭�� ����ϴ�.
		ma_array = new int [chasu][chasu];
		//2.������ ä���
		int row =0;
		int col = chasu/2;
		int su = 1;
		
		ma_array[row][col] = su++;
		//3.�ݺ�
		for(int i=0; i<(chasu*chasu)-1; i++) {
			
			//1.�밢���� �̵�
			row--;
			col++;
			
			//2.�� / ���� ��� �������
			if(row<0 && col ==chasu) {
				row +=2;
				col--;
			}else if(row<0) {//���� ������� ->�� �Ʒ��� �̵�
				row = chasu-1;
				
			}else if(col==chasu) { //�������� ������� ->�Ǿ����� �̵�
				col = 0;
			}
			
			//�̹� ���� ä���� ������ -> ������ġ�� �Ʒ��� �̵�
			if(ma_array[row][col]!=0) {
				row +=2; //�Ʒ��� 2ĭ
				col--; //�������� 1ĭ
				
			}
			//�̵� ��ġ�� ���ֱ�
			ma_array[row][col] =su++;
			
			
		}//for: end
		
	}//make_mabangjin(): end
	
	public void display() {
		int [] col_sum = new int[chasu];
		
		for(int i=0; i<chasu; i++) {
			int row_sum=0;
			
			for(int k=0; k<chasu; k++) {
				System.out.printf("%4d",ma_array[i][k]);
				//������
				row_sum += ma_array[i][k];
				col_sum[k] += ma_array[i][k];
			}	
			//������ ���
			System.out.printf("%4d",row_sum);			
			System.out.println();
			
		}
		
		//���� �հ� ���
		for(int i=0; i<chasu; i++) {
			System.out.printf("%4d" ,col_sum[i]);
		}
		System.out.println();
		
	}//display() : end
	
	

}

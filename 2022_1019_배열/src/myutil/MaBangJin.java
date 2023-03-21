package myutil;

public class MaBangJin {
	
	int chasu;
	
	//전역변수
	int [][] ma_array;
	
	//외부에서 정보를 받기 위한 녀석 
	public void setChasu(int chasu) {
		this.chasu = chasu;
		
		//마방진 생성
		make_mabangjin();
	}
	
	//메소가 private이다 내부매소드 이다.
	//안에서만 쓰라는거다 .
	private void make_mabangjin() {
		// TODO Auto-generated method stub
		//1.마방진 배열을 만듭니다.
		ma_array = new int [chasu][chasu];
		//2.마방진 채우기
		int row =0;
		int col = chasu/2;
		int su = 1;
		
		ma_array[row][col] = su++;
		//3.반복
		for(int i=0; i<(chasu*chasu)-1; i++) {
			
			//1.대각으로 이동
			row--;
			col++;
			
			//2.위 / 우측 모두 나간경우
			if(row<0 && col ==chasu) {
				row +=2;
				col--;
			}else if(row<0) {//위로 나간경우 ->맨 아래로 이동
				row = chasu-1;
				
			}else if(col==chasu) { //우측으로 나간경우 ->맨앞으로 이동
				col = 0;
			}
			
			//이미 값이 채워져 있으면 -> 먼저위치의 아래로 이동
			if(ma_array[row][col]!=0) {
				row +=2; //아래로 2칸
				col--; //왼쪽으로 1칸
				
			}
			//이동 위치에 값넣기
			ma_array[row][col] =su++;
			
			
		}//for: end
		
	}//make_mabangjin(): end
	
	public void display() {
		int [] col_sum = new int[chasu];
		
		for(int i=0; i<chasu; i++) {
			int row_sum=0;
			
			for(int k=0; k<chasu; k++) {
				System.out.printf("%4d",ma_array[i][k]);
				//행의합
				row_sum += ma_array[i][k];
				col_sum[k] += ma_array[i][k];
			}	
			//행의합 출력
			System.out.printf("%4d",row_sum);			
			System.out.println();
			
		}
		
		//열의 합계 출력
		for(int i=0; i<chasu; i++) {
			System.out.printf("%4d" ,col_sum[i]);
		}
		System.out.println();
		
	}//display() : end
	
	

}

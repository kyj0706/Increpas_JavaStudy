package mymain;

public class _03_MyMain_Array1_응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month = 5;
		//					  1	 2  3  4  5  6  7  8  9 10  11 12	 <-month
		//					  0  1 	2  3  4  5  6  7  8  9  10 11    <-index : month-1
		int [] month_array = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.printf("[%d]월은 [%d]일 입니다.\n" ,month,month_array[month-1]);
		
		
		//띠구하기 : 출생년도%12
		//0  1  2  3  4  5  6  7  8  9  10 11 <- index
		//신 유 술 해 자 축 인 묘 진 사 오 미
		int year = 1999;
		//                        0      1    2     3     4    5      6       7     8    9   10    11
		String [] Tti_array = {"원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양" };
		
		System.out.printf("[%d]년은 [%s]띠입 입니다.\n" ,year,Tti_array[year%12]);
		
		
		
		
		
	}

}

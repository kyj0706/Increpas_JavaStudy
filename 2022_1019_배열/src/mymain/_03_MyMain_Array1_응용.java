package mymain;

public class _03_MyMain_Array1_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month = 5;
		//					  1	 2  3  4  5  6  7  8  9 10  11 12	 <-month
		//					  0  1 	2  3  4  5  6  7  8  9  10 11    <-index : month-1
		int [] month_array = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.printf("[%d]���� [%d]�� �Դϴ�.\n" ,month,month_array[month-1]);
		
		
		//�챸�ϱ� : ����⵵%12
		//0  1  2  3  4  5  6  7  8  9  10 11 <- index
		//�� �� �� �� �� �� �� �� �� �� �� ��
		int year = 1999;
		//                        0      1    2     3     4    5      6       7     8    9   10    11
		String [] Tti_array = {"������","��","��","����","��","��","ȣ����","�䳢","��","��","��","��" };
		
		System.out.printf("[%d]���� [%s]���� �Դϴ�.\n" ,year,Tti_array[year%12]);
		
		
		
		
		
	}

}

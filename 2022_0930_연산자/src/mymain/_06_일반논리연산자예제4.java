package mymain;

public class _06_일반논리연산자예제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 윤년알아보기
		// 조건1) 400의 배수
		// 조건2) 4의 배수이면서 100의 배수가 아닌 해
		
		int year = 2022;
		
		
		//강사님
				//조건1   또는 조건2
		if((year%400==0)||(year%4==0 && year%100 !=0))
			System.out.printf("[%d]년은 윤년\n",year);
		else
			System.out.printf("[%d]년은 평년\n.",year);
		
		//내가한거
//		if((year %4 ==0) && (year %100 !=0 ) || year % 400 ==0)
//			System.out.printf("[%d]년은 윤년입니다.",year);
//		else
//			System.out.printf("[%d]년은 평년입니다.",year);

	}

}

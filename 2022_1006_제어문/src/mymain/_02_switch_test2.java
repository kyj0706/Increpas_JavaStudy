package mymain;

import java.util.Random;

public class _02_switch_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//난수(무작위수)
		Random random = new Random();
		
		//난수 1~ 20 까지의 값
		//+1은   정수는 0~19까지이기 때문에 1부터 시작 ~20 하기위해서
		int month = random.nextInt(20)+1; //data변수
		int last_day;	//저장변수
		
		
		
		//1	 2  3  4  5   6  7  8  9 10 11 12 <- month
		//31 28 31 30 31 30 31 31 30 31 30 31 <- last_day
		
		//경우의 수가 많은것을 default 처리한다.
		
		
		//되긴하는데 문제가 있다1
		//문제1) data 이상의 값이 들어와도 출력이 된다.
		//why ) default가 31 이라서
		
		//정상처리2
		//유효성체크
		if(month >=1 && month <=12) 
		{
			/*if문으로
				if(month==2) last_day = 28;
				else if(month==4 || month==6 || month==9 || month==11) last_day=30;
				else
					last_day = 31;
			*/
			switch(month)
			{
				case 2  : last_day = 28; break;
				case 4  : 
				case 6  :
				case 9  :
				case 11 : last_day = 30; break;
				default : last_day = 31;
			}
			System.out.printf("[%d]월의 마지막날짜는 [%d]일입니다\n",month,last_day);
		}
		//오류처리
		else
		{
			System.out.printf("[%d]월은(는) 없습니다. 1~12사이를 입력해주세요\n",month);
			
		}
	}

}

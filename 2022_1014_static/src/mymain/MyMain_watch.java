package mymain;

import java.util.Calendar;

import myutil.MyCalendar;

public class MyMain_watch {
	
	/*
	  Design Pattern (설계방법론)
	  	: 과거에 여러개발자의 의해서 검증된 프로그램 알고리즘(패턴) 정리해놓은 이론.
  	  	
  	  		1. Single-ton Pattern
  	  			:서비스객체를 1개만 만들어서 사용하자
  			2. 
 
	 */
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// 현재시간 시계를 만들어 봅시다
		while (true) {

			// System.out.println("--현재시간--");
			// 현재 시스템 시간을 구합니다.
			
			
			
			/* 얘를 이용하지 말고
			//heap에 생성 
			Date today = new Date();
			//stact에 생성  }되면 사라짐
			int hour 	= today.getHours();
			int minute 	= today.getMinutes();
			int second 	= today.getSeconds();
			*/
			
			
			//static method
			//형식 : ??? 집중이 안된다 ..ㅅㅂ ...
			Calendar now = Calendar.getInstance();//현재시스템 시간 구하기
			int year = now.get(Calendar.YEAR);
			int month = now.get(Calendar.MONTH)+1;
			int day =now.get(Calendar.DATE);
			
			int hour = now.get(Calendar.HOUR_OF_DAY)%12; //24시간 
			int minute = now.get(Calendar.MINUTE);
			int second = now.get(Calendar.SECOND);
			
			int ampm = now.get(Calendar.AM);
			
			int weekday =now.get(Calendar.DAY_OF_WEEK);//일 기준 요일
			
			//요일 1~7 문자 비교
			String week = " ";
			
			String strAmPm = (ampm == Calendar.AM) ? "오전" : "오후"; 
			
			switch(weekday) 
			{
				case 1:week ="일";break;	
				case 2:week ="월";break;
				case 3:week ="화";break;
				case 4:week ="수";break;	
				case 5:week ="목";break;	
				case 6:week ="금";break;
				case 7:week ="토";break;
				default:break;
			
			}
			//이렇게 사용 몬하게 기본생성자를 private 로 설정을 하는게 좋다 ~
			//MyCalender mc =new MyCalender();
			
			MyCalendar mc = MyCalendar.getInstance();
			mc.draw_line();
			
			//출력변경 
			// 년-월-일  시:분:초:pm" 
			
			System.out.printf("%02d:%02d:%02d\n",hour,minute,second);
			
			
			System.out.printf("%d년%d월%d일  %02d:%02d:%02d [%s]' [%s]요일\n"
					,year,month,day,hour,minute,second,strAmPm,week);
			
			
			
			
			
			Thread.sleep(1000);// 1초 대기
		} // while_end

	}

}

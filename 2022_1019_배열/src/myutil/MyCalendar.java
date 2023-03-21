package myutil;

import java.util.Calendar;

public class MyCalendar {

	// 월의 마지막날을 저장할 배열
	// 1 2 3 4 5 6 7 8 9 10 11 12 <- month
	// 0 1 2 3 4 5 6 7 8 9 10 11 <- index = month-1
	int[] month_array = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	int year;
	int month;

	int[][] cal_array;

	public void setDate(int year, int month) {

		this.year = year;
		this.month = month;

		// 달력만들기
		make_calender();
	}

	// 윤년이냐?
	private boolean isYoon() {

		return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
	}

	private void make_calender() {
		// TODO Auto-generated method stub
		cal_array = new int[6][7];

		// 윤년여부에 따라서 2월 마지막값을 수정
		if (isYoon())
			month_array[1] = 29; // 윤년
		else
			month_array[1] = 28; // 평년

		int week = 0;
		int yoil;

		Calendar c = Calendar.getInstance();// 현재 시스템시간 구하기
		// 내가 생성하기 위한 날짜로 수정
		c.set(year, month - 1, 1);

		// 요일추출
		yoil = c.get(Calendar.DAY_OF_WEEK) - 1;

		// 1.
		// 이전달 날짜 채우기

		if (yoil > 0) {

			int prev_yoil = yoil - 1;// 이전 달의 날 요일
			int prev_month = (month == 1) ? 12 : month - 1;// 이전달 월
			int prev_last_day = month_array[prev_month];

			for (int i = prev_yoil; i >= 0; i--) {
				cal_array[week][i] = prev_last_day--;
			}
		}

		// 현재달의 날짜 채우기
		for (int i = 1; i <= month_array[month - 1]; i++) {
			cal_array[week][yoil] = i;
			// 다음날짜로 이동
			yoil++;
			if (yoil > 6) {
				week++;
				yoil = 0;
			}

		}

		// 2
		// 다음달 날짜 채우기
		for (int i = 1; i < 20; i++) { //

			cal_array[week][yoil] = i;

			// 다음날짜로 이동
			yoil++;
			if (yoil > 6) {
				week++;
				if (week > 5)
					break;

				yoil = 0;
			}
		}

	}

	// 출력
	public void display() {
		
		String [] week_array = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
		for(int i=0;i<week_array.length; i++) {
			System.out.printf("%4s" ,week_array[i]);
		}
		System.out.println();
		
		
		for (int i = 0; i < 6; i++) {// 행첨자(주)

			for (int k = 0; k < 7; k++) {// 열첨자(요일)

				System.out.printf("%4d", cal_array[i][k]);
			}
			System.out.println();
		}
	}

}

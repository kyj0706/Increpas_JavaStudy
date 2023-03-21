package myutil;

import java.util.Calendar;

public class MyCalendar {

	// ���� ���������� ������ �迭
	// 1 2 3 4 5 6 7 8 9 10 11 12 <- month
	// 0 1 2 3 4 5 6 7 8 9 10 11 <- index = month-1
	int[] month_array = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	int year;
	int month;

	int[][] cal_array;

	public void setDate(int year, int month) {

		this.year = year;
		this.month = month;

		// �޷¸����
		make_calender();
	}

	// �����̳�?
	private boolean isYoon() {

		return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
	}

	private void make_calender() {
		// TODO Auto-generated method stub
		cal_array = new int[6][7];

		// ���⿩�ο� ���� 2�� ���������� ����
		if (isYoon())
			month_array[1] = 29; // ����
		else
			month_array[1] = 28; // ���

		int week = 0;
		int yoil;

		Calendar c = Calendar.getInstance();// ���� �ý��۽ð� ���ϱ�
		// ���� �����ϱ� ���� ��¥�� ����
		c.set(year, month - 1, 1);

		// ��������
		yoil = c.get(Calendar.DAY_OF_WEEK) - 1;

		// 1.
		// ������ ��¥ ä���

		if (yoil > 0) {

			int prev_yoil = yoil - 1;// ���� ���� �� ����
			int prev_month = (month == 1) ? 12 : month - 1;// ������ ��
			int prev_last_day = month_array[prev_month];

			for (int i = prev_yoil; i >= 0; i--) {
				cal_array[week][i] = prev_last_day--;
			}
		}

		// ������� ��¥ ä���
		for (int i = 1; i <= month_array[month - 1]; i++) {
			cal_array[week][yoil] = i;
			// ������¥�� �̵�
			yoil++;
			if (yoil > 6) {
				week++;
				yoil = 0;
			}

		}

		// 2
		// ������ ��¥ ä���
		for (int i = 1; i < 20; i++) { //

			cal_array[week][yoil] = i;

			// ������¥�� �̵�
			yoil++;
			if (yoil > 6) {
				week++;
				if (week > 5)
					break;

				yoil = 0;
			}
		}

	}

	// ���
	public void display() {
		
		String [] week_array = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
		for(int i=0;i<week_array.length; i++) {
			System.out.printf("%4s" ,week_array[i]);
		}
		System.out.println();
		
		
		for (int i = 0; i < 6; i++) {// ��÷��(��)

			for (int k = 0; k < 7; k++) {// ��÷��(����)

				System.out.printf("%4d", cal_array[i][k]);
			}
			System.out.println();
		}
	}

}

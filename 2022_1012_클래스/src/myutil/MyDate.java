package myutil;

public class MyDate {

	
	//����1
	//����  : Member field / property / attribute ���� �Ѵ�.
	//		: instance����(��ü�� �����Ǹ� ��������� ����)
	public 		int year;
	protected 	int month;
	private 	int day;
				int weekday;
	
				
	//setter method	
	//���� : set(Field��) <- Camel ǥ���
	//������ month�� ������ ���� �ִ� �޼ҵ�
	public void setMonth(int m) {
		month =m;
	}
	
	public void setDay(int d) {
		day = d;
	}
	
	public void setWeekday(int wd) {
		weekday =wd;
	}
	
	//getter method
	//���� : get(Field��) <- Camel ǥ���
	public int getMonth() {
		
		return month;
	}
	
	public int getDay() {
		
		return day;
	}
	
	public int getWeekday() {
		
		return weekday;
	}
	
	
	public void display() {
		System.out.printf("%d-%02d-%02d [%d]����\n",
				year,month,day,weekday);
		
		
	}
	
}

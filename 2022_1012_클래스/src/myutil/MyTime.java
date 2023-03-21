package myutil;

public class MyTime {
	
	//ȥ�� ������
	//�ʱ�ȭ�� �ȰŴ� .
	//heap�� ��������� ���� 0���� �ʱ�ȭ�ȴ�
	//���� ? �����ڰ� �ʱ�ȭ �����ذŴ�.
	//int => 0  double => 0.0  boolean => false  String => null ��
	//�׷��� !!  null �̿�����..
	
	//����3
	//����
	/*
	 	������(Constructor) �޼ҵ�
	 	1.��ü�� �����ɶ� !!��1ȸ!! (�ڵ�)ȣ��Ǵ� �޼ҵ� [�ý��ۿ� ���ؼ�] 
	 	2.��ü �ʱ�ȭ ���� [��������ų� �����ϰų� ���]
	 	3.����)		Ŭ������()
	 				!!!!��ȯ���� ���� !!!!!
	 	4.�����ڴ� Overload(�ߺ��޼ҵ�)�� ����
	 	5.�����ڴ� ���� �����ϴ�.->������ JVM�� �ڵ����� ó��
	 	
	 	
	 */
	
	//����1
	//instance ����
	private int hour;
	private int minute;
	private int second;
	
	//����4
	//������1
	//default constructor(�⺻������) = ���ڰ� ����
	//�ʱ�ȭ�� ��� 
	public MyTime() {
		//����6 �ѹ����ô�
		System.out.println("--MyTime()--");
		//����7
		hour =minute =second =1;
	}
	
	//����8
	//������2(Overload)����� ������
	public MyTime(int h, int m, int s) {
		
		System.out.println("--MyTime(h,m,s)--");
		hour 	= h;
		minute 	= m;
		second 	= s;
			
	}
	
	
	//����10
	public MyTime(int h) {
		System.out.println("--MyTime(h)--");
		hour = h;
	}
	
	//����11
	public MyTime(int h, int m) {
		System.out.println("--MyTime(h,m)--");
		hour = h;
		minute =m;
	}
	 
	
	
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}

	//����2
	//Member Method
	//instance method =>��ü�� �����Ǿ� ���������.
	public void display( ) {
		
		System.out.printf("%02d:%02d:%02d\n",hour,minute,second);
		
		
	}
}

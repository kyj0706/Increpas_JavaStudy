package mymain;

import java.util.Calendar;

import myutil.MyCalendar;

public class MyMain_watch {
	
	/*
	  Design Pattern (��������)
	  	: ���ſ� ������������ ���ؼ� ������ ���α׷� �˰���(����) �����س��� �̷�.
  	  	
  	  		1. Single-ton Pattern
  	  			:���񽺰�ü�� 1���� ���� �������
  			2. 
 
	 */
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// ����ð� �ð踦 ����� ���ô�
		while (true) {

			// System.out.println("--����ð�--");
			// ���� �ý��� �ð��� ���մϴ�.
			
			
			
			/* �긦 �̿����� ����
			//heap�� ���� 
			Date today = new Date();
			//stact�� ����  }�Ǹ� �����
			int hour 	= today.getHours();
			int minute 	= today.getMinutes();
			int second 	= today.getSeconds();
			*/
			
			
			//static method
			//���� : ??? ������ �ȵȴ� ..���� ...
			Calendar now = Calendar.getInstance();//����ý��� �ð� ���ϱ�
			int year = now.get(Calendar.YEAR);
			int month = now.get(Calendar.MONTH)+1;
			int day =now.get(Calendar.DATE);
			
			int hour = now.get(Calendar.HOUR_OF_DAY)%12; //24�ð� 
			int minute = now.get(Calendar.MINUTE);
			int second = now.get(Calendar.SECOND);
			
			int ampm = now.get(Calendar.AM);
			
			int weekday =now.get(Calendar.DAY_OF_WEEK);//�� ���� ����
			
			//���� 1~7 ���� ��
			String week = " ";
			
			String strAmPm = (ampm == Calendar.AM) ? "����" : "����"; 
			
			switch(weekday) 
			{
				case 1:week ="��";break;	
				case 2:week ="��";break;
				case 3:week ="ȭ";break;
				case 4:week ="��";break;	
				case 5:week ="��";break;	
				case 6:week ="��";break;
				case 7:week ="��";break;
				default:break;
			
			}
			//�̷��� ��� ���ϰ� �⺻�����ڸ� private �� ������ �ϴ°� ���� ~
			//MyCalender mc =new MyCalender();
			
			MyCalendar mc = MyCalendar.getInstance();
			mc.draw_line();
			
			//��º��� 
			// ��-��-��  ��:��:��:pm" 
			
			System.out.printf("%02d:%02d:%02d\n",hour,minute,second);
			
			
			System.out.printf("%d��%d��%d��  %02d:%02d:%02d [%s]' [%s]����\n"
					,year,month,day,hour,minute,second,strAmPm,week);
			
			
			
			
			
			Thread.sleep(1000);// 1�� ���
		} // while_end

	}

}

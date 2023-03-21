package mymain;

import java.util.Scanner;

import myutil.MyCalendar;

public class MyMain_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int year;
		int month;
		String yn="y";
		
			
		MyCalendar mc = new MyCalendar();
		
		while(true) {
		
			System.out.print("년/월:");
			year = scanner.nextInt();
			month = scanner.nextInt();
			
			
			//달력 객체에게 year/month를 넘긴다
			mc.setDate(year, month);
			
			
			//달력출력
			mc.display();
			
			
			
			
			System.out.print("또?(y/n):");
			yn = scanner.next();
			
			if(!yn.equalsIgnoreCase("Y")) break;
			
			
		}//end: while
		
		System.out.println("---End---");
		
		
		scanner.close();
		
		

	}

}

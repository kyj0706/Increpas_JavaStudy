package mymain;

import java.util.Scanner;

public class Q1 {
	
	//public static final int DAY_1 = 24;
	public static final int MIN_60 = 60;
	public static final int HOUR_60 = 3600;
	public static final int DAY_60 = 86400;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		
		Scanner scanner = new Scanner( System.in);
		
		//변수 선언
		int total_sec; //전체 초(sec)
		int im_sec;
		
		//변수선언
		int day 	=0; //일
		int hour 	=0; //시
		int min 	=0; //분 
		int sec		=0; //초
		
		//int total 	=0;
		
		//입력
		System.out.printf("초(sec):");
		total_sec = scanner.nextInt();
		
		//임시변수
		im_sec = total_sec;
		
		
		
		
		//일
		day = im_sec / DAY_60 ;
		im_sec = im_sec % DAY_60;
		
		//시
		hour = im_sec / HOUR_60;
		im_sec = im_sec % HOUR_60;
		
		//분
		min = im_sec / MIN_60;
		im_sec = im_sec % MIN_60;
		
		//초
		sec = im_sec ;
		
		
		
		
		
		
		System.out.printf("%d일 %d시 %d분 %d초\n",day,hour,min,sec);
		
		
		System.out.println();
		System.out.printf("일%d : %d일\n",DAY_60 ,day );
		System.out.printf("시%d : %d시\n",HOUR_60 ,hour );
		System.out.printf("분%d : %d분\n",MIN_60 ,min );
		System.out.printf("초%d : %d초\n",sec ,sec );
		
		
		
		
		
		// ?일 ?시간 ?초 인지 계산하는식 
		
		
		
		
		
		scanner.close();
		

	}

}

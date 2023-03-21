package mymain;

import java.util.Scanner;

public class Q2_강사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 1.키보드로 부터 반지름을 입력받는다.
		 	double radius:
		 
		 2.산출해야될 정보
		 	원둘레 = 2 * Math.PI * radius; 
		 	원면적 = 반지름*반지름*Math.PI;
		 	구부피 = 4/3*Math.PI* 반지름*반지름*반지름
		 */
		
		double radius;			//반지름
		double circle_length;	//원둘레
		double circle_area;		//원면적
		double circle_volume;	//구부피
		
		Scanner scanner = new Scanner(System.in);
		
		//원의 반지름 입력받기
		System.out.print("반지름");
		radius =scanner.nextDouble();
		
		//계산
		circle_length = 2 * Math.PI * radius;
		circle_area = radius*radius*Math.PI;
		circle_volume =4.0/3*Math.PI*radius*radius*radius;
		
		//출력
		System.out.printf("원둘레 : %.1f\n" ,circle_length);
		System.out.printf("원면적 : %.1f\n" ,circle_area);
		System.out.printf("구부피 : %.1f\n" ,circle_volume);
		
		
		scanner.close();
	}

}

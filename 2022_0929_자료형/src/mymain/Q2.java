package mymain;

import java.util.Scanner;

public class Q2 {

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
		
		System.out.println("구의 표면적 부피 구하기");
		
		Scanner scanner = new Scanner(System.in);
		
		
		//반지름(입력)
		System.out.print("반지름 :");
		double radius = scanner.nextDouble();
		//--------------------------------------
		
		//원둘레
		double circumference = 2 *Math.PI*radius; 
		
		//원면적
		double area =radius*radius*Math.PI;
		
		//원부피
		double volume =4.0/3*Math.PI*radius*radius*radius;
		
		//출력방법1
		System.out.println("===출력방법1===");
		System.out.println("반지름 : "+radius);
		System.out.printf("원둘레 : %.1f%n",circumference);
        System.out.printf("표면적 : %.1f%n", area);
        System.out.printf("부피 : %.1f%n", volume);
        
        //출력방법 2
        System.out.println("===출력방법2====");
        System.out.printf("반지름: %.1f\n 원둘레: %.1f\n 표면적: %.1f\n 부피: %.1f\n", radius,circumference,area,volume);
		
        scanner.close();
		
		System.out.println(Math.PI);

	}

}

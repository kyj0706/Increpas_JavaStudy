package _03_제어문;

import java.util.Scanner;

public class _01_ifEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		String res = " ";
//		String fruit =" ";
//		
//		System.out.print("과일명(포도, 수박, 딸기) 입력 : ");
//		fruit= scanner.nextLine();
//		
//		if(fruit.equals("포도")) {
//			res = "달다";
//		}else if (fruit.equals("수박")) {
//			res= "시원하다";
//		}else if (fruit.equals("딸기")) {
//			res = "맛있다";
//		}else {
//			res = "3개가 다 입니다.";
//		}
//		
//		
//			System.out.printf("%s는 %s",fruit,res);
//		
//		scanner.close();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				if(j==3)
					break;
				System.out.println("i값"+i+",j값"+j);
			}
		}
		
		
	}

}

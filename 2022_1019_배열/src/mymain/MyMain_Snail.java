package mymain;

import java.util.Scanner;

import myutil.Snail;

public class MyMain_Snail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int chasu;
		String yn="y";
		
		Snail snail = new Snail();
		
		while(true) {
		
			System.out.print("차수:");
			chasu = scanner.nextInt();
			
			
			//달팽이 객체에게 chasu를 넘긴다
			snail.setChasu(chasu);
			
			//달팽이출력
			System.out.println("--[순서대로 달팽이]--");
			snail.display();
			
			System.out.println();//줄만들기
			
			
			
			System.out.print("또?(y/n):");
			yn = scanner.next();
			
			if(!yn.equalsIgnoreCase("Y")) break;
			
			
		}//end: while
		
		System.out.println("---End---");
		
		
		scanner.close();
		
		

	}

}

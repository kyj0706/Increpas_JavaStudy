package mymain;

import java.util.Scanner;

import myutil.ReSnail;

public class MyMain_ReSnail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int chasu;
		String yn="y";
		
		ReSnail reSnail = new ReSnail();
		
		while(true) {
		
			System.out.print("차수:");
			chasu = scanner.nextInt();
			
			
			//달팽이 객체에게 chasu를 넘긴다
			reSnail.setChasu(chasu);
			
			
			System.out.println("--[안쪽에서 달팽이]--");
			reSnail.display();
			
			System.out.println();//줄만들기
			
			
			
			System.out.print("또?(y/n):");
			yn = scanner.next();
			
			if(!yn.equalsIgnoreCase("Y")) break;
			
			
		}//end: while
		
		System.out.println("---End---");
		
		
		scanner.close();
		
		

	}

}

package mymain;

import java.util.Scanner;

import myutil.MaBangJin;

public class MyMain_Mabangjin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int chasu;
		String yn="y";
		
		MaBangJin  maBangJin = new MaBangJin();
		
		while(true) {
		
			System.out.print("차수:");
			chasu = scanner.nextInt();
			
			if(chasu%2==0) {
				System.out.println("차수는 홀수만 입력하세요!!");
				continue;
			}
			
			//마방진객체에게 chasu를 넘긴다
			maBangJin.setChasu(chasu);
			//마방진출력
			maBangJin.display();
			
			
			System.out.print("또?(y/n):");
			yn = scanner.next();
			
			if(!yn.equalsIgnoreCase("Y")) break;
			
			
		}//end: while
		
		System.out.println("---End---");
		
		
		scanner.close();
		
		

	}

}

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
		
			System.out.print("����:");
			chasu = scanner.nextInt();
			
			
			//������ ��ü���� chasu�� �ѱ��
			reSnail.setChasu(chasu);
			
			
			System.out.println("--[���ʿ��� ������]--");
			reSnail.display();
			
			System.out.println();//�ٸ����
			
			
			
			System.out.print("��?(y/n):");
			yn = scanner.next();
			
			if(!yn.equalsIgnoreCase("Y")) break;
			
			
		}//end: while
		
		System.out.println("---End---");
		
		
		scanner.close();
		
		

	}

}

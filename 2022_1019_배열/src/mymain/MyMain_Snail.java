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
		
			System.out.print("����:");
			chasu = scanner.nextInt();
			
			
			//������ ��ü���� chasu�� �ѱ��
			snail.setChasu(chasu);
			
			//���������
			System.out.println("--[������� ������]--");
			snail.display();
			
			System.out.println();//�ٸ����
			
			
			
			System.out.print("��?(y/n):");
			yn = scanner.next();
			
			if(!yn.equalsIgnoreCase("Y")) break;
			
			
		}//end: while
		
		System.out.println("---End---");
		
		
		scanner.close();
		
		

	}

}

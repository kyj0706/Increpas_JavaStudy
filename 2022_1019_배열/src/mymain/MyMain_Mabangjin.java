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
		
			System.out.print("����:");
			chasu = scanner.nextInt();
			
			if(chasu%2==0) {
				System.out.println("������ Ȧ���� �Է��ϼ���!!");
				continue;
			}
			
			//��������ü���� chasu�� �ѱ��
			maBangJin.setChasu(chasu);
			//���������
			maBangJin.display();
			
			
			System.out.print("��?(y/n):");
			yn = scanner.next();
			
			if(!yn.equalsIgnoreCase("Y")) break;
			
			
		}//end: while
		
		System.out.println("---End---");
		
		
		scanner.close();
		
		

	}

}

package mymain;

import java.util.Scanner;

public class Q2_������3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��������
		int feet;
		double cm,inch;
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("======[����3]=======");
		//feet & inch = > cm ȯ��
		System.out.print("feet �Է� :");
		feet = scanner.nextInt();
		
		
		inch = 12*feet;
		cm = inch *2.54;
		
		
		
		
		
		
		
		System.out.printf("%d��Ʈ %.1f��ġ %.2fcm�̴�.\n" ,feet,inch,cm);
		
		
		
		
		scanner.close();

	}

}

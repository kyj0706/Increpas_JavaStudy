package mymain;

import java.util.Scanner;

public class Q2_������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� ����
		int feet;
		double cm,inch;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("======[����2]=======");
		//cm�� feet & inch ȯ��
		
		System.out.print("cm �Է� :");
		cm = scanner.nextDouble();
		
		inch = cm / 2.54;
		feet = (int)inch/12;
		inch = inch-(feet*12);
		System.out.printf("%.2fcm�� %d��Ʈ %.1f��ġ�̴�.\n" ,cm,feet,inch);
		
		
	
		
		
		scanner.close();
	}

}

package mymain;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�̸� name
		//���� age
		//�ּ� addr
		//Ű ki
		//��ȭ tel
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int age;
		String addr;
		double ki;
		String tel;
		
		System.out.println("---[�Է³���]---");
		
		System.out.print("�̸� :");
		name=scanner.next();
		
		System.out.print("���� :");
		age=scanner.nextInt();
		
		System.out.print("�ּ� :");
		scanner.nextLine();
		addr=scanner.nextLine();
		
		System.out.print("Ű :");
		ki=scanner.nextDouble();
		
		System.out.print("��ȭ :");
		scanner.nextLine();
		tel=scanner.nextLine();
		
		
		System.out.println("---[��³���]---");
		System.out.printf("�̸�: %s��\n",name);
		System.out.printf("����: %d(��)\n",age);
		System.out.printf("�ּ�: %s\n",addr);
		System.out.printf("Ű: %.1f(cm)\n",ki);
		System.out.printf("��ȭ: %s\n",tel);
		
		scanner.close();

	}

}

package mymain;

import java.util.Scanner;

public class Q2_�����������_5_�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner =new Scanner(System.in);
		
		System.out.print("���� �� ���� �Է��ϼ���");
		int ch = scanner.next().charAt(0);
		
		
		if(ch=='a' || ch=='A') {
			System.out.println("America");
		}else if(ch=='b' || ch=='B') {
			System.out.println("Brazil");
		}else if(Character.toUpperCase(ch)=='C'){ //��ҹ��� �ڵ���ȯ toUpperCase
			System.out.println("Canada");
		}else if(Character.toUpperCase(ch)=='D'){ //��ҹ��� �ڵ���ȯ toUpperCase
			System.out.println("Denmark");
		}else if(Character.toUpperCase(ch)=='E'){ //��ҹ��� �ڵ���ȯ toUpperCase
			System.out.println("Espania");
			
		}else {
			System.out.println("[A~Z]�� �Է����ּ���, ���� E������ �ֽ��ϴ�.");
		}
		
		
		scanner.close();

	}

}

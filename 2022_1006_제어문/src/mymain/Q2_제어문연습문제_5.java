package mymain;

import java.util.Scanner;

public class Q2_�����������_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���ڸ� �Է¹޾� �׹��ڸ� �̴ϼȷ� �� ���� �� ����ϴ� ���α׷��� 
		//if~ els ������ �ۼ��غ����� ����
		
		
		Scanner scanner = new Scanner(System.in );
		
		char ch;//����1�� �Է�
		System.out.print("���� �Ѱ��� �Է��ϼ���>>");
		
		ch = scanner.next().charAt(0);
		
		if(ch=='a' || ch =='A') {
			System.out.println("Africa");

		}else if (ch=='b' || ch =='B') {
			System.out.println("Brazil");
		
		}else if (ch=='c' || ch =='C') {
			System.out.println("Canada");
			
		}else if (ch=='d' || ch =='D') {
			System.out.println("Denmark");
			
		}else {
			System.out.println("���� D���� �ۿ� ����");
		}
		
		
		
		
		
		//System.out.printf("%c",ch);
		
		
		
		
		
		scanner.close();

	}

}

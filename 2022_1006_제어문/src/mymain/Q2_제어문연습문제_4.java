package mymain;

import java.util.Scanner;

public class Q2_�����������_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����, ������(+, -, *, / ���� �ϳ�), ������ �Է¹޾� �ش� �����ڿ� ���� ����� ���Ͽ� 
		//����ϴ� ���α׷��� if~else ������ �ۼ�����.(��, 0���� ���� ��� �Ҵ����� �������.
		
		Scanner scanner = new Scanner(System.in);
		
		int num_1, num_2;
		String oper;
		
		
		System.out.print("�� ������ +,-,*,/�� �ϳ��� �����ڸ� �Է��ϼ��� >>>\n");
		
		num_1 = scanner.nextInt();
		num_2 = scanner.nextInt();
		oper = scanner.next();
		
		if(oper.equals("+")) {
			System.out.printf("%d + %d = %d",num_1,num_2,num_1+num_2);
			
		}else if (oper.equals("-")) {
			System.out.printf("%d - %d = %d",num_1,num_2,num_1-num_2);
		
		}else if (oper.equals("*")) {
			System.out.printf("%d * %d = %d",num_1,num_2,num_1*num_2);
			
		
		}else if (oper.equals("/")) {
			System.out.printf("%d / %d = %d",num_1,num_2,num_1/num_2);
			
		}else {
			System.out.println("Ʋ�� ������");
		}
		
		
		
		
		scanner.close();

	}

}

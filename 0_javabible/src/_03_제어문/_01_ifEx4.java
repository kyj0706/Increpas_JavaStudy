package _03_���;

import java.util.Scanner;

public class _01_ifEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner = new Scanner(System.in);
//		String res = " ";
//		String fruit =" ";
//		
//		System.out.print("���ϸ�(����, ����, ����) �Է� : ");
//		fruit= scanner.nextLine();
//		
//		if(fruit.equals("����")) {
//			res = "�޴�";
//		}else if (fruit.equals("����")) {
//			res= "�ÿ��ϴ�";
//		}else if (fruit.equals("����")) {
//			res = "���ִ�";
//		}else {
//			res = "3���� �� �Դϴ�.";
//		}
//		
//		
//			System.out.printf("%s�� %s",fruit,res);
//		
//		scanner.close();
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
				if(j==3)
					break;
				System.out.println("i��"+i+",j��"+j);
			}
		}
		
		
	}

}

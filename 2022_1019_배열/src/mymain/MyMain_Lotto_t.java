package mymain;

import java.util.Scanner;

import myutil.Lotto_t;

public class MyMain_Lotto_t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String yn="y";
		
		int [] user_no = new int[6];
		
		Lotto_t lotto_t = new Lotto_t();
		
		//��÷����
		lotto_t.make_win_no2();
		
		
				
		while(true) {
		
			System.out.print("�ζ� 6�ڸ� �Է�:");
			user_no[0] = scanner.nextInt();
			user_no[1] = scanner.nextInt();
			user_no[2] = scanner.nextInt();
			user_no[3] = scanner.nextInt();
			user_no[4] = scanner.nextInt();
			user_no[5] = scanner.nextInt();
			
			//�ζ� ��ü���� user_no�� �ѱ��
			lotto_t.setUser_no(user_no);
			//������
			lotto_t.display();
						
			
			System.out.print("��?(y/n):");
			yn = scanner.next();
			
			if(!yn.equalsIgnoreCase("Y")) break;
			
			
		}//end: while
		
		System.out.println("---End---");
		
		
		scanner.close();
		
		

	}

}

package S_test;
import java.util.Scanner;

public class S_study_�л�����_ver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kor;
		int eng;
		int math;
		String name;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("======�л�����======");
		
		//�̸�
		System.out.print("�̸��� �Է��ϼ��� :");
		name = scanner.nextLine();
		
		//��������
		System.out.print("�������� :");
		scanner.nextLine();
		kor = scanner.nextInt();

		System.out.print("�������� :");
		eng = scanner.nextInt();
		
		System.out.print("�������� :");
		math = scanner.nextInt();
		
				
		
		
		scanner.close();
		
		
		System.out.printf("�̸� : %s\n ���� : %d\n"  ,name, kor);
	
		

	}

}

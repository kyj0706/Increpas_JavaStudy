package S_test;
import java.util.Scanner;

public class S_study_for_ver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int num = 10;
//		for (int i=1; num> - i; i++) {
//			System.out.println("");
//		}
		
		/*
		 * int i; int j;
		 * 
		 * for(i=0; i<5; i++) {
		 * 
		 * for(j=0; j<=i; j++) {
		 * 
		 * System.out.print("*"); }
		 * 
		 * System.out.println(); }
		 */
		
		
		int a;
		int b;
		int c;
		int num = 5;
		
		for(a=0; a<num; a++) {
			
			for(b=1; b<num-a; b++) {
				
				System.out.print(" ");
			}
			for(c=0; c<a*2+1; c++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ϴ� �Ƕ�̵� ���� �Է� : ");
		
		int n = scanner.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=1; j<n-i; j++ ) {
				System.out.print(" ");
			}
			for(int k=0; k<i*2+1; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		System.out.println("������ �ܼ� �Է�");
		int Gu = scanner.nextInt();
		
		for(int j=0; j<10; j++) {
			System.out.print(Gu + "x" + j + "=" + Gu* j );
		}
		
		
		
		
		/*
		 * for(int i=2; i <10; i++) { System.out.println(i+"���� ����մϴ�."); for(int j=1;
		 * j<10; j++) { System.out.println(i + "x" + j + "=" + i * j); }
		 * 
		 * }
		 */
		
		
		
		scanner.close();
		
		

	}

}

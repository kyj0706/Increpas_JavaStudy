package S_test;
import java.util.Scanner;

public class S_study_학생점수_ver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int kor;
		int eng;
		int math;
		String name;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("======학생점수======");
		
		//이름
		System.out.print("이름을 입력하세요 :");
		name = scanner.nextLine();
		
		//국어점수
		System.out.print("국어점수 :");
		scanner.nextLine();
		kor = scanner.nextInt();

		System.out.print("영어점수 :");
		eng = scanner.nextInt();
		
		System.out.print("수학점수 :");
		math = scanner.nextInt();
		
				
		
		
		scanner.close();
		
		
		System.out.printf("이름 : %s\n 수학 : %d\n"  ,name, kor);
	
		

	}

}

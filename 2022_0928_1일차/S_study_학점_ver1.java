import java.util.Scanner;

public class S_study_����_ver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score;
		char opt=0;
		char grade = 'F' ;
		
		System.out.println("����� ������ �Է����ּ��� :");
		
		Scanner scanner = new Scanner(System.in);
		
		score = scanner.nextInt();
		
		if(score >= 90) {
			grade = 'A';
			if(score >= 98) {
				opt = '+';
			}else if (score < 94) {
				opt = '-';
				
			}
			
		}else if (score >=80) {
			grade = 'B';
			if(score >=88) {
				opt = '+';
			}else if (score < 84) {
				opt = '-';
			}
			
		}else if (score >=70) {
			grade = 'C';
			if(score >=78);
				opt = '+';
			}else if (score >=74) {
				opt = '-';
			}
		else if (score >=60) {
			grade = 'D';
			if(score >=68);
				opt = '+';
			}else if (score >=64) {
				opt = '-';
				
			}else {
				grade = 'F';
			}
		
		
		System.out.println("���� ������ : " +score+ "\n���� ����� : "+grade +""+opt);
	
		
		
		
		
		scanner.close();
		
		

	}

}

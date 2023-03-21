import java.util.Scanner;

public class S_study_원그리기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 비트맵 방식으로 적당하게 그린 원(동그라미)을 출력해보세요. 사이즈를 입력받아 이것이 도화지의 가로와 세로의 길이가 되도록 하고, 
		//도화지는 "□" 기호로 채우고, 원은 "■"으로 그려봅니다.
		
		//힌트: 원의 방정식은 x^2 + y^2 = (반지름)^2 입니다.
		
		//변수선언
		int num;
		
		//입력변수 선언
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("사이즈를 입력하세요:");
		num = scanner.nextInt();
		
		for(int i= -num/2; i<=num/2; i++) {
			for(int j= -num/2; j<=num/2; j++) {
				if(i*i+j*j< num/2*num/2 && i*i+j*j > (num-2.5)/2 * (num-2.5)/2) {
					System.out.print("■");
				}else {
					System.out.print("□");
					
				}
			}
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		//입련변수 종료
		scanner.close();

	}

}

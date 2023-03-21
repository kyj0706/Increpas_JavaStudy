package mymain;

public class Q2_제어문연습문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//문제가 있었네 지금보니까...
		
		
		int sin =10000;
		double sale;
		
		System.out.println("정상가격         세일가격");
		System.out.println("-------------------------");
		
		for(int i=0; i<=10; i++) {
			sin = sin + 1000;
			sale = (sin-(sin*0.3)) ;
			
			System.out.printf("%d\t\t%.1f\n ",sin,sale);
			
			
			
		}
		
		
	}

}

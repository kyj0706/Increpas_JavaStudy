package mymain;

public class Q2_제어문연습문제_11_강 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//반복규칙을 찾아라
		//부호가 변경 : + - + -
		//분모가 홀수로 가더라
		//분자는 고정 
		
		int n= 1000000000;
		double pi =0.0;
		int sign =1; // 부호결정할거
		
		
		
		for(int i=0; i<n; i++) {
			pi = pi+ sign*(4.0/(i*2L+1)); 
			
			//음수만들기
			sign = -sign;
			
		}
		System.out.println(pi);

	}

}

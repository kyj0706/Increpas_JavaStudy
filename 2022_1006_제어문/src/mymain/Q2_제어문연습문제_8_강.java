package mymain;

public class Q2_제어문연습문제_8_강 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//주어진 수가 다르게 된다면 
		//내가한 방법은 합계가 되지 않는다 .
		//그래서 이런식으로 하는게 정상이다 .
		
		System.out.println("n           1부터 n까지의 합");
		System.out.println("============================");
		for(int n=1; n<=10; n++) {
			
			//n까지의 합을 구하는 식 

			int sum =0;//n까지의합 누적할 변수 임시변수
			for(int i=1; i<=n; i++) {
				sum += i;
			}
			
			System.out.printf("%2d%20d\n",n,sum); 
			
			
		}
	}

}

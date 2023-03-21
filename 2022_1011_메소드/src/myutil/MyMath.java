package myutil;

public class MyMath {

	// 2개수 중에서 큰수 구하기
	public static int max(int a, int b) {

		return (a >= b) ? a : b;
	}//2_max_end

	// 3개수 중에서 큰수 구하기
	public static int max(int a, int b, int c) {

		// 내가한거
		// int res_1; //두수중에 비교
		// int res_2; //비교한 걸 또 비교

		// res_1 = (a > b) ? a : b;
		// res_2 = (c>res_1) ? c :res_1;

		// 강사님ver
		int big = (a > b) ? a : b;
		big = (big > c) ? big : c;

		// return res_2;

		return big;
	}//3_max_end

	// n까지의 합
	public static int hap(int n) {

		int sum = 0;

		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}//n_max_end
	
	//n까지의 수중 m의 배수의합
	public static int hap(int n,int m) {

		int sum = 0;

		for (int i = 0; i <= n; i++) {
			if(i%m==0) {
				sum += i;
				
			}
		}
		return sum;
	}//nm_hap
	
	
	//짝수의 합
	public static int hap_even(int n) {

		int even_sum = 0;

		for (int i = 1; i <= n; i++) {
			if(i%2==0) {
				even_sum += i;
				
			}//if_end
		}//for_end
		
		return even_sum;
	}//even_end
	
	//홀수의 합
	public static int hap_odd(int n) {

		int odd_sum = 0;

		for (int i = 1; i <= n; i++) {
			if(i%2==1)
			odd_sum += i;
		}//for_end
		return odd_sum;
	}//odd_end
	
	//소수??
	public static void display_prime(int n) {

		int count=0;

		for (int i = 2; i <= n; i++) {
			for(int j=2; j<=i; j++) {
				if(i%j==0) {
					count++;
				}//if_end
			}//for_end
			if(count==1) {
				
				System.out.printf("%d ",i);
			}//if_end
			count=0;
		}//for_end
		return ;
	}//odd_end
	
	//강사ver
	public static void display_prime_t(int n) {
		
		System.out.print("솟수(강사ver) :");
		for(int i=2; i<=n; i++) {
			
			if(i==2) { 
				System.out.printf("%3d " ,i);
				continue;
			}
			//소수체크
			boolean bPrime = true;
			for(int k=2; k<=(i/2); k++) {
				
				//소수가 아닌조건
				if(i%k==0) {
					bPrime = false;
					break;
				}
			}
			//소수면 출력해라.
			if(bPrime)
				System.out.printf("%d ",i);
				
				
			
		}
		System.out.println();
		
		
		return ;
	}//odd_end
	
	
	

}

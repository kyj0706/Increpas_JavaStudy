package mymain;

public class Q2_제어문연습문제_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * double pi =0.0;
		 * 
		 * for(int i=1; i<=10000000; i++) { i = i+4;
		 * 
		 * pi = pi +(1.0/i) -(1.0/(i+2)); } System.out.println(pi);
		 */

		/*
		 * double pi =0; for(int i=1; i<1000000; i=i+4) { pi = pi +(1.0/i) -
		 * (1.0/(i+2)); } System.out.println(pi*4);
		 */

		for (int i = 10; i <= 10000000; i = i * 10) {
			double pi = 0;

			for (int j = 1; j < i; j = j + 4) {
				pi = pi + (1.0 / j) - (1.0 / (j + 2));
			}
			// System.out.printf("%f",pi);

			System.out.println("pie = " + pi * 4 + "(" + i + "회)");
			System.out.printf("%.1f", pi * 4);
		}

		/*
		 * double pi=0, temp=1, p=1, num=1;
		 * 
		 * while(num<10000000) { p *=-1; pi +=p*1.0/temp; temp +=2; num++;
		 * 
		 * } System.out.printf("%.16f",4*pi);
		 */

		/*
		 * for(int i=1; i<=1000000; i++) {
		 * 
		 * 
		 * if(i%2==0) { pi = pi+(double)(4/(double)(i*num)); num = -num; } }
		 * System.out.printf("%.15f",pi);
		 */
	}

}

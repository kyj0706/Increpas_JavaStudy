package mymain;

public class Q2_제어문연습문제_14_강 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double sum =0;
		int 	n =1;
		
		while(n<10) { //n = 1 3 5 7 9
			
			//=============화면출력==============
			if(n>1)
				System.out.printf("1.0/%d",n);
			else 
				System.out.printf("1.0");

			
			if(n<9)
				System.out.print(" + ");
			else
				System.out.print(" = ");
			
			//==============계산식===============
			
			sum =sum+(1.0/n);
			
			
			
			
			n +=2; //2씩 증가
			
			
		}
		System.out.println(sum);
	}

}

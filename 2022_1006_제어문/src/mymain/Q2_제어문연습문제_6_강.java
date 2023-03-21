package mymain;

public class Q2_제어문연습문제_6_강 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("정상가격         세일가격");
		System.out.println("-------------------------");
		
		for(int price=10000; price<=20000; price+=1000) {
			
			System.out.printf("%d            %.1f\n",price,price*0.7);
		}

	}

}

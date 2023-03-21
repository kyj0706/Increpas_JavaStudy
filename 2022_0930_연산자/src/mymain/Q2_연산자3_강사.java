package mymain;

public class Q2_연산자3_강사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1ft = 12inch
		//1inch = 2.54cm
		int ft = 5;
		int inch = 4;
		
		double cm = (ft*12+ inch) * 2.54;
		
		System.out.printf("%d피트 %d인치 %.2fcm이다.\n" ,ft,inch,cm);

	}

}

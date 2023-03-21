package mymain;

public class Q2_연산자2_강사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//162.56cm는 5ft 4inch입니다.
		
		double cm =162.56;
		
		double total_inch;
		
		//cm->inch변환
		total_inch = cm / 2.54;
		
		//inch -> ft추출
		int ft 		= (int) (total_inch/12);
		int inch 	= (int) (total_inch%12);
		
		System.out.printf("%.2f(cm)는 %dft %dinch입니다\n",cm,ft,inch);

	}

}

package mymain;

public class Q2_������2_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//162.56cm�� 5ft 4inch�Դϴ�.
		
		double cm =162.56;
		
		double total_inch;
		
		//cm->inch��ȯ
		total_inch = cm / 2.54;
		
		//inch -> ft����
		int ft 		= (int) (total_inch/12);
		int inch 	= (int) (total_inch%12);
		
		System.out.printf("%.2f(cm)�� %dft %dinch�Դϴ�\n",cm,ft,inch);

	}

}

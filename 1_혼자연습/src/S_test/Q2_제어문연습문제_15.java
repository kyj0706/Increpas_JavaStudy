package S_test;

public class Q2_�����������_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		. ������ ���� ��Ģ�� �ִ� ���� ����غ���.(while �� ���)
//		 -1, 3, -5, 7, -9, 11, -13, 15, -17, 19
		// 4 -8 12 +
		// +4 8 +12 -16 +20

		int sign = -4;
		int n = 1;

//		for(int i=1; i<=20; i++) {
//			
//			sum+=i;
//			sign= -sign;
//			
//			
//			System.out.printf("%d ",sign);
//		}
		//for (int i = 1; i < 20; i++) {

			// sum = i;

			// sign = sign+4;

			// System.out.printf("%d ",sign);
			// if(i%2==1)
			// System.out.printf("%d ",sum);

		//}
		for (int i = 0; i <= 20; i++) {
			if(i%2==1) {
				n =+i;
				//System.out.printf("%d ", n);
				continue;
				
			}
			for(int j=0; j<i; j++) {
				if(i<=sign) {
					j+=2;
					sign = -sign;
					
					System.out.printf("%d",j);
				}
			}

//			for (int j = 1; j <= i; j++) {
//				sum += i;
//				// System.out.print(n);
//				if (i % 2 == j) {
//					sign++;
//					 //System.out.printf("%d ", sign);
//				}
//			}

		}

	}

}

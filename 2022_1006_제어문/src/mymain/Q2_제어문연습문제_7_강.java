package mymain;

public class Q2_�����������_7_�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("������   ����   ������");
		System.out.println("======================");
		
		
		
		for(int n=0; n<=5;  n++) {
			
			//System.out.printf("%d%11d%11d\n", n, n*n, n*n*n);// ������

			
				
			//Math.pow(a,b) <- a's b ��
			System.out.printf("%d%11d%11d\n", n, (int)Math.pow(n, 2), (int)Math.pow(n, 3));
		}

	}

}

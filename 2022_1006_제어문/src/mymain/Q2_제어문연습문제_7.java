package mymain;

public class Q2_�����������_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//7. for ���� ����Ͽ� 0���� 5������ ������ 
		//�������� ���ؼ� ����ϴ� ���α׷��� �ۼ��� ����.
		
		int num = 0;
		
		int res_1=0;
		int res_2=0;
		
		
		System.out.println("������   ����   ������");
		System.out.println("======================");
		
		for(int i=0; i<=5; i++) {
			
			num = i;
			res_1 = (int) Math.pow(num, 2);
			res_2 = (int) Math.pow(num, 3);
			
			System.out.printf("%d%11d%11d\n",num,res_1,res_2);
			//System.out.printf("%d\n",res_2);
			
			
			
		}

	}

}

package myutil;

public class MyMath {

	// 2���� �߿��� ū�� ���ϱ�
	public static int max(int a, int b) {

		return (a >= b) ? a : b;
	}//2_max_end

	// 3���� �߿��� ū�� ���ϱ�
	public static int max(int a, int b, int c) {

		// �����Ѱ�
		// int res_1; //�μ��߿� ��
		// int res_2; //���� �� �� ��

		// res_1 = (a > b) ? a : b;
		// res_2 = (c>res_1) ? c :res_1;

		// �����ver
		int big = (a > b) ? a : b;
		big = (big > c) ? big : c;

		// return res_2;

		return big;
	}//3_max_end

	// n������ ��
	public static int hap(int n) {

		int sum = 0;

		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}//n_max_end
	
	//n������ ���� m�� �������
	public static int hap(int n,int m) {

		int sum = 0;

		for (int i = 0; i <= n; i++) {
			if(i%m==0) {
				sum += i;
				
			}
		}
		return sum;
	}//nm_hap
	
	
	//¦���� ��
	public static int hap_even(int n) {

		int even_sum = 0;

		for (int i = 1; i <= n; i++) {
			if(i%2==0) {
				even_sum += i;
				
			}//if_end
		}//for_end
		
		return even_sum;
	}//even_end
	
	//Ȧ���� ��
	public static int hap_odd(int n) {

		int odd_sum = 0;

		for (int i = 1; i <= n; i++) {
			if(i%2==1)
			odd_sum += i;
		}//for_end
		return odd_sum;
	}//odd_end
	
	//�Ҽ�??
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
	
	//����ver
	public static void display_prime_t(int n) {
		
		System.out.print("�ڼ�(����ver) :");
		for(int i=2; i<=n; i++) {
			
			if(i==2) { 
				System.out.printf("%3d " ,i);
				continue;
			}
			//�Ҽ�üũ
			boolean bPrime = true;
			for(int k=2; k<=(i/2); k++) {
				
				//�Ҽ��� �ƴ�����
				if(i%k==0) {
					bPrime = false;
					break;
				}
			}
			//�Ҽ��� ����ض�.
			if(bPrime)
				System.out.printf("%d ",i);
				
				
			
		}
		System.out.println();
		
		
		return ;
	}//odd_end
	
	
	

}

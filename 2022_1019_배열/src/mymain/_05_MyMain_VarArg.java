package mymain;

public class _05_MyMain_VarArg {
	
	//����1
	//Method Overload
	//�̷������� ��� �߰��ϸ� �ݺ������� �ʴ��� 
	static void sub(int a) {}
	static void sub(int a, int b) {}
	static void sub(int a, int b, int c) {}
	
	//����2_1
	//VarArgs(��������) : .... (ellipsis)
	//�̷��� �������ڸ� ���ؼ� �����ϴ�.
	static void sub_arg(int ... nr) {//���������̴�. =>ȣ��� ���ÿ� ������ �ȴ�.
		
		//����3				�̷������� ����2_2ó�� ����Ѵ�.
		//����			int[] nr = {1};
		//�迭			int[] nr = {1,2};
		//				int[] nr = {1,2,3};
		
		//����2_3 ���
		System.out.print("[");
		for(int i=0; i<nr.length; i++) {
			System.out.printf("%3d", nr[i]);
		}
		System.out.print("]\n");
		
		
	}
	//����4_1
	static int max(int ...nr) {
		
		//����4_3 ���
		int big =0;
		for(int i=0; i<nr.length; i++) {
			
			big = (big >nr[i]) ? big : nr[i];
		}
		
		return big;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//����2_2
		//�̷��� ȣ���� �����Ѵ�.
		sub_arg(1);
		sub_arg(1,2);
		sub_arg(1,2,3);
		sub_arg(1,2,3,4);
		
		//����4_2
		int a=1, b=5,c=3,d=8, res;
		res = max(a,b);
		System.out.printf("%d,%d�� ū�� %d\n",a,b ,res);
		res = max(a,b,c);
		System.out.printf("%d,%d,%d�� ū�� %d\n",a,b,c ,res);
		res = max(a,b,c,d);
		System.out.printf("%d,%d,%d,%d�� ū�� %d\n",a,b,c,d ,res);
		
		
		
		

	}

}

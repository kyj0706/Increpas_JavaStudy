package mymain;

import myutil.MyMath;

public class MyMain_MyMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����1
		//���� API
		int n= -100 , res;
		
		//The constructor Math() is not visible
		//Math m = new Math();//
		res =Math.abs(n);
		
		
		
		System.out.printf("[%d]=%d\n",n,res);
		
		
		//����2
		//���������
		//MyMath mm = new MyMath();
		//res =mm.abs(n);
		
		res =MyMath.abs(n);
		System.out.printf("[%d]=%d\n",n,res);
		
		
		
		double a=2, b=10, c;
		
		//Java API
		c=  Math.pow(a, b);
		System.out.printf("%.0f's  %.0f�� = %.0f\n",a ,b ,c);
		
		//����
		c = MyMath.pow(a, b);
		System.out.printf("%.0f's  %.0f�� = %.0f\n",a ,b ,c);
		
		
		
		int x=10, y;
		
		//hap
		y=MyMath.hap(x);
		System.out.printf("1~[%d]���� �� [%d]\n",x,y);
		
		//����Լ�
		y=MyMath.recurive_hap(x);
		System.out.printf("1~[%d]���� �� [%d]\n",x,y);
		
		
		//???
		int u=4; 
		double res1;
		
		//res1=MyMath.factorial(u);

		
		res1 = MyMath.factorial(u);
		System.out.printf("for%d!= %.1f\n", u, res1);
		
		res1 = MyMath.recursive_factorial(u);
		System.out.printf("���%d!= %.1f\n", u, res1);
		
		//System.out.printf("[%d!] = [%d]\n");
		//res1 =  MyMath.recursive_factorial(t);
		
		
		
		
		
		

	}

}

package mymain;

public class Q2_�����������_14_�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double sum =0;
		int 	n =1;
		
		while(n<10) { //n = 1 3 5 7 9
			
			//=============ȭ�����==============
			if(n>1)
				System.out.printf("1.0/%d",n);
			else 
				System.out.printf("1.0");

			
			if(n<9)
				System.out.print(" + ");
			else
				System.out.print(" = ");
			
			//==============����===============
			
			sum =sum+(1.0/n);
			
			
			
			
			n +=2; //2�� ����
			
			
		}
		System.out.println(sum);
	}

}

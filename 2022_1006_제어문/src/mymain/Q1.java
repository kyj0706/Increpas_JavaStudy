package mymain;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�������� �Է¹޾� ����غ�����
		
		Scanner scanner = new Scanner(System.in);
		
		int dan; //�ܼ�
		int res; //�������
		
		System.out.print("��:");
		dan= scanner.nextInt();
		
		
		for(int i=1; i<10; i++) {
			res = dan*i;//���� �̷��� �ص� �ǳ� ?? �ᱹ �̰͵� 11�� ���°��ݾ� ?
				
				//System.out.println(dan+"x"+i+"="+dan*i);
				//�޸� �����̶� 
				
				//System.out.println();
				System.out.printf("%d x %d = %d\n",dan,i,res);

			
		}
		
		
		
		
		scanner.close();

	}

}

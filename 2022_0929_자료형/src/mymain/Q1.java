package mymain;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int width = 100; //��
		int height = 50; //����
		int area; //����

				
		//Ű����κ��� �Է¹޴� ��ü ����
		//System.in		: System class���� ǥ�� �Է°�ü
		//System.out	: System class���� ǥ�� ��°�ü
		Scanner scanner = new Scanner(System.in); //Ű���� �Է¹ޱ� [�׳� �ܿ��� �Ѵ�.]
		
		System.out.println("�� :"); 
		width = scanner.nextInt(); //���� �Է¹ޱ�
		
		System.out.println("����? :"); 
		height = scanner.nextInt();//���� �Է¹ޱ�
		
		//�������
		area = width * height;
		
		System.out.printf("��:%d ����:%d �簢���Ǹ�����:%d", width,height,area);
		
		
		
		/*
		 * int width; //�� int height; //���� int area; //����
		 */		 		
		
		//(���� ���ص� ������ ����) ���� ���α׷��� ������ �����°Ŵϱ�
		scanner.close();//��ĳ�ʸ� �ݾ��ش�.
		
		  //�������
		  
		  
		  
		  
		 
		  
		 
		
		
	
		
		

	}

}

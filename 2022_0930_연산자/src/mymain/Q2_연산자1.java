package mymain;

import java.util.Scanner;

public class Q2_������1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����1
		//��������
		int My_Money; 	//���ұݾ�
		int Coffee; 	//����
		int Count; 		//����
		int Vat;		//�ΰ���
		int total;		//�Ѿ�
		int re_Money;   //�����ݾ�
		
		//�Էº�
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("======[����1]=======");
		//�����Է�
		System.out.print("������ ��	:");
		My_Money =scanner.nextInt();
		//Ŀ���Է�
		System.out.print("Ŀ�Ǳݾ� 	:");
		Coffee = scanner.nextInt();
		//�����Է�
		System.out.printf("����		:");
		Count = scanner.nextInt();
		
		//�ΰ���
		Vat = (int) ((Coffee*0.1) *Count);
		
		//��ǰ�Ѿ�
		total = Coffee * Count;
		
		//�Ž�����
		re_Money = My_Money - (total+Vat); 
		
		
		System.out.printf("�����ѵ�		:%d\n",My_Money);
		System.out.printf("Ŀ�Ǳݾ�		:%d\n",Coffee);
		System.out.printf("����			:%d\n",Count);
		System.out.printf("�ΰ���			:%d\n",Vat);
		System.out.printf("��ǰ�Ѿ�		:%d\n",total);
		System.out.printf("�Ž�����		:%d\n",re_Money);
		

		//�Է�����
		scanner.close();
	}

}

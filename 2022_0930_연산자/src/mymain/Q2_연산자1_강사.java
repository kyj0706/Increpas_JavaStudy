package mymain;

import java.util.Scanner;

public class Q2_������1_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��������
		int money; 	//���ұݾ�
		int cafe_moka= 3500; 	//����
		int count; 		//����
		int vat;		//�ΰ���
		int total;		//�Ѿ�
		int re_Money;   //�����ݾ�
		
		Scanner scanner = new Scanner(System.in);
		
		//�Է�
		System.out.print("�ݾ�");
		money = scanner.nextInt();
		
		System.out.print("����");
		count = scanner.nextInt();
		
		//���(�ΰ���/�Ѿ�/�ܾ�)
		vat = (cafe_moka *count)/10;
		total =cafe_moka*count+vat;
		re_Money =money-total;
		
		
		System.out.println("-------[������]-----");
		System.out.printf("�����ѵ�		:%d\n",money);
		System.out.printf("Ŀ�Ǳݾ�		:%d\n",cafe_moka);
		System.out.printf("����			:%d\n",count);
		System.out.printf("�ΰ���			:%d\n",vat);
		System.out.printf("��ǰ�Ѿ�		:%d\n",total);
		System.out.printf("�ܾ�			:%d\n",re_Money);
		
		scanner.close();
	}

}

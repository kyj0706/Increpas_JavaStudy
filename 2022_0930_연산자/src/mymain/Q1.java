package mymain;

import java.util.Scanner;

public class Q1 {
	
	//public static final int DAY_1 = 24;
	public static final int MIN_60 = 60;
	public static final int HOUR_60 = 3600;
	public static final int DAY_60 = 86400;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		
		Scanner scanner = new Scanner( System.in);
		
		//���� ����
		int total_sec; //��ü ��(sec)
		int im_sec;
		
		//��������
		int day 	=0; //��
		int hour 	=0; //��
		int min 	=0; //�� 
		int sec		=0; //��
		
		//int total 	=0;
		
		//�Է�
		System.out.printf("��(sec):");
		total_sec = scanner.nextInt();
		
		//�ӽú���
		im_sec = total_sec;
		
		
		
		
		//��
		day = im_sec / DAY_60 ;
		im_sec = im_sec % DAY_60;
		
		//��
		hour = im_sec / HOUR_60;
		im_sec = im_sec % HOUR_60;
		
		//��
		min = im_sec / MIN_60;
		im_sec = im_sec % MIN_60;
		
		//��
		sec = im_sec ;
		
		
		
		
		
		
		System.out.printf("%d�� %d�� %d�� %d��\n",day,hour,min,sec);
		
		
		System.out.println();
		System.out.printf("��%d : %d��\n",DAY_60 ,day );
		System.out.printf("��%d : %d��\n",HOUR_60 ,hour );
		System.out.printf("��%d : %d��\n",MIN_60 ,min );
		System.out.printf("��%d : %d��\n",sec ,sec );
		
		
		
		
		
		// ?�� ?�ð� ?�� ���� ����ϴ½� 
		
		
		
		
		
		scanner.close();
		

	}

}

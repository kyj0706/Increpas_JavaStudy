package mymain;

import myutil.MyInteger;

public class _05_�����������ڿ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int������
		//16���� : nibble
		//ǥ�� %x
		//���� ���� 4��Ʈ => 1  9 
		
		
		int birth_day = 0x19991225; 
		//����1
		System.out.println(MyInteger.toBinaryString(birth_day));
		//0001 1001 1001 1001 0001 0010 0010 0101
		// 1	9	 9	  9    1	2    2    5
		//2������ 4���� ������ 16����
		//2������ 3���� ������ 8����
		
		//����2
		//����Ʈ������ Ȱ��(2������)
		
		int year = birth_day >>>16;
		System.out.printf("����⵵ : %x\n", year);
		
		//����3
		//���� ���մϴ�.
		//&(AND)�� �غ��ô� _ �Ұſ���
		//���� 		 0x00199912  &   				0x00199912
		int month = birth_day >>8 & 0x000000ff; //&	0x000000ff
		System.out.printf("����� 	 : %02x\n", month);
		
		
		int day = birth_day & 0xff;
		System.out.printf("�����	 : %02x\n", day); // 0x000000ff ������ �����ֱ� ����.	
		
		// �������� ���������� �̷������� �ϴ°� �Դϴ� ~~~~   
		// ������ ��¥ǥ���� �̵����� �ƴϴϱ�
		
		//����4
		//�������ϰ� �ʹ�.
		// 19991225 > 19881225��  99�� ���� 19001225 > 89 �߰� 19891225
		//������ : ������ ������ -> ���ο �ֱ�
		//										0x19991225	9:1001 	5:0101
		birth_day = birth_day ^ 0x00990000;//^	0x00990000	9"1000	0:0000
										   //		00		  0001	  0101(����)
		System.out.printf("�⵵���� :%x\n", birth_day);
		
		//�߰�
		birth_day = birth_day | 0x00880000;
		System.out.printf("�⵵�߰� :%x\n",birth_day);
		
		//�غ���
		birth_day = birth_day ^ 0x00001225;
		birth_day = birth_day | 0x00001003;
		System.out.printf("�⵵���� :%x\n",birth_day);
		
	}

}

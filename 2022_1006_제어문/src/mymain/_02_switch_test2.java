package mymain;

import java.util.Random;

public class _02_switch_test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����(��������)
		Random random = new Random();
		
		//���� 1~ 20 ������ ��
		//+1��   ������ 0~19�����̱� ������ 1���� ���� ~20 �ϱ����ؼ�
		int month = random.nextInt(20)+1; //data����
		int last_day;	//���庯��
		
		
		
		//1	 2  3  4  5   6  7  8  9 10 11 12 <- month
		//31 28 31 30 31 30 31 31 30 31 30 31 <- last_day
		
		//����� ���� �������� default ó���Ѵ�.
		
		
		//�Ǳ��ϴµ� ������ �ִ�1
		//����1) data �̻��� ���� ���͵� ����� �ȴ�.
		//why ) default�� 31 �̶�
		
		//����ó��2
		//��ȿ��üũ
		if(month >=1 && month <=12) 
		{
			/*if������
				if(month==2) last_day = 28;
				else if(month==4 || month==6 || month==9 || month==11) last_day=30;
				else
					last_day = 31;
			*/
			switch(month)
			{
				case 2  : last_day = 28; break;
				case 4  : 
				case 6  :
				case 9  :
				case 11 : last_day = 30; break;
				default : last_day = 31;
			}
			System.out.printf("[%d]���� ��������¥�� [%d]���Դϴ�\n",month,last_day);
		}
		//����ó��
		else
		{
			System.out.printf("[%d]����(��) �����ϴ�. 1~12���̸� �Է����ּ���\n",month);
			
		}
	}

}

package mymain;

import myutil.Save;

public class MyMain_Save {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//����1 
		//static ������ ����������� Ȯ��
		System.out.printf("�������� : %.0f(%%)\n",Save.rate*100);
		
		//����2
		Save s1 = new Save("�ϱ浿", 1000000);
		Save s2 = new Save("�̱浿", 2000000);
		Save s3 = new Save("��浿", 3000000);
		
		
		s1.display();
		s2.display();
		s3.display();
		
		//���� ���� : 0.1 -> 0.2
		Save.rate = 0.048; //�׷��� �̷��� ����
		
		//static�� ���� �����̱� ������ �̷��Ե� �����ϴ� .
		//�Ǳ��ϴµ� ? �� static Ŭ���� �����ε� ... �̷��� ���°� �� ...�̶�� �˷���
		//s1.rate = 0.2;			
		
		System.out.printf("�������� : %.1f(%%)\n",Save.rate*100);
		
		//s1�� ����ݾ��� ����
		s1.setMoney(50000000);
		
		s1.display();
		s2.display();
		s3.display();
		
		
		
		
	}

}

package mymain;

public class _06_�Ϲݳ������ڿ���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ����˾ƺ���
		// ����1) 400�� ���
		// ����2) 4�� ����̸鼭 100�� ����� �ƴ� ��
		
		int year = 2022;
		
		
		//�����
				//����1   �Ǵ� ����2
		if((year%400==0)||(year%4==0 && year%100 !=0))
			System.out.printf("[%d]���� ����\n",year);
		else
			System.out.printf("[%d]���� ���\n.",year);
		
		//�����Ѱ�
//		if((year %4 ==0) && (year %100 !=0 ) || year % 400 ==0)
//			System.out.printf("[%d]���� �����Դϴ�.",year);
//		else
//			System.out.printf("[%d]���� ����Դϴ�.",year);

	}

}

package mymain;

public class _06_continue_break_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// continue : �ݺ��������� ���
		// 			: �ݺ����� ����� �����Ű�� ���� ��������� �̵���Ų��.

		
		
		int sum = 0;
		
		//����1
		//¦���� ��
		//���1
		for (int i=1; i <=10; i++) {

			if (i % 2 == 0) 

				sum = sum + i;
			
		} // for_end
		System.out.println(sum);
		
		//����2
		//���2)
		//��ɼ����ϱ� ����
		//���α׷��� ���������� ������!!!
		sum = 0; //�ʱ�ȭ
		for(int i=1; i<=10; i++) {
			if(i%2==1) continue;
			sum =sum +i;
		}
		System.out.println(sum);
		
		
		//����3
		//break : ���� �ݺ����� �����ض�(Ż��)
		//���ǽ��� ����� (true) �ν� ����� ���´� . �ٸ� .Stack Overflow ���Ͼ��
		//int ���� 21�� ��¼�� ��¼�� ����
		sum = 0;
		for(int i=1;  ; i++) {
			
			if(i>10) break; // ������ �����ϸ� ������
			
			sum= sum+i;
			
		}
		System.out.println(sum);
		
		
		
		
		
		
		

	}

}

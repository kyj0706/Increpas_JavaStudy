package mymain;

public class _04_while_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����4
		//for ����  while ���� �������� ��������
		//1. for 	: �ݺ�Ƚ���� ��Ȯ�� �˶�
		//2. while 	: �ݺ�Ƚ���� �𸦶�
		//    ex)Ű�����Է�, �����б�
		
		
		
		//����1
		//for���� ���ϴ��� �ݺ� �Ǵ� ���¸� �ٽ� ����
		//for���� ���´� �ͼ��ϴϱ� ��ų� ����
		for(int i=0; i<3; i++) {
			System.out.print("�ȳ�");
		}
		System.out.println();//�ٹٲٱ�
		
		
		//����2
		//for���� �̷��� �ᵵ �ȴ�.(for�� ��������  �ʱ�; ����; �������ε� �����ϴ� 
		//�������� ���� a�� ��ü �����ϴ�. 
		//�� !! �������� ���⶧���� a<3�� ���� ���� ���� ���ѷ��� ����
		//�ֿܼ����� Ȯ���� �ȵȴ� .��`~~�� ���� ���Ƽ�(���� �Ⱥ��̴°�)
		int a = 0;
		for (/*�ʱ�Ļ���*/ ; a<3; /*������ ����*/ ) {
			
			System.out.print("�ȳ�");
			a++;
		}
		System.out.println();//�ٹٲٱ�
		
		//����3
		int n = 0;						//�ʱ��
		while(n<3) { 					//���ǽ�
			System.out.print("�ȳ�");	//������
			n++;						//������
		}
		

	}

}

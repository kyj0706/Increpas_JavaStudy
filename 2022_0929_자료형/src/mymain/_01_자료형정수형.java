package mymain;

public class _01_�ڷ��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��¹��
		//1. println(����) 			: ������� �� �� �ٲٱ� (ln : line next =�ٹٲٱ�)
		//2. print(����) 			: ���븸 ���
			//->print fomat ��� ����ض� ��� �ǹ� 
		
		//3. printf("��¼���", ��) : ��¼��Ĵ�� ���� �־ ����ض�.
		
		
		//================
		//���� 2��
		System.out.print("==��������ϴ� ���α׷�==\n"); //\n : new line = �ٹٲٱ�
		//print�� �ٹٲٱⰡ �ȵȴٴ°� ���� 
		//�׷����� �ϰ� ������ \n�� �ϸ� �ȴٴ°��� �����ش�.
		
		//���� 1��
		int age = 20;
		System.out.printf("�� ���̴� %d��\n", age);
		
		//================
		//����3
		//�������̶�	: �Ҽ����� ���� �� = �����Ҽ���
		
		//�������ڷ���	: bate, short, int(�⺻��), long
		
		//���ǥ��		: 1 0 <- �⺻���� int �̱� ������ 4byte�� �޸𸮴� �Ҵ��Ѵ�.
		//				: 1L 0L <- long �� 8byte�� �Ҵ��Ѵ�.
		
		/*
		 * System.out.println(1); // 4byte System.out.println(1+1);//����� �Ǵµ� �̰� ��� ǥ���ǳ�
		 * -> �޸𸮿� ǥ���� �ȴ�.
		 * 
		 * System.out.println(1L);//8byte
		 */		
		
		//==================
		//����4
		//��¼���		: %d <- decimal(10���� ��¼���)
		//				: %o <- octal(8���� ��¼���)
		//				: %x <- hexa(16���� ��¼���)
		
		
		
		
		//��� = ������ �ʴ� ��
		//����4-4
		final int WIDTH = 1000; //final�� ������ ����� ���� !!����!!
		//WIDTH = 2000; // ���� ������ �� ������ ����
		//Eclipse �� ģ���ϰԵ� ������ 1���� �ɷ��ְ� �����ص� ������ �����شٴ� ���� �����ش�.
		//�������� : The final local variable WIDTH cannot be assigned. ��������ش�. 
		// final variable(����� ) cannot ������ �� �����ϴ� .=> �������� ���ش�.
		
		//���� = ���ϴ¼�
		int n = 100;
		System.out.printf("10����	: %d\n", n);//10���� ��� 
		System.out.printf(" 8����	: 0%o\n", n);//8���� ���
		System.out.printf("16����	: 0x%x\n", n);//16���� ���
		
		
		//����4-3
		n = 1000; //���� �����մϴ�.
		
		
		//����4-2
		//�ѹ��� �غ��ô�.  1  2   3     1  2  3
		System.out.printf("%d %o %x\n" , n, n, n);
		
		//����4-1
		//�� ������ 10������ ���
		System.out.printf("0144-> %d\n", 0144); //8����
		System.out.printf("0x64-> %d\n", 0x64); //16����
		
		//����4-5
		//�ڸ��� ���� ���
		int m = 123;
		// %nd = n <-��ü�ڸ���
		//[](�����) = �ڸ��� ���̸� ���� �ľ�&Ȯ���ϱ� ����
		System.out.printf("[%10d]\n", m);//Right����
		System.out.printf("[%-10d]\n", m);//Left����
		
		System.out.printf("[%010d]\n", m);//���ڸ��� 0���� ä���� Right �� ���� 
		
		//�׳��غ��°� ������ ������..
		System.out.printf("[%2d]\n", m);// ����ڸ��� > ��ü�ڸ��� = ��ü�ڸ��� ����
		
		
	}

}

package mymain;

public class _03_�����ڷ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ���� �ڷ��� : boolean
		// ��� 	: true(��) or false(����)
		// ��¼��� : %b(�ҹ���) %B(�빮)
		
		//����1
		boolean bOk = 3 > 2; 
		
		System.out.printf("3 > 2 => %b\n", bOk);
		System.out.printf("3 > 2 => %b(%B)\n", bOk ,bOk);
		
		
		//��ȣ������ ���� 
		//������ ������ �޶� flase �� �������Ѵ�.
		//���ڿ��� �̷��� �ϸ� �ȵȴ�. equals�̰ɷ� �ؾ��Ѵ�.
		//�׳� �� �غ��� ��Ȳ�̶� �غ��� .
		//��� if for�� ���ؼ� �����ڷ� �񱳸� ������ ������ ����� �ʾ����ϱ� ������� �̴�.
		
		bOk = "�ĸ�" == "��";
		System.out.printf("�ĸ��� ���� => %b\n",bOk);

	}

}

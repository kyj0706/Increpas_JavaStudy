package mymain;

public class _01_Sting�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1���� ������ �ϱ� ���ؼ� �Ѱ�
		//�޸𸮿� ��� ��ġ�� �Ǵ��� Ȯ���ϱ� ���ؼ� .
		
		
		//����1
		//1,�Ͻ����������
		String s1 = "Twinkle";
		String s2 = "Twinkle";
		

		//����2
		//�ּҺ�
		if(s1==s2) 
			System.out.println("�Ͻ��� Same");
		else
			System.out.println("�Ͻ��� Diff");
		
		//����3
		//2.������������
		String s3 = new String("Little Star");
		String s4 = new String("Little Star");
		
		//����4
		//�ּҺ�
		if(s3==s4)
			System.out.println("����� Same");
		else
			System.out.println("����� Diff");
		
		//����5
		//����
		if(s3.equals(s4))
			System.out.println("����� equals Same");
		else
			System.out.println("����� equals Diff");
		
		

	}

}

package mymain;

public class _02_String�Һ���Ư¡ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�ʱ��� ���� ������ �ʴ´�.
		//���ο���� �����Ǹ� �ʱ���� �������.
		
		
		//�Ͻ���
		//String s1 = "I Love You";
		//����� (����� ����)
		String s1 = new String ("I Love You");
		
		//����������� ���ο� String��ü�� ����
		s1 = s1 + " Yun-A";

		System.out.println(s1);
		
		String s2 = "abcd";
		
		String s3 =s2.toUpperCase();//�빮�ڷ� ��ȯ 
		
		//�빮�ڷ� ������ �ʴ´�.
		//�� ?  s2�� ������ ���ο� ��ü�� ����� �����̴�.
		System.out.println(s2);
		//�׷���  s3�� ���ο� ��ü�� �ް� s2 �� ����.
		System.out.println(s3);
	}

}

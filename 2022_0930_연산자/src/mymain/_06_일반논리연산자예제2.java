package mymain;

public class _06_�Ϲݳ������ڿ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�Ϲݳ������� ��������
		
		
		//���� : A(��) 90 ~ 100
		//		 B(��) 80 ~ 89
		//		 C(��) 70 ~ 79
		//		 D(��) 60 ~ 69 
		//		 F(��)    ~ 59
		
		//����1
		int kor = 89;
		String grade = "F";
		
		//120�� �Է��ϸ� 90�� �´µ� 100�� Ʋ����.
		//���� ���� 
		// && (AND)
		if(kor >=90 && kor <= 100) grade = "A";
		//int(���� ����) �̱⶧����
		//if(kor >=80 && kor <= 90) grade ="B"; // �̷��� �ص� �ȴ� . �ٸ� ��Ȯ�ϰ� �ϰ� ������ 
		if(kor >=80 && kor <= 89) grade ="B";
		if(kor >=70 && kor <= 79) grade ="C";
		if(kor >=60 && kor <= 69) grade ="D";
		if(kor >=0 && kor  <= 59) grade ="D";
		
		System.out.printf("���� :%d ��� :%s\n" , kor, grade);
		
		
	}

}

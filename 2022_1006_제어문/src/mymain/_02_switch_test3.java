package mymain;

public class _02_switch_test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�л������� �غ��ô�.
		// ����
		// ���
		// 90 ~ 100 : A
		// 80 ~ 89  : B
		// 70 ~ 79  : C
		// 60 ~ 69  : D
		// 60 ~ 59  : F
		
		//��������
		int kor = 101;
		String grade="F";
		if(kor >=0 && kor <=100) {
			//switch(����) �� �����ϴ� ! 
			switch(kor/10)
			{
				case 10	:
				case 9	: grade = "A"; break;
				case 8 	: grade = "B"; break;
				case 7	: grade = "C"; break;
				case 6 	: grade = "D"; break;
				default : grade = "F";
			}
			System.out.printf("[%d]�� ��� :[%s]\n", kor, grade);
		
		}else {
			System.out.printf("�Էµ����� kor[%d]�� 0~100������ ���̿����մϴ�.\n",kor);
		}
	}

}

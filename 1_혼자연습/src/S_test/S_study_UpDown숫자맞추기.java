package S_test;

import java.util.Random;
import java.util.Scanner;

public class S_study_UpDown���ڸ��߱� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��ǻ�Ͱ� 1~100 �� ���� ���� �ϳ��� ���մϴ�. �� ���ڸ� �����ּ���.
		//1~100 ���� �Է�:50 DOWN
		
		//��������
		int num; //�����Է�
		int res; //���庯��
		
		Random random = new Random();
		//Ű�����Է�
		Scanner scanner = new Scanner(System.in);
		
		
		res = (int) (Math.random() * 99+1);
		
		while(true) {
			System.out.print("1~100 ���� �Է�:");
			num = scanner.nextInt();
			if(res < num) {
				System.out.print("Down");
			}else if (res > num) {
				System.out.print("Up");
			}else {
				System.out.printf("[%d]������ ����\n ����",res+1);
				break;
			}
			res++;
			System.out.printf("\n[%d]��° �õ���\n",res);
		

		}
		scanner.close();
		//�Է�����
	}
}

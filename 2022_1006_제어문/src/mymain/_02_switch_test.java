package mymain;

import java.util.Scanner;

public class _02_switch_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�Է¼���1
		Scanner scanner = new Scanner(System.in);
		
		//��������2
		String data;	//���ϸ�
		String res;		//�������
		
		//�Է�3
		System.out.print("���ϸ�:");
		data = scanner.next(); //���ڿ� �Է¹ޱ� 
		
		//���Ͽ� ���� ���� ��������� �ִ´�4
		//switch(���� �Ǵ� ����)5
		
		switch(data)
		{
			case "����" 	: res = "�޴�";		break;
			case "����" 	: res = "�ÿ��ϴ�"; break;
			case "����" 	: res = "���ִ�."; 	break;
			case "����" 	: res = "�˾Ƶ�";	break;
			default			: res = "������";
			
		}
		
		System.out.printf("[%s]�� [%s]\n" ,data,res);
		
		
		
		
		
		//�Է�����
		scanner.close();

	}

}

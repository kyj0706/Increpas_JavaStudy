package mymain;

import java.util.Scanner;

public class Q2_�����������_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		char ch;
		System.out.print("���� 1���� �Է��ϼ���>>");
		//     0123
		//    "ABCD"
		ch = scanner.next().charAt(0);//���ڿ��߿��� ù��°���� ������
		
		if( ch>='A' && ch<='Z')
		   System.out.printf("�빮�� [%c]�Դϴ�\n", ch);
		else if( ch>='a' && ch<='z' )
			System.out.printf("�ҹ��� [%c]�Դϴ�\n", ch);
		else if( ch>='0' && ch<='9' )
			System.out.printf("���ڹ��� [%c]�Դϴ�\n", ch);
		else if( ch==' ' || ch=='\t' || ch=='\r' || ch=='\n')
			System.out.println("ȭ��Ʈ �����Դϴ�");
		else
			System.out.printf("��Ÿ ���� [%c]�Դϴ�\n", ch);
		
		
		scanner.close();
	}

}

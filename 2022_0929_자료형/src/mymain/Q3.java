package mymain;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ű����κ��� �Է��� �޾� ���ô�.
		//
		
		Scanner scanner = new Scanner(System.in);
		// ���� �����մϴ�.
		
		
		String name;		//�̸�
		int age;			//����
		double body_length;//Ű
		boolean bMarride;	//��ȥ
		String addr;		//�ּ�
		
		
		System.out.println("===����� ���������� �Է��ϼ���===");
		
		//�̸�
		System.out.print("�̸���?:");
		name=scanner.next();	//���ڿ� �������
		//name=scanner.nextLine();//���ڿ� ��������
		
		//����
		System.out.print("���̴�? :");
		age=scanner.nextInt();
		
		//Ű
		System.out.print("���� :");
		body_length=scanner.nextDouble();
		
		//��ȥ
		System.out.print("��ȥ :");
		bMarride=scanner.nextBoolean();
		
		//����1
		//�Է� ������ ������ ������ �´�. (enter ������) => �Է�(scanner)+ender(�Է±�����)
		//next()
		//nextLine()
		//nextDouble()
		//nextBoolean()
		// enter �� ���´�.
		
		
		//�� nextLine�� enter�� ���Ƽ�. ������ ����. �׷��� !  ����� �ȵǴ� .
		
		//����2
		//�ּ�
		//�Է±����ڸ� �����ϱ� ���� (����)
		//�ٷ��Է��� �ȵɲ���.
		//Ű������� (�ӽ������)
		//�Է±����ڱ����� ������ �´�  
		System.out.print("�ּҴ�? :");
		
		scanner.nextLine(); // ����3 �׷��� ������ enter(�Է±�����)�� ������ ���� �뵵.
		addr=scanner.nextLine(); //����4 �ٽý���
		
		//���1
		System.out.printf("�̸� : %s\n",name);
		System.out.printf("���� : %d(��)\n",age);
		System.out.printf("���� : %.1f(��)\n",body_length);
		System.out.printf("��ȥ : %b\n",bMarride);
		System.out.printf("�ּ� : %s\n",addr);
		
		
		//���2
		System.out.printf(" �̸�:%s\n ����:%d\n Ű:%.1f\n ��ȥ:%B\n �ּ�:%s\n",name,age,body_length,bMarride,addr );
		
		scanner.close();

	}

}

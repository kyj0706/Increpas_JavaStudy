package mymain;

import java.util.Scanner;

public class _05_dowhile_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1ȸ�� ���α׷� 
		
		//����1
		//�Էº�
		Scanner scanner = new Scanner(System.in);
		
		//����2
		int dan;//�����ܼ�
		String yn = "y"; //����y
		
		//����3
		//�������1
		do  
		{
			
				System.out.print("��?");
				dan = scanner.nextInt();
			
			//����7
			//dan : 2~9���̰�?
				
			// if(dan<2 || dan>9) ����
			if( !(dan >=2 && dan<=9) ) {
				System.out.println("���� ���� 2~9���̸� �Է��ϼ���");
				continue;//���� ��� �����Ű�� �������� �����ض� ������ �ٽ� ó�� ���� 
			
			}//if_end
			
			//������ ���
			System.out.printf("---[%d]�� ����---\n",dan);
			
			
			
			//����4
			//������for��
			for(int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %2d\n",dan, i ,dan*i);
				
				
			}//for_end
			
			//����5
			//���ҷ� ?
			System.out.print("��?(y/n)");
			//scanner�� ���ڿ� 1���� �޴´� ?  =>�ϴ� ������
			// "y" "Y" ��ҹ��� ���� �Ұǵ� ? => ó���ؾ��Ѵ�.
			yn =scanner.next();//���ڿ� �Է¹ޱ� "y", "Y"
			
			//���ڿ� �񱳴� equals ����Ѵ�.
			// yn=="y" (X)  yn.equals("y") (O)
			
		}//do_end
		
		//����6
		//�������2
		while(yn.equals("y") || yn.equals("Y"));
		
		
		System.out.println("---End---");
		
		
		
		
		
		//�Է�����
		scanner.close();

	}

}

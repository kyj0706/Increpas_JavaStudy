package mymain;

import java.io.IOException;

public class _04_while_test2_keyboard {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		//����1
		// Ű���� ���۷� ���� 1byte�� ������ �´� 
		// ABC ��� ASCII�ڵ忡 ���� => 65, 66 , 67
		// 65�о� => 65���� => 66�о� 
		
		// ����1)
		// while �� ��� ���ҳ�?
		// I am Tom (enter) =>  10���̶�°Ŵ� .
		// ��??? ����1byte + ����1byte+ ����(\r \n)�� ��1byte �̱� ������
		
		// ����1)
		// �ݺ�Ƚ���� �����ڰ� �˼��� ���� => �� ? ����ڰ� ��� ���� �˰� ;;;
		
		// ��Ȳ)
		// ��Ŭ������ ctrl + z�� ����� �ȵɼ��� �ִ� .. �׷��� �͹̳η� �غ��°� 
		int ch;
		int count= 0;
		
		
		System.out.println("���ڸ� �Է��ϼ���(����:Ctrl+Z)");
		
		
		while(true) {
			
			//Ű���� ���۷κ��� 1byte�о����
			ch=System.in.read();
			
			
			//�������� : ctrl + Z
			if(ch==-1) break; //break <- ���� �ݺ����� ����(Ż��)�Ѵ�.
			
			count++;
			//�о�� ���� ���
			System.out.printf("%c", ch);
			
			
		}
		
		System.out.printf("�ݺ�Ƚ����:%d(ȸ)\n",count);
		
		System.out.println("--Edn---");
			

	}

}

package mymain;

import java.io.IOException;

public class Q2_�����������_13_�� {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("�����͸� �Է��ϼ���. �������� [Ctrl]+z�� ��������.");
		
		int alpha_count=0; //���ĺ�����
		int number_count=0;//���ڰ���
		int white_count=0;//ȭ��Ʈ���ڰ���
		int etc_count=0; //��Ÿ
		
		
		int ch;		
		while(true) {
			
			ch= System.in.read();//Ű������� 
			
			
			
			if(ch==-1) break;//����
			
			//���ĺ� üũ (�빮�ڷ� ��ȯ���Ѽ� ��)
			if(Character.toUpperCase(ch)>='A' && Character.toUpperCase(ch)<='Z')
				alpha_count++;
			else if(ch>='0'&& ch<='9')
				number_count++;
			else if(ch==32 || ch=='\t' || ch=='\n' || ch=='\r')
				white_count++;
			else
				etc_count++;
			
			
				
				
			System.out.printf("%c",ch);
		}
			System.out.printf("���ĺ� ���� 	:%d\n",alpha_count);
			System.out.printf("���� ���� 	:%d\n",number_count);
			System.out.printf("ȭ��Ʈ ���� 	:%d\n",white_count);
			System.out.printf("Ư�� ��ȣ 	:%d\n",etc_count);
	}

}

package mymain;

public class _05_String���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= " aaa ";
		
		//null �ƹ����� ������ ���� �ʴ�.
		String msg = null;
		msg = s1.replaceAll("aa", "b");		
		System.out.printf("msg : %s\n" ,msg);
		
		
		//�빮�ڷ� ����
		msg = s1.toUpperCase();
		System.out.printf("msg : %s\n" ,msg);
		
		//��������
		msg = s1.trim();
		System.out.printf("[%s]->���������� ����:[%s]\n",s1,msg);
		
		
		//String.valueOf(��) : �� -> String���� ����
		msg =String.valueOf(s1.length()); // 5-> ���ڿ� "5" �� �����
		msg = String.format("%d", s1.length()); //����.
		
		
		System.out.printf("msg : [%s]\n",msg);
		

	}

}

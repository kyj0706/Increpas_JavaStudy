package mymain;

public class _03_String�Һ���Ư¡ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count =0;
		
		String msg = ++count + " little," + ++count + " little," + ++count + " little Indian";
		
		System.out.println(msg);
		System.out.println(msg.length()); //���ڿ� ���� ���
		
		
		
		//�ذ���
		//StringBuffer()
		StringBuffer sb = new StringBuffer(33);
		
		count =0;
		sb.append(++count);
		sb.append(" little,");
		sb.append(++count);
		sb.append(" little,");
		sb.append(++count);
		sb.append(" little Indian");
		
		
		//StringBuffer���� ���� String���� ����
		String msg1 = sb.toString();
		
		System.out.println(msg1);
		System.out.println(msg1.length());
		
		//�ذ���2 : String.format() <- ���Ŀ� ���� ���ڿ� ����
		
		int age = 30;
		System.out.printf("���̴� : %d(��)\n",age); //format���� ������ ȭ������ ����ض�
		
		//Ŭ���� ������ 
		//static �޼ҵ�
		String str = String.format("���� : %d(��)\n", age);//format���� ������ ���ڿ��� ���(����)�ض�
		
		count = 0;//�ʱ�ȭ
		String msg2 = String.format("%d little,%d lettle,%d lettle Indian",++count, ++count, ++count);
		System.out.println(msg2);
		
	}

}

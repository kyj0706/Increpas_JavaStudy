package mymain;

public class _04_�������ڷ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//������ �ڷ��� : char
		//��� 			: '��'	'A'		'��'
		//��¼���		: %c	
		
		//�˾ƾ��Ұ�
		//ASCII( American Standard Code for Information Interchange)
		//Ű����� �ִ� ���ڸ� ���ڷ� ǥ���� �� �� 
		//���ڸ� �����ϴ� ��찡 ���� �� �ִ� �׷��� ����� �˰� �־�� �Ѵ�.
		
		//==========================================
		//0~31		: ��� �� ���� ����
		//31~126	: �Ϲݹ���
		//'A' = 65 	'a' = 97  ���� 32 [��ҹ��� �ٲ� �� + - �ϸ�ȴ�]
		//'0' = 48 	'1' = 49
		//'����' = 32
		
		//����1
		//����� ���� ��� �� �� �ִ�
		//�ΰ� ǥ���� A�� ������ ��ǻ�ʹ� 65�� �ν��Ѵ�.
		
		//char ch = 'A';
		char ch = 65;//65��� �Ҽ� �ִ�.
		System.out.printf("ch=%c\n", ch);
		
		//����2
		ch = 'a';
		System.out.printf("ch=%c\n", ch);
		
		//����3
		//�ѱ��� ��� ? 
		ch = '��';
		System.out.printf("ch=%c\n", ch);
		//ASCII �ڵ尡 ���� ~ ?? 
		//�̷��� �ϸ� �������� . �� ? 
		// %d�� ���� ����ε� ��  char����? ....  ���信���� ����. d != java.lang.Character
		//System.out.printf("ch=%c(code:%d)\n", ch, ch);
		//�׷��� (int)�� ���� ����ȯ�� ��Ų�� .
		System.out.printf("ch=%c(code:%d)\n", ch, (int)ch);
		//�ڵ带 �ȴٸ� �̷��� �ص� �ȴٴ� ���̴�.
		System.out.printf("ch=%c\n", 54620);
		
		/* �غ��� �ǰ� ���ص� �ǰ� . 
		 * //�׷��� ���̸� char K = '��'; char Y = '��'; char J = '��';
		 * System.out.printf("��=code:%d\n",(int)K);
		 * System.out.printf("��=code:%d\n",(int)Y);
		 * System.out.printf("��=code:%d\n",(int)J);
		 */
		
		//�����(�̷��� �ִ� ~~�� �˰� ������ȴ�.)
		//\n : new line(Enter) => �̰͵� ����ڴ� = �ٹٲٱ� 
		//\r : carrige return(Home) \r\n[���̾���] =>���� ���ο� ���������� ����
		//\t : tab
		//\b : left arrow [��Ŭ���� �Ұ� �ܺ� �͹̳ΰ���]
		//\f : line feed [�׽�Ʈ �Ұ�]
		
		//����4
		//���ڿ��� double quotation
		//���� 1���� Single �����̼�
		System.out.println("A\nB\nC\n"); //\n
		System.out.println("A\tB\tC\t"); //\t
		System.out.println("ABC\b\bX\n"); //��Ŭ���������� \b�� �ȵȴ�. �͹̳�(�ܺ�)���� ����ȴ�. ���= AXC
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

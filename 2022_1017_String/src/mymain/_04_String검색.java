package mymain;

public class _04_String�˻� {
	
	public static void main (String[] args) {
		
		//			 01234567890  <= index(����)
		String s1 = "Kwon Sun Ae";
		
		//���ڿ��� ����(n)�� ��ġ
		int index = s1.indexOf('n');
		System.out.printf("�� ó�� ������ n�� ��ġ : %d\n",index);
		
		//���ڿ��� ���ڿ�("Sun")�� ��ġ
		index = s1.indexOf("Sun");
		System.out.printf("���� Sun�� ��ġ : %d\n",index);
		
		//���ڿ��� ����(n)�� ���ʺ��� �˻�
		index = s1.lastIndexOf('n');
		System.out.printf("������ ���� n�� ��ġ :%d\n",index);
		
		//���ڿ��� ���� 1�� ����
		char c= s1.charAt(index);
		System.out.printf("index=%d��° ������ ���� :%c\n",index,c);
		
		//'S'�� ��ġ ���Ѵ�.
		index = s1.indexOf('S');
		
		//���ڿ��� ���ڿ��� ����
		String str = s1.substring(index);
		System.out.printf("�빮�� S�κ��� ������ �߷����� : [%s]\n", str);
		
		//                 ����(����) ~ +����
		str = s1.substring(index, index+3);
		System.out.printf("�빮�� S�κ��� 3���� �߶󳻱� : [%s]\n",str);
		
		
	}

}

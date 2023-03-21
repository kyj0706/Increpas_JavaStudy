package myutil;

public interface BaseCalc {
	
	//interface���� : ��� / �߻�޼ҵ� / default �޼ҵ�(JDK1.8 later)
	
	
	//����޼ҵ�
	//��1) �׳��غ��°�
	double PI = 3.14; //�� ? ���� �ֱ淡 �ȵǴ��� ����
	//���� : �̷��� ������ �Ʒ�ó�� �ν��� �Ѵٴ� ��(���ó���ȴ�.)
	public static final double PI2 =3.141592;
	
	
	//�߻�޼ҵ�
	int plus(int a, int b); //����� �����ϴ� 
	//���� : �̷��� ������ �Ʒ�ó�� �ν��� �Ѵٴ� ��(�߻�ȭó��)
	public abstract int minus(int a, int b);
	
	
	//default �޼ҵ�
	//(JDK1.8 later)
	default int multiply(int a, int b) {return a*b;};
}

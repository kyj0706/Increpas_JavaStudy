package myutil;

public class Child extends Parent { //Parent�� ��ӹ���

	int c_money;
	
	public Child() {
		//����������  super();�� ����
		
		//����͸� ��
		System.out.println("--Child()--");
		c_money = 5000;
	}

	//�����ε�
	public Child(int c_money) {
		super();
		System.out.println("--Child(c_money)--");
		this.c_money = c_money;
	}
	
	
	public Child(int c_money, int p_money) {
		
		super(p_money); //�޼ҵ�
		System.out.println("--Child(c_money,p_money)--");
		//super.p_money = p_money;
		this.c_money =c_money;
	}
	
	public void display() {
		System.out.println("=======================");
		
		super.diaplay();//����
		System.out.printf("Child's  money 	: %d\n",c_money);
		System.out.printf("Total 	 money 	: %d\n",c_money+p_money);
	}
	
}

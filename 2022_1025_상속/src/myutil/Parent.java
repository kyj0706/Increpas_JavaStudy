package myutil;

public class Parent { /*�ڹ��� ��簴ü��  extends Object*/

	
	protected int p_money;
	
	
	//�⺻������
	public Parent() {
		// TODO Auto-generated constructor stub
		
		System.out.println("--Parent()--");
		p_money = 1000;//�ʱⰪ
	}

	//�����ε�
	public Parent(int p_money) {
		//�θ�ü
		super(); //Object()�����Ѵ�.		
		System.out.println("--Parent(p_money)--");
		this.p_money = p_money;
	}
	
	public void diaplay() {
		System.out.printf("Prarnt's money  : %d\n", p_money);
	}
	
}

package myutil;

public class Save {
	
	//����1
	// instance ����
	//1. �����ñ� : ��ü(instance)�� �����Ǹ� �����Ǵ� ����
	private String name; 	//�������̸�
	private int 	money;	//����ݾ�
	
	//����2
	//����(static) ����
	//1. �����ñ� : ���α׷� ���۽�
	//2. �� ��ü�� ��������	
	public static double rate =0.1;
	
	//����4
	//�⺻������
	public Save() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	//����3
	//������
	//�����ڸ� ������ ������ �⺻�����ڸ� ������ => �����ε带 ���Ÿ� �׳� ������ �⺻������.
	public Save(String name, int money) {
		
		this.name = name;
		this.money = money;
	}

	
	
	//����5
	public String getNeme() {
		return name;
	}


	public void setNeme(String name) {
		this.name = name;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}
	
	
	//���������� ����� �޼ҵ�
	public void display() {
		
		System.out.printf("�̸�:[%s] �����:[%10d] �����[%10.0f]\n",name,money,money*rate);
		
		
	}
	
	
	
	
	
	
}

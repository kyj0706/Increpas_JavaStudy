package myutil;

public class Child extends Parent { //Parent를 상속받음

	int c_money;
	
	public Child() {
		//묵시적으로  super();가 존재
		
		//모니터링 용
		System.out.println("--Child()--");
		c_money = 5000;
	}

	//오버로드
	public Child(int c_money) {
		super();
		System.out.println("--Child(c_money)--");
		this.c_money = c_money;
	}
	
	
	public Child(int c_money, int p_money) {
		
		super(p_money); //메소드
		System.out.println("--Child(c_money,p_money)--");
		//super.p_money = p_money;
		this.c_money =c_money;
	}
	
	public void display() {
		System.out.println("=======================");
		
		super.diaplay();//변수
		System.out.printf("Child's  money 	: %d\n",c_money);
		System.out.printf("Total 	 money 	: %d\n",c_money+p_money);
	}
	
}

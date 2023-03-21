package myutil;

public class Parent { /*자바의 모든객체는  extends Object*/

	
	protected int p_money;
	
	
	//기본생성자
	public Parent() {
		// TODO Auto-generated constructor stub
		
		System.out.println("--Parent()--");
		p_money = 1000;//초기값
	}

	//오버로드
	public Parent(int p_money) {
		//부모객체
		super(); //Object()를말한다.		
		System.out.println("--Parent(p_money)--");
		this.p_money = p_money;
	}
	
	public void diaplay() {
		System.out.printf("Prarnt's money  : %d\n", p_money);
	}
	
}

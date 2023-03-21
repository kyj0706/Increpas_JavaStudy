package myutil;

public class Save {
	
	//순서1
	// instance 변수
	//1. 생성시기 : 객체(instance)가 생성되면 생성되는 변수
	private String name; 	//저축자이름
	private int 	money;	//저축금액
	
	//순서2
	//정적(static) 변수
	//1. 생성시기 : 프로그램 시작시
	//2. 각 객체별 공유변수	
	public static double rate =0.1;
	
	//순서4
	//기본생성자
	public Save() {
		
		// TODO Auto-generated constructor stub
	}
	
	
	//순서3
	//생성자
	//생성자를 생성시 무조건 기본생성자를 만들어라 => 오버로드를 쓸거면 그냥 만드들어 기본생성자.
	public Save(String name, int money) {
		
		this.name = name;
		this.money = money;
	}

	
	
	//순서5
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
	
	
	//저축정보를 출력할 메소드
	public void display() {
		
		System.out.printf("이름:[%s] 저축액:[%10d] 저축액[%10.0f]\n",name,money,money*rate);
		
		
	}
	
	
	
	
	
	
}

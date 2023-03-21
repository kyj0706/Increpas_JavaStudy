package myutil;

public class AnimalTest_t {

	boolean live;
	int age;
	String name;
	
	//기본생성자
	public AnimalTest_t() {
		// TODO Auto-generated constructor stub
	}
	
	//생성자
	public AnimalTest_t(String name, int age, boolean live) {
		super();
		this.name = name;
		this.age = age;
		this.live = live;
	}
	
	public void display() {
		
		
		System.out.println("--[Animal]--");
		System.out.printf("이    름 : %s\n",name); 
		System.out.printf("나    이 : %d\n",age); 
		System.out.printf("생존여부 : %b\n",live); 
	}
	
	
	
	
	//getset
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}

package myutil;

public class AnimalTest_t {

	boolean live;
	int age;
	String name;
	
	//�⺻������
	public AnimalTest_t() {
		// TODO Auto-generated constructor stub
	}
	
	//������
	public AnimalTest_t(String name, int age, boolean live) {
		super();
		this.name = name;
		this.age = age;
		this.live = live;
	}
	
	public void display() {
		
		
		System.out.println("--[Animal]--");
		System.out.printf("��    �� : %s\n",name); 
		System.out.printf("��    �� : %d\n",age); 
		System.out.printf("�������� : %b\n",live); 
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

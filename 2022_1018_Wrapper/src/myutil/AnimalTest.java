package myutil;

public class AnimalTest {

	private boolean live;
	private int age;
	private String name;

	// 기본생성자
/*
	public AnimalTest() {

	}

	// 정보담을 녀석

	public AnimalTest(boolean live, int age, String name) {
		super();
		this.live = live;
		this.age = age;
		this.name = name;
	}
*/
	public String getName(int age, String name) {
		
		this.name = name;
		this.age =age;
		
		return name;
	}

	public String setName(String name) {

		return this.name = name;
	}

	public void getLive(boolean live) {
		this.live = live;
	}

	public void display() {

		System.out.printf("동물: [%s] 나이:[%d] 생존:[%b]\n", name, age, live);
	}

}

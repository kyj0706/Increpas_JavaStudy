package myutil;

public class AnimalTest {

	private boolean live;
	private int age;
	private String name;

	// �⺻������
/*
	public AnimalTest() {

	}

	// �������� �༮

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

		System.out.printf("����: [%s] ����:[%d] ����:[%b]\n", name, age, live);
	}

}

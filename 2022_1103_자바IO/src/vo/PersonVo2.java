package vo;

import java.io.Serializable;

/*
 	직렬화 가는객체로 선언
 		1.Serializable interface 선언
 		2.getter / setter 반드시 있어야 함 !
 		3.기본생성자는 무조건 선언(생성자를 모두생략 하던지)
 			why? 없으면 JVM이 기본생성자를 알아서 만들어 준다. 
 			근데... 인자담긴 Overload 생성자를 생성시 JVM이 있는걸로 간주하고 자동생성이 안된다. 
 */


public class PersonVo2 implements Serializable {
	
	String name;
	transient int age; //제외하기
	String addr;
	
	
	//기본생성자
	public PersonVo2() {
		// TODO Auto-generated constructor stub
	}
	
	//생성자
	public PersonVo2(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[%s, %d, %s]", name,age,addr);
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	

}

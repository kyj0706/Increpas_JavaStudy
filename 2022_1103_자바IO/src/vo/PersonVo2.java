package vo;

import java.io.Serializable;

/*
 	����ȭ ���°�ü�� ����
 		1.Serializable interface ����
 		2.getter / setter �ݵ�� �־�� �� !
 		3.�⺻�����ڴ� ������ ����(�����ڸ� ��λ��� �ϴ���)
 			why? ������ JVM�� �⺻�����ڸ� �˾Ƽ� ����� �ش�. 
 			�ٵ�... ���ڴ�� Overload �����ڸ� ������ JVM�� �ִ°ɷ� �����ϰ� �ڵ������� �ȵȴ�. 
 */


public class PersonVo2 implements Serializable {
	
	String name;
	transient int age; //�����ϱ�
	String addr;
	
	
	//�⺻������
	public PersonVo2() {
		// TODO Auto-generated constructor stub
	}
	
	//������
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

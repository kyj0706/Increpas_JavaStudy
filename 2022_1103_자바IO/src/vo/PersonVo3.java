package vo;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

/*
  직렬화 가능객체로 선언
  1.Serializable interface 선언
  2.getter/setter 반드시 있어야 함
  3.기본생성자는 무조건 선언(생성자를 모두 생략하던지)
*/
public class PersonVo3 implements Externalizable{

	String name;
	int    age; 
	String addr;
	
	//default constructor
	public PersonVo3() {
		// TODO Auto-generated constructor stub
	}
	
	public PersonVo3(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("[ %s , %d , %s ]", name,age,addr);
		
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

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(name);
		out.writeInt(age);
		out.writeObject(addr);
		
	
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		name = (String) in.readObject();
		age  = in.readInt();
		addr = (String) in.readObject();
	}
	
	
		
}

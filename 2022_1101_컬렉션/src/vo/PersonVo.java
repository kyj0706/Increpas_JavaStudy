package vo;

/*
  	VO (Value Object)
  	1. 값을 저장관리하는 객체
  	2. DTO(Data Transfer Object) : 데이터 전달객체
  		TO(Transfer Object)
  	
  	3. DTO (read/write)   VS   VO (read) 이렇게 정의하기도 한다. (정의를 굳~~~이 한다면?)[의미를 두지말아라]
  	
  	4. VO 내에 Getter /Setter 생성[무조건]
  	
 */


//개인정보를 관리하는 객체
//기본적으로 Object를 상속 받기 때문에 출력시 해시값이 가지고 온다.
public class PersonVo /*extends Object*/ {
	
	String 	name;
	int 	age;
	String	addr;
	
	//생성자는 처음부터 생성하지 말던지 
	//Overload 생성자가 존재하면 기본생성자는 무조건 생성 
	//기본생성자
	public PersonVo() {
		// TODO Auto-generated constructor stub
	}
	
	//생성자
	public PersonVo(String name, int age, String addr) {
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

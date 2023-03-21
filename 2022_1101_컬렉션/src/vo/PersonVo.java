package vo;

/*
  	VO (Value Object)
  	1. ���� ��������ϴ� ��ü
  	2. DTO(Data Transfer Object) : ������ ���ް�ü
  		TO(Transfer Object)
  	
  	3. DTO (read/write)   VS   VO (read) �̷��� �����ϱ⵵ �Ѵ�. (���Ǹ� ��~~~�� �Ѵٸ�?)[�ǹ̸� �������ƶ�]
  	
  	4. VO ���� Getter /Setter ����[������]
  	
 */


//���������� �����ϴ� ��ü
//�⺻������ Object�� ��� �ޱ� ������ ��½� �ؽð��� ������ �´�.
public class PersonVo /*extends Object*/ {
	
	String 	name;
	int 	age;
	String	addr;
	
	//�����ڴ� ó������ �������� ������ 
	//Overload �����ڰ� �����ϸ� �⺻�����ڴ� ������ ���� 
	//�⺻������
	public PersonVo() {
		// TODO Auto-generated constructor stub
	}
	
	//������
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

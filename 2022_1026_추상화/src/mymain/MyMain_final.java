package mymain;

//final�� 3������ �ִ�.
//1.���� : ���
//2.�޼ҵ� : ���̻� Override ������
//3.Ŭ���� : ���̻� ��� ������

//========================================================

//1. final ���� : �������
//	 => �����տ� ���� ����� �����ϴ°Ŵ�.
//      =>���:
//���� : final double PI = 3.14 

class MyClass{
	//�������
	public static final double PI = 3.14;
}

//========================================================

//2. final �޼ҵ� : ���̻� ������(Override)���� ���ƶ�
//���� : final void �޼ҵ�(){}

class A{
	void sub() {}
}
class B extends A{
	@Override
	final void sub() {}
}
final class C extends B{
	//@Override
	//void sub() {}
}

//========================================================

//3. final Ŭ���� : ���̻� ������� ���ƶ�
//���� : final Class A

//class D extends C{}


//========================================================

//3_2. String�� final class �̱⶧���� ������ ����.
//class MyString extends String() {}




public class MyMain_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MyClass.PI = 3.141592;

	}

}

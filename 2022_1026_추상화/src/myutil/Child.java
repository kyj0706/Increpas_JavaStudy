package myutil;

//����4 : extends Parent ��� ����
public class Child extends Parent {

	//��5	: Override(������)
	//			=> �θ� ���� �޼ҵ带 �ٽ�����
	//			����1) �޼ҵ�� + �������� ��� �����ؾ���
	//			����2) ���������ڴ� ũ�ų� ���ƾ� �Ѵ�.
	//			ũ���) private < default < protected < public
	
	//��6_2 : �ּ� //  /* */
	//����  => �����ڸ� ���� �ּ�
	
	//��6_1 : @�� ����� �ϴ��� ?
	//			=>Annotation
	//����	=> ���α׷��� ���� �ּ� 
	//		=> java�� JVM�� ���� �ּ�
	
	
	@Override
	public void sub() {
		// TODO Auto-generated method stub
		//super.sub();
		System.out.println("--Child.sub()--");
	}
	
	
}

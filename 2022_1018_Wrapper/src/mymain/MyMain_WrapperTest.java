package mymain;

import java.util.ArrayList;

public class MyMain_WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Wrapper class : �⺻���ڷ���(primitive type)�� ��ü������ ������ Ŭ����
		
		//1. �ڹ��� �÷����� ��ü�� ������� �� �� �ֵ�.
		
		ArrayList list = new ArrayList(); //���� ���� ���ϱ� �� �˾Ƶֶ� ������ ����� �ʴ�.
		
		//Auto_Boxing(�ڵ�����) : JDK 5.0 later ����
		//java version�� �ٿ���� compile �غ���.
		//list.add(Integer.valueOf(10));// 10  -> new Interger(10)
		list.add(10);
		
		Integer i0b = 100; // 100 -> Interger.valueOf(100)
		
		
		 //������ �ȵȴ� . ��?  int = Interger �̱� ������
		//Auto_Unboxing�� ���ش�.
		int n= i0b; 	//i0b.intValue();
		double d = i0b;//i0b.doubleValue();
		
		
		String s1 = "10.5";
		double d1 = Double.parseDouble(s1); //"10.5 ->0.5
		Double d0b = Double.valueOf(s1);
		
		int n1 = d0b.intValue();
		
		double d2 = d0b;
		
		//�̷��� �־���.
		char ch ='a';
		if(Character.toUpperCase(ch)=='A')
			System.out.println("A��");
		
		
		
	}

}

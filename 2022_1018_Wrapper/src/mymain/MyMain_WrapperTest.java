package mymain;

import java.util.ArrayList;

public class MyMain_WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Wrapper class : 기본형자료형(primitive type)을 객체형으로 생성한 클래스
		
		//1. 자바의 컬렉션은 객체만 저장관리 할 수 있따.
		
		ArrayList list = new ArrayList(); //가장 많이 쓰니깐 잘 알아둬라 하지만 어렵지 않다.
		
		//Auto_Boxing(자동포장) : JDK 5.0 later 지원
		//java version을 다운시켜 compile 해본다.
		//list.add(Integer.valueOf(10));// 10  -> new Interger(10)
		list.add(10);
		
		Integer i0b = 100; // 100 -> Interger.valueOf(100)
		
		
		 //원래는 안된다 . 왜?  int = Interger 이기 때문에
		//Auto_Unboxing을 해준다.
		int n= i0b; 	//i0b.intValue();
		double d = i0b;//i0b.doubleValue();
		
		
		String s1 = "10.5";
		double d1 = Double.parseDouble(s1); //"10.5 ->0.5
		Double d0b = Double.valueOf(s1);
		
		int n1 = d0b.intValue();
		
		double d2 = d0b;
		
		//이런게 있엇따.
		char ch ='a';
		if(Character.toUpperCase(ch)=='A')
			System.out.println("A냐");
		
		
		
	}

}

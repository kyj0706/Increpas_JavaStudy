package mymain;

import java.util.ArrayList;
import java.util.List;

public class _01_GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		
		list.add("사과");//String
		list.add(100);	 //Integer
		
		//list를 Generic 없이 할 경우 
		//Down_casting을 해야한다.
		String f = (String) list.get(0);
		
		//Generic : Collection에 저장 Type 지정 (Fixed)
		ArrayList<String> fruit_list = new ArrayList<String>();
		
		fruit_list.add("사과");
		//fruit_list.add(100);// Generic Type이 String 객체만 저장 할 수 있도록 지정 
		fruit_list.add("참외");
		fruit_list.add("수박");
		
		System.out.println("--[과일목록: 개선 loop]--");
		
		//개선loop
		//	        변수 :  컬렉션 또는 배열
		for(String fruit : fruit_list) {
			System.out.println(fruit);
		}
		
		
		System.out.println("--[과일목록: 첨자이용]--");
		
		//개선loop
		//	        변수 :  컬렉션 또는 배열
		for(int i=0; i<fruit_list.size(); i++) {
			String fruit = fruit_list.get(i);
			System.out.println(fruit);
		}
		
		
		
		//해봅시다
		//Integer Type의 객체만 저장 가능 
		ArrayList<Integer> su_list = new ArrayList<Integer>();
		su_list.add(10);//auto-boxing : int -> Integer
		//su_list.add("문자열");
		
	}

}

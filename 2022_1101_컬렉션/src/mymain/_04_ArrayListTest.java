package mymain;

import java.util.ArrayList;
import java.util.List;

public class _04_ArrayListTest {
	
	/*
	 	List
	 		1. 순서있는 자료구조
	 		2. List 구현객체 : ArrayList, Vector, Stack, LinkedList
	 
	 
	 
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruit_list = new ArrayList<String>();
		
		fruit_list.add("사과");
		fruit_list.add("딸기");
		fruit_list.add("포도");
		fruit_list.add("참외");
		
		System.out.println(fruit_list);
		System.out.println("--[첨자를 이용한 방법]--");
		for(int i=0; i<fruit_list.size(); i++) {
			String fruit = fruit_list.get(i);
			System.out.println(fruit);
		}

	}

}

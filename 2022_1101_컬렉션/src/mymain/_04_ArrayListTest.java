package mymain;

import java.util.ArrayList;
import java.util.List;

public class _04_ArrayListTest {
	
	/*
	 	List
	 		1. �����ִ� �ڷᱸ��
	 		2. List ������ü : ArrayList, Vector, Stack, LinkedList
	 
	 
	 
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruit_list = new ArrayList<String>();
		
		fruit_list.add("���");
		fruit_list.add("����");
		fruit_list.add("����");
		fruit_list.add("����");
		
		System.out.println(fruit_list);
		System.out.println("--[÷�ڸ� �̿��� ���]--");
		for(int i=0; i<fruit_list.size(); i++) {
			String fruit = fruit_list.get(i);
			System.out.println(fruit);
		}

	}

}

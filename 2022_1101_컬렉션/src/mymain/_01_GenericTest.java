package mymain;

import java.util.ArrayList;
import java.util.List;

public class _01_GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		
		list.add("���");//String
		list.add(100);	 //Integer
		
		//list�� Generic ���� �� ��� 
		//Down_casting�� �ؾ��Ѵ�.
		String f = (String) list.get(0);
		
		//Generic : Collection�� ���� Type ���� (Fixed)
		ArrayList<String> fruit_list = new ArrayList<String>();
		
		fruit_list.add("���");
		//fruit_list.add(100);// Generic Type�� String ��ü�� ���� �� �� �ֵ��� ���� 
		fruit_list.add("����");
		fruit_list.add("����");
		
		System.out.println("--[���ϸ��: ���� loop]--");
		
		//����loop
		//	        ���� :  �÷��� �Ǵ� �迭
		for(String fruit : fruit_list) {
			System.out.println(fruit);
		}
		
		
		System.out.println("--[���ϸ��: ÷���̿�]--");
		
		//����loop
		//	        ���� :  �÷��� �Ǵ� �迭
		for(int i=0; i<fruit_list.size(); i++) {
			String fruit = fruit_list.get(i);
			System.out.println(fruit);
		}
		
		
		
		//�غ��ô�
		//Integer Type�� ��ü�� ���� ���� 
		ArrayList<Integer> su_list = new ArrayList<Integer>();
		su_list.add(10);//auto-boxing : int -> Integer
		//su_list.add("���ڿ�");
		
	}

}

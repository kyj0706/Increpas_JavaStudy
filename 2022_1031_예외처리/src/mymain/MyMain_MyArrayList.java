package mymain;

import myutil.MyArrayList;

public class MyMain_MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�����迭
		MyArrayList list = new MyArrayList();
		System.out.println(list.size());
		
		list.add("���");//0
		list.add("����");//1
		list.add("����");//2
		
		System.out.println(list.size());
		
		System.out.println("--[��ü]--");
		for(int i=0; i<list.size(); i++) {
			
			try {
				String fruit = (String) list.get(i);
				System.out.printf("index => %d %s\n",i,fruit);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//end : for
		
		
		try {
			list.remove(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("--[1�� ����]--");
		for(int i=0; i<list.size(); i++) {
			
			try {
				String fruit = (String) list.get(i);
				System.out.printf("index => %d %s\n",i,fruit);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//end : for
		
		
		System.out.println("--��������--");
	}

}

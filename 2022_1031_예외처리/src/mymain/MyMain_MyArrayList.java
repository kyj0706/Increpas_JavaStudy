package mymain;

import myutil.MyArrayList;

public class MyMain_MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//동적배열
		MyArrayList list = new MyArrayList();
		System.out.println(list.size());
		
		list.add("사과");//0
		list.add("참외");//1
		list.add("수박");//2
		
		System.out.println(list.size());
		
		System.out.println("--[전체]--");
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
		
		System.out.println("--[1개 삭제]--");
		for(int i=0; i<list.size(); i++) {
			
			try {
				String fruit = (String) list.get(i);
				System.out.printf("index => %d %s\n",i,fruit);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//end : for
		
		
		System.out.println("--정상종료--");
	}

}

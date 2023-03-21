package mymain;

import myutil.MyArrayList;

public class _02_MyArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Generic설정을 안하고 객체 생성하면 Object로 인식&해석
		MyArrayList list = new MyArrayList();
		
		list.add("사과");
		list.add(100);

		
		//Generic 사용
		//String 객체만 저장
		MyArrayList<String> sido_list = new MyArrayList<String>();
		sido_list.add("서울");
		sido_list.add("경기");
		sido_list.add("인천");
		
		//sido_list.add(1000);
		
		System.out.println("--[시도목록]--");
		
		for(int i=0; i<sido_list.size(); i++) {//i = 0 , 1 , 2
			try {
				String sido = sido_list.get(i);
				System.out.printf("첨자순 :%d = 도시명 : %s\n",i, sido);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//end-for : 시도목록
		
		
		//Integer Type만 저장
		MyArrayList<Integer> odd_list = new MyArrayList<Integer>();
		
		odd_list.add(1);//auto_boxing : int -> integer 
		odd_list.add(3);
		odd_list.add(5);
		odd_list.add(7);
		odd_list.add(9);
		
		System.out.println("--[홀수목록]--");
		for(int i =0; i<odd_list.size(); i++) {
			
			try {
				//int <- Integer
				int su = odd_list.get(i);//auto-unboxing : Integer -> int
				//  su = odd_list.get(i) :intValue();
				System.out.println(su);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}

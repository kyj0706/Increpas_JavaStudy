package mymain;

import java.util.ArrayList;

public class MyMain_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//동적배열
		//java의 모든 객체를 저장할수 있따.
		ArrayList list = new ArrayList();
		System.out.println(list.size());
		
		
		list.add("사과");//0
		list.add("참외");//1
		list.add("수박");//2
		
		System.out.println(list.size());
		
		
		//이렇게 하면 에러가 난다.  why?
		//get으로 가져온게 Object로 저장되어 있는 걸 가지고오는데... 뭘 ...가지고 오라고 ?
		//String fruit = list.get(1);
		//그래서  Down_cating 으로 변환 시켜줘야한다
		
		String fruit = (String) list.get(1); // 이렇게
		System.out.println(fruit);
		
		System.out.println("--[전체]--");
		for(int i=0; i<list.size(); i++) {
			String fruit1 = (String) list.get(i);
			System.out.printf("index => %d : %s\n",i,fruit1);
		}//end : for
		
		//2번째 데이터 삭제(index -> 1삭제
		//삭제를 하고 정렬을 한다. ->첨자가 변경된다.
		list.remove(1);
		
		//모두지우기
		list.clear();
		
		System.out.println("--[1.삭제]--");
		for(int i=0; i<list.size(); i++) {
			String fruit1 = (String) list.get(i);
			System.out.printf("index => %d : %s\n",i,fruit1);
		}
		
		
	}

}

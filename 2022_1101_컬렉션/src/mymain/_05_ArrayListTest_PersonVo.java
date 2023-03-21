package mymain;

import java.util.ArrayList;
import java.util.List;

import vo.PersonVo;

public class _05_ArrayListTest_PersonVo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// <Generic> : 저장타입을 지정
		List<PersonVo> p_list = new ArrayList<PersonVo>();

		p_list.add(new PersonVo("일길동",21,"서울시 관악구 조원1동"));
		p_list.add(new PersonVo("이길동",22,"서울시 관악구 조원2동"));
		p_list.add(new PersonVo("삼길동",23,"서울시 관악구 조원3동"));
		p_list.add(new PersonVo("사길동",24,"서울시 관악구 조원4동"));
		p_list.add(new PersonVo("오길동",25,"서울시 관악구 조원5동"));
		
		
		PersonVo p1 = p_list.get(0);
		
		//같은 결과 해시값이 출력된다.
		//System.out.println(p_list.get(0));
		//System.out.println(p1.toString());//toString은 누구를... 가지고 온걸까?
		System.out.println(p1);
		
		System.out.println("--[전체조회(개선 loop]--");
		for(PersonVo p : p_list) {
			System.out.println(p);
		}
		
		System.out.println("--[전체조회(첨자이용)]--");
		for(int i=0; i<p_list.size(); i++) {
			PersonVo p =p_list.get(i);
			
			String name = p.getName();
			
			System.out.printf("[%s]님 정보 : %s\n",name,p);
		}
		
	}

}

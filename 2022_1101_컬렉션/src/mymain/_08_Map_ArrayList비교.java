package mymain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import vo.PersonVo;

public class _08_Map_ArrayList비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList PersonVo목록저장
		List<PersonVo>  p_list = new ArrayList<PersonVo>();
		
		//Map PersonVo목록저장
		Map<String, PersonVo> personMap = new HashMap<String, PersonVo>();
		
		
		//Sample Data 100명
		for(int i=1;i<=1000;i++) {
			
			String name = String.format("길동%04d", i);
			//System.out.println(name);
			int    age  = 20 + i%11;
			//System.out.println(age);
			String addr = String.format("서울시 관악구 신림%d동", i%3 + 1);
			//System.out.println(addr);
			
			PersonVo p = new PersonVo(name, age, addr);
			
			//p_list추가
			p_list.add(p);
			
			//personMap추가
			personMap.put(name, p);
		}
		
		String search_name = "길동0100";
		int count;
		//ArrayList로 검색하기
		System.out.println("--[ArrayList검색]--");
		for(int i=0;i<p_list.size();i++) { // i = 0 1 2 3 ...99
						
			PersonVo p = p_list.get(i);
			
			if(p.getName().equals(search_name)) {
				count = i+1;
				System.out.printf("[%s]님 정보 [%d]회 검색 : %s\n", search_name,count,p);
				break;
			}//end-if
		}//end-for
		
		//Map으로 검색
		System.out.println("--[Map검색]--");
		PersonVo p1 = personMap.get(search_name);
		System.out.printf("[%s]님 정보 %s\n",search_name,p1);
		
		
		
		
		
		
		
		
		
	}

}

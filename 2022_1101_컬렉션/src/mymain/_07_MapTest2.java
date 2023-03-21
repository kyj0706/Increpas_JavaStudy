package mymain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _07_MapTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String, List<String>> fruitMap =new HashMap<String, List<String>>();
		
		//봄철 과일
		List<String> season1 = new ArrayList<String>();
		season1.add("토마토");
		season1.add("딸기");
		fruitMap.put("봄", season1);
		
		//여름철과일
		List<String> season2 = new ArrayList<String>();
		season2.add("수박");
		season2.add("참외");
		fruitMap.put("여름", season2);
		
		//가을철과일
		List<String> season3 = new ArrayList<String>();
		season3.add("포도");
		season3.add("감");
		fruitMap.put("가을", season3);
		
		//겨울철과일
		List<String> season4 = new ArrayList<String>();
		season4.add("귤");
		fruitMap.put("겨울", season4);
		
		//키를 이용해서 검색
		String season = "봄";
		List<String> fruit_list = fruitMap.get(season);
		
		System.out.printf("--[%s]철 과일 목록--\n",season);
		for(String fruit : fruit_list) {
			System.out.println(fruit);
		}
		
		
	}

}

package mymain;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class _06_MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> telMap = new HashMap<Integer, String>();
		
		
		//         key    Value
		telMap.put(1, "010-1111-1234");
		telMap.put(2, "010-2222-1234");
		telMap.put(3, "010-3333-1234");
		telMap.put(4, "010-4444-1234");
		telMap.put(5, "010-5555-1234");
		
		
		
		int short_num = 2;
		//Map의 Value값은 get(Key) 통해서 얻어온다.
		String tel_num =telMap.get(short_num);
		System.out.printf("단축번호 %d : %s\n",short_num,tel_num);
		
		//Map으로 부터 key집합을 얻어온다(Set)
		Set<Integer> keySet =telMap.keySet();
		System.out.println(keySet);
		
		//for문으로 전체를 조회해 볼거다. 근데 사실상 의미는 없다.
		// 	Why?? key를 통해서 value결과(값을)를 보여 주는건데 전체를 보여주는 의미가 있는가 ?
		System.out.println("--[전체조회 개선 loop]--");
		
		for(Integer key : keySet) {
			String tel = telMap.get(key);
			System.out.printf("단축번호 %d : %s\n",key,tel);
		}
		

	}

}

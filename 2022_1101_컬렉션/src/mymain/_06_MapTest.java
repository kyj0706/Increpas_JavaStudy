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
		//Map�� Value���� get(Key) ���ؼ� ���´�.
		String tel_num =telMap.get(short_num);
		System.out.printf("�����ȣ %d : %s\n",short_num,tel_num);
		
		//Map���� ���� key������ ���´�(Set)
		Set<Integer> keySet =telMap.keySet();
		System.out.println(keySet);
		
		//for������ ��ü�� ��ȸ�� ���Ŵ�. �ٵ� ��ǻ� �ǹ̴� ����.
		// 	Why?? key�� ���ؼ� value���(����)�� ���� �ִ°ǵ� ��ü�� �����ִ� �ǹ̰� �ִ°� ?
		System.out.println("--[��ü��ȸ ���� loop]--");
		
		for(Integer key : keySet) {
			String tel = telMap.get(key);
			System.out.printf("�����ȣ %d : %s\n",key,tel);
		}
		

	}

}

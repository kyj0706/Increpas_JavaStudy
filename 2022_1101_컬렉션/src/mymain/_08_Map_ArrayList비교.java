package mymain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import vo.PersonVo;

public class _08_Map_ArrayList�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArrayList PersonVo�������
		List<PersonVo>  p_list = new ArrayList<PersonVo>();
		
		//Map PersonVo�������
		Map<String, PersonVo> personMap = new HashMap<String, PersonVo>();
		
		
		//Sample Data 100��
		for(int i=1;i<=1000;i++) {
			
			String name = String.format("�浿%04d", i);
			//System.out.println(name);
			int    age  = 20 + i%11;
			//System.out.println(age);
			String addr = String.format("����� ���Ǳ� �Ÿ�%d��", i%3 + 1);
			//System.out.println(addr);
			
			PersonVo p = new PersonVo(name, age, addr);
			
			//p_list�߰�
			p_list.add(p);
			
			//personMap�߰�
			personMap.put(name, p);
		}
		
		String search_name = "�浿0100";
		int count;
		//ArrayList�� �˻��ϱ�
		System.out.println("--[ArrayList�˻�]--");
		for(int i=0;i<p_list.size();i++) { // i = 0 1 2 3 ...99
						
			PersonVo p = p_list.get(i);
			
			if(p.getName().equals(search_name)) {
				count = i+1;
				System.out.printf("[%s]�� ���� [%d]ȸ �˻� : %s\n", search_name,count,p);
				break;
			}//end-if
		}//end-for
		
		//Map���� �˻�
		System.out.println("--[Map�˻�]--");
		PersonVo p1 = personMap.get(search_name);
		System.out.printf("[%s]�� ���� %s\n",search_name,p1);
		
		
		
		
		
		
		
		
		
	}

}

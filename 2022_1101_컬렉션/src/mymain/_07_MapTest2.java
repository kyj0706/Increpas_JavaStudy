package mymain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _07_MapTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String, List<String>> fruitMap =new HashMap<String, List<String>>();
		
		//��ö ����
		List<String> season1 = new ArrayList<String>();
		season1.add("�丶��");
		season1.add("����");
		fruitMap.put("��", season1);
		
		//����ö����
		List<String> season2 = new ArrayList<String>();
		season2.add("����");
		season2.add("����");
		fruitMap.put("����", season2);
		
		//����ö����
		List<String> season3 = new ArrayList<String>();
		season3.add("����");
		season3.add("��");
		fruitMap.put("����", season3);
		
		//�ܿ�ö����
		List<String> season4 = new ArrayList<String>();
		season4.add("��");
		fruitMap.put("�ܿ�", season4);
		
		//Ű�� �̿��ؼ� �˻�
		String season = "��";
		List<String> fruit_list = fruitMap.get(season);
		
		System.out.printf("--[%s]ö ���� ���--\n",season);
		for(String fruit : fruit_list) {
			System.out.println(fruit);
		}
		
		
	}

}

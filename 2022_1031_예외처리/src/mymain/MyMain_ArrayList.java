package mymain;

import java.util.ArrayList;

public class MyMain_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�����迭
		//java�� ��� ��ü�� �����Ҽ� �ֵ�.
		ArrayList list = new ArrayList();
		System.out.println(list.size());
		
		
		list.add("���");//0
		list.add("����");//1
		list.add("����");//2
		
		System.out.println(list.size());
		
		
		//�̷��� �ϸ� ������ ����.  why?
		//get���� �����°� Object�� ����Ǿ� �ִ� �� ��������µ�... �� ...������ ����� ?
		//String fruit = list.get(1);
		//�׷���  Down_cating ���� ��ȯ ��������Ѵ�
		
		String fruit = (String) list.get(1); // �̷���
		System.out.println(fruit);
		
		System.out.println("--[��ü]--");
		for(int i=0; i<list.size(); i++) {
			String fruit1 = (String) list.get(i);
			System.out.printf("index => %d : %s\n",i,fruit1);
		}//end : for
		
		//2��° ������ ����(index -> 1����
		//������ �ϰ� ������ �Ѵ�. ->÷�ڰ� ����ȴ�.
		list.remove(1);
		
		//��������
		list.clear();
		
		System.out.println("--[1.����]--");
		for(int i=0; i<list.size(); i++) {
			String fruit1 = (String) list.get(i);
			System.out.printf("index => %d : %s\n",i,fruit1);
		}
		
		
	}

}

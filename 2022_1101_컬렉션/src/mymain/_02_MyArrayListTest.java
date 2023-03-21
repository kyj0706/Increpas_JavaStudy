package mymain;

import myutil.MyArrayList;

public class _02_MyArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Generic������ ���ϰ� ��ü �����ϸ� Object�� �ν�&�ؼ�
		MyArrayList list = new MyArrayList();
		
		list.add("���");
		list.add(100);

		
		//Generic ���
		//String ��ü�� ����
		MyArrayList<String> sido_list = new MyArrayList<String>();
		sido_list.add("����");
		sido_list.add("���");
		sido_list.add("��õ");
		
		//sido_list.add(1000);
		
		System.out.println("--[�õ����]--");
		
		for(int i=0; i<sido_list.size(); i++) {//i = 0 , 1 , 2
			try {
				String sido = sido_list.get(i);
				System.out.printf("÷�ڼ� :%d = ���ø� : %s\n",i, sido);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}//end-for : �õ����
		
		
		//Integer Type�� ����
		MyArrayList<Integer> odd_list = new MyArrayList<Integer>();
		
		odd_list.add(1);//auto_boxing : int -> integer 
		odd_list.add(3);
		odd_list.add(5);
		odd_list.add(7);
		odd_list.add(9);
		
		System.out.println("--[Ȧ�����]--");
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

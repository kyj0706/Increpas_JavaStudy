package mymain;

import java.util.ArrayList;

public class MyMain_UpDown_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Collection : �ڹ��� ��簴ü�� ��ü�� ��������ϴ� �ڷᱸ��
		
		//��ü�� ����
		ArrayList list = new ArrayList();
		
		//�̰��� �迭�� �����Ҽ� �ִ°� ? => �ȵȴ�.
		//�� �迭�� Ư¡�� ������ �ڷ���(�����Ҵ�)
		String str = new String("ȫ�浿");
		Integer n0b = Integer.valueOf(10); //new Integer(10);
		Double d0b = Double.valueOf(12.5); //new Double(12.5);
		Boolean b0b = Boolean.valueOf(false); //new Boolean(false);
		
		
		//up_casting
		//÷��                0    1   2   3
		Object [] ob_array = {str,n0b,d0b,b0b};
		
		
		//down_casting
		int len = ((String)ob_array[0]).length();
		
		System.out.printf("list.size() = %d\n", list.size());
		
		//up_cating���� ����
		list.add(str);
		list.add(n0b);
		list.add(d0b);
		list.add(b0b);
		
		
		System.out.printf("list.size() = %d\n", list.size());
		
		//������ ���ÿ��� �� ��ü�� Ÿ������ down_casting�� �Ѵ�.
		//list.get(0);
		String s1 = (String)list.get(0);
		Integer n1 = (Integer) list.get(1);
		
		
		//3��° ������ ����(index:2)
		list.remove(2);
		
		System.out.printf("list.size() = %d\n",list.size());
		
		
	}

}

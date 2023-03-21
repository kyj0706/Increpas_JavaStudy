package mymain;

import java.util.ArrayList;

public class MyMain_UpDown_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Collection : 자바의 모든객체를 객체를 저장관리하는 자료구조
		
		//객체의 종류
		ArrayList list = new ArrayList();
		
		//이것을 배열로 저장할수 있는가 ? => 안된다.
		//왜 배열을 특징은 동일한 자료형(연속할당)
		String str = new String("홍길동");
		Integer n0b = Integer.valueOf(10); //new Integer(10);
		Double d0b = Double.valueOf(12.5); //new Double(12.5);
		Boolean b0b = Boolean.valueOf(false); //new Boolean(false);
		
		
		//up_casting
		//첨자                0    1   2   3
		Object [] ob_array = {str,n0b,d0b,b0b};
		
		
		//down_casting
		int len = ((String)ob_array[0]).length();
		
		System.out.printf("list.size() = %d\n", list.size());
		
		//up_cating으로 저장
		list.add(str);
		list.add(n0b);
		list.add(d0b);
		list.add(b0b);
		
		
		System.out.printf("list.size() = %d\n", list.size());
		
		//꺼내서 사용시에는 각 객체의 타입으로 down_casting을 한다.
		//list.get(0);
		String s1 = (String)list.get(0);
		Integer n1 = (Integer) list.get(1);
		
		
		//3번째 데이터 삭제(index:2)
		list.remove(2);
		
		System.out.printf("list.size() = %d\n",list.size());
		
		
	}

}

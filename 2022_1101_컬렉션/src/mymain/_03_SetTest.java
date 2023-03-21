package mymain;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class _03_SetTest {
	
	/*
	 	Set
	 	1. 순서없이 저장되는 자료구조
	 	2. 중복불가
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Interface               class
		//사용명세서(설명서)      설계서
		Set<Integer> numSet = new HashSet<Integer>(); // 순서가 없다.
		//Set<Integer> numSet = new TreeSet<Integer>(); //정렬이 된다.
		
		numSet.add(10);
		numSet.add(5);
		numSet.add(7);
		numSet.add(110);
		numSet.add(200);
		numSet.add(8);
		numSet.add(9);
		numSet.add(2);
		numSet.add(4);
		numSet.add(6);
		
		System.out.println(numSet);
	//	System.out.println(numSet.toString()); // 내부적으로 toString이 된다.
		
		
		//로또번호 추첨
		Set<Integer> lottoSet =new TreeSet<Integer>();
		Random random = new Random();
		
		int n = 6;
		System.out.println("--[Set 로또]--");
		while(n>0) {
			
			int su = random.nextInt(45)+1; // 1~45 난수
			//add실패면 : 동일값이 들어갈경우
			//왜 ? 중복불가니까 ?
			if(lottoSet.add(su)==false) {
				continue;
			}
		
			n--;
			
		}
		System.out.println(lottoSet);
		
		
		//필요한 값만 가지고 오기 
		//Set Element(요소) 값 얻어오기 
		
		//방법1) 개선 loop 방법
		System.out.println("--[개선 loop로 값 얻어오기]--");
		for(Integer num : lottoSet) {
			System.out.printf("%3d",num);
		}
		System.out.println();
		
		//방법2) iterator(반복자)이용한는 방법 
		Iterator<Integer> it = lottoSet.iterator();
		
		System.out.println("--[iterator를 통해서 값 얻어오기]--");
		while(it.hasNext()) {//요소값을 갖고 있냐?
			
			int num = it.next();// 값을 얻어오고 다음위치로 이동해라
			System.out.printf("%3d",num);
			
		}
		System.out.println();
		

	}

}

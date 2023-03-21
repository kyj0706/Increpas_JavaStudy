package mymain;

import java.util.Random;

public class _06_일반논리연산자예제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//|| (OR)
		//	조건 : 노약자
		// 조건1)10세미만 : 어린이(약자)
		// 조건2)65세이상 : 노인(약자)
		
		int age = 66; // 나이

		
		//순서2
		//난수발생객체
		Random random = new Random();
		
		age = random.nextInt(100)+1;
			
		//순서1
		if(age<10 || age>=65)
			System.out.printf("[%d]세는 노약자 입니다.\n", age);
		else
			System.out.printf("[%d]세는 노약자가 아닙니다.\n", age);

	}

}

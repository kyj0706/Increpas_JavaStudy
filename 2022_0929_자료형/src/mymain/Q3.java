package mymain;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키보드로부터 입력을 받아 봅시다.
		//
		
		Scanner scanner = new Scanner(System.in);
		// 변수 선언합니다.
		
		
		String name;		//이름
		int age;			//나이
		double body_length;//키
		boolean bMarride;	//결혼
		String addr;		//주소
		
		
		System.out.println("===당신의 개인정보를 입력하세요===");
		
		//이름
		System.out.print("이름은?:");
		name=scanner.next();	//문자열 공백없이
		//name=scanner.nextLine();//문자열 공백포함
		
		//나이
		System.out.print("나이는? :");
		age=scanner.nextInt();
		
		//키
		System.out.print("신장 :");
		body_length=scanner.nextDouble();
		
		//결혼
		System.out.print("결혼 :");
		bMarride=scanner.nextBoolean();
		
		//설명1
		//입력 구분자 전까지 가지고 온다. (enter 전까지) => 입력(scanner)+ender(입력구분자)
		//next()
		//nextLine()
		//nextDouble()
		//nextBoolean()
		// enter 만 남는다.
		
		
		//↓ nextLine은 enter만 남아서. 가지고 간다. 그래서 !  출력이 안되다 .
		
		//설명2
		//주소
		//입력구분자를 설명하기 위한 (복선)
		//바로입력이 안될꺼다.
		//키보드버퍼 (임시저장소)
		//입력구분자까지만 가지고 온다  
		System.out.print("주소는? :");
		
		scanner.nextLine(); // 설명3 그래서 가지온 enter(입력구분자)를 버리기 위한 용도.
		addr=scanner.nextLine(); //설명4 다시시작
		
		//방법1
		System.out.printf("이름 : %s\n",name);
		System.out.printf("나이 : %d(살)\n",age);
		System.out.printf("신장 : %.1f(㎝)\n",body_length);
		System.out.printf("결혼 : %b\n",bMarride);
		System.out.printf("주소 : %s\n",addr);
		
		
		//방법2
		System.out.printf(" 이름:%s\n 나이:%d\n 키:%.1f\n 결혼:%B\n 주소:%s\n",name,age,body_length,bMarride,addr );
		
		scanner.close();

	}

}

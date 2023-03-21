package mymain;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//이름 name
		//나이 age
		//주소 addr
		//키 ki
		//전화 tel
		
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int age;
		String addr;
		double ki;
		String tel;
		
		System.out.println("---[입력내용]---");
		
		System.out.print("이름 :");
		name=scanner.next();
		
		System.out.print("나이 :");
		age=scanner.nextInt();
		
		System.out.print("주소 :");
		scanner.nextLine();
		addr=scanner.nextLine();
		
		System.out.print("키 :");
		ki=scanner.nextDouble();
		
		System.out.print("전화 :");
		scanner.nextLine();
		tel=scanner.nextLine();
		
		
		System.out.println("---[출력내용]---");
		System.out.printf("이름: %s님\n",name);
		System.out.printf("나이: %d(살)\n",age);
		System.out.printf("주소: %s\n",addr);
		System.out.printf("키: %.1f(cm)\n",ki);
		System.out.printf("전화: %s\n",tel);
		
		scanner.close();

	}

}

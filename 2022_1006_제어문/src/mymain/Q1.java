package mymain;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//구구단을 입력받아 출력해보세요
		
		Scanner scanner = new Scanner(System.in);
		
		int dan; //단수
		int res; //저장공간
		
		System.out.print("단:");
		dan= scanner.nextInt();
		
		
		for(int i=1; i<10; i++) {
			res = dan*i;//저장 이렇게 해도 되나 ?? 결국 이것도 11번 도는거잖아 ?
				
				//System.out.println(dan+"x"+i+"="+dan*i);
				//메모리 낭비이랑 
				
				//System.out.println();
				System.out.printf("%d x %d = %d\n",dan,i,res);

			
		}
		
		
		
		
		scanner.close();

	}

}

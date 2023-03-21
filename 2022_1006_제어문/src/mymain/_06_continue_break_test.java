package mymain;

public class _06_continue_break_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// continue : 반복문에서만 사용
		// 			: 반복문의 명령을 종료시키고 다음 제어식으로 이동시킨다.

		
		
		int sum = 0;
		
		//순서1
		//짝수의 합
		//방법1
		for (int i=1; i <=10; i++) {

			if (i % 2 == 0) 

				sum = sum + i;
			
		} // for_end
		System.out.println(sum);
		
		//순서2
		//방법2)
		//기능설명하기 위함
		//프로그램은 직관적으로 만들어라!!!
		sum = 0; //초기화
		for(int i=1; i<=10; i++) {
			if(i%2==1) continue;
			sum =sum +i;
		}
		System.out.println(sum);
		
		
		//순서3
		//break : 현재 반복문을 종료해라(탈출)
		//조건식을 비워도 (true) 인식 결과는 나온다 . 다만 .Stack Overflow 가일어난다
		//int 값의 21억 어쩌고 저쩌고 까지
		sum = 0;
		for(int i=1;  ; i++) {
			
			if(i>10) break; // 조건이 만족하면 끝내라
			
			sum= sum+i;
			
		}
		System.out.println(sum);
		
		
		
		
		
		
		

	}

}

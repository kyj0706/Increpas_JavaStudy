package mymain;

public class _06_일반논리연산자예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//순서1
		//변수 su가 짝수인지 홀수인지 알고 싶다.
		//if 문
		int su = 7;
		
		//짝수 조건
		if(su%2==0) 	//이 조건이 만족하면 
						//su를 2로 나눴더니 0이 남았더라 그래서 
			System.out.printf("[%d]은(는) 짝수\n" , su);// 프로그램은 여기서 끝내도 나온다.
			
		else//홀수 조건
			System.out.printf("[%d]은(는) 홀수\n" , su);
		
		

		//순서2
		//3의 배수조건
		//3으로 나눴을때 0으로 떨어지는것이 3배수이지 않느냐 
		if(su%3==0)
			System.out.printf("[%d]은(는) 3의 배수\n", su);//이렇게 하면 안나올것이다
			
		//순서3
		else
			System.out.printf("[%d]은(는) 3의 배수가 아닙니다.\n" , su);
		
		//순서4
		//내가 찾고싶은건 각각의 정보가 아니라  
		//su가 2와 3의 배수이냐 (공배수)
		//2의 배수면서 3의 배수이냐 ?
		//조건1 : 조건2  = true를 원한다.
			//조건1	&&	조건2   &&로 연결
		//if((su%2==0) (su%3==0))
			//2배수			3배수
		if((su%2==0) && (su%3==0))
			System.out.printf("[%d]은(는) 2와3의 배수\n", su);
	
		else
			System.out.printf("[%d]은(는) 2와3의 배수가 아닙니다.\n" , su);
		
	}

}

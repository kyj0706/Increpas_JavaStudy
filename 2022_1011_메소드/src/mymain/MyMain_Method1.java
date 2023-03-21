package mymain;

public class MyMain_Method1 {
	
	//순서1
	//메소드 (내가 호출한거)
	//메소드의 종류는 3가지 된다.
	//메소드는 지역변수이다. 
	//return이 되면 소멸이 되기 때문이다. 
	//그럼 값은 ? int 반환형은 존재한다.  즉  a b c 는 사라진다. 다만 int plus의 값은 존재한다.
	public static int plus(int a,int b) {
							// 메소드의 가인자는 호출시 생성
							// int a =x 
							// int b =y
		//지역변수
		//순서5
		int c= a+b;
		//순서2
		return c;
		/*
		 	return 		: 자신을 호출한 곳으로 돌아가라(복귀해라)
		 	return 값	: 자신을 호출한 곳으로 값을 갖고 돌아가라
		 */
	}
	
	
	//메인메소드 (JVM에 의해 자동 호출)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 전역변수 지역변수는 사용하기 나름이다.
		
		//순서7
		// 블럭이 main 메소드 까지 있기때문에
		//전역변수
		int global_a =10;
		
		
		//순서6
		{   
			//block내에서 선언된 변수는 블럭을 벗어나면 소멸된다.
			//지역변수(local variable)
			int local_a=10;
			global_a =100; //이렇게 가능하다는 의미
		}
	
		//local_a =19; //에러 지역변수에서 없어졌기 때문에 없는 변수인데 뭘 하라고 ? 의미
		
		
		//순서3
		int x=10, y=5, res;
		
		//순서4
		// 이미 만들어 놓은 plus를 호출해서 쓴다.
		//res = plus(x, y);
		
		res = MyMain_Method1.plus(x, y);//정확한 표현
		
		
		System.out.printf("%d+%d=%d",x,y,res);
	}

}

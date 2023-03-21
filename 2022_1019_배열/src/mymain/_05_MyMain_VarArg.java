package mymain;

public class _05_MyMain_VarArg {
	
	//순서1
	//Method Overload
	//이런식으로 계속 추가하면 반복적이지 않느냐 
	static void sub(int a) {}
	static void sub(int a, int b) {}
	static void sub(int a, int b, int c) {}
	
	//순서2_1
	//VarArgs(가변인자) : .... (ellipsis)
	//이렇게 가변인자를 통해서 가능하다.
	static void sub_arg(int ... nr) {//지역변수이다. =>호출과 동시에 생성이 된다.
		
		//순서3				이런식으로 순서2_2처럼 사용한다.
		//동작			int[] nr = {1};
		//배열			int[] nr = {1,2};
		//				int[] nr = {1,2,3};
		
		//순서2_3 출력
		System.out.print("[");
		for(int i=0; i<nr.length; i++) {
			System.out.printf("%3d", nr[i]);
		}
		System.out.print("]\n");
		
		
	}
	//순서4_1
	static int max(int ...nr) {
		
		//순서4_3 출력
		int big =0;
		for(int i=0; i<nr.length; i++) {
			
			big = (big >nr[i]) ? big : nr[i];
		}
		
		return big;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//순서2_2
		//이렇게 호출이 가능한다.
		sub_arg(1);
		sub_arg(1,2);
		sub_arg(1,2,3);
		sub_arg(1,2,3,4);
		
		//순서4_2
		int a=1, b=5,c=3,d=8, res;
		res = max(a,b);
		System.out.printf("%d,%d중 큰수 %d\n",a,b ,res);
		res = max(a,b,c);
		System.out.printf("%d,%d,%d중 큰수 %d\n",a,b,c ,res);
		res = max(a,b,c,d);
		System.out.printf("%d,%d,%d,%d중 큰수 %d\n",a,b,c,d ,res);
		
		
		
		

	}

}

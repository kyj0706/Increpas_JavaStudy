package mymain;

public class _06_일반논리연산자예제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =1, y=2;
		boolean z;
		
		//cpu의 연산방식 
		//shot circuit evaluation(경제적연산=단축연산.)
		//일반논리연산자 %% || 는 
		// > 논리값을 가지고 수행한다.
		// 수행순서)  --x 
		//			  x(조건1) > 0
		//			  false (전체 결과가 false이기 때문에 ) 
		//			  --y 	(해당 연산을 하지 않는다.) 
		//
		
		//타이핑말고 계산을해보세요 
		
		// &&는 앞 조건이 false가 나오면 뒤조건은 수행안한다.
		z= --x >0 && ++y > 0;
		//일반논리 연산자에서 조심해야할 것 
		//대부분읜 정답 x=0, y=3, z=false
		
		System.out.printf("x=%d y=%d z=%b\n", x, y, z);

		
		
		//순서2 
		//그래서 이해를 했을까 ?
		//(경제적연산은) AND OR 둘다 적용된다.
		// || 앞조건이 true면 전체결과가 이미 결결되었기 때문에 뒷조것은 수행 안한다.
		z= ++x > 0 || ++y >0;
		System.out.printf("x=%d y=%d z=%b\n", x, y, z);
		
		//순서3(시간이남아서)
		++x;
		++y;
		z = x>0 || y>0;
	}

}

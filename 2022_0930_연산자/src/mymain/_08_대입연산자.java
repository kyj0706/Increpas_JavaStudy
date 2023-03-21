package mymain;

public class _08_대입연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 대입연산자 		: =
		// 복합대입연산자	: += -= *= /= %= >>= <<= >>>= &= ^= |=
				
		//순서1
		int n=10;
		
		n++; // n = n + 1 => 자신을 1씩 증가
		
		//n = n+2; //자신을 2씩증가
		//이걸 줄여 놓은걸
		n +=2; // n = n + 2;
		//그럼 이건 ?
		n -=2; // n = n - 2; 자신을 2씩 감소해라	
		
		//지금의 흐름 칠판으로 그려줌 
		//n의값 10 -> n++ -> ... 등등 그래서 최종결과 11을 
		
		//조심해야할것 (정상 n -=2; 
		n =- 2;
		
		System.out.printf("n=%d\n",n);
		
		//순서2
		n += 2;//결과 0
		n += 2;//결과 2
		n *= 5;//결과 10 n = n *5
		
		//나머지는 일반 어플리케이션에서는 잘안쓴다. 
		//이런게 있다고 알고만 있어라 ~~ 
		
		//순서2
		//연산자 정리 (수평관계 우선순위)
		//꺼꾸로 연산
		//단항연산자
		boolean bOk = !!!!!!!!!!(3>2);// <= 방향으로 
		
		//삼항연산자 : 중첩시키면 뒷쪽부터 처리
		int a=5, b=8, c=1, res;
		
		//방법1
		//이렇게 하면 헷갈리니깐 (쓰기싫어서 함축)
		//코드는 모호하게 하지말아라 ~~~~
		res = (a > b) ? (a>c ? a:c) : (b>c? b:c); 
		System.out.printf("%d %d %d중 큰수는 %d\n" ,a,b,c,res);
		
		//방법2(직관적)
		//풀어서 하면 된다
		res = (a>b)? a:b; //  a b를 비교 res에 담고
		res = c > res ? c : res; // res랑 c를 비교 다시 res에 담고
		System.out.printf("%d %d %d중 큰수는 %d\n" ,a,b,c,res);
		
		
		
		//대입연산자
		int x,y,z;
		x= y= z= 0; //
		
		
		
		

	}

}

package mymain;

public class _02_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//산술연산자 : 
		//				*(곱) /(몫) %(나머지)
		//				+(더하기) -(빼기)
		
		//변수 선언
		int a = 10, b=3, res;
				
		//순서1 (더하기)
		res = a + b;
		System.out.printf("%d + %d =%d\n",a, b, res);
		
		//순서2(빼기)
		res = a - b;
		System.out.printf("%d - %d = %d\n",a, b, res);
		
		
		//복사하기 단축키 알려주기 원하는 라인 :  ctrl + alt = ↑↓
		//순서3(곱하기)
		res = a * b;
		System.out.printf("%d * %d = %d\n",a, b, res);
		
		//순서4(나누기 몫구하기)
		res = a / b;
		System.out.printf("%d / %d = %d\n",a, b, res);
		
		//순서5(나머지)
		res = a % b;
		//System.out.printf("%d % %d = %d\n",a, b, res); //이러면 에러가 나올꺼다 
		//이유 : %는 무조건 출력서식으로 인식한다.
		
		//순서 6_1( %문자표시 방법)
		//공백으로 인식하기 때문에 [%d %s 등등  %뒤에 아무것도 없는데 무슨말이야 ? 라고 질문하는거.]
		//해결 : %를 문자로 사용하려면 %%로 입력한다.
		System.out.printf("%d %% %d = %d\n",a, b, res); //해결
		//결과 : 10 % 3 = 1
		
		//순서 6_2 (""강조 및 표시방법)
		// " "로 강조하고 싶을때는 
		//System.out.printf("%d %% %d = "%d"\n",a, b, res); // 이러면 에러가 나올꺼다
		// 이유 : "시작 "끝 뒤에는 뭔데 ?라고 하는거
		// 해결 : \로 처리  
		System.out.printf("%d %% %d = \"%d\"\n",a, b, res); // 해결 [경로 설정할때 사용]
		//결과 : 10 % 3 = "1"
		
		
		//순서 6_3 (경로표시 c:\work\javastudy)
		//System.out.println("c:\work\javastudy"); // 이러면 에러가 나올꺼다.
		// 이유 : \w는 없다 \j는 없는데 뭐하라고 ? [역슬레쉬 다음에 나오는게 유효한 값이 아니야] 
		// 해결 : \\로처리
		System.out.println("c:\\work\\javastudy"); // 해결 [보여지는건 \\지만 사용은 \로
		//결과 : c:\work\javastudy
		
		//순서6 정리
		//	%를 문자로 사용하려면 : %% -> '%' 처리
		//	"를 문자로 사용하려면 : \" -> '"' 처리
		//  \를 문자로 사용하려면 : \\ -> '\' 처리
		// Spring 을 사용 하게 되면 자동으로 된다. 그래도 해봐야하고 알아야 하니깐 설명하는거다 .
		
		//순서4_2 %몫 연산자 (짚고 넘어갈 것)
		// /(몫) 연산자가  정확히 몫이라고 할 수 있는가 ?
		// 정수 / 정수로 -> 정수 정확히 ?
		System.out.println(10/3);
		System.out.println(10/3.);
		//방법1 : 강제형변환
		System.out.println(10/(int)3.);
		//방법2 : 전체를
		System.out.println((int)(10/3.));
		
		//순서5_2 /나머지 연산자 (짚고 넘어갈것)
		//나머지는 문제없이 된다. 
		System.out.println(10%3);
		System.out.println(10%3.0);
		
		//순서5_3
		//불능 : 젯수가 0인 경우
		System.out.println(10%0);
		//결과 by zero
		
		
		
		
		
		
		
		
		
		
	}

}

package mymain;

public class _07_삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//상함연산자:
		//형태 
		//(조건) ? (값1) : (값2)
		//			참		거짓
		//

		//순서1
		//두수중에 큰수 구하기
		int a=5, b=3, c;
		
		//조건식
		//순서 : 연산 => =(대입연산자) 결과
		c = (a > b) ? a : b;
		System.out.printf("%d,%d중에 큰수는 %d\n", a,b,c);
		
		//순서2
		//절대값구하기
		int n = -10;
		//m변수 선언
		int m;
		
		//이렇게 써도 되는데 난해하다 ?
		//m = n < 0 ? -n : n;
		// 조건을 확실히 하기 위해서
		//    우선
		m = (n < 0) ? -n : n;
		System.out.printf("|%d| => %d\n" ,n ,m);
		
		// 강사님 말)
		//삼한연산자는 이런거구나 ~ 
		// 조건이 참이면  값의 앞 
		// 조건이 거짓이면 값의 뒤
		// 간결하게 하기 위해서 삼항연산자를 사용한다 
		// 다양한 곳에 사용이 된다 ~ 
		// 이해됨 ?
		// 끝 ~ 
	}

}

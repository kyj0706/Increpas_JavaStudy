package mymain;

import myutil.MyArrays;

public class _02_MyMain_Array1_초기화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//순서1 [방법1]
		//1차원 배열 초기화 (변수선언과 동시에 값을 부여)
		//	초기화시에는 배열을 갯수부분을 생략합니다.
		// 						 0   1   2   3   4   <-index(첨자)
		int [] mr = new int[] { 1 , 2 , 3 , 4 , 5,};
		
		//순서2 [방법2]
		//변수 선언과 종시에 값을 부여가 가능하다는 예시
		int [] nr = 		   { 5 , 4 , 3 , 2 , 1};
		
		
		//순서3
		int [] ar;
		//이것은 되지 않는다 선언이 아니라  대입이기 때문에
		//이런식으로 쓸거면 방법1과 같이 써야한다.
		//ar = { 10,20,30,40,50};
		ar = new int[] { 10,20,30,40,50};
		
		System.out.println("---[초기화된 배열정보]---");
		MyArrays.display_array(mr);
		MyArrays.display_array(nr);
		MyArrays.display_array(ar);
		
		
		
	}

}

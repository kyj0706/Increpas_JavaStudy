package mymain;

import java.util.StringTokenizer;

public class _06_StringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sido_list ="서울 경기 인천 대전 대구 부산 광주 목포";
		
		//문자열중에서 토큰추출
		// 분리기준문자		: 공백 탭 엔터
		// 토큰(token) 		: 분리분자로 분리된 데이터(서울/경기/인천)
		//
		StringTokenizer st = new StringTokenizer(sido_list);
		
		System.out.println(st.countTokens());
		
		while( st.hasMoreTokens()) { //st가 토큰을 가지고 있나?
			
			String token = st.nextToken();//토큰을 가지고온후 다음토큰으로 이동
			System.out.println(token);
			
		}
		
		String my_date = "2022/10//17";
		StringTokenizer st1 = new StringTokenizer(my_date, "/");
		
		
		System.out.println("--[StringTokenizer]--");
		while(st1.hasMoreTokens()) {
			String token = st1.nextToken();
			System.out.println(token);
		}
		
		//String class split("분리문자정규식") =>배열
		String [] date_array = my_date.split("/");
		//							0        1     2				
		//String [] date_array ={ "2022" , "10",  "17"}
		//System.out.println(date_array.length);
		System.out.println("--[split로 불리된 결과]--");
		/*직관적
		for(int i=0; i<3; i++) {
			System.out.println(date_array[i]);
		}
		*/
		
		//length로 
		for(int i=0; i<date_array.length; i++) {
			System.out.println(date_array[i]);
		}
		
		
	}

}

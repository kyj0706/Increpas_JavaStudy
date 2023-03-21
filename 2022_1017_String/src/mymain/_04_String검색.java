package mymain;

public class _04_String검색 {
	
	public static void main (String[] args) {
		
		//			 01234567890  <= index(순서)
		String s1 = "Kwon Sun Ae";
		
		//문자열중 문자(n)의 위치
		int index = s1.indexOf('n');
		System.out.printf("맨 처음 문자의 n의 위치 : %d\n",index);
		
		//문자열중 문자열("Sun")의 위치
		index = s1.indexOf("Sun");
		System.out.printf("문자 Sun의 위치 : %d\n",index);
		
		//문자열중 문자(n)을 뒷쪽부터 검색
		index = s1.lastIndexOf('n');
		System.out.printf("마지막 문자 n의 위치 :%d\n",index);
		
		//문자열중 문자 1개 추출
		char c= s1.charAt(index);
		System.out.printf("index=%d번째 추출한 문자 :%c\n",index,c);
		
		//'S'의 위치 구한다.
		index = s1.indexOf('S');
		
		//문자열중 문자열을 추출
		String str = s1.substring(index);
		System.out.printf("대문자 S로부터 끝까지 잘래내기 : [%s]\n", str);
		
		//                 시작(기준) ~ +개수
		str = s1.substring(index, index+3);
		System.out.printf("대문자 S로부터 3까지 잘라내기 : [%s]\n",str);
		
		
	}

}

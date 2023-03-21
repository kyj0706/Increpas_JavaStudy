package mymain;

public class _04_finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			//본코드
			System.out.println("--1.try--");
			//throw new Exception();
			
		} catch (Exception e) {
			// TODO: handle exception
			//예외처리
			e.printStackTrace();
			System.out.println("--2.catch--");
			
		}finally {
			//무조건 처리 구문
			System.out.println("--3.finally--");
		}
		
		//얘는 무조건 처리 되던데 ? 뭐야 ?
		//그럼  finally 가 왜 필요해 ? 
		//해도 상관은 없는데 지속성 ? 형태를 위해서 ? 또는 별개로 하기 위해서
		System.out.println("무조건 처리구문");

	}

}

package mymain;

public class _01_Sting비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1가지 설명을 하기 위해서 한거
		//메모리에 어떻게 배치가 되는지 확인하기 위해서 .
		
		
		//순서1
		//1,암시적생성방법
		String s1 = "Twinkle";
		String s2 = "Twinkle";
		

		//순서2
		//주소비교
		if(s1==s2) 
			System.out.println("암시적 Same");
		else
			System.out.println("암시적 Diff");
		
		//순서3
		//2.명시적생성방법
		String s3 = new String("Little Star");
		String s4 = new String("Little Star");
		
		//순서4
		//주소비교
		if(s3==s4)
			System.out.println("명시적 Same");
		else
			System.out.println("명시적 Diff");
		
		//순서5
		//값비교
		if(s3.equals(s4))
			System.out.println("명시적 equals Same");
		else
			System.out.println("명시적 equals Diff");
		
		

	}

}

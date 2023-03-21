package mymain;

public class _06_일반논리연산자예제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//일반논리연산자 범위산출
		
		
		//학점 : A(수) 90 ~ 100
		//		 B(우) 80 ~ 89
		//		 C(미) 70 ~ 79
		//		 D(양) 60 ~ 69 
		//		 F(가)    ~ 59
		
		//순서1
		int kor = 89;
		String grade = "F";
		
		//120을 입력하면 90은 맞는데 100은 틀리다.
		//범위 산출 
		// && (AND)
		if(kor >=90 && kor <= 100) grade = "A";
		//int(정수 조건) 이기때문에
		//if(kor >=80 && kor <= 90) grade ="B"; // 이렇게 해도 된다 . 다만 정확하게 하고 싶으면 
		if(kor >=80 && kor <= 89) grade ="B";
		if(kor >=70 && kor <= 79) grade ="C";
		if(kor >=60 && kor <= 69) grade ="D";
		if(kor >=0 && kor  <= 59) grade ="D";
		
		System.out.printf("점수 :%d 등급 :%s\n" , kor, grade);
		
		
	}

}

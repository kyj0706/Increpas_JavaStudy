package mymain;

public class _02_switch_test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//학생성적을 해봅시다.
		// 점수
		// 등급
		// 90 ~ 100 : A
		// 80 ~ 89  : B
		// 70 ~ 79  : C
		// 60 ~ 69  : D
		// 60 ~ 59  : F
		
		//변수선언
		int kor = 101;
		String grade="F";
		if(kor >=0 && kor <=100) {
			//switch(수식) 도 가능하다 ! 
			switch(kor/10)
			{
				case 10	:
				case 9	: grade = "A"; break;
				case 8 	: grade = "B"; break;
				case 7	: grade = "C"; break;
				case 6 	: grade = "D"; break;
				default : grade = "F";
			}
			System.out.printf("[%d]점 등급 :[%s]\n", kor, grade);
		
		}else {
			System.out.printf("입력된점수 kor[%d]은 0~100사이의 값이여야합니다.\n",kor);
		}
	}

}

package mymain;

import myutil.Save;

public class MyMain_Save {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//순서1 
		//static 변수가 만들어졌는지 확인
		System.out.printf("현재이율 : %.0f(%%)\n",Save.rate*100);
		
		//순서2
		Save s1 = new Save("일길동", 1000000);
		Save s2 = new Save("이길동", 2000000);
		Save s3 = new Save("삼길동", 3000000);
		
		
		s1.display();
		s2.display();
		s3.display();
		
		//이율 변경 : 0.1 -> 0.2
		Save.rate = 0.048; //그래서 이렇게 쓰자
		
		//static이 공유 변수이기 때문에 이렇게도 가능하다 .
		//되긴하는데 ? 왜 static 클래스 변수인데 ... 이렇게 쓰는건 좀 ...이라고 알려줌
		//s1.rate = 0.2;			
		
		System.out.printf("현재이율 : %.1f(%%)\n",Save.rate*100);
		
		//s1의 저축금액을 변경
		s1.setMoney(50000000);
		
		s1.display();
		s2.display();
		s3.display();
		
		
		
		
	}

}

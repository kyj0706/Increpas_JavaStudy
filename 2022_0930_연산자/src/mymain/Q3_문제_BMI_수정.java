package mymain;

import java.util.Scanner;

public class Q3_문제_BMI_수정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BMI(Body Mass Indexer): 체칠량 계수
		
		Scanner scanner = new Scanner(System.in);
		
		//변수 
		double body_height;//키
		double body_weight;//몸무게
		
		double bmi = 18.5;
		
		String body_state="정상";
		
		System.out.print("키:");
		body_height = scanner.nextDouble();
		
		System.out.print("몸무게:");
		body_weight = scanner.nextDouble();
		
		
		
		//bmi계산 : 몸무게 /(키(m)) * 키(m))
		bmi = body_weight/((body_height/100) * (body_height/100));
		//강사님
		//새변수선언
		double body_height_m = body_height/100; //키
		bmi = body_weight/(body_height_m*body_height_m);
		//근데이렇게 하면 같은 값을 곱하는데 도움을 주는 Java API가 있다.
		//Math.pow (a.b) -> a' s b 승
		bmi = body_weight/Math.pow(body_height_m,2);
		
		//!!!!!!!!!!!!!!!!!!!!!!!
		//수정_221006
		
		//body_state 값을 넣어준다.
		if(bmi<18.5) body_state ="저체중";
		else if(bmi>=18.5 && bmi < 23) body_state ="정상체중";
		else if(bmi>=23 && bmi < 25) body_state ="비만";
		else if(bmi>=25 && bmi < 30) body_state ="1단계 비만";
		else if(bmi>=30 && bmi < 35) body_state ="2단계 비만";
		else if(bmi>=36) body_state ="3단계비만";
		
		
		System.out.println("======[입력확인]======");
		System.out.printf("[키]:%.1f(cm)\n[몸무게]%.1f(kg)\n",body_height, body_weight);
		
		//결과
		System.out.println("======[BMI결과]======");
		System.out.printf("BMI:%.1f  상태:%s\n",bmi,body_state);
		
		//추가
		System.out.println("======[너의 상황은?]======");
		if(bmi>=18.5 && bmi < 23) {
			System.out.println("표준입니다.");
		}else if(bmi >=23 && bmi <25) {
			System.out.println("관리가 필요합니다.");
		}else {
			System.out.println("큰일 났습니다.");
		}
	}

}

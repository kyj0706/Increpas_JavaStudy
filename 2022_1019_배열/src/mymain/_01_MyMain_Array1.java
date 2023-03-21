package mymain;

import java.util.Arrays;

import myutil.MyArrays;

public class _01_MyMain_Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1차원 배열선언
		// 순서1
		int[] mr;
		mr = new int[4];

		System.out.printf("mr's length=%d\n", mr.length);// 배열의 길이 확인

		// 순서2
		// 배열의 요소(Element) -> 각각의 공간명(변수명) 표현
		mr[0] = 1; // mr[0]해석 -> mr로부터 0번째 떨어진 공간
		mr[1] = 2;
		mr[2] = 3;
		mr[3] = 4;

		// 순서3
		// 배열을 출력해 봅시다.
		for (int i = 0; i < mr.length; i++) {

			System.out.printf("mr[%d] = %d\n", i, mr[i]);

		}
		
		//순서4
		// 기존 API 기능 : Arrays
		// 모든값을 0으로 채우기
		Arrays.fill(mr, 0);// 모든값을 0으로 채우겠다.
		System.out.println("--[0으로 채우기]--");
		for (int i = 0; i < mr.length; i++) {

			System.out.printf("mr[%d] = %d\n", i, mr[i]);

		}
		
		//순서5_1 MyArrays method 생성후
		Arrays.fill(mr, 1);
		System.out.println("--[1으로 채우기]--");
		
		//내가 만든 display 출력
		MyArrays.display_array(mr);
		
		//순서6_1
		//내가 구현해본 fill
		MyArrays.fill(mr, 5);
		System.out.println("--[내가만든 API로 5으로 채우기]--");
		
		MyArrays.display_array(mr); 
		
		//순서7_1
		//기존 API overload
		//Arrays.fill(mr, 1, 1+2, 0);
		//내 API
		MyArrays.fill(mr, 1, 1+2, 0);
		System.out.println("--[2.3]칸을 0으로 채우기");
		MyArrays.display_array(mr);
		
	}

}

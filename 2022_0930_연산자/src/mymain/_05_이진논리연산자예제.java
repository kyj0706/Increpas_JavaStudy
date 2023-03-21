package mymain;

import myutil.MyInteger;

public class _05_이진논리연산자예제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int형으로
		//16진수 : nibble
		//표현 %x
		//각가 숫자 4비트 => 1  9 
		
		
		int birth_day = 0x19991225; 
		//순서1
		System.out.println(MyInteger.toBinaryString(birth_day));
		//0001 1001 1001 1001 0001 0010 0010 0101
		// 1	9	 9	  9    1	2    2    5
		//2진수를 4개씩 끈으면 16진수
		//2진수를 3개씩 끈으면 8진수
		
		//순서2
		//쉬프트연산자 활용(2진연산)
		
		int year = birth_day >>>16;
		System.out.printf("출생년도 : %x\n", year);
		
		//순서3
		//월을 구합니다.
		//&(AND)로 해봅시다 _ 소거연산
		//과정 		 0x00199912  &   				0x00199912
		int month = birth_day >>8 & 0x000000ff; //&	0x000000ff
		System.out.printf("출생월 	 : %02x\n", month);
		
		
		int day = birth_day & 0xff;
		System.out.printf("출생일	 : %02x\n", day); // 0x000000ff 한이유 보여주기 위한.	
		
		// 이진수의 이진연산을 이런식으로 하는거 입니다 ~~~~   
		// 이정도 날짜표현은 이딴식이 아니니깐
		
		//순서4
		//수정을하고 싶다.
		// 19991225 > 19881225로  99를 제거 19001225 > 89 추가 19891225
		//값수정 : 이전값 지우지 -> 새로운값 넣기
		//										0x19991225	9:1001 	5:0101
		birth_day = birth_day ^ 0x00990000;//^	0x00990000	9"1000	0:0000
										   //		00		  0001	  0101(유지)
		System.out.printf("년도제거 :%x\n", birth_day);
		
		//추가
		birth_day = birth_day | 0x00880000;
		System.out.printf("년도추가 :%x\n",birth_day);
		
		//해보기
		birth_day = birth_day ^ 0x00001225;
		birth_day = birth_day | 0x00001003;
		System.out.printf("년도변경 :%x\n",birth_day);
		
	}

}

package mymain;

import myutil.MyInteger;

public class _03_쉬프트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// shift연산자 : >>  <<  >>>(2진연산)
		
		//순서1
		int n = 10;
		System.out.printf("[%32s]: %d\n",MyInteger.toBinaryString(n) ,n);
		//n의 값을 >> 오른쪽으로 밀어 봅시다.
		System.out.printf("[%32s]: %d>>\n",MyInteger.toBinaryString(n>>2) ,n);
		//n의 값을 << 왼쪽으로 밀어 봅시다.
		System.out.printf("[%32s]: %d<<\n",MyInteger.toBinaryString(n<<2) ,n);

		
		n = -1;
		System.out.printf("[%32s]: %d\n",MyInteger.toBinaryString(n) ,n);
		
		//>>4 비트결과
		System.out.printf("[%32s]: %d>>4\n",MyInteger.toBinaryString(n>>4) ,n);
		// >>>-1
		System.out.printf("[%32s]: %d>>>4\n",MyInteger.toBinaryString(n>>>4) ,n);
		

	}

}

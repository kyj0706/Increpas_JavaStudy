package mymain;

import myutil.MyInteger;

public class _03_����Ʈ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// shift������ : >>  <<  >>>(2������)
		
		//����1
		int n = 10;
		System.out.printf("[%32s]: %d\n",MyInteger.toBinaryString(n) ,n);
		//n�� ���� >> ���������� �о� ���ô�.
		System.out.printf("[%32s]: %d>>\n",MyInteger.toBinaryString(n>>2) ,n);
		//n�� ���� << �������� �о� ���ô�.
		System.out.printf("[%32s]: %d<<\n",MyInteger.toBinaryString(n<<2) ,n);

		
		n = -1;
		System.out.printf("[%32s]: %d\n",MyInteger.toBinaryString(n) ,n);
		
		//>>4 ��Ʈ���
		System.out.printf("[%32s]: %d>>4\n",MyInteger.toBinaryString(n>>4) ,n);
		// >>>-1
		System.out.printf("[%32s]: %d>>>4\n",MyInteger.toBinaryString(n>>>4) ,n);
		

	}

}

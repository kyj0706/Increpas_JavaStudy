package mymain;

import myutil.BaseCalc;
import myutil.BaseCalcImpl;

public class MyMain_BaceCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//�̷��� �Ǹ� ������ ���� ���������� Ȯ������
		// �������� : The final field BaseCalc.PI cannot be assigned 
		//	 => ������ �ȵ�...
		//BaseCalc.PI = 3.141592;
		
		//�̷��� ���� ������ ����.
		System.out.println(BaseCalc.PI);
		
		
		//�������̽� = new  Ŭ����
		//������  		���輭
		BaseCalc calc = new BaseCalcImpl();
		
		int a = 10 , b=5, res;
		
		res =calc.plus(a, b);
		System.out.printf("%d + %d = %d\n", a ,b, res);
		
		res =calc.multiply(a, b);
		System.out.printf("%d * %d = %d\n", a ,b, res);

	}

}

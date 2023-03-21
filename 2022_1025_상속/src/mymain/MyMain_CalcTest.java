package mymain;

import myutil.AdvanceClac;
import myutil.BaseCalc;

public class MyMain_CalcTest {

	// up_casting(�������)
	// ����� �����ٲ� ->����������
	static void use_basecalc(BaseCalc bc) { //up_casting
		// ���������Ǵ°� : �����Ǿ�����
		// BaseCalc bc ���� = ac�� ����ִ�
		// �� ? main���� �����೻ �����ϱ�

		int x = 10, y = 5, res;
		res = bc.minus(x, y);
		System.out.printf("use basecalc : %d - %d = %d\n", x, y, res);

	}

	static void use_object(Object ob) { //up_casting
		// ���������Ǵ°� : �����Ǿ�����
		// use_object ob ���� = ac�� ����ִ�
		// �� ? main���� �����೻ �����ϱ�
		
		int n= 10, res;
				
		//�̷��� �ȵȴ�. �� ? ���� �� ������ 1�ε� �� 3���� ?
		//res = ob.hap(n);
		
		//donw_casting(������ Ȯ��)
		// . ��Ʈ �����ڰ� �� ������ ��ȣ����   . > ()
		res = ((AdvanceClac)ob).hap(n);
		
		//���� ��
		/*
		AdvanceClac ac = (AdvanceClac)ob;
		res = ac.hap(n);
		*/
		
		System.out.printf("use_object : %d������ ��=%d\n",n,res);

	}

	// �����ڴ� �̳༮�̴�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdvanceClac ac = new AdvanceClac();

		// �ʿ��Ѱ� �����ֲ�~
		use_basecalc(ac);

		use_object(ac);

		int a = 10, b = 3, res;

		System.out.println("--[main]--");
		res = ac.plus(a, b);
		System.out.printf("%d + %d = %d\n", a, b, res);

		res = ac.hap(a);
		System.out.printf("%d������ �� = %d\n", a, res);

		double result = ac.pow(a, b);
		System.out.printf("%d�� %d��= %.0f\n", a, b, result);

	}

}

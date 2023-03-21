package myutil;

public class MyMath {

	// �������� ����� �䳻 ������ ~~

	// �⺻������
	// �����ε� �뵵�� �ܺο��� ��� ���ϰ� �ϱ� ���� .
	// �� static���� ����� �ǵ� ��ü�� ��� �����ϸ� �޸� ���� ���ϱ� ����
	private MyMath() {
		// TODO Auto-generated constructor stub
	}

	// ���밪 ���ϱ�
	public static int abs(int n) {

		return (n < 0) ? -n : n;
	}

	// ���� �¼� ���ϱ�
	public static double pow(double n, double m) {

		double res = 1.0;
		for (int i = 1; i <= m; i++) {

			res = res * n;

		}

		return res;
	}

	// ���ȣ���� �̿��� �ձ��ϱ�
	public static int recurive_hap(int n) {
		if (n == 1)
			return 1;

		return n + recurive_hap(n - 1);
	}

	// ���ȣ���ϰ� ����� ����.
	public static int hap(int n) {

		int res = 0;
		for (int i = 1; i <= n; i++) {
			res += i;
		}

		return res;
	}
	
	
	//���� 
	//���� �̰ǵ� 
	public static double factorial(int n) {

		double result = 1.0;

		for (int i = n; i > 0; i--)
			result = result * i;

		return result;
	}

	// 4! = 4*3*2*1
	// ���ȣ���� �̿��� factorial���ϱ�
	public static double recursive_factorial(int n) {
		if (n==1)
			return 1.0;
		return  n * recursive_factorial(n - 1);
	}

}

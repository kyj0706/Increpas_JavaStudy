package mymain;

public class _06_�Ϲݳ������ڿ���5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x =1, y=2;
		boolean z;
		
		//cpu�� ������ 
		//shot circuit evaluation(����������=���࿬��.)
		//�Ϲݳ������� %% || �� 
		// > ������ ������ �����Ѵ�.
		// �������)  --x 
		//			  x(����1) > 0
		//			  false (��ü ����� false�̱� ������ ) 
		//			  --y 	(�ش� ������ ���� �ʴ´�.) 
		//
		
		//Ÿ���θ��� ������غ����� 
		
		// &&�� �� ������ false�� ������ �������� ������Ѵ�.
		z= --x >0 && ++y > 0;
		//�Ϲݳ� �����ڿ��� �����ؾ��� �� 
		//��κ��� ���� x=0, y=3, z=false
		
		System.out.printf("x=%d y=%d z=%b\n", x, y, z);

		
		
		//����2 
		//�׷��� ���ظ� ������ ?
		//(������������) AND OR �Ѵ� ����ȴ�.
		// || �������� true�� ��ü����� �̹� ���Ǿ��� ������ �������� ���� ���Ѵ�.
		z= ++x > 0 || ++y >0;
		System.out.printf("x=%d y=%d z=%b\n", x, y, z);
		
		//����3(�ð��̳��Ƽ�)
		++x;
		++y;
		z = x>0 || y>0;
	}

}

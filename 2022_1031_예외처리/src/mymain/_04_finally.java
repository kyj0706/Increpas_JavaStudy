package mymain;

public class _04_finally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			//���ڵ�
			System.out.println("--1.try--");
			//throw new Exception();
			
		} catch (Exception e) {
			// TODO: handle exception
			//����ó��
			e.printStackTrace();
			System.out.println("--2.catch--");
			
		}finally {
			//������ ó�� ����
			System.out.println("--3.finally--");
		}
		
		//��� ������ ó�� �Ǵ��� ? ���� ?
		//�׷�  finally �� �� �ʿ��� ? 
		//�ص� ����� ���µ� ���Ӽ� ? ���¸� ���ؼ� ? �Ǵ� ������ �ϱ� ���ؼ�
		System.out.println("������ ó������");

	}

}

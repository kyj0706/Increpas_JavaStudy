package mymain;

import java.io.FileReader;

public class _01_��������Ŀ���ó�� {
	
	public static void main(String[] args) {
		
		int a=10, b=0, res;
		
		//��1
		//�̷��� ó���ϸ� ������ �ɰŴ� ��� �˷������ 
		//������ ���� main method�� 
		//����������� -> �Ǵ� �͸� ���� 
		if(b!=0) {
			
			res = a/0;
		}
		
		//��2
		//�������� str : null�ǹ� = �ƹ� ��ü�� �������� �ʴ´�.  ��ü�� ����� ���µ� heap�� �ƹ��͵� ���� .! 
		String str = null;
		//length�� ���ڿ��� ���� ���̸� ���ϴ°Ŵ� 
		//�ٵ� null�� heap�� �ƹ��͵� ���µ� ���϶�� �ž� ? ��� java�� �˷��ش�
		if(str!=null) {//������ ���Ѱ� ?
			int len = str.length();
		}
		
		//��3
		//�迭
		int [] mr = { 1,2,3};
		int index = 5;
		
		if(index>0 &&index < mr.length) {
			
			mr [index] = 10;
		}
		
		
		
		
		
		System.out.println("��������");
	}

}

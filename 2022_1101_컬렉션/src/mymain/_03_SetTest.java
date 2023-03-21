package mymain;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class _03_SetTest {
	
	/*
	 	Set
	 	1. �������� ����Ǵ� �ڷᱸ��
	 	2. �ߺ��Ұ�
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Interface               class
		//������(����)      ���輭
		Set<Integer> numSet = new HashSet<Integer>(); // ������ ����.
		//Set<Integer> numSet = new TreeSet<Integer>(); //������ �ȴ�.
		
		numSet.add(10);
		numSet.add(5);
		numSet.add(7);
		numSet.add(110);
		numSet.add(200);
		numSet.add(8);
		numSet.add(9);
		numSet.add(2);
		numSet.add(4);
		numSet.add(6);
		
		System.out.println(numSet);
	//	System.out.println(numSet.toString()); // ���������� toString�� �ȴ�.
		
		
		//�ζǹ�ȣ ��÷
		Set<Integer> lottoSet =new TreeSet<Integer>();
		Random random = new Random();
		
		int n = 6;
		System.out.println("--[Set �ζ�]--");
		while(n>0) {
			
			int su = random.nextInt(45)+1; // 1~45 ����
			//add���и� : ���ϰ��� �����
			//�� ? �ߺ��Ұ��ϱ� ?
			if(lottoSet.add(su)==false) {
				continue;
			}
		
			n--;
			
		}
		System.out.println(lottoSet);
		
		
		//�ʿ��� ���� ������ ���� 
		//Set Element(���) �� ������ 
		
		//���1) ���� loop ���
		System.out.println("--[���� loop�� �� ������]--");
		for(Integer num : lottoSet) {
			System.out.printf("%3d",num);
		}
		System.out.println();
		
		//���2) iterator(�ݺ���)�̿��Ѵ� ��� 
		Iterator<Integer> it = lottoSet.iterator();
		
		System.out.println("--[iterator�� ���ؼ� �� ������]--");
		while(it.hasNext()) {//��Ұ��� ���� �ֳ�?
			
			int num = it.next();// ���� ������ ������ġ�� �̵��ض�
			System.out.printf("%3d",num);
			
		}
		System.out.println();
		

	}

}

package myutil;

import java.util.Arrays;
import java.util.Random;

public class Lotto_t {

	//��÷��ȣ
	int [] win_no;//  = new int[7];
	
	//������ȣ
	int [] user_no;
	
	int rank =0; //���
	int count=0; //��������

	public void setUser_no(int[] user_no) {
		this.user_no = user_no;
		
		Arrays.sort(user_no);
		
		//���(��������)üũ
		check_rank();
		
	}
	
	private void check_rank() {
		// TODO Auto-generated method stub
		//��÷��ȣ�� ������ȣ�� ���ؼ� ��� üũ
		count = 0;
		
		//������ üũ
		for(int i=0;i<6;i++) {
			for(int k=0;k<6;k++) {
				
				if(user_no[i]==win_no[k]) {
					count++;
					break;
				}
			}
		}
		
		//������
		if(count==3) rank = 5;
		else if(count==4) rank=4;
		else if(count==5) rank=3;
		else if(count==6) rank=1;
		
		//2��üũ
		if(count==5) {//3���߿��� ���ʽ���ȣ ������ üũ
			
			for(int i=0;i<6;i++) {
				if(user_no[i]==win_no[6]) {
					rank = 2;
					break;
				}
			}
		}
			
	}//end : check_rank()
	
	

	public void make_win_no() {
		
		Random random = new Random();
		win_no = new int[7];// ��÷��ȣ(6) + ���ʽ�(1)
		
		OUT_FOR: //label�ޱ�
		for(int i=0;i<win_no.length;i++) {
			
			int su = random.nextInt(45) + 1; //1~45������ ����
			
			//�ߺ��� üũ(���� ä���� �ڸ��� ��������üũ)
			for(int k=0; k<i;k++) {
				
				if(su==win_no[k]) {
					
					i--;
					continue OUT_FOR;//label OUT_FOR������ �ݺ����������� continue
				}
			}
			
			//�߻��� ������ �ִ´�
			win_no[i] = su;
		}
		//���ʽ���ȣ�� ������ ���� 6�ڸ��� ��Ʈ
		Arrays.sort(win_no, 0, 6);
		
		
	}//end : make_win_no()
	
	
	boolean isSame(int su, int n) {
		
		for(int i=0;i<n;i++) {
			
			if(su==win_no[i])return true;
		}
		
		return false;
	}
	
	public void make_win_no2() {
		
		Random random = new Random();
		win_no = new int[7];// ��÷��ȣ(6) + ���ʽ�(1)
		
		for(int i=0;i<win_no.length;i++) {
			
			int su = random.nextInt(45) + 1; //1~45������ ����
			
			if(isSame(su, i)) {
				i--;
				continue;
			}
			
			//�߻��� ������ �ִ´�
			win_no[i] = su;
		}
		//���ʽ���ȣ�� ������ ���� 6�ڸ��� ��Ʈ
		Arrays.sort(win_no, 0, 6);
		
		
	}//end : make_win_no2()
	
	
	
	
	public void display() {
		
		//��÷��ȣ ���
		System.out.print("��÷��ȣ:");
		for(int i=0;i<6;i++) {
			System.out.printf("%3d", win_no[i]);
		}
		//���ʽ���ȣ���
		System.out.printf(" (%d)\n", win_no[6]);
		
		//������ȣ ���
		System.out.print("������ȣ:");
		for(int i=0;i<6;i++) {
			System.out.printf("%3d", user_no[i]);
		}
		System.out.println();
		
		System.out.println("---[��÷���]---");
		
		//���������� ������
		if(count<3) {
			System.out.println("�� �Դϴ�!!");
		}else {
			
			System.out.printf("[%d]�� ��÷�Ǽ̽��ϴ�(��������:%d)\n", rank,count);
		}
		
		
	}
	
	
	
	
	
}

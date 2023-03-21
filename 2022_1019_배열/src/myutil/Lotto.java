package myutil;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	// ��÷��ȣ
	int[] win_no;// = new int[7];

	// ������ȣ
	int[] user_no;

	// ���
	int rank = 0; // ���
	int count = 0; // ���� ����

	public void setUser_no(int[] user_no) {
		this.user_no = user_no;

		Arrays.sort(user_no);// ����

		check_rank();
	}

	private void check_rank() {
		// TODO Auto-generated method stub
		// ��÷��ȣ�� ������ȣ�� ���ؼ� ��� üũ
		count = 0;
		rank =0;
		for(int i=0; i<user_no.length; i++) {
			for(int k=0; k<win_no.length; k++) {
				if(user_no[i]==win_no[k]) {
					count++;
					
				}
			}
			
		}
		
		// ���üũ
		if (count == 6)
			rank = 1;
		else if (count == 5)
			rank = 3; 
		else if (count == 4)
			rank = 4;
		else if (count == 3)
			rank = 5;
		

		if (count == 5)
			for (int j = 0; j < 6; j++)
				if (win_no[6] == user_no[j])
					rank = 2;
		
		System.out.printf("%d���Դϴ�.\n",rank);
		
	}

	public void make_win_no() {
		// ��÷��ȣ
		Random random = new Random();
		win_no = new int[7]; // ��÷��ȣ(6) +���ʽ�(1)
		for (int i = 0; i < win_no.length; i++) {
			win_no[i] = random.nextInt(45) + 1;
			for (int k = 0; k < i; k++) {
				if (win_no[i] == win_no[k]) {
					i--;
					break;
				} // end: if
			} // end: for(k)
		} // end: for(i)
		Arrays.sort(win_no, 0, 6);
	}// end : make_win_no

	public void display() {
		// ��÷��ȣ ���
		System.out.print("��÷��ȣ :");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%3d", win_no[i]);
		}
		// ���ʽ���ȣ ���
		System.out.printf(" +���ʽ�(%d)\n", win_no[6]);

		// ������ȣ ���
		System.out.print("������ȣ :");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%3d", user_no[i]);
		}
		System.out.println();// �ٹٲٱ�

		
		
		System.out.println("---[��������]---");
		count = 0;
		for (int i = 0; i < win_no.length; i++) {
			for (int k = 0; k < user_no.length; k++) {
				if (win_no[i] == user_no[k]) {
					count++;
				} // end : if
			} // end : for(k)
		} // end: for(i)
		
		System.out.printf("%d�� �¾ҽ��ϴ�.\n", count);
		
		
		
		
		// ��÷��� count
		System.out.println("---[��÷���]---");
		check_rank();
		

		
		
		

	}

}

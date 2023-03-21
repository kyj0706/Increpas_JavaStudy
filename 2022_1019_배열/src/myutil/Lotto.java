package myutil;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	// 추첨번호
	int[] win_no;// = new int[7];

	// 유저번호
	int[] user_no;

	// 등수
	int rank = 0; // 등수
	int count = 0; // 맞은 개수

	public void setUser_no(int[] user_no) {
		this.user_no = user_no;

		Arrays.sort(user_no);// 정렬

		check_rank();
	}

	private void check_rank() {
		// TODO Auto-generated method stub
		// 추첨번호와 유저번호를 비교해서 등수 체크
		count = 0;
		rank =0;
		for(int i=0; i<user_no.length; i++) {
			for(int k=0; k<win_no.length; k++) {
				if(user_no[i]==win_no[k]) {
					count++;
					
				}
			}
			
		}
		
		// 등수체크
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
		
		System.out.printf("%d등입니다.\n",rank);
		
	}

	public void make_win_no() {
		// 추첨번호
		Random random = new Random();
		win_no = new int[7]; // 추첨번호(6) +보너스(1)
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
		// 추첨번호 출력
		System.out.print("추첨번호 :");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%3d", win_no[i]);
		}
		// 보너스번호 출력
		System.out.printf(" +보너스(%d)\n", win_no[6]);

		// 유저번호 출력
		System.out.print("유저번호 :");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%3d", user_no[i]);
		}
		System.out.println();// 줄바꾸기

		
		
		System.out.println("---[맞은개수]---");
		count = 0;
		for (int i = 0; i < win_no.length; i++) {
			for (int k = 0; k < user_no.length; k++) {
				if (win_no[i] == user_no[k]) {
					count++;
				} // end : if
			} // end : for(k)
		} // end: for(i)
		
		System.out.printf("%d개 맞았습니다.\n", count);
		
		
		
		
		// 당첨결과 count
		System.out.println("---[당첨결과]---");
		check_rank();
		

		
		
		

	}

}

package myutil;

import java.util.Arrays;
import java.util.Random;

public class Lotto_t {

	//추첨번호
	int [] win_no;//  = new int[7];
	
	//유저번호
	int [] user_no;
	
	int rank =0; //등수
	int count=0; //맞은갯수

	public void setUser_no(int[] user_no) {
		this.user_no = user_no;
		
		Arrays.sort(user_no);
		
		//등수(맞은갯수)체크
		check_rank();
		
	}
	
	private void check_rank() {
		// TODO Auto-generated method stub
		//추첨번호와 유저번호를 비교해서 등수 체크
		count = 0;
		
		//맞은수 체크
		for(int i=0;i<6;i++) {
			for(int k=0;k<6;k++) {
				
				if(user_no[i]==win_no[k]) {
					count++;
					break;
				}
			}
		}
		
		//등수계산
		if(count==3) rank = 5;
		else if(count==4) rank=4;
		else if(count==5) rank=3;
		else if(count==6) rank=1;
		
		//2등체크
		if(count==5) {//3등중에서 보너스번호 맞은것 체크
			
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
		win_no = new int[7];// 추첨번호(6) + 보너스(1)
		
		OUT_FOR: //label달기
		for(int i=0;i<win_no.length;i++) {
			
			int su = random.nextInt(45) + 1; //1~45사이의 난수
			
			//중복수 체크(현재 채워질 자리의 이전까지체크)
			for(int k=0; k<i;k++) {
				
				if(su==win_no[k]) {
					
					i--;
					continue OUT_FOR;//label OUT_FOR영역인 반복문영역까지 continue
				}
			}
			
			//발생된 난수를 넣는다
			win_no[i] = su;
		}
		//보너스번호를 제외한 앞의 6자리를 소트
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
		win_no = new int[7];// 추첨번호(6) + 보너스(1)
		
		for(int i=0;i<win_no.length;i++) {
			
			int su = random.nextInt(45) + 1; //1~45사이의 난수
			
			if(isSame(su, i)) {
				i--;
				continue;
			}
			
			//발생된 난수를 넣는다
			win_no[i] = su;
		}
		//보너스번호를 제외한 앞의 6자리를 소트
		Arrays.sort(win_no, 0, 6);
		
		
	}//end : make_win_no2()
	
	
	
	
	public void display() {
		
		//추첨번호 출력
		System.out.print("추첨번호:");
		for(int i=0;i<6;i++) {
			System.out.printf("%3d", win_no[i]);
		}
		//보너스번호출력
		System.out.printf(" (%d)\n", win_no[6]);
		
		//유저번호 출력
		System.out.print("유저번호:");
		for(int i=0;i<6;i++) {
			System.out.printf("%3d", user_no[i]);
		}
		System.out.println();
		
		System.out.println("---[당첨결과]---");
		
		//맞은갯수와 등수출력
		if(count<3) {
			System.out.println("꽝 입니다!!");
		}else {
			
			System.out.printf("[%d]등 당첨되셨습니다(맞은갯수:%d)\n", rank,count);
		}
		
		
	}
	
	
	
	
	
}

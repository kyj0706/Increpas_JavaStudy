package mymain;

import java.util.Scanner;

import myutil.Jumin_t;

public class MyMain_Jumin_t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String  jumin_no;
		String  yn = "y";
		
		//주민번호 관리객체
		Jumin_t jumin = new Jumin_t();
		
		while(true) {
			
			System.out.print("주민번호(xxxxxx-xxxxxxx):");
			jumin_no = scanner.next();
			
			//주민번호 객체에게 전달
			jumin.setJumin_no(jumin_no);
			
			
			//주민번호 객체로부터 부가정보를 얻어온다
			//(출생년도/나이/띠/성별/계절/지역/간지/유효성)
			int year 		= jumin.getYear();
			int age  		= jumin.getAge();
			String tti 		= jumin.getTti2();
			String season 	= jumin.getSeason();
			String local 	= jumin.getLocal();
			String ganji	= jumin.getGanji();
			boolean bValid = jumin.isValid();
			
			
			
			
			if(bValid)//유효한 주민번호
			{
				System.out.println("---[결과출력]---");
				System.out.printf("출생년도 : %d\n",  	year);
				System.out.printf("나    이 : %d(살)\n",age);
				System.out.printf("      띠 : %s\n", 	tti);
				System.out.printf("계    절 : %s\n", 	season);
				System.out.printf("출생지역 : %s\n",  	local);
				System.out.printf("간    지 : %s\n", 	ganji);
			}else {
				System.out.println("--[주민번호가 유효하지 않습니다.]--");
			}
			
			//또?
			System.out.print("또?(y/n):");
			yn = scanner.next();
			
			if(!yn.equalsIgnoreCase("Y"))break;
						
		}//end-while
		
		System.out.println("---End---");
		
		
		scanner.close();
		
		
	}

}

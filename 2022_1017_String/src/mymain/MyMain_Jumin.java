package mymain;

import java.util.Scanner;

import myutil.Jumin;

public class MyMain_Jumin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String jumin_no ;
		String yn ="y";
		
		//주민번호 관리 객체 
		Jumin jumin = new Jumin();
		
		while(true) {
			System.out.println("주민번호(xxxxxx-xxxxxxx)");
			jumin_no = scanner.next();
			
			
			//주민번호객체에게 전달
			jumin.setJumin_no(jumin_no);
			
			
			//주민번호 객체로부터 부가 정보를 얻어온다.
			//(출생년도/나이/띠/성별/계절/지역/간지/유효성)
			int year = jumin.getYear();
			int agekor = jumin.getAge();
			String gender = jumin.getGender();
			String tti = jumin.getTti();
			String season = jumin.Season();
			String local = jumin.getLocal();
			
			
			System.out.println("---[결과출력]---");
			System.out.printf("출생년도 %d\n",year);
			System.out.printf("나    이 :[%d]\n",agekor);
			System.out.printf("십이지띠 :[%s]\n",tti);
			System.out.printf("성    별 :[%s]\n",gender);
			System.out.printf("지    역 :[%s]\n",local);
			System.out.printf("계    절 :[%s]\n",season);
			
			
			//또할건지
			System.out.print("또?(y/n)");
			yn = scanner.next();
			
			
			if(!yn.equalsIgnoreCase("Y")) break;
			
			
		}//while_end
		
		System.out.println("---End---");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scanner.close();

	}//

}

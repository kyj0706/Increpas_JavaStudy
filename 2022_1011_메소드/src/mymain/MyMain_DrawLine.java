package mymain;

import myutil.MyLine;

public class MyMain_DrawLine {
	
	
	
	//메인메소드
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int line_length =35;//라인추가 변수
		char title_line_style ='=';
		
		
		char ch1_st='*';
		int line_len1=1;
		char ch2_st='-';
		int line_len2=3;
		int total=13;
		int res;
		
		
		
		
		//성적관리
		System.out.println("          [성적관리] ");
		
		//메소드활용
		MyLine.draw_line(title_line_style, line_length);//MyLine.draw_line(line_length);//MyLine.draw_line();//System.out.println("-------------------------");
		System.out.println("번호 이름  국어 영어 수학 총점 평균");
		MyLine.draw_line('*', line_length);//MyLine.draw_line(line_length);//MyLine.draw_line();//System.out.println("-------------------------");
		System.out.println(" 1  일길동  99   88   88  288   80" );
		System.out.println(" 2  이길동  99   88   88  300   70" );
		MyLine.draw_line(line_length);//MyLine.draw_line();//System.out.println("-------------------------");
		System.out.println("소계       300  349  400" );
		MyLine.draw_line(line_length);//MyLine.draw_line();//System.out.println("-------------------------");
		
		System.out.println();
		
		//내가한거
		MyLine.draw_line1(ch1_st, line_len1, ch2_st, line_len2, total);
		MyLine.draw_line2('*',1,'-',3,line_length);
		MyLine.draw_line2('*',3,'-',1,line_length);
		System.out.println("테스트");
		
		//강사님ver
		MyLine.draw_line('*',1,'-',3,line_length);
		MyLine.draw_line('*',3,'-',1,line_length);
		
		
	}//메인메소드_end

}//클레스_end

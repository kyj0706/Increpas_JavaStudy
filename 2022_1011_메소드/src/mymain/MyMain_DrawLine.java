package mymain;

import myutil.MyLine;

public class MyMain_DrawLine {
	
	
	
	//���θ޼ҵ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int line_length =35;//�����߰� ����
		char title_line_style ='=';
		
		
		char ch1_st='*';
		int line_len1=1;
		char ch2_st='-';
		int line_len2=3;
		int total=13;
		int res;
		
		
		
		
		//��������
		System.out.println("          [��������] ");
		
		//�޼ҵ�Ȱ��
		MyLine.draw_line(title_line_style, line_length);//MyLine.draw_line(line_length);//MyLine.draw_line();//System.out.println("-------------------------");
		System.out.println("��ȣ �̸�  ���� ���� ���� ���� ���");
		MyLine.draw_line('*', line_length);//MyLine.draw_line(line_length);//MyLine.draw_line();//System.out.println("-------------------------");
		System.out.println(" 1  �ϱ浿  99   88   88  288   80" );
		System.out.println(" 2  �̱浿  99   88   88  300   70" );
		MyLine.draw_line(line_length);//MyLine.draw_line();//System.out.println("-------------------------");
		System.out.println("�Ұ�       300  349  400" );
		MyLine.draw_line(line_length);//MyLine.draw_line();//System.out.println("-------------------------");
		
		System.out.println();
		
		//�����Ѱ�
		MyLine.draw_line1(ch1_st, line_len1, ch2_st, line_len2, total);
		MyLine.draw_line2('*',1,'-',3,line_length);
		MyLine.draw_line2('*',3,'-',1,line_length);
		System.out.println("�׽�Ʈ");
		
		//�����ver
		MyLine.draw_line('*',1,'-',3,line_length);
		MyLine.draw_line('*',3,'-',1,line_length);
		
		
	}//���θ޼ҵ�_end

}//Ŭ����_end

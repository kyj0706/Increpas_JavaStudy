package mymain;

import java.util.Scanner;

import myutil.Jumin_t;

public class MyMain_Jumin_t {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		String  jumin_no;
		String  yn = "y";
		
		//�ֹι�ȣ ������ü
		Jumin_t jumin = new Jumin_t();
		
		while(true) {
			
			System.out.print("�ֹι�ȣ(xxxxxx-xxxxxxx):");
			jumin_no = scanner.next();
			
			//�ֹι�ȣ ��ü���� ����
			jumin.setJumin_no(jumin_no);
			
			
			//�ֹι�ȣ ��ü�κ��� �ΰ������� ���´�
			//(����⵵/����/��/����/����/����/����/��ȿ��)
			int year 		= jumin.getYear();
			int age  		= jumin.getAge();
			String tti 		= jumin.getTti2();
			String season 	= jumin.getSeason();
			String local 	= jumin.getLocal();
			String ganji	= jumin.getGanji();
			boolean bValid = jumin.isValid();
			
			
			
			
			if(bValid)//��ȿ�� �ֹι�ȣ
			{
				System.out.println("---[������]---");
				System.out.printf("����⵵ : %d\n",  	year);
				System.out.printf("��    �� : %d(��)\n",age);
				System.out.printf("      �� : %s\n", 	tti);
				System.out.printf("��    �� : %s\n", 	season);
				System.out.printf("������� : %s\n",  	local);
				System.out.printf("��    �� : %s\n", 	ganji);
			}else {
				System.out.println("--[�ֹι�ȣ�� ��ȿ���� �ʽ��ϴ�.]--");
			}
			
			//��?
			System.out.print("��?(y/n):");
			yn = scanner.next();
			
			if(!yn.equalsIgnoreCase("Y"))break;
						
		}//end-while
		
		System.out.println("---End---");
		
		
		scanner.close();
		
		
	}

}

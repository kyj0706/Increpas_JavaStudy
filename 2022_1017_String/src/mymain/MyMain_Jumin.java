package mymain;

import java.util.Scanner;

import myutil.Jumin;

public class MyMain_Jumin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		String jumin_no ;
		String yn ="y";
		
		//�ֹι�ȣ ���� ��ü 
		Jumin jumin = new Jumin();
		
		while(true) {
			System.out.println("�ֹι�ȣ(xxxxxx-xxxxxxx)");
			jumin_no = scanner.next();
			
			
			//�ֹι�ȣ��ü���� ����
			jumin.setJumin_no(jumin_no);
			
			
			//�ֹι�ȣ ��ü�κ��� �ΰ� ������ ���´�.
			//(����⵵/����/��/����/����/����/����/��ȿ��)
			int year = jumin.getYear();
			int agekor = jumin.getAge();
			String gender = jumin.getGender();
			String tti = jumin.getTti();
			String season = jumin.Season();
			String local = jumin.getLocal();
			
			
			System.out.println("---[������]---");
			System.out.printf("����⵵ %d\n",year);
			System.out.printf("��    �� :[%d]\n",agekor);
			System.out.printf("�������� :[%s]\n",tti);
			System.out.printf("��    �� :[%s]\n",gender);
			System.out.printf("��    �� :[%s]\n",local);
			System.out.printf("��    �� :[%s]\n",season);
			
			
			//���Ұ���
			System.out.print("��?(y/n)");
			yn = scanner.next();
			
			
			if(!yn.equalsIgnoreCase("Y")) break;
			
			
		}//while_end
		
		System.out.println("---End---");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scanner.close();

	}//

}

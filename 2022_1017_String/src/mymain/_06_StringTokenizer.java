package mymain;

import java.util.StringTokenizer;

public class _06_StringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sido_list ="���� ��� ��õ ���� �뱸 �λ� ���� ����";
		
		//���ڿ��߿��� ��ū����
		// �и����ع���		: ���� �� ����
		// ��ū(token) 		: �и����ڷ� �и��� ������(����/���/��õ)
		//
		StringTokenizer st = new StringTokenizer(sido_list);
		
		System.out.println(st.countTokens());
		
		while( st.hasMoreTokens()) { //st�� ��ū�� ������ �ֳ�?
			
			String token = st.nextToken();//��ū�� ��������� ������ū���� �̵�
			System.out.println(token);
			
		}
		
		String my_date = "2022/10//17";
		StringTokenizer st1 = new StringTokenizer(my_date, "/");
		
		
		System.out.println("--[StringTokenizer]--");
		while(st1.hasMoreTokens()) {
			String token = st1.nextToken();
			System.out.println(token);
		}
		
		//String class split("�и��������Խ�") =>�迭
		String [] date_array = my_date.split("/");
		//							0        1     2				
		//String [] date_array ={ "2022" , "10",  "17"}
		//System.out.println(date_array.length);
		System.out.println("--[split�� �Ҹ��� ���]--");
		/*������
		for(int i=0; i<3; i++) {
			System.out.println(date_array[i]);
		}
		*/
		
		//length�� 
		for(int i=0; i<date_array.length; i++) {
			System.out.println(date_array[i]);
		}
		
		
	}

}

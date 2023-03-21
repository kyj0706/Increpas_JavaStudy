package mymain;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str ="Java Programming";
		
		System.out.println(str.substring(2, 4));
		
		
		int count =0;
		
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)=='r') count++;
				
		}
		System.out.printf("r's°¹¼ö : %d(°³)\n",count);
		
		
		
	}

}

package myutil;

public class MyInteger {

	public static  String toBinaryString(int n) {
		
		StringBuffer sb = new StringBuffer();
		for(int i=31;i>=0;i--) {
			sb.append(n >> i & 1);
		}
		return sb.toString();
	}
	
	
}

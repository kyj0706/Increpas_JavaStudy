package mymain;

public class _06_MyMain_외부인자 {
	
	//			java.exe mymain._06_MyMayn_외부인자 a b c 
	public static void main(String[] args) {
		//										 0     1    2   <-c첨자
		//					  String[] args = { "a" , "b" ,"c"} 로 들어옴
		// TODO Auto-generated method stub
		
		System.out.println("--외부인자--");
		for(int i=0; i<args.length; i++) {
			System.out.printf("args[%s] : %s\n",i ,args[i]);
		}
		
	}

}

package mymain;

public class _03_String불변적특징 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count =0;
		
		String msg = ++count + " little," + ++count + " little," + ++count + " little Indian";
		
		System.out.println(msg);
		System.out.println(msg.length()); //문자열 길이 출력
		
		
		
		//해결방안
		//StringBuffer()
		StringBuffer sb = new StringBuffer(33);
		
		count =0;
		sb.append(++count);
		sb.append(" little,");
		sb.append(++count);
		sb.append(" little,");
		sb.append(++count);
		sb.append(" little Indian");
		
		
		//StringBuffer내의 값을 String으로 추출
		String msg1 = sb.toString();
		
		System.out.println(msg1);
		System.out.println(msg1.length());
		
		//해결방안2 : String.format() <- 서식에 의한 문자열 생성
		
		int age = 30;
		System.out.printf("나이는 : %d(살)\n",age); //format내의 내용을 화면으려 출력해라
		
		//클래스 명으로 
		//static 메소드
		String str = String.format("나이 : %d(살)\n", age);//format내의 내용을 문자열로 출력(생성)해라
		
		count = 0;//초기화
		String msg2 = String.format("%d little,%d lettle,%d lettle Indian",++count, ++count, ++count);
		System.out.println(msg2);
		
	}

}

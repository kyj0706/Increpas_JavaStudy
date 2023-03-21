package mymain.output;

import java.io.OutputStream;

public class _01_MonitorOutputTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 OutputStream os = System.out; //up_casting 이다.
		 
		 //문자출력
		 os.write(65);//출략버퍼에 쓰인다.
		 
		 os.write('\n');
		 
		 //안녕하세요
		 String msg = "안녕하세요\n";
		 
		 
		 //String -> byte [] 변환 : getBytes()
		 //os.write(byte [])
		 byte [] mag_byte = msg.getBytes();
		 os.write(mag_byte);
		 
		 //123 출력하고 싶다.
		 int n = 123;
		 String s1 = String.valueOf(n);
		 os.write(s1.getBytes());
		 
		 os.write('\n');
		 
		 //true
		 String s2 = String.valueOf(true);
		 os.write(s2.getBytes());
		 
		 
		 os.flush();//출력버퍼내용을 밀어내라.
		 

	}

}

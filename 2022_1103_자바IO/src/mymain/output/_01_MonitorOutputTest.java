package mymain.output;

import java.io.OutputStream;

public class _01_MonitorOutputTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		 OutputStream os = System.out; //up_casting �̴�.
		 
		 //�������
		 os.write(65);//�ⷫ���ۿ� ���δ�.
		 
		 os.write('\n');
		 
		 //�ȳ��ϼ���
		 String msg = "�ȳ��ϼ���\n";
		 
		 
		 //String -> byte [] ��ȯ : getBytes()
		 //os.write(byte [])
		 byte [] mag_byte = msg.getBytes();
		 os.write(mag_byte);
		 
		 //123 ����ϰ� �ʹ�.
		 int n = 123;
		 String s1 = String.valueOf(n);
		 os.write(s1.getBytes());
		 
		 os.write('\n');
		 
		 //true
		 String s2 = String.valueOf(true);
		 os.write(s2.getBytes());
		 
		 
		 os.flush();//��¹��۳����� �о��.
		 

	}

}

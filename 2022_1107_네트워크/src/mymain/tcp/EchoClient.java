package mymain.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		//1. Ŭ���̾�Ʈ ���ϻ���(����)
		// ������ 2����ġ ��û
		Socket client = new Socket("192.168.0.23", 7000);
		
		//2.�޼�������->����Ư 3�� ���ſ��� ó��
		 String msg = "�ɲ����";
		
		OutputStream os = client.getOutputStream();//����
		
		os.write(msg.getBytes());
		
		//3 ���������� �ǵ����� ������ ����
		InputStream is = client.getInputStream();
		byte [] buff = new byte [100];
		int len = is.read(buff);
		
		String readMsg = new String(buff,0,len);
		
		System.out.printf("[Ŭ���̾�Ʈ�� �����κ��� �ǵ��ƿ� ������] : %s\n",readMsg);
		
		
		
		
		

	}

}

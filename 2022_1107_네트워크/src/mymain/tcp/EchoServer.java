package mymain.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		while(true) {
		
		//1. �������ϻ���
		ServerSocket server = new ServerSocket(7000);
		System.out.println("--[���������]--");
		
		//2. ���Ӵ��
		Socket child = server.accept();
		
		//System.out.println("--[���Ӽ���]--");
		
		//3. ����ó��
		InputStream is =child.getInputStream();
		byte [] buff = new byte[100];
		
		int len = is.read(buff);
		String readMsg = new String(buff,0,len);
		System.out.printf("[�������� ���ŵ� ������]:%s\n",readMsg);
		
		
		//4. Client������ �ǵ����ش�.->Ŭ���̾�Ʈ 3�� ����
		OutputStream os = child.getOutputStream();
		os.write(readMsg.getBytes());
		}
	}

}

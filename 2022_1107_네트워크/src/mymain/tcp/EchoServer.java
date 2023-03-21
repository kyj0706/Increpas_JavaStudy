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
		
		//1. 서버소켓생성
		ServerSocket server = new ServerSocket(7000);
		System.out.println("--[서버대기중]--");
		
		//2. 접속대기
		Socket child = server.accept();
		
		//System.out.println("--[접속성공]--");
		
		//3. 수신처리
		InputStream is =child.getInputStream();
		byte [] buff = new byte[100];
		
		int len = is.read(buff);
		String readMsg = new String(buff,0,len);
		System.out.printf("[서버에서 수신된 데이터]:%s\n",readMsg);
		
		
		//4. Client측으로 되돌려준다.->클라이언트 3번 수행
		OutputStream os = child.getOutputStream();
		os.write(readMsg.getBytes());
		}
	}

}

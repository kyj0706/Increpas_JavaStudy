package mymain.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class EchoClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		//1. 클라이언트 소켓생성(연결)
		// 서버측 2번위치 요청
		Socket client = new Socket("192.168.0.23", 7000);
		
		//2.메세지전송->서버특 3번 수신에서 처리
		 String msg = "쪼꼬미찌누";
		
		OutputStream os = client.getOutputStream();//전송
		
		os.write(msg.getBytes());
		
		//3 서버측에서 되돌려준 데이터 수신
		InputStream is = client.getInputStream();
		byte [] buff = new byte [100];
		int len = is.read(buff);
		
		String readMsg = new String(buff,0,len);
		
		System.out.printf("[클라이언트로 측으로부터 되돌아온 데이터] : %s\n",readMsg);
		
		
		
		
		

	}

}

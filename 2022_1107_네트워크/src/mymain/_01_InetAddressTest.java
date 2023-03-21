package mymain;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class _01_InetAddressTest {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		// IP4v : 4 byte ->  "192.168.0.23"
		// IP6v : 16byte 
		
		//IP������ü : InetAddress
		InetAddress  naver = InetAddress.getByName("www.naver.com");

		System.out.printf("Naver IP : [%s]\n", naver.getHostAddress() );
		
		//Domain�� ����� ��� IP�ּ� ���ϱ�
		InetAddress [] naver_array = InetAddress.getAllByName("www.naver.com");
		
		System.out.println("--[www.daum.net]--");
		for(InetAddress naver1 : naver_array) {
			System.out.printf("[%s]\n",naver1.getHostAddress());
			
		}
		
		//Broadcast�ּ�
		InetAddress broadcast = InetAddress.getByName("192.168.0.255");
		System.out.printf("Local Broadcast�ּ� : [%s]\n", broadcast.getHostAddress());
		
		//localhost
		InetAddress localhost = InetAddress.getByName("localhost");
		System.out.printf("Local localhost�ּ� : [%s]\n", localhost.getHostAddress());
		
		

	}

}

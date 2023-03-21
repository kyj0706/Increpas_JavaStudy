package mymain;

import myutil.RemoteCon;
import myutil.Tv;

public class MyMain_Tv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		RemoteCon remoteCon = new Tv();
		
		
		
		
		
		remoteCon.onOff();//ÄÑÁü
		
		//remoteCon.onOff();//²¨Áü

		//remoteCon.volumeUp();
		//remoteCon.volumeDown();
		//remoteCon.channelUp();
		//remoteCon.channelDown();
		//remoteCon.volumeZero();
		//remoteCon.volumeZero();
		remoteCon.setChannel(1);
		
		
		
	
		
		
	}

}

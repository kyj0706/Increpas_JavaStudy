package myutil;

public class Tv implements RemoteCon{
	
	int volume 	= 10;
	int channel	= 9;
	
	boolean bOn = false;			//꺼짐상태
	boolean bVolumeZero = false;	//음소거상태
	
	
	
	//상태확인 
	void display() {
		
		if(bOn) {
			//켜진상태
			System.out.println("--[TV On]--");
			System.out.printf("채널 : %d\n",channel);
			if(bVolumeZero) {
				System.out.println("볼륨 : 음소거");
			}else {
				System.out.printf("볼륨 : %d\n",volume);
			}
			System.out.println("===============================");
		}else {
			//꺼진상태
			System.out.println("--[TV Off]--");
			System.out.println("===============================");
		}
		
	}

	
	
	
	
	
	
	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		
		if(bOn==false) return;
		
		channel++;
		if(channel>Channel.MAX)
			channel = Channel.MIN;
		display();
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		
		if(bOn==false) return;
		channel--;
		if(channel < Channel.MIN)
			channel = Channel.MAX;
		display();
		
		
	}

	@Override
	public void setChannel(int channel) {
		// TODO Auto-generated method stub
		if(bOn ==false) return;
		if(channel >Channel.MAX) {
			channel=Channel.MIN;
		}else if (channel<Channel.MIN) {
			channel =Channel.MAX;
			
		}
		this.channel=channel;
		display();
		
		
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		
		//TV가 꺼진상태에서는 동작하지 말아라
		if(bOn==false) return;
		
		volume++;
		if(volume > Volume.MAX)
			volume = Volume.MAX;
		display();
		
		
		
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		if(bOn==false) return;
		
		volume--; 
		if(volume > Volume.MAX)
			volume = Volume.MIN;
		
		display();
		
	}

	@Override
	public void volumeZero() {
		// TODO Auto-generated method stub
		if(bOn==false) return;
			
		bVolumeZero =! bVolumeZero;
		
		
			
			display();
				
	}

	@Override
	public void onOff() {
		// TODO Auto-generated method stub
		//Toggle방식  True <-> false
		bOn = !bOn;
		
		display();
		
		
	}

}

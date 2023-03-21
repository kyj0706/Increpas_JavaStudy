package myutil;

public class Tv implements RemoteCon{
	
	int volume 	= 10;
	int channel	= 9;
	
	boolean bOn = false;			//��������
	boolean bVolumeZero = false;	//���ҰŻ���
	
	
	
	//����Ȯ�� 
	void display() {
		
		if(bOn) {
			//��������
			System.out.println("--[TV On]--");
			System.out.printf("ä�� : %d\n",channel);
			if(bVolumeZero) {
				System.out.println("���� : ���Ұ�");
			}else {
				System.out.printf("���� : %d\n",volume);
			}
			System.out.println("===============================");
		}else {
			//��������
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
		
		//TV�� �������¿����� �������� ���ƶ�
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
		//Toggle���  True <-> false
		bOn = !bOn;
		
		display();
		
		
	}

}

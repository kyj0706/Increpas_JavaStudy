package mymain;


//Thread���� ���1: ���
class MyThread extends Thread{
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" ����....");
	}
}


//Thread���� ���2: Runnable(���ఴü����)
class MyRunnable implements Runnable{
	
	//�߻�ȭ (������ �ʼ�)
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" ����....");
		
	}
	
}


public class _01_ThreadTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main method�� �����ϴ� ������ �Ҵ�
		//Primary Thread(�־�����)
		
		
		//���1 ������ �Ҵ���� �ʾҴ�
		Thread t1 = new MyThread();
		//�������Ҵ�
		t1.start(); //start �ؾ� (�ϲ�1) �Ҵ� �� 
		
		//���2
		Runnable r = new MyRunnable();  //���ఴü
		Thread t2 = new Thread(r);		//������ü ������ ���ఴü ����
		//�������Ҵ�
		t2.start();

	}

}

package mymain;


//Thread생성 방법1: 상속
class MyThread extends Thread{
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" 수행....");
	}
}


//Thread생성 방법2: Runnable(수행객체별도)
class MyRunnable implements Runnable{
	
	//추상화 (재정의 필수)
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+" 수행....");
		
	}
	
}


public class _01_ThreadTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main method를 수행하는 쓰레드 할당
		//Primary Thread(주쓰레드)
		
		
		//방법1 아직은 할당되지 않았다
		Thread t1 = new MyThread();
		//쓰레드할당
		t1.start(); //start 해야 (일꾼1) 할당 됨 
		
		//방법2
		Runnable r = new MyRunnable();  //수행객체
		Thread t2 = new Thread(r);		//관리객체 생성시 수행객체 연결
		//쓰레드할당
		t2.start();

	}

}

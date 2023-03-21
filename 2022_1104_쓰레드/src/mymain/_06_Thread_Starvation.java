package mymain;


class TestRunnable2 implements Runnable
{
	
	int money = 1000;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();
		
		while(true) {
			
			synchronized (this) 
			{
			
				//잠든 쓰레드 깨우기
				if(money > 100)
				   notify();
				
				money = money - 100;
				
				
				System.out.printf("[%s] 100원 먼저(%d)\n", name, money);
				
				try {
					
					//잠든다
					wait();
					
					
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
			
		}//end-while
		
	}//end-run
}


public class _06_Thread_Starvation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Runnable r  = new TestRunnable2();
        
        Thread t1 = new Thread(r, "1_형님");
        Thread t2 = new Thread(r, "2_아우");
        
        t1.start();
        t2.start();
        
        
	}

}

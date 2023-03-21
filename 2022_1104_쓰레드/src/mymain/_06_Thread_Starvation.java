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
			
				//��� ������ �����
				if(money > 100)
				   notify();
				
				money = money - 100;
				
				
				System.out.printf("[%s] 100�� ����(%d)\n", name, money);
				
				try {
					
					//����
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
        
        Thread t1 = new Thread(r, "1_����");
        Thread t2 = new Thread(r, "2_�ƿ�");
        
        t1.start();
        t2.start();
        
        
	}

}

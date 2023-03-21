package mymain;

class TestRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();

		while (true) {

			synchronized (this) 
			{
				//일어나 (잠든 쓰래드 깨우기)
				notify();
				
				
				System.out.printf("[%s] 먼저\n", name);

				try {
					//자라
					wait();
					
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}

public class _05_Thread_Fairness {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runnable r = new TestRunnable();

		Thread t1 = new Thread(r, "1_형님");
		Thread t2 = new Thread(r, "2_아우");

		t1.start();
		t2.start();

	}

}

package mymain;

class TestRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		String name = Thread.currentThread().getName();

		while (true) {

			synchronized (this) 
			{
				//�Ͼ (��� ������ �����)
				notify();
				
				
				System.out.printf("[%s] ����\n", name);

				try {
					//�ڶ�
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

		Thread t1 = new Thread(r, "1_����");
		Thread t2 = new Thread(r, "2_�ƿ�");

		t1.start();
		t2.start();

	}

}

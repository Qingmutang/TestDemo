package tony.test.ali;

public class ThreadTest {
	
 
		
		static int count = 1;
		static final Object obj = new Object();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				while (true) {
					synchronized (obj) {
						if (count % 3 == 1&&count<=100) {
							System.out.println(Thread.currentThread().getName()+":"+count);
							count++;
							obj.notifyAll();
						} else
							try {
								obj.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
					}
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				while (true) {
					synchronized (obj) {
						if (count % 3 == 2&&count<=100) {
							System.out.println(Thread.currentThread().getName()+":"+count);
							count++;
							obj.notifyAll();
						} else
							try {
								obj.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
					}
				}
			}
		});
		Thread t3 = new Thread(new Runnable() {
			public void run() {
				while (true) {
					synchronized (obj) {
						if (count % 3 == 0&&count<=100) {
							System.out.println(Thread.currentThread().getName()+":"+count);
							count++;
							obj.notifyAll();
						} else
							try {
								obj.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
					}
				}
			}
		});
	 
		public void fun() {
			
			t1.start();
			t2.start();
			t3.start();
		}
	 
		public static void main(String[] args) {
			System.out.println("===start====");
			ThreadTest tp = new ThreadTest();
			long t1 = System.currentTimeMillis();
			tp.fun();
			while (true){
				
				if(count>100) {
					System.out.println("===end====");
					System.exit(0);
				}
				
			}
			
			
			
		}
	

	
}

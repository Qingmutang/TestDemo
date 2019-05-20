package tony.test.ali.semph;

import java.util.concurrent.Semaphore;
/**
 * 顺序执行
 * @author 
 *
 */
public class SemphTest {
	static volatile int count= 1;
	
	static Semaphore p1 = new Semaphore(1);
	static Semaphore p2 = new Semaphore(2);
	static Semaphore p3 = new Semaphore(3);
	
	Thread a = new Thread(
			new Runnable() {
				
				public void run() {
					try {
						p2.acquire();
						p3.acquire();
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
				
					
					while (count<=100) {
						if(count%3==1) {
							try {
								p1.acquire();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							if(count<=100)
							System.out.println(Thread.currentThread().getName()+":"+count);
							count++;
						
							p2.release();
						}
						
					}
					
				}
			});
	
	Thread b = new Thread(
			new Runnable() {
				
				public void run() {
					while (count<=100) {
						if(count%3==2) {
							try {
								p2.acquire();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							if(count<=100)
							System.out.println(Thread.currentThread().getName()+":"+count);
							count++;
							
							p3.release();
						}
					}
					
				}
			});
	
	Thread c = new Thread(
			new Runnable() {
				
				public void run() {
					while (count<=100) {
						if(count%3==0) {
							try {
								p3.acquire();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							if(count<=100)
							System.out.println(Thread.currentThread().getName()+":"+count);
							count++;
							
							p1.release();
						}
					
					}
					
				}
			});
	
	public void startFun() {
	
		try {
			a.start();
			b.start();
			c.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		SemphTest test = new SemphTest();
		test.startFun();
		
	}

}

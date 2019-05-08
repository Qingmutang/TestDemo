package tony.test.current;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * 说明：Semaphore是一种在多线程环境下使用的设施，该设施负责协调各个线程，
 *      以保证它们能够正确、合理的使用公共资源的设施，也是操作系统中用于控制进程同步互斥的量。
 *      Semaphore是一种计数信号量，用于管理一组资源，内部是基于AQS的共享模式。
 *      它相当于给线程规定一个量从而控制允许活动的线程数。
 * semaphor ：信号量
 *    acquire():从此信号量获取一个许可前线程将一直阻塞。相当于一辆车占了一个车位
 *    release():释放一个许可，将其返回给信号量。就如同车开走返回一个车位。
 * 
 * 底层：使用cas无锁机制 乐观锁实现
 *    
 * 实例： 
    10个人去银行存款，但是该银行只有5个办公柜台，有空位则上去存钱，没有空位则只能去排队等待
 *    
 * @author 
 *
 */
public class SemaphoreTest  {

	private static final Semaphore semaphore = new Semaphore(5);
	/**线程池*/
	private static final Executor executor = Executors.newFixedThreadPool(3);
	
	static class RunPrivate implements Runnable{

		public void run() {
			
			System.out.println("current Thread:  "+Thread.currentThread().getName()+"==="); 
			
			try {
				/**执行后面的操作，需要获取到资源才执行后面的逻辑*/
		        semaphore.acquire();
			    businessHandler();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}finally {
				/**执行完，释放资源*/
				semaphore.release();
			}
			
		}
		
	}
	
	public static void businessHandler() {
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * out:
	 current Thread:  pool-1-thread-1===
	 current Thread:  pool-1-thread-2===
	 current Thread:  pool-1-thread-3===
	 current Thread:  pool-1-thread-2===
	 current Thread:  pool-1-thread-3===
	 current Thread:  pool-1-thread-1===
	 current Thread:  pool-1-thread-1===
	 current Thread:  pool-1-thread-2===
	 current Thread:  pool-1-thread-3===
	 current Thread:  pool-1-thread-1===
	 */
	public static void main(String[] args) {
		
		try {
			for (int i = 0; i < 10; i++) {
				
				executor.execute(new RunPrivate());
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}

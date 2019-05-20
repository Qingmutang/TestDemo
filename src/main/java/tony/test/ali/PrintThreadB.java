package tony.test.ali;

public class PrintThreadB extends Thread {

	public void run() {
		for(int i=1;i<=100;i++) {
			if(i%3==2) {
				System.out.println(Thread.currentThread().getName()+":"+i); 
			}
		}
			
		}

}

package tony.test.ali;

public class PrintThreadC extends Thread {

	public void run() {
		for(int i=1;i<=100;i++) {
			if(i%3==1) {
				System.out.println(Thread.currentThread().getName()+":"+i); 
			}
		}
			
		}

}

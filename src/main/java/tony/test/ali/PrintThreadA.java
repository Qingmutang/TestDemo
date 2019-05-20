package tony.test.ali;

public class PrintThreadA extends Thread {
	public boolean flag;
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public void run() {
		for(int i=1;i<=100;i++) {
			
			if(i%3==1) {
				System.out.println(Thread.currentThread().getName()+":"+i); 
			}
		}
			
		}

}

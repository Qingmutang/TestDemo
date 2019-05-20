package tony.test.adapter;

/**
 * 直接持有原对象，调用原有逻辑就可以
 * @author 
 *
 */
public class PrintBanner2 implements Print{
	Banner banner;
	
	public PrintBanner2(Banner banner) {
		this.banner = banner;
	}

	public void printWeak() {
		banner.showWithAster();
		
	}

	public void printStrong() {
		banner.showWithPaten();
		
	}
	

}

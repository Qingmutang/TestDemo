package tony.test.adapter;

public class PrintBanner extends Banner implements Print{
	
	public PrintBanner(String string) {
		super(string);
	}

	public void printWeak() {
		showWithPaten();
		
	}

	public void printStrong() {
		showWithAster();
		
	}

}

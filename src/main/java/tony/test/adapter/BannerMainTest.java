package tony.test.adapter;

public class BannerMainTest {
	public static void main(String[] args) {
		Print print  = new PrintBanner("banner");
		print.printWeak();
		print.printStrong();
	}

}

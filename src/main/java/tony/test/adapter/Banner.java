package tony.test.adapter;

/**
 * 原有类
 * @author  
 *
 */
public class Banner {
  private String string;
  public Banner(String string) {
	  this.string = string;
  }
  
  public void showWithPaten() {
	  System.out.println("("+string+")");
  }
  
  public void showWithAster() {
	  System.out.println("*"+string+"*");
  }
	
}

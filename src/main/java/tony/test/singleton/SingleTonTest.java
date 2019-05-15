package tony.test.singleton;

public class SingleTonTest {

	
   private SingleTonTest() {
	   
   }
   
   public static SingleTonTest getInstance() {
	   return new SingleTonTest();
   }
}

/**
 * 编译失败  子类的创建依赖父类构造器，而父类是私有的
 * @author 
 *
 */
//class SonTest extends SingleTonTest{
//	
//}

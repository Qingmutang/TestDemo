package tony.test.decorate;
/**
 * 装饰器模式
 * @author 
 *
 */
public abstract class Beverage {
	protected String desc = "Unknow Beverage"; 
	
	public String getDesc() {
		return desc;
	}
	
	public abstract double cost();

}

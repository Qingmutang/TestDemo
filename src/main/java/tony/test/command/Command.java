package tony.test.command;
/**
 * 和简单的组合不同，这里相当于有两个接口1.父类接口，统一execute 2.light 抽象接口，组合 在execute里面调用light里面的实现
 * 
 * @author 
 *
 */
public interface Command {
	
	public void execute();

}

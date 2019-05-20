package tony.test.command;

/**
 * 
 * 简单看，和适配器模式长得一样，都是持有一个功能对象，然后调用这个对象的实现方法。
 * 
 * @author 
 *
 */
public class LightOnCommand implements Command {
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	

	public void execute() {
		light.on();

	}

}

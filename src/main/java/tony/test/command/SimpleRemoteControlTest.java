package tony.test.command;

public class SimpleRemoteControlTest {
	public static void main(String[] args) {
		SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
		Light light = new Light() {
			
			@Override
			public void on() {
				System.out.println("light on...");
				
			}
			
			@Override
			public void off() {
				System.out.println("light off...");
				
			}
		};
		
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		simpleRemoteControl.setCommand(lightOnCommand); 
		simpleRemoteControl.buttonWasPressed();
		
	}

}

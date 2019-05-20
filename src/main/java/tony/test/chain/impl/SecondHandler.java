package tony.test.chain.impl;

import tony.test.chain.Handler;

public class SecondHandler implements Handler {

	public boolean handle() {
		System.out.println("second handler");
		return true;
	}

}

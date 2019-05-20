package tony.test.chain.impl;

import tony.test.chain.Handler;

public class FirstHandler implements Handler {

	public boolean handle() {
		System.out.println("first handler");
		return true; 
	}

}

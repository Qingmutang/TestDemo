package tony.test.chain.impl;

import tony.test.chain.Handler;
import tony.test.chain.HandlerChain;

public class HandlerChainTest {

	public static void main(String[] args) {
		HandlerChain chain = new HandlerChain();
		Handler firstHandler = new FirstHandler();
		Handler secondHandler = new SecondHandler();
		chain.addHandler(firstHandler);
		chain.addHandler(secondHandler);
		
		System.out.println(chain.doHandler());
		
	}

}

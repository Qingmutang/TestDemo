package tony.test.chain;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;

public class HandlerChain {

	List<Handler> handlers;

	public HandlerChain() {
		handlers = new ArrayList<Handler>();
	}

	public void addHandler(Handler handler) {
		if (handler == null) {
			return;
		}
		handlers.add(handler);
	}

	public boolean doHandler() {
		if (CollectionUtils.isEmpty(handlers)) {
			return true;
		}
		for (Handler handler : handlers) {

			if (handler != null) {
				if (!handler.handle()) {
					return false;
				}
			}

		}
		return true;
	}

}

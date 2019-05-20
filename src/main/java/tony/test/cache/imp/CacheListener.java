package tony.test.cache.imp;

import java.util.Set;

public class CacheListener {

	private CacheManagerImpl cacheManagerImpl;

	public CacheListener(CacheManagerImpl cacheManagerImpl) {
		super();
		this.cacheManagerImpl = cacheManagerImpl;
	}
	
	public void startListen() {
		new Thread() {
			public void run() {
				
				while(true) {
					Set<String> keySet = cacheManagerImpl.getAllKeys();
					for (String key : keySet) {
						if(cacheManagerImpl.isTimeOut(key)) {
							cacheManagerImpl.clearByKey(key); 
							
						}
					}
				}
			}
			
		}.start();
	}
	
}

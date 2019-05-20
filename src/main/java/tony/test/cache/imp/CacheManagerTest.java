package tony.test.cache.imp;

public class CacheManagerTest {
	public static void main(String[] args) {
		CacheManagerImpl cacheManagerImpl = new CacheManagerImpl();
		cacheManagerImpl.putChache("aa", "bb", System.currentTimeMillis()+30000);
		
		CacheListener cacheListener = new CacheListener(cacheManagerImpl);
		cacheListener.startListen();
		
		
		
	}

}

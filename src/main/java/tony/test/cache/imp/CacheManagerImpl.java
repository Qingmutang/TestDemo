package tony.test.cache.imp;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import tony.test.cache.ICacheManager;

public class CacheManagerImpl implements ICacheManager {
	private static Map<String, CacheEntity> caches = new ConcurrentHashMap<String, CacheEntity>();
	

	public void putChache(String key, Object obj, long timeOut) {
		timeOut = timeOut>0?timeOut:0L;
		
        putCache(key, new CacheEntity(obj, timeOut, System.currentTimeMillis())); 
	}
	
	public void putCache(String key, CacheEntity entity) {
		caches.put(key, entity);
		
	}

	public CacheEntity getCacheEntity(String key) {
		if(this.isContanis(key)) {
			return caches.get(key);
		}
		
		return null;
	}
	
	public Object getCacheDataByKey(String key) {
		if(this.isContanis(key)) {
			return caches.get(key).getDatas();
		}
		return null;
	}

	public boolean isContanis(String key) {
		
		return caches.containsKey(key);
	}

	public void clearAll() {
		caches.clear();

	}

	public void clearByKey(String key) {
		if(this.isContanis(key)) {
			caches.remove(key);
		}

	}

	public boolean isTimeOut(String key) {
		if(!caches.containsKey(key)) {
			return true;
		}
		CacheEntity cacheEntity = caches.get(key);
		long timeOut = cacheEntity.getTimeOut();
		long lastRefreshTime = cacheEntity.getLastRefreshTime(); 
		
		if(timeOut==0||System.currentTimeMillis()>cacheEntity.getTimeOut()) {
			return true;
		}
		
		return false;
	}

	public Set<String> getAllKeys() {
		
		return caches.keySet();
	}



}

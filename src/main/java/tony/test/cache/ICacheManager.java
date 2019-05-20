package tony.test.cache;

import java.util.Set;

import tony.test.cache.imp.CacheEntity;

public interface ICacheManager {
	
	public void putCache(String key,CacheEntity entity);
	
	public void putChache(String key,Object obj,long timeOut);
	
	public Object getCacheDataByKey(String key);
	
	public CacheEntity getCacheEntity(String key);
	
	public boolean isContanis(String key);

	void clearAll();
	
	void clearByKey(String key);
	
	boolean isTimeOut(String key);
	
	Set<String> getAllKeys();
	
}

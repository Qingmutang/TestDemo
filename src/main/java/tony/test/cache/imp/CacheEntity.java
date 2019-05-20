package tony.test.cache.imp;

public class CacheEntity {
	
	/**
	 * 保存的数据
	 */
	private Object datas;
	
	/**
	 * 设置数据失效时间,为0表示永不失效
	 */
	private long timeOut;
	
	/**
	 * 最后刷新时间
	 */
	private long lastRefreshTime;
	
	

	public CacheEntity(Object datas, long timeOut, long lastRefreshTime) {
		super();
		this.datas = datas;
		this.timeOut = timeOut;
		this.lastRefreshTime = lastRefreshTime;
	}

	public Object getDatas() {
		return datas;
	}

	public void setDatas(Object datas) {
		this.datas = datas;
	}

	public long getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(long timeOut) {
		this.timeOut = timeOut;
	}

	public long getLastRefreshTime() {
		return lastRefreshTime;
	}

	public void setLastRefreshTime(long lastRefreshTime) {
		this.lastRefreshTime = lastRefreshTime;
	}
	
	

}

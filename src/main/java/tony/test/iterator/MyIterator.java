package tony.test.iterator;

public interface MyIterator {
    /**
     * 1.判断是否还有下一个元素
     * 
     * @return
     */
	public abstract boolean hasNext();
	
	/**
	 * 1.返回下一元素
	 * 2.同时指针下移
	 * 
	 * @return
	 */
	public abstract Object next();
	
}

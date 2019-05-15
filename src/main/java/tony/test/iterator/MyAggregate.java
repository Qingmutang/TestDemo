package tony.test.iterator;

/**
 * 
 * 作为遍历集合的接口 -- 表示继承了这个接口的集合都有遍历能力
 * 
 * @author
 *
 */
public interface MyAggregate {
	
	public abstract MyIterator iterator();

}

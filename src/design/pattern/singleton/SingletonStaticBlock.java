package design.pattern.singleton;

/**
 * @author msg4m <br>
 *         Static block initialization is similar to eager initialization,
 *         except that the instance of the class is created in the static block
 *         that provides the <blockquote>option for exception
 *         handling</blockquote>.
 * 
 */
public class SingletonStaticBlock {

	String name;
	int age;

	private static SingletonStaticBlock instance = null;

	// Private Constructor
	private SingletonStaticBlock(String name, int age) {
		this.name = name;
		age = this.age;
	}

	static {
		try {
			instance = new SingletonStaticBlock("MyName", 33);
		} catch (Exception e) {
			throw new RuntimeException("Exception while instantiating class 'SingletonStaticBlock' ");
		}
	}

	public static SingletonStaticBlock getInstance() {
		return instance;
	}

}

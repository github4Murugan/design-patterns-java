/**
 * 
 */
package design.pattern.singleton;

/**
 * @author msg4m <br>
 *         *Bill Pugh was the main force behind Java memory model changes. His
 *         principle “Initialization-on-demand holder idiom” also uses static
 *         blocks but in a different way.
 * 
 *         <br>
 * 		It suggests using a static inner class. Notice the private inner
 *         static class that contains the instance of the singleton class. When
 *         the singleton class is loaded, the SingletonHelper class is not
 *         loaded into memory, and only when someone calls the getInstance
 *         method, does this class get loaded and create the Singleton class
 *         instance.
 * 
 *         <br>
 * 		This is the most widely used approach for Singleton classes, as it
 *         doesn’t require synchronization. I am using this approach in many of
 *         my projects, and it’s easy to understand and implement, too.
 * 
 */
public class SingletonBillPughInnerClass {
	private SingletonBillPughInnerClass() {
	}

	private static class SingletonHelper {
		private static final SingletonBillPughInnerClass instance = new SingletonBillPughInnerClass();
	}

	public static SingletonBillPughInnerClass getInstance() {
		return SingletonHelper.instance;
	}
}

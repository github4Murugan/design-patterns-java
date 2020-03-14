/**
 * 
 */
package design.pattern.singleton;

/**
 * @author msg4m <br>
 *         In eager initialization, the instance of Singleton Class is
 *         <blockquote>created at the time of class loading</blockquote> . This
 *         is the easiest method to create a Singleton class, but it has the
 *         drawback of the instance being created even though client
 *         <blockquote>application might not be using it</blockquote>.
 * 
 */
public class SingletonEagerInitialization {

	private static SingletonEagerInitialization instance = new SingletonEagerInitialization();

	// Private Constructor
	private SingletonEagerInitialization() {

	}

	public static SingletonEagerInitialization getInstance() {
		return instance;
	}
}

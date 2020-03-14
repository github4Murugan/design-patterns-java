package design.pattern.singleton;

/**
 * 
 * @author msg4m <br>
 *         Lazy initialization is a method to implement the Singleton pattern to
 *         create an instance in the global access method.
 * 
 *         <br>
 *         The above implementation works fine in case of a single-threaded
 *         environment, but when it comes to multithreaded systems, <br>
 * 		it can cause issues if multiple threads are inside the if loop at the
 *         same time. It will destroy the singleton pattern, and both threads
 *         will get the different instances of the singleton class.</b>
 * 
 */
public class SingletonLazyInitialized {

	private static SingletonLazyInitialized instance;

	private SingletonLazyInitialized() {

	}

	public static SingletonLazyInitialized getInstance() {
		if (instance == null) {
			instance = new SingletonLazyInitialized();
		}
		return instance;
	}
}

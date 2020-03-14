package design.pattern.singleton;

/**
 * @author msg4m The easier way to create a thread-safe singleton class is to
 *         make the global access method synchronized so that only one thread
 *         can execute this method at a time. The general implementation of this
 *         approach is like the following class:
 * 
 */
public class SingletonThreadSafe {

	private static SingletonThreadSafe instance;

	private SingletonThreadSafe() {

	}

	public static synchronized SingletonThreadSafe getInstance() {
		if (instance == null) {
			instance = new SingletonThreadSafe();
		}
		return instance;
	}

	public static SingletonThreadSafe getInstance1() {
		if (instance == null) {
			synchronized (SingletonThreadSafe.class) {
				instance = new SingletonThreadSafe();
			}
		}
		return instance;
	}
}

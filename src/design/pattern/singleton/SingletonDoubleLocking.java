/**
 * 
 */
package design.pattern.singleton;

/**
 * @author msg4m <br>
 *         <b>SingletonLazyInitialized<b> implementation works fine and provides
 *         thread-safety, but it reduces performance because of the cost
 *         associated with the synchronized method, although we need it only for
 *         the first few threads that might create the separate instances (Read:
 *         Java Synchronization).
 * 
 *         <br>
 *         To avoid this extra overhead every time, the double-checked locking
 *         principle is used. In this approach, the synchronized block is used
 *         inside the if condition with an additional check to ensure that only
 *         one instance of the singleton class is created. Let's see how.
 * 
 *         <br>
 *         Suppose there are two threads, T1 and T2. Both come to create
 *         an instance and execute “instance==null”. Now both threads have
 *         identified the instance variable as null and thus assume they must
 *         create an instance. They sequentially go to a synchronized block and
 *         create the instances. In the end, we have two instances in our
 *         application.
 * 
 */
public class SingletonDoubleLocking {
	private static SingletonDoubleLocking instance;
	private static Object lock = new Object();

	private SingletonDoubleLocking() {
	}

	public static SingletonDoubleLocking getInstance() {
		SingletonDoubleLocking tempInstance = instance;
		if (tempInstance == null) {
			synchronized (lock) {
				tempInstance = instance;
				if (tempInstance == null) {
					tempInstance = new SingletonDoubleLocking();
					instance = tempInstance;
				}
			}
		}
		return tempInstance;
	}

}

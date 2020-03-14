/**
 * 
 */
package design.pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author msg4m When you run the above test class, you will notice that the
 *         hashcode of both the instances is not same, whcih destroys the
 *         Singleton pattern. Reflection is very powerful and used in a lot of
 *         frameworks like Spring and Hibernate.
 * 
 */
public class DestroySingletonByReflection {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SingletonLazyInitialized instanceOne = SingletonLazyInitialized.getInstance();
		SingletonLazyInitialized instanceTwo = null; // SingletonEagerInitialization.getInstance();
		try {
			Constructor[] constructors = SingletonLazyInitialized.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instanceTwo = (SingletonLazyInitialized) constructor.newInstance();
				break;
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());

	}
}

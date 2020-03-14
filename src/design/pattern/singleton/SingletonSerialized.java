/**
 * 
 */
package design.pattern.singleton;

import java.io.Serializable;

/**
 * @author msg4m
 *
 */
public class SingletonSerialized implements Serializable {
	private static final long serialVersionUID = 6120448684397325573L;
	private static SingletonSerialized instance;

	private SingletonSerialized() {
	}

	public static SingletonSerialized getInstance() {
		if (instance == null) {
			instance = new SingletonSerialized();
		}
		return instance;
	}
	 protected Object readResolve() {
	        return instance;

	    }
}

package design.pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 * @author msg4m
 * 
 *         It destroys the Singleton design pattern. To overcome this scenario,
 *         all we need to do is provide the implementation of the readResolve()
 *         method. This method will be invoked when you \ deserialize the
 *         object. Inside this method, you must return the existing instance to
 *         ensure a single instance application-wide.
 * 
 *         protected Object readResolve() 
 *         { return instance; }
 * 
 */
public class SingletonSerializedTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SingletonSerialized instanceOne = SingletonSerialized.getInstance();
		SingletonSerialized instanceTwo;

		serialize(instanceOne);
		instanceTwo = deSerialize();

		System.out.println(instanceOne.hashCode());
		System.out.println(instanceTwo.hashCode());
	}

	private static void serialize(SingletonSerialized singletonSerialized) throws IOException {
		ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream("instance.obj"));
		OOS.writeObject(singletonSerialized);
		OOS.close();
	}

	private static SingletonSerialized deSerialize() throws IOException, ClassNotFoundException {

		ObjectInputStream OIS = new ObjectInputStream(new FileInputStream("instance.obj"));

		Object obj = OIS.readObject();

		if (obj.getClass().equals(SingletonSerialized.class))
			return (SingletonSerialized) obj;
		else
			return null;

	}

}

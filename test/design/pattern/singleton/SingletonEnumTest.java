package design.pattern.singleton;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SingletonEnumTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		SingletonEnum instance = SingletonEnum.INSTANCE;
		SingletonEnum instance1 = SingletonEnum.INSTANCE;
		assertTrue(SingletonEnum.INSTANCE instanceof SingletonEnum);
		assertEquals(instance.Name, instance1.Name);
	}

}

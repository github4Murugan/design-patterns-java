package design.pattern.singleton;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SingletonEagerInitializationTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		System.out.println("setUpBeforeClass...");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {

		System.out.println("tearDownAfterClass...");
	}

	@Before
	public void setUp() throws Exception {

		System.out.println("setUp...");
	}

	@After
	public void tearDown() throws Exception {

		System.out.println("tearDown...");
	}

	@Test
	public void test() {
		SingletonEagerInitialization instance = SingletonEagerInitialization.getInstance();
		SingletonEagerInitialization instance1 = SingletonEagerInitialization.getInstance();
		assertNotNull(instance);
		assertTrue(instance instanceof SingletonEagerInitialization);
		
		assertEquals(instance, instance1);
		assertTrue(instance.equals(instance1));
	}

}

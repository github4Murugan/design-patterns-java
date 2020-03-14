package design.pattern.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonStaticBlockTest {

	@Test
	public void testFailtoCreateInsance() {
		// SingletonStaticBlock instance = new SingletonStaticBlock();
	}

	@Test
	public void testgetInsance() {
		SingletonStaticBlock instance = SingletonStaticBlock.getInstance();
		SingletonStaticBlock instance1 = SingletonStaticBlock.getInstance();

		assertNotNull(instance);
		assertTrue(instance instanceof SingletonStaticBlock);
		assertEquals(instance, instance1);
		assertTrue(instance.equals(instance1));

	}

}

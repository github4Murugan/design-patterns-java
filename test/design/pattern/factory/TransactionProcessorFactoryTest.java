package design.pattern.factory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TransactionProcessorFactoryTest {

	TransactionProcessor processor;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		processor = null;
	}

	@Test
	public void testDifferentProcessort() {
		processor = TransactionProcessorFactory.getProcessor("APPLE"); 
		assertTrue(processor instanceof AppleProcessor);
		
		processor = TransactionProcessorFactory.getProcessor("SAMSUNG"); 
		assertTrue(processor instanceof SamsungProcessor);
		
		processor = TransactionProcessorFactory.getProcessor("GOOGLE"); 
		assertTrue(processor instanceof GoogleProcessor);
		
		processor = TransactionProcessorFactory.getProcessor("CLOUD"); 
		assertTrue(processor instanceof CloudProcessor);
	}
	
	@Test ( expected = NullPointerException.class)
	public void testNull() {
		processor = TransactionProcessorFactory.getProcessor(""); 
	}
	
	@Test ( expected = NullPointerException.class)
	public void testNull1() {
		processor = TransactionProcessorFactory.getProcessor(null); 
	}

}

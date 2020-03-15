package design.pattern.factory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class WalletTypeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testType() {
		assertEquals("APPLE",WalletType.APPLE.getType());
		assertEquals("SAMSUNG",WalletType.SAMSUNG.getType());
		assertEquals("GOOGLE",WalletType.GOOGLE.getType());
		assertEquals("CLOUD",WalletType.CLOUD.getType());
	}

	@Test
	public void testGetWallettype() {
		assertEquals(WalletType.APPLE, WalletType.getWallettype("APPLE"));
		assertEquals(WalletType.SAMSUNG, WalletType.getWallettype("SAMSUNG"));
		assertEquals(WalletType.GOOGLE, WalletType.getWallettype("GOOGLE"));
		assertEquals(WalletType.CLOUD, WalletType.getWallettype("CLOUD"));
	}

}

package lambdasinaction.chap11;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.concurrent.Future;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AsyncShopTest {
	@Test
	public void testAsyncShop_1()
		throws Exception {
		String name = "aaaa";

		AsyncShop result = new AsyncShop(name);

		assertNotNull(result);
	}

	@Test
	public void testGetPrice_1()
		throws Exception {
		AsyncShop fixture = new AsyncShop("");
		String product = "";

		Future<Double> result = fixture.getPrice(product);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.lang.String.charAt(Unknown Source)
		//       at lambdasinaction.chap11.AsyncShop.<init>(AsyncShop.java:17)
		assertNotNull(result);
	}

	@BeforeEach
	public void setUp()
		throws Exception {
	}

	@AfterEach
	public void tearDown()
		throws Exception {
	}

}
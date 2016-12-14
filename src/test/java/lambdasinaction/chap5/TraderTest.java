package lambdasinaction.chap5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TraderTest {
	@Test
	public void testTrader_1()
		throws Exception {
		String n = "";
		String c = "";

		Trader result = new Trader(n, c);

		assertNotNull(result);
		assertEquals("Trader: in ", result.toString());
		assertEquals("", result.getName());
		assertEquals("", result.getCity());
	}

	@Test
	public void testGetCity_1()
		throws Exception {
		Trader fixture = new Trader("", "");

		String result = fixture.getCity();

		assertEquals("", result);
	}

	@Test
	public void testGetName_1()
		throws Exception {
		Trader fixture = new Trader("", "");

		String result = fixture.getName();

		assertEquals("", result);
	}

	@Test
	public void testSetCity_1()
		throws Exception {
		Trader fixture = new Trader("", "");
		String newCity = "";

		fixture.setCity(newCity);

	}

	@Test
	public void testToString_1()
		throws Exception {
		Trader fixture = new Trader("", "");

		String result = fixture.toString();

		assertEquals("Trader: in ", result);
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
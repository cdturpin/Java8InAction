package lambdasinaction.chap5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TransactionTest {
	@Test
	public void testTransaction_1()
		throws Exception {
		Trader trader = new Trader("", "");
		int year = 1;
		int value = 1;

		Transaction result = new Transaction(trader, year, value);

		assertNotNull(result);
		assertEquals("{Trader: in , year: 1, value:1}", result.toString());
		assertEquals(1, result.getValue());
		assertEquals(1, result.getYear());
	}

	@Test
	public void testGetTrader_1()
		throws Exception {
		Transaction fixture = new Transaction(new Trader("", ""), 1, 1);

		Trader result = fixture.getTrader();

		assertNotNull(result);
		assertEquals("Trader: in ", result.toString());
		assertEquals("", result.getName());
		assertEquals("", result.getCity());
	}

	@Test
	public void testGetValue_1()
		throws Exception {
		Transaction fixture = new Transaction(new Trader("", ""), 1, 1);

		int result = fixture.getValue();

		assertEquals(1, result);
	}

	@Test
	public void testGetYear_1()
		throws Exception {
		Transaction fixture = new Transaction(new Trader("", ""), 1, 1);

		int result = fixture.getYear();

		assertEquals(1, result);
	}

	@Test
	public void testToString_1()
		throws Exception {
		Transaction fixture = new Transaction(new Trader("", ""), 1, 1);

		String result = fixture.toString();

		assertEquals("{Trader: in , year: 1, value:1}", result);
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
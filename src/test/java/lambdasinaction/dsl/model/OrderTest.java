package lambdasinaction.dsl.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderTest {
	@Test
	public void testOrder_1()
		throws Exception {
		Order result = new Order();
		assertNotNull(result);
	}

	@Test
	public void testAddTrade_1()
		throws Exception {
		Order fixture = new Order();
		fixture.setCustomer("");
		fixture.addTrade(new Trade());
		Trade trade = new Trade();

		fixture.addTrade(trade);

	}

	@Test
	public void testGetCustomer_1()
		throws Exception {
		Order fixture = new Order();
		fixture.setCustomer("");
		fixture.addTrade(new Trade());

		String result = fixture.getCustomer();

		assertEquals("", result);
	}

	@Test
	public void testGetValue_1()
		throws Exception {
		Order fixture = new Order();
		fixture.setCustomer("");
		fixture.addTrade(new Trade());

		double result = fixture.getValue();

		assertEquals(0.0, result, 0.1);
	}

	@Test
	public void testSetCustomer_1()
		throws Exception {
		Order fixture = new Order();
		fixture.setCustomer("");
		fixture.addTrade(new Trade());
		String customer = "";

		fixture.setCustomer(customer);

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
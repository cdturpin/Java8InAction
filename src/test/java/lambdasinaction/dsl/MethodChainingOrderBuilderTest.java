package lambdasinaction.dsl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import lambdasinaction.dsl.model.Order;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MethodChainingOrderBuilderTest {
	@Test
	public void testBuy_1()
		throws Exception {
		MethodChainingOrderBuilder fixture = MethodChainingOrderBuilder.forCustomer("");
		int quantity = 1;

		MethodChainingOrderBuilder.TradeBuilder result = fixture.buy(quantity);

		assertNotNull(result);
	}

	@Test
	public void testEnd_1()
		throws Exception {
		MethodChainingOrderBuilder fixture = MethodChainingOrderBuilder.forCustomer("");

		Order result = fixture.end();

		assertNotNull(result);
		assertEquals(0.0, result.getValue(), 1.0);
		assertEquals("", result.getCustomer());
	}

	@Test
	public void testForCustomer_1()
		throws Exception {
		String customer = "";

		MethodChainingOrderBuilder result = MethodChainingOrderBuilder.forCustomer(customer);

		assertNotNull(result);
	}

	@Test
	public void testSell_1()
		throws Exception {
		MethodChainingOrderBuilder fixture = MethodChainingOrderBuilder.forCustomer("");
		int quantity = 1;

		MethodChainingOrderBuilder.TradeBuilder result = fixture.sell(quantity);

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
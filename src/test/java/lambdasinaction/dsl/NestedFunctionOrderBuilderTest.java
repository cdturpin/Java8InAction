package lambdasinaction.dsl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import lambdasinaction.dsl.model.Order;
import lambdasinaction.dsl.model.Stock;
import lambdasinaction.dsl.model.Trade;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NestedFunctionOrderBuilderTest {
	@Test
	public void testAt_1()
		throws Exception {
		double price = 1.0;

		double result = NestedFunctionOrderBuilder.at(price);

		assertEquals(1.0, result, 0.1);
	}

	@Test
	public void testBuy_1()
		throws Exception {
		int quantity = 1;
		Stock stock = new Stock();
		double price = 1.0;

		Trade result = NestedFunctionOrderBuilder.buy(quantity, stock, price);

		assertNotNull(result);
		assertEquals(0.0, result.getValue(), 1.0);
		assertEquals(1.0, result.getPrice(), 1.0);
		assertEquals(0, result.getQuantity());
	}

	@Test
	public void testOn_1()
		throws Exception {
		String market = "";

		String result = NestedFunctionOrderBuilder.on(market);

		assertEquals("", result);
	}

	@Test
	public void testOrder_1()
		throws Exception {
		String customer = "";

		Order result = NestedFunctionOrderBuilder.order(customer);

		assertNotNull(result);
		assertEquals(0.0, result.getValue(), 1.0);
		assertEquals("", result.getCustomer());
	}

	@Test
	public void testSell_1()
		throws Exception {
		int quantity = 1;
		Stock stock = new Stock();
		double price = 1.0;

		Trade result = NestedFunctionOrderBuilder.sell(quantity, stock, price);

		assertNotNull(result);
		assertEquals(0.0, result.getValue(), 1.0);
		assertEquals(1.0, result.getPrice(), 1.0);
		assertEquals(0, result.getQuantity());
	}

	@Test
	public void testStock_1()
		throws Exception {
		String symbol = "";
		String market = "";

		Stock result = NestedFunctionOrderBuilder.stock(symbol, market);

		assertNotNull(result);
		assertEquals("", result.getSymbol());
		assertEquals("", result.getMarket());
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
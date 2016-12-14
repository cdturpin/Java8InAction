package lambdasinaction.dsl.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TradeTest {
	@Test
	public void testGetPrice_1()
		throws Exception {
		Trade fixture = new Trade();
		fixture.setType(Trade.Type.BUY);
		fixture.setPrice(1.0);
		fixture.setStock(new Stock());
		fixture.setQuantity(1);

		double result = fixture.getPrice();

		assertEquals(1.0, result, 0.1);
	}

	@Test
	public void testGetQuantity_1()
		throws Exception {
		Trade fixture = new Trade();
		fixture.setType(Trade.Type.BUY);
		fixture.setPrice(1.0);
		fixture.setStock(new Stock());
		fixture.setQuantity(1);

		int result = fixture.getQuantity();

		assertEquals(1, result);
	}

	@Test
	public void testGetStock_1()
		throws Exception {
		Trade fixture = new Trade();
		fixture.setType(Trade.Type.BUY);
		fixture.setPrice(1.0);
		fixture.setStock(new Stock());
		fixture.setQuantity(1);

		Stock result = fixture.getStock();

		assertNotNull(result);
		assertEquals(null, result.getSymbol());
		assertEquals(null, result.getMarket());
	}

	@Test
	public void testGetType_1()
		throws Exception {
		Trade fixture = new Trade();
		fixture.setType(Trade.Type.BUY);
		fixture.setPrice(1.0);
		fixture.setStock(new Stock());
		fixture.setQuantity(1);

		Trade.Type result = fixture.getType();

		assertNotNull(result);
		assertEquals("BUY", result.name());
		assertEquals("BUY", result.toString());
		assertEquals(0, result.ordinal());
	}

	@Test
	public void testGetValue_1()
		throws Exception {
		Trade fixture = new Trade();
		fixture.setType(Trade.Type.BUY);
		fixture.setPrice(1.0);
		fixture.setStock(new Stock());
		fixture.setQuantity(1);

		double result = fixture.getValue();

		assertEquals(1.0, result, 0.1);
	}

	@Test
	public void testSetPrice_1()
		throws Exception {
		Trade fixture = new Trade();
		fixture.setType(Trade.Type.BUY);
		fixture.setPrice(1.0);
		fixture.setStock(new Stock());
		fixture.setQuantity(1);
		double price = 1.0;

		fixture.setPrice(price);

	}

	@Test
	public void testSetQuantity_1()
		throws Exception {
		Trade fixture = new Trade();
		fixture.setType(Trade.Type.BUY);
		fixture.setPrice(1.0);
		fixture.setStock(new Stock());
		fixture.setQuantity(1);
		int quantity = 1;

		fixture.setQuantity(quantity);

	}

	@Test
	public void testSetStock_1()
		throws Exception {
		Trade fixture = new Trade();
		fixture.setType(Trade.Type.BUY);
		fixture.setPrice(1.0);
		fixture.setStock(new Stock());
		fixture.setQuantity(1);
		Stock stock = new Stock();

		fixture.setStock(stock);

	}

	@Test
	public void testSetType_1()
		throws Exception {
		Trade fixture = new Trade();
		fixture.setType(Trade.Type.BUY);
		fixture.setPrice(1.0);
		fixture.setStock(new Stock());
		fixture.setQuantity(1);
		Trade.Type type = Trade.Type.BUY;

		fixture.setType(type);

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
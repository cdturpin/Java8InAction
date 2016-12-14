package lambdasinaction.dsl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.function.Consumer;

import lambdasinaction.dsl.model.Order;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MixedBuilderTest {
	@Test
	public void testBuy_1()
		throws Exception {
		Consumer<MixedBuilder.TradeBuilder> consumer = mock(Consumer.class);
		// add mock object expectations here


		MixedBuilder.TradeBuilder result = MixedBuilder.buy(consumer);

		assertNotNull(result);
	}

	@Test
	public void testForCustomer_1()
		throws Exception {
		String customer = "";

		Order result = MixedBuilder.forCustomer(customer);

		assertNotNull(result);
		assertEquals(0.0, result.getValue(), 1.0);
		assertEquals("", result.getCustomer());
	}

	@Test
	public void testSell_1()
		throws Exception {
		Consumer<MixedBuilder.TradeBuilder> consumer = mock(Consumer.class);
		// add mock object expectations here


		MixedBuilder.TradeBuilder result = MixedBuilder.sell(consumer);

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
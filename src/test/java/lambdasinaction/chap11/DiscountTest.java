package lambdasinaction.chap11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DiscountTest {
	@Test
	public void testApplyDiscount_1()
		throws Exception {
		Quote quote = new Quote("", 1.0, Discount.Code.DIAMOND);

		String result = Discount.applyDiscount(quote);

		assertEquals(" price is 0.8", result);
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
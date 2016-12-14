package lambdasinaction.dsl.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TaxTest {
	@Test
	public void testGeneral_1()
		throws Exception {
		double value = 1.0;

		double result = Tax.general(value);

		assertEquals(1.3, result, 0.1);
	}

	@Test
	public void testRegional_1()
		throws Exception {
		double value = 1.0;

		double result = Tax.regional(value);

		assertEquals(1.1, result, 0.1);
	}

	@Test
	public void testSurcharge_1()
		throws Exception {
		double value = 1.0;

		double result = Tax.surcharge(value);

		assertEquals(1.05, result, 0.1);
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
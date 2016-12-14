package lambdasinaction.chap14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.function.DoubleUnaryOperator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CurryingTest {
	@Test
	public void testConverter_1()
		throws Exception {
		double x = 1.0;
		double y = 1.0;
		double z = 1.0;

		double result = Currying.converter(x, y, z);

		assertEquals(2.0, result, 0.1);
	}

	@Test
	public void testCurriedConverter_1()
		throws Exception {
		double y = 1.0;
		double z = 1.0;

		DoubleUnaryOperator result = Currying.curriedConverter(y, z);

		assertNotNull(result);
	}

	@Test
	public void testExpandedCurriedConverter_1()
		throws Exception {
		double w = 1.0;
		double y = 1.0;
		double z = 1.0;

		DoubleUnaryOperator result = Currying.expandedCurriedConverter(w, y, z);

		assertNotNull(result);
	}

	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		Currying.main(args);

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
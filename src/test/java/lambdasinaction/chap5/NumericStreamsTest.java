package lambdasinaction.chap5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NumericStreamsTest {
	@Test
	public void testIsPerfectSquare_1()
		throws Exception {
		int n = 1;

		boolean result = NumericStreams.isPerfectSquare(n);

		assertEquals(true, result);
	}

	@Test
	public void testIsPerfectSquare_2()
		throws Exception {
		int n = 1;

		boolean result = NumericStreams.isPerfectSquare(n);

		assertEquals(true, result);
	}

	@Test
	public void testMain_1()
		throws Exception {

		NumericStreams.main();

	}

	@Test
	public void testMain_2()
		throws Exception {

		NumericStreams.main();

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
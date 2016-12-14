package lambdasinaction.chap7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ForkJoinSumCalculatorTest {
	@Test
	public void testForkJoinSumCalculator_1()
		throws Exception {
		long[] numbers = new long[] {};

		ForkJoinSumCalculator result = new ForkJoinSumCalculator(numbers);

		assertNotNull(result);
		assertEquals(null, result.getRawResult());
		assertEquals(new Long(0L), result.invoke());
		assertEquals(new Long(0L), result.get());
		assertEquals(new Long(0L), result.join());
		assertEquals(null, result.getException());
		assertEquals(false, result.isCancelled());
		assertEquals(true, result.isDone());
		assertEquals((short) 0, result.getForkJoinTaskTag());
		assertEquals(new Long(0L), result.getRawResult());
		assertEquals(false, result.isCompletedAbnormally());
		assertEquals(true, result.isCompletedNormally());
		assertEquals(false, result.tryUnfork());
	}

	@Test
	public void testCompute_1()
		throws Exception {
		ForkJoinSumCalculator fixture = new ForkJoinSumCalculator(new long[] {});

		Long result = fixture.compute();

		assertNotNull(result);
		assertEquals("0", result.toString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
	}

	@Test
	public void testCompute_2()
		throws Exception {
		ForkJoinSumCalculator fixture = new ForkJoinSumCalculator(new long[] {});

		Long result = fixture.compute();

		assertNotNull(result);
		assertEquals("0", result.toString());
		assertEquals((byte) 0, result.byteValue());
		assertEquals((short) 0, result.shortValue());
		assertEquals(0, result.intValue());
		assertEquals(0L, result.longValue());
		assertEquals(0.0f, result.floatValue(), 1.0f);
		assertEquals(0.0, result.doubleValue(), 1.0);
	}

	@Test
	public void testForkJoinSum_1()
		throws Exception {
		long n = 1L;

		long result = ForkJoinSumCalculator.forkJoinSum(n);

		assertEquals(1L, result);
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
package lambdasinaction.chap7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ParallelStreamsTest {
	@Test
	public void testIterativeSum_1()
		throws Exception {
		long n = 1L;

		long result = ParallelStreams.iterativeSum(n);

		assertEquals(1L, result);
	}

	@Test
	public void testIterativeSum_2()
		throws Exception {
		long n = -1L;

		long result = ParallelStreams.iterativeSum(n);

		assertEquals(0L, result);
	}

	@Test
	public void testParallelRangedSum_1()
		throws Exception {
		long n = 1L;

		long result = ParallelStreams.parallelRangedSum(n);

		assertEquals(1L, result);
	}

	@Test
	public void testParallelSum_1()
		throws Exception {
		long n = 1L;

		long result = ParallelStreams.parallelSum(n);

		assertEquals(1L, result);
	}

	@Test
	public void testRangedSum_1()
		throws Exception {
		long n = 1L;

		long result = ParallelStreams.rangedSum(n);

		assertEquals(1L, result);
	}

	@Test
	public void testSequentialSum_1()
		throws Exception {
		long n = 1L;

		long result = ParallelStreams.sequentialSum(n);

		assertEquals(1L, result);
	}

	@Test
	public void testSideEffectParallelSum_1()
		throws Exception {
		long n = 1L;

		long result = ParallelStreams.sideEffectParallelSum(n);

		assertEquals(1L, result);
	}

	@Test
	public void testSideEffectSum_1()
		throws Exception {
		long n = 1L;

		long result = ParallelStreams.sideEffectSum(n);

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
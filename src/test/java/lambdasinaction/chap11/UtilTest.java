package lambdasinaction.chap11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UtilTest {
	@Test
	public void testUtil_1()
		throws Exception {
		Util result = new Util();
		assertNotNull(result);
	}

	@Test
	public void testDelay_1()
		throws Exception {

		Util.delay();

	}

	@Test
	public void testDelay_2()
		throws Exception {

		Util.delay();

	}

	@Test
	public void testFormat_1()
		throws Exception {
		double number = 1.0;

		double result = Util.format(number);

		assertEquals(1.0, result, 0.1);
	}

	@Test
	public void testFormat_2()
		throws Exception {
		double number = 1.0;

		double result = Util.format(number);

		assertEquals(1.0, result, 0.1);
	}

	@Test
	public void testSequence_1()
		throws Exception {
		List<CompletableFuture<Object>> futures = mock(List.class);
		// add mock object expectations here


		CompletableFuture<List<Object>> result = Util.sequence(futures);

		assertNotNull(result);
		assertEquals(false, result.isCancelled());
		assertEquals(true, result.isDone());
		assertEquals(0, result.getNumberOfDependents());
		assertEquals(true, result.isCompletedExceptionally());
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
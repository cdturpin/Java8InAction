package lambdasinaction.chap10;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OperationsWithOptionalTest {
	@Test
	public void testMain_1()
		throws Exception {

		OperationsWithOptional.main();

	}

	@Test
	public void testMax_1()
		throws Exception {
		Optional<Integer> i = Optional.empty();
		Optional<Integer> j = Optional.empty();

		Optional<Integer> result = OperationsWithOptional.max(i, j);

		assertNotNull(result);
		assertEquals("Optional.empty", result.toString());
		assertEquals(false, result.isPresent());
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
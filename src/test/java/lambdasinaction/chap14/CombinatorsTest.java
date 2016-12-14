package lambdasinaction.chap14;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.function.Function;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CombinatorsTest {
	@Test
	public void testCompose_1()
		throws Exception {
		Function<Object, Object> g = mock(Function.class);
		Function<Object, Object> f = mock(Function.class);
		// add mock object expectations here


		Function<Object, Object> result = Combinators.compose(g, f);

		assertNotNull(result);
	}

	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		Combinators.main(args);

	}

	@Test
	public void testRepeat_1()
		throws Exception {
		int n = 1;
		Function<Object, Object> f = mock(Function.class);
		// add mock object expectations here


		Function<Object, Object> result = Combinators.repeat(n, f);

		assertNotNull(result);
	}

	@Test
	public void testRepeat_2()
		throws Exception {
		int n = 0;
		Function<Object, Object> f = mock(Function.class);
		// add mock object expectations here


		Function<Object, Object> result = Combinators.repeat(n, f);

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
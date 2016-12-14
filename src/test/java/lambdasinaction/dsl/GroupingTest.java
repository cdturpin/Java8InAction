package lambdasinaction.dsl;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GroupingTest {
	@Test
	public void testMain_1()
		throws Exception {

		Grouping.main();

	}

	@Test
	public void testTwoLevelGroupingBy_1()
		throws Exception {
		Function<? extends Object, ? extends Object> f1 = mock(Function.class);
		Function<? extends Object, ? extends Object> f2 = mock(Function.class);
		// add mock object expectations here


		Collector<Object, Object, Map<Object, Map<Object, List<Object>>>> result = Grouping.twoLevelGroupingBy(f1, f2);

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
package lambdasinaction.chap14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LazyListsTest {
	@Test
	public void testFrom_1()
		throws Exception {
		int n = 1;

		LazyLists.LazyList<Integer> result = LazyLists.from(n);

		assertNotNull(result);
		assertEquals(false, result.isEmpty());
		assertEquals(new Integer(1), result.head());
	}

	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		LazyLists.main(args);

	}

	@Test
	public void testPrimes_1()
		throws Exception {
		LazyLists.MyList<Integer> numbers = mock(LazyLists.MyList.class);
		// add mock object expectations here


		LazyLists.MyList<Integer> result = LazyLists.primes(numbers);

		assertNotNull(result);
		assertEquals(false, result.isEmpty());
		assertEquals(null, result.head());
	}

	@Test
	public void testPrintAll_1()
		throws Exception {
		LazyLists.MyList<Object> numbers = mock(LazyLists.MyList.class);
		// add mock object expectations here


		LazyLists.printAll(numbers);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call isEmpty()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at lambdasinaction.chap14.$Proxy64.head(Unknown Source)
		//       at lambdasinaction.chap14.LazyLists.printAll(LazyLists.java:125)
	}

	@Test
	public void testPrintAll_2()
		throws Exception {
		LazyLists.MyList<Object> numbers = mock(LazyLists.MyList.class);
		// add mock object expectations here


		LazyLists.printAll(numbers);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalStateException: missing behavior definition for the preceding method call isEmpty()
		//       at org.easymock.internal.MockInvocationHandler.invoke(MockInvocationHandler.java:41)
		//       at org.easymock.internal.ObjectMethodsFilter.invoke(ObjectMethodsFilter.java:72)
		//       at lambdasinaction.chap14.$Proxy64.head(Unknown Source)
		//       at lambdasinaction.chap14.LazyLists.printAll(LazyLists.java:125)
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
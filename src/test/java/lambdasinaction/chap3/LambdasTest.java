package lambdasinaction.chap3;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LambdasTest {
	@Test
	public void testFilter_1()
		throws Exception {
		List<Lambdas.Apple> inventory = mock(List.class);
		Lambdas.ApplePredicate p = mock(Lambdas.ApplePredicate.class);
		// add mock object expectations here


		List<Lambdas.Apple> result = Lambdas.filter(inventory, p);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap3.Lambdas.filter(Lambdas.java:29)
		assertNotNull(result);
	}

	@Test
	public void testFilter_2()
		throws Exception {
		List<Lambdas.Apple> inventory = mock(List.class);
		Lambdas.ApplePredicate p = mock(Lambdas.ApplePredicate.class);
		// add mock object expectations here


		List<Lambdas.Apple> result = Lambdas.filter(inventory, p);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap3.Lambdas.filter(Lambdas.java:29)
		assertNotNull(result);
	}

	@Test
	public void testFilter_3()
		throws Exception {
		List<Lambdas.Apple> inventory = mock(List.class);
		Lambdas.ApplePredicate p = mock(Lambdas.ApplePredicate.class);
		// add mock object expectations here


		List<Lambdas.Apple> result = Lambdas.filter(inventory, p);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap3.Lambdas.filter(Lambdas.java:29)
		assertNotNull(result);
	}

	@Test
	public void testMain_1()
		throws Exception {

		Lambdas.main();

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
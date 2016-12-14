package lambdasinaction.chap2;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilteringApplesTest {
	@Test
	public void testFilter_1()
		throws Exception {
		List<FilteringApples.Apple> inventory = mock(List.class);
		FilteringApples.ApplePredicate p = mock(FilteringApples.ApplePredicate.class);
		// add mock object expectations here


		List<FilteringApples.Apple> result = FilteringApples.filter(inventory, p);
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap2.FilteringApples.filter(FilteringApples.java:74)
		assertNotNull(result);
	}

	@Test
	public void testFilter_2()
		throws Exception {
		List<FilteringApples.Apple> inventory = mock(List.class);
		FilteringApples.ApplePredicate p = mock(FilteringApples.ApplePredicate.class);
		// add mock object expectations here

		List<FilteringApples.Apple> result = FilteringApples.filter(inventory, p);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap2.FilteringApples.filter(FilteringApples.java:74)
		assertNotNull(result);
	}

	@Test
	public void testFilter_3()
		throws Exception {
		List<FilteringApples.Apple> inventory = mock(List.class);
		FilteringApples.ApplePredicate p = mock(FilteringApples.ApplePredicate.class);
		// add mock object expectations here


		List<FilteringApples.Apple> result = FilteringApples.filter(inventory, p);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap2.FilteringApples.filter(FilteringApples.java:74)
		assertNotNull(result);
	}

	@Test
	public void testFilterApplesByColor_1()
		throws Exception {
		List<FilteringApples.Apple> inventory = mock(List.class);
		String color = "";
		// add mock object expectations here


		List<FilteringApples.Apple> result = FilteringApples.filterApplesByColor(inventory, color);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap2.FilteringApples.filterApplesByColor(FilteringApples.java:53)
		assertNotNull(result);
	}

	@Test
	public void testFilterApplesByColor_2()
		throws Exception {
		List<FilteringApples.Apple> inventory = mock(List.class);
		String color = "";
		// add mock object expectations here


		List<FilteringApples.Apple> result = FilteringApples.filterApplesByColor(inventory, color);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap2.FilteringApples.filterApplesByColor(FilteringApples.java:53)
		assertNotNull(result);
	}

	@Test
	public void testFilterApplesByColor_3()
		throws Exception {
		List<FilteringApples.Apple> inventory = mock(List.class);
		String color = "";
		// add mock object expectations here


		List<FilteringApples.Apple> result = FilteringApples.filterApplesByColor(inventory, color);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap2.FilteringApples.filterApplesByColor(FilteringApples.java:53)
		assertNotNull(result);
	}

	@Test
	public void testFilterApplesByWeight_1()
		throws Exception {
		List<FilteringApples.Apple> inventory = mock(List.class);
		int weight = 1;
		// add mock object expectations here


		List<FilteringApples.Apple> result = FilteringApples.filterApplesByWeight(inventory, weight);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap2.FilteringApples.filterApplesByWeight(FilteringApples.java:63)
		assertNotNull(result);
	}

	@Test
	public void testFilterApplesByWeight_2()
		throws Exception {
		List<FilteringApples.Apple> inventory = mock(List.class);
		int weight = 1;
		// add mock object expectations here


		List<FilteringApples.Apple> result = FilteringApples.filterApplesByWeight(inventory, weight);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap2.FilteringApples.filterApplesByWeight(FilteringApples.java:63)
		assertNotNull(result);
	}

	@Test
	public void testFilterApplesByWeight_3()
		throws Exception {
		List<FilteringApples.Apple> inventory = mock(List.class);
		int weight = 1;
		// add mock object expectations here


		List<FilteringApples.Apple> result = FilteringApples.filterApplesByWeight(inventory, weight);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap2.FilteringApples.filterApplesByWeight(FilteringApples.java:63)
		assertNotNull(result);
	}

	@Test
	public void testFilterGreenApples_1()
		throws Exception {
		List<FilteringApples.Apple> inventory = mock(List.class);
		// add mock object expectations here


		List<FilteringApples.Apple> result = FilteringApples.filterGreenApples(inventory);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap2.FilteringApples.filterGreenApples(FilteringApples.java:43)
		assertNotNull(result);
	}

	@Test
	public void testFilterGreenApples_2()
		throws Exception {
		List<FilteringApples.Apple> inventory = mock(List.class);
		// add mock object expectations here


		List<FilteringApples.Apple> result = FilteringApples.filterGreenApples(inventory);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap2.FilteringApples.filterGreenApples(FilteringApples.java:43)
		assertNotNull(result);
	}

	@Test
	public void testFilterGreenApples_3()
		throws Exception {
		List<FilteringApples.Apple> inventory = mock(List.class);
		// add mock object expectations here


		List<FilteringApples.Apple> result = FilteringApples.filterGreenApples(inventory);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap2.FilteringApples.filterGreenApples(FilteringApples.java:43)
		assertNotNull(result);
	}

	@Test
	public void testMain_1()
		throws Exception {

		FilteringApples.main();

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
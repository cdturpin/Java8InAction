package lambdasinaction.chap4;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StreamBasicTest {
	@Test
	public void testGetLowCaloricDishesNamesInJava7_1()
		throws Exception {
		List<Dish> dishes = mock(List.class);
		// add mock object expectations here


		List<String> result = StreamBasic.getLowCaloricDishesNamesInJava7(dishes);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap4.StreamBasic.getLowCaloricDishesNamesInJava7(StreamBasic.java:26)
		assertNotNull(result);
	}

	@Test
	public void testGetLowCaloricDishesNamesInJava7_2()
		throws Exception {
		List<Dish> dishes = mock(List.class);
		// add mock object expectations here


		List<String> result = StreamBasic.getLowCaloricDishesNamesInJava7(dishes);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap4.StreamBasic.getLowCaloricDishesNamesInJava7(StreamBasic.java:26)
		assertNotNull(result);
	}

	@Test
	public void testGetLowCaloricDishesNamesInJava7_3()
		throws Exception {
		List<Dish> dishes = mock(List.class);
		// add mock object expectations here


		List<String> result = StreamBasic.getLowCaloricDishesNamesInJava7(dishes);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap4.StreamBasic.getLowCaloricDishesNamesInJava7(StreamBasic.java:26)
		assertNotNull(result);
	}

	@Test
	public void testGetLowCaloricDishesNamesInJava8_1()
		throws Exception {
		List<Dish> dishes = mock(List.class);
		// add mock object expectations here


		List<String> result = StreamBasic.getLowCaloricDishesNamesInJava8(dishes);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at lambdasinaction.chap4.StreamBasic.getLowCaloricDishesNamesInJava8(StreamBasic.java:45)
		assertNotNull(result);
	}

	@Test
	public void testMain_1()
		throws Exception {

		StreamBasic.main();

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
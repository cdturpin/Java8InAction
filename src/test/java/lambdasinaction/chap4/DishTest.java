package lambdasinaction.chap4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DishTest {
	@Test
	public void testDish_1()
		throws Exception {
		String name = "";
		boolean vegetarian = true;
		int calories = 1;
		Dish.Type type = Dish.Type.FISH;

		Dish result = new Dish(name, vegetarian, calories, type);

		assertNotNull(result);
		assertEquals("", result.toString());
		assertEquals("", result.getName());
		assertEquals(true, result.isVegetarian());
		assertEquals(1, result.getCalories());
	}

	@Test
	public void testGetCalories_1()
		throws Exception {
		Dish fixture = new Dish("", true, 1, Dish.Type.FISH);

		int result = fixture.getCalories();

		assertEquals(1, result);
	}

	@Test
	public void testGetName_1()
		throws Exception {
		Dish fixture = new Dish("", true, 1, Dish.Type.FISH);

		String result = fixture.getName();

		assertEquals("", result);
	}

	@Test
	public void testGetType_1()
		throws Exception {
		Dish fixture = new Dish("", true, 1, Dish.Type.FISH);

		Dish.Type result = fixture.getType();

		assertNotNull(result);
		assertEquals("FISH", result.name());
		assertEquals("FISH", result.toString());
		assertEquals(1, result.ordinal());
	}

	@Test
	public void testIsVegetarian_1()
		throws Exception {
		Dish fixture = new Dish("", true, 1, Dish.Type.FISH);

		boolean result = fixture.isVegetarian();

		assertEquals(true, result);
	}

	@Test
	public void testIsVegetarian_2()
		throws Exception {
		Dish fixture = new Dish("", false, 1, Dish.Type.FISH);

		boolean result = fixture.isVegetarian();

		assertEquals(false, result);
	}

	@Test
	public void testToString_1()
		throws Exception {
		Dish fixture = new Dish("", true, 1, Dish.Type.FISH);

		String result = fixture.toString();

		assertEquals("", result);
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
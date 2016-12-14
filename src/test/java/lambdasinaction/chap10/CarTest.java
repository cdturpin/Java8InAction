package lambdasinaction.chap10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CarTest {
	@Test
	public void testGetInsurance_1()
		throws Exception {
		Car fixture = new Car();

		Optional<Insurance> result = fixture.getInsurance();

		assertEquals(null, result);
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
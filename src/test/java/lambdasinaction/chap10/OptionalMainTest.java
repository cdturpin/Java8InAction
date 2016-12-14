package lambdasinaction.chap10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OptionalMainTest {
	@Test
	public void testGetCarInsuranceName_1()
		throws Exception {
		OptionalMain fixture = new OptionalMain();
		Optional<Person> person = Optional.empty();

		String result = fixture.getCarInsuranceName(person);

		assertEquals("Unknown", result);
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
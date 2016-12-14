package lambdasinaction.chap10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InsuranceTest {
	@Test
	public void testGetName_1()
		throws Exception {
		Insurance fixture = new Insurance();

		String result = fixture.getName();

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
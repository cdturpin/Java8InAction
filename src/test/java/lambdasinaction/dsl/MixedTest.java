package lambdasinaction.dsl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MixedTest {
	@Test
	public void testMixed_1()
		throws Exception {
		Mixed fixture = new Mixed();

		fixture.mixed();

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
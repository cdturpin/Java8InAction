package lambdasinaction.chap2;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MeaningOfThisTest {
	@Test
	public void testMeaningOfThis_1()
		throws Exception {
		MeaningOfThis result = new MeaningOfThis();
		assertNotNull(result);
	}

	@Test
	public void testDoIt_1()
		throws Exception {
		MeaningOfThis fixture = new MeaningOfThis();

		fixture.doIt();

	}

	@Test
	public void testMain_1()
		throws Exception {

		MeaningOfThis.main();

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
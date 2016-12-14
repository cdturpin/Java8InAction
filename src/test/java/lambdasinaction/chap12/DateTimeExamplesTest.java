package lambdasinaction.chap12;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateTimeExamplesTest {
	@Test
	public void testDateTimeExamples_1()
		throws Exception {
		DateTimeExamples result = new DateTimeExamples();
		assertNotNull(result);
	}

	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		DateTimeExamples.main(args);

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
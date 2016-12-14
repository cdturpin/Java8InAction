package lambdasinaction.dsl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MainTest {
	@Test
	public void testLambda_1()
		throws Exception {
		Main fixture = new Main();

		fixture.lambda();

	}

	@Test
	public void testMethodChaining_1()
		throws Exception {
		Main fixture = new Main();

		fixture.methodChaining();

	}

	@Test
	public void testNestedFunction_1()
		throws Exception {
		Main fixture = new Main();

		fixture.nestedFunction();

	}

	@Test
	public void testPlain_1()
		throws Exception {
		Main fixture = new Main();

		fixture.plain();

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
package lambdasinaction.chap8;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FactoryMainTest {
	@Test
	public void testFactoryMain_1()
		throws Exception {
		FactoryMain result = new FactoryMain();
		assertNotNull(result);
	}

	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		FactoryMain.main(args);

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
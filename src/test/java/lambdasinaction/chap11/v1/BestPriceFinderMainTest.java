package lambdasinaction.chap11.v1;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BestPriceFinderMainTest {
	@Test
	public void testBestPriceFinderMain_1()
		throws Exception {
		BestPriceFinderMain result = new BestPriceFinderMain();
		assertNotNull(result);
	}

	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		BestPriceFinderMain.main(args);

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
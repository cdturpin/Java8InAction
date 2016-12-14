package lambdasinaction.chap9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LetterTest {
	@Test
	public void testAddFooter_1()
		throws Exception {
		String text = "";

		String result = Letter.addFooter(text);

		assertEquals("Kind regards", result);
	}

	@Test
	public void testAddHeader_1()
		throws Exception {
		String text = "";

		String result = Letter.addHeader(text);

		assertEquals("From Raoul, Mario and Alan:", result);
	}

	@Test
	public void testCheckSpelling_1()
		throws Exception {
		String text = "";

		String result = Letter.checkSpelling(text);

		assertEquals("", result);
	}

	@Test
	public void testMain_1()
		throws Exception {

		Letter.main();

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
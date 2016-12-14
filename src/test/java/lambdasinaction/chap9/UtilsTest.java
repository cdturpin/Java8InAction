package lambdasinaction.chap9;

import static org.mockito.Mockito.mock;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UtilsTest {
	@Test
	public void testPaint_1()
		throws Exception {
		List<Resizable> l = mock(List.class);
		// add mock object expectations here


		Utils.paint(l);

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
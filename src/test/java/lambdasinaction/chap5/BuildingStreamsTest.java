package lambdasinaction.chap5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BuildingStreamsTest {
	@Test//(expected = java.nio.file.NoSuchFileException.class)
	public void testMain_1()
		throws Exception {

		BuildingStreams.main();

	}

	@Test//(expected = java.nio.file.NoSuchFileException.class)
	public void testMain_2()
		throws Exception {

		BuildingStreams.main();

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
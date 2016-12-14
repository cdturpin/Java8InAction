package lambdasinaction.chap3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ExecuteAroundTest {
	
	@Test
	void fileNotFoundException() {
		Throwable exception = assertThrows(java.io.FileNotFoundException.class, () -> {
            throw new java.io.FileNotFoundException("file not found");
        });
        assertEquals("file not found", exception.getMessage());
	}
	
	@Test//(expected = java.io.FileNotFoundException.class)
	public void testMain_1()
		throws Exception {

		ExecuteAround.main();
		assertThrows(java.io.FileNotFoundException.class, () -> {
			 fileNotFoundException();
		      });
	}

	@Test//(expected = java.io.FileNotFoundException.class)
	public void testMain_2()
		throws Exception {

		ExecuteAround.main();

	}

	@Test//(expected = java.io.FileNotFoundException.class)
	public void testMain_3()
		throws Exception {

		ExecuteAround.main();

	}

	@Test//(expected = java.io.FileNotFoundException.class)
	public void testMain_4()
		throws Exception {

		ExecuteAround.main();

	}

	@Test//(expected = java.io.FileNotFoundException.class)
	public void testProcessFile_1()
		throws Exception {
		ExecuteAround.BufferedReaderProcessor p = mock(ExecuteAround.BufferedReaderProcessor.class);
		// add mock object expectations here


		String result = ExecuteAround.processFile(p);

		assertNotNull(result);
	}

	@Test//(expected = java.io.FileNotFoundException.class)
	public void testProcessFile_2()
		throws Exception {
		ExecuteAround.BufferedReaderProcessor p = mock(ExecuteAround.BufferedReaderProcessor.class);
		// add mock object expectations here


		String result = ExecuteAround.processFile(p);

		assertNotNull(result);
	}

	@Test//(expected = java.io.FileNotFoundException.class)
	public void testProcessFileLimited_1()
		throws Exception {

		String result = ExecuteAround.processFileLimited();

		assertNotNull(result);
	}

	@Test//(expected = java.io.FileNotFoundException.class)
	public void testProcessFileLimited_2()
		throws Exception {

		String result = ExecuteAround.processFileLimited();

		assertNotNull(result);
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
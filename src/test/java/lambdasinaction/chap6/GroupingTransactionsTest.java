package lambdasinaction.chap6;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GroupingTransactionsTest {
	@Test
	public void testGroupingTransactions_1()
		throws Exception {
		GroupingTransactions result = new GroupingTransactions();
		assertNotNull(result);
	}

	@Test
	public void testMain_1()
		throws Exception {

		GroupingTransactions.main();

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
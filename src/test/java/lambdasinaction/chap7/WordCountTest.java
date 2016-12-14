package lambdasinaction.chap7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WordCountTest {
	@Test
	public void testWordCount_1()
		throws Exception {
		WordCount result = new WordCount();
		assertNotNull(result);
	}

	@Test
	public void testCountWords_1()
		throws Exception {
		String s = "";

		int result = WordCount.countWords(s);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.lang.String.charAt(Unknown Source)
		//       at lambdasinaction.chap7.WordCount$WordCounterSpliterator.tryAdvance(WordCount.java:86)
		//       at java.util.Spliterator.forEachRemaining(Unknown Source)
		//       at java.util.stream.AbstractPipeline.copyInto(Unknown Source)
		//       at java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
		//       at java.util.stream.ReduceOps$ReduceTask.doLeaf(Unknown Source)
		//       at java.util.stream.ReduceOps$ReduceTask.doLeaf(Unknown Source)
		//       at java.util.stream.AbstractTask.compute(Unknown Source)
		//       at java.util.concurrent.CountedCompleter.exec(Unknown Source)
		//       at java.util.concurrent.ForkJoinTask.doExec(Unknown Source)
		//       at java.util.concurrent.ForkJoinTask.doInvoke(Unknown Source)
		//       at java.util.concurrent.ForkJoinTask.invoke(Unknown Source)
		//       at java.util.stream.ReduceOps$ReduceOp.evaluateParallel(Unknown Source)
		//       at java.util.stream.AbstractPipeline.evaluate(Unknown Source)
		//       at java.util.stream.ReferencePipeline.reduce(Unknown Source)
		//       at lambdasinaction.chap7.WordCount.countWords(WordCount.java:43)
		//       at lambdasinaction.chap7.WordCount.countWords(WordCount.java:39)
		assertEquals(0, result);
	}

	@Test
	public void testCountWordsIteratively_1()
		throws Exception {
		String s = "";

		int result = WordCount.countWordsIteratively(s);

		assertEquals(0, result);
	}

	@Test
	public void testCountWordsIteratively_2()
		throws Exception {
		String s = "";

		int result = WordCount.countWordsIteratively(s);

		assertEquals(0, result);
	}

	@Test
	public void testCountWordsIteratively_3()
		throws Exception {
		String s = "";

		int result = WordCount.countWordsIteratively(s);

		assertEquals(0, result);
	}

	@Test
	public void testCountWordsIteratively_4()
		throws Exception {
		String s = "";

		int result = WordCount.countWordsIteratively(s);

		assertEquals(0, result);
	}

	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		WordCount.main(args);

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
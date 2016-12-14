package lambdasinaction.chap11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BestPriceFinderTest {
	@Test
	public void testBestPriceFinder_1()
		throws Exception {
		BestPriceFinder result = new BestPriceFinder();
		assertNotNull(result);
	}

	@Test
	public void testFindPricesFuture_1()
		throws Exception {
		BestPriceFinder fixture = new BestPriceFinder();
		String product = "";

		List<String> result = fixture.findPricesFuture(product);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.concurrent.CompletionException: java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.util.concurrent.CompletableFuture.encodeThrowable(Unknown Source)
		//       at java.util.concurrent.CompletableFuture.completeThrowable(Unknown Source)
		//       at java.util.concurrent.CompletableFuture$AsyncSupply.run(Unknown Source)
		//       at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
		//       at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
		//       at java.lang.Thread.run(Unknown Source)
		//       Caused by: java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.lang.String.charAt(Unknown Source)
		//       at lambdasinaction.chap11.Shop.calculatePrice(Shop.java:26)
		//       at lambdasinaction.chap11.Shop.getPrice(Shop.java:19)
		//       at lambdasinaction.chap11.BestPriceFinder.lambda$7(BestPriceFinder.java:56)
		//       at lambdasinaction.chap11.BestPriceFinder$$Lambda$284/2064947022.get(Unknown Source)
		//       ... 4 more
		assertNotNull(result);
	}

	@Test
	public void testFindPricesParallel_1()
		throws Exception {
		BestPriceFinder fixture = new BestPriceFinder();
		String product = "";

		List<String> result = fixture.findPricesParallel(product);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.lang.String.charAt(Unknown Source)
		//       at lambdasinaction.chap11.Shop.calculatePrice(Shop.java:26)
		//       at lambdasinaction.chap11.Shop.getPrice(Shop.java:19)
		//       at lambdasinaction.chap11.BestPriceFinder.lambda$1(BestPriceFinder.java:39)
		//       at lambdasinaction.chap11.BestPriceFinder$$Lambda$278/656460878.apply(Unknown Source)
		//       at java.util.stream.ReferencePipeline$3$1.accept(Unknown Source)
		//       at java.util.Spliterators$ArraySpliterator.forEachRemaining(Unknown Source)
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
		//       at java.util.stream.ReferencePipeline.collect(Unknown Source)
		//       at lambdasinaction.chap11.BestPriceFinder.findPricesParallel(BestPriceFinder.java:42)
		assertNotNull(result);
	}

	@Test
	public void testFindPricesSequential_1()
		throws Exception {
		BestPriceFinder fixture = new BestPriceFinder();
		String product = "";

		List<String> result = fixture.findPricesSequential(product);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.lang.String.charAt(Unknown Source)
		//       at lambdasinaction.chap11.Shop.calculatePrice(Shop.java:26)
		//       at lambdasinaction.chap11.Shop.getPrice(Shop.java:19)
		//       at lambdasinaction.chap11.BestPriceFinder.lambda$0(BestPriceFinder.java:31)
		//       at lambdasinaction.chap11.BestPriceFinder$$Lambda$275/418866340.apply(Unknown Source)
		//       at java.util.stream.ReferencePipeline$3$1.accept(Unknown Source)
		//       at java.util.Spliterators$ArraySpliterator.forEachRemaining(Unknown Source)
		//       at java.util.stream.AbstractPipeline.copyInto(Unknown Source)
		//       at java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
		//       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(Unknown Source)
		//       at java.util.stream.AbstractPipeline.evaluate(Unknown Source)
		//       at java.util.stream.ReferencePipeline.collect(Unknown Source)
		//       at lambdasinaction.chap11.BestPriceFinder.findPricesSequential(BestPriceFinder.java:34)
		assertNotNull(result);
	}

	@Test
	public void testFindPricesStream_1()
		throws Exception {
		BestPriceFinder fixture = new BestPriceFinder();
		String product = "";

		Stream<CompletableFuture<String>> result = fixture.findPricesStream(product);

		assertNotNull(result);
		assertEquals(5L, result.count());
		assertEquals(false, result.isParallel());
	}

	@Test
	public void testPrintPricesStream_1()
		throws Exception {
		BestPriceFinder fixture = new BestPriceFinder();
		String product = "";

		fixture.printPricesStream(product);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.concurrent.CompletionException: java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.util.concurrent.CompletableFuture.encodeThrowable(Unknown Source)
		//       at java.util.concurrent.CompletableFuture.completeThrowable(Unknown Source)
		//       at java.util.concurrent.CompletableFuture$AsyncSupply.run(Unknown Source)
		//       at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
		//       at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
		//       at java.lang.Thread.run(Unknown Source)
		//       Caused by: java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.lang.String.charAt(Unknown Source)
		//       at lambdasinaction.chap11.Shop.calculatePrice(Shop.java:26)
		//       at lambdasinaction.chap11.Shop.getPrice(Shop.java:19)
		//       at lambdasinaction.chap11.BestPriceFinder.lambda$7(BestPriceFinder.java:56)
		//       at lambdasinaction.chap11.BestPriceFinder$$Lambda$284/2064947022.get(Unknown Source)
		//       ... 4 more
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
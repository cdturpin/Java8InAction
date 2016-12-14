package lambdasinaction.chap11.v1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

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
		//       at lambdasinaction.chap11.v1.Shop.calculatePrice(Shop.java:25)
		//       at lambdasinaction.chap11.v1.Shop.getPrice(Shop.java:20)
		//       at lambdasinaction.chap11.v1.BestPriceFinder.lambda$12(BestPriceFinder.java:53)
		//       at lambdasinaction.chap11.v1.BestPriceFinder$$Lambda$379/579314863.get(Unknown Source)
		//       ... 4 more
		assertNotNull(result);
	}

	@Test
	public void testFindPricesInUSD_1()
		throws Exception {
		BestPriceFinder fixture = new BestPriceFinder();
		String product = "";

		List<String> result = fixture.findPricesInUSD(product);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.concurrent.CompletionException: java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.util.concurrent.CompletableFuture.encodeThrowable(Unknown Source)
		//       at java.util.concurrent.CompletableFuture.completeThrowable(Unknown Source)
		//       at java.util.concurrent.CompletableFuture$AsyncSupply.run(Unknown Source)
		//       at java.util.concurrent.CompletableFuture$AsyncSupply.exec(Unknown Source)
		//       at java.util.concurrent.ForkJoinTask.doExec(Unknown Source)
		//       at java.util.concurrent.ForkJoinPool$WorkQueue.runTask(Unknown Source)
		//       at java.util.concurrent.ForkJoinPool.runWorker(Unknown Source)
		//       at java.util.concurrent.ForkJoinWorkerThread.run(Unknown Source)
		//       Caused by: java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.lang.String.charAt(Unknown Source)
		//       at lambdasinaction.chap11.v1.Shop.calculatePrice(Shop.java:25)
		//       at lambdasinaction.chap11.v1.Shop.getPrice(Shop.java:20)
		//       at lambdasinaction.chap11.v1.BestPriceFinder.lambda$3(BestPriceFinder.java:70)
		//       at lambdasinaction.chap11.v1.BestPriceFinder$$Lambda$381/173024885.get(Unknown Source)
		//       ... 6 more
		assertNotNull(result);
	}

	@Test
	public void testFindPricesInUSD_2()
		throws Exception {
		BestPriceFinder fixture = new BestPriceFinder();
		String product = "";

		List<String> result = fixture.findPricesInUSD(product);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.concurrent.CompletionException: java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.util.concurrent.CompletableFuture.encodeThrowable(Unknown Source)
		//       at java.util.concurrent.CompletableFuture.completeThrowable(Unknown Source)
		//       at java.util.concurrent.CompletableFuture$AsyncSupply.run(Unknown Source)
		//       at java.util.concurrent.CompletableFuture$AsyncSupply.exec(Unknown Source)
		//       at java.util.concurrent.ForkJoinTask.doExec(Unknown Source)
		//       at java.util.concurrent.ForkJoinPool$WorkQueue.runTask(Unknown Source)
		//       at java.util.concurrent.ForkJoinPool.runWorker(Unknown Source)
		//       at java.util.concurrent.ForkJoinWorkerThread.run(Unknown Source)
		//       Caused by: java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.lang.String.charAt(Unknown Source)
		//       at lambdasinaction.chap11.v1.Shop.calculatePrice(Shop.java:25)
		//       at lambdasinaction.chap11.v1.Shop.getPrice(Shop.java:20)
		//       at lambdasinaction.chap11.v1.BestPriceFinder.lambda$3(BestPriceFinder.java:70)
		//       at lambdasinaction.chap11.v1.BestPriceFinder$$Lambda$381/173024885.get(Unknown Source)
		//       ... 6 more
		assertNotNull(result);
	}

	@Test
	public void testFindPricesInUSD2_1()
		throws Exception {
		BestPriceFinder fixture = new BestPriceFinder();
		String product = "";

		List<String> result = fixture.findPricesInUSD2(product);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.concurrent.CompletionException: java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.util.concurrent.CompletableFuture.encodeThrowable(Unknown Source)
		//       at java.util.concurrent.CompletableFuture.completeThrowable(Unknown Source)
		//       at java.util.concurrent.CompletableFuture$AsyncSupply.run(Unknown Source)
		//       at java.util.concurrent.CompletableFuture$AsyncSupply.exec(Unknown Source)
		//       at java.util.concurrent.ForkJoinTask.doExec(Unknown Source)
		//       at java.util.concurrent.ForkJoinPool$WorkQueue.runTask(Unknown Source)
		//       at java.util.concurrent.ForkJoinPool.runWorker(Unknown Source)
		//       at java.util.concurrent.ForkJoinWorkerThread.run(Unknown Source)
		//       Caused by: java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.lang.String.charAt(Unknown Source)
		//       at lambdasinaction.chap11.v1.Shop.calculatePrice(Shop.java:25)
		//       at lambdasinaction.chap11.v1.Shop.getPrice(Shop.java:20)
		//       at lambdasinaction.chap11.v1.BestPriceFinder.lambda$7(BestPriceFinder.java:128)
		//       at lambdasinaction.chap11.v1.BestPriceFinder$$Lambda$386/2131039473.get(Unknown Source)
		//       ... 6 more
		assertNotNull(result);
	}

	@Test
	public void testFindPricesInUSD2_2()
		throws Exception {
		BestPriceFinder fixture = new BestPriceFinder();
		String product = "";

		List<String> result = fixture.findPricesInUSD2(product);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.concurrent.CompletionException: java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.util.concurrent.CompletableFuture.encodeThrowable(Unknown Source)
		//       at java.util.concurrent.CompletableFuture.completeThrowable(Unknown Source)
		//       at java.util.concurrent.CompletableFuture$AsyncSupply.run(Unknown Source)
		//       at java.util.concurrent.CompletableFuture$AsyncSupply.exec(Unknown Source)
		//       at java.util.concurrent.ForkJoinTask.doExec(Unknown Source)
		//       at java.util.concurrent.ForkJoinPool$WorkQueue.runTask(Unknown Source)
		//       at java.util.concurrent.ForkJoinPool.runWorker(Unknown Source)
		//       at java.util.concurrent.ForkJoinWorkerThread.run(Unknown Source)
		//       Caused by: java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.lang.String.charAt(Unknown Source)
		//       at lambdasinaction.chap11.v1.Shop.calculatePrice(Shop.java:25)
		//       at lambdasinaction.chap11.v1.Shop.getPrice(Shop.java:20)
		//       at lambdasinaction.chap11.v1.BestPriceFinder.lambda$7(BestPriceFinder.java:128)
		//       at lambdasinaction.chap11.v1.BestPriceFinder$$Lambda$386/2131039473.get(Unknown Source)
		//       ... 6 more
		assertNotNull(result);
	}

	@Test
	public void testFindPricesInUSD3_1()
		throws Exception {
		BestPriceFinder fixture = new BestPriceFinder();
		String product = "";

		List<String> result = fixture.findPricesInUSD3(product);

		// An unexpected exception was thrown in user code while executing this test:
		//    java.util.concurrent.CompletionException: java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.util.concurrent.CompletableFuture.encodeThrowable(Unknown Source)
		//       at java.util.concurrent.CompletableFuture.completeThrowable(Unknown Source)
		//       at java.util.concurrent.CompletableFuture$AsyncSupply.run(Unknown Source)
		//       at java.util.concurrent.CompletableFuture$AsyncSupply.exec(Unknown Source)
		//       at java.util.concurrent.ForkJoinTask.doExec(Unknown Source)
		//       at java.util.concurrent.ForkJoinPool$WorkQueue.runTask(Unknown Source)
		//       at java.util.concurrent.ForkJoinPool.runWorker(Unknown Source)
		//       at java.util.concurrent.ForkJoinWorkerThread.run(Unknown Source)
		//       Caused by: java.lang.StringIndexOutOfBoundsException: String index out of range: 0
		//       at java.lang.String.charAt(Unknown Source)
		//       at lambdasinaction.chap11.v1.Shop.calculatePrice(Shop.java:25)
		//       at lambdasinaction.chap11.v1.Shop.getPrice(Shop.java:20)
		//       at lambdasinaction.chap11.v1.BestPriceFinder.lambda$13(BestPriceFinder.java:148)
		//       at lambdasinaction.chap11.v1.BestPriceFinder$$Lambda$392/854656383.get(Unknown Source)
		//       ... 6 more
		assertNotNull(result);
	}

	@Test
	public void testFindPricesInUSDJava7_1()
		throws Exception {
		BestPriceFinder fixture = new BestPriceFinder();
		String product = "";

		List<String> result = fixture.findPricesInUSDJava7(product);

		assertNotNull(result);
		assertEquals(0, result.size());
	}

	@Test
	public void testFindPricesInUSDJava7_2()
		throws Exception {
		BestPriceFinder fixture = new BestPriceFinder();
		String product = "";

		List<String> result = fixture.findPricesInUSDJava7(product);

		assertNotNull(result);
		assertEquals(0, result.size());
	}

	@Test
	public void testFindPricesInUSDJava7_3()
		throws Exception {
		BestPriceFinder fixture = new BestPriceFinder();
		String product = "";

		List<String> result = fixture.findPricesInUSDJava7(product);

		assertNotNull(result);
		assertEquals(0, result.size());
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
		//       at lambdasinaction.chap11.v1.Shop.calculatePrice(Shop.java:25)
		//       at lambdasinaction.chap11.v1.Shop.getPrice(Shop.java:20)
		//       at lambdasinaction.chap11.v1.BestPriceFinder.lambda$1(BestPriceFinder.java:45)
		//       at lambdasinaction.chap11.v1.BestPriceFinder$$Lambda$377/1774483465.apply(Unknown Source)
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
		//       at lambdasinaction.chap11.v1.BestPriceFinder.findPricesParallel(BestPriceFinder.java:46)
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
		//       at lambdasinaction.chap11.v1.Shop.calculatePrice(Shop.java:25)
		//       at lambdasinaction.chap11.v1.Shop.getPrice(Shop.java:20)
		//       at lambdasinaction.chap11.v1.BestPriceFinder.lambda$0(BestPriceFinder.java:39)
		//       at lambdasinaction.chap11.v1.BestPriceFinder$$Lambda$376/2024453511.apply(Unknown Source)
		//       at java.util.stream.ReferencePipeline$3$1.accept(Unknown Source)
		//       at java.util.Spliterators$ArraySpliterator.forEachRemaining(Unknown Source)
		//       at java.util.stream.AbstractPipeline.copyInto(Unknown Source)
		//       at java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
		//       at java.util.stream.ReduceOps$ReduceOp.evaluateSequential(Unknown Source)
		//       at java.util.stream.AbstractPipeline.evaluate(Unknown Source)
		//       at java.util.stream.ReferencePipeline.collect(Unknown Source)
		//       at lambdasinaction.chap11.v1.BestPriceFinder.findPricesSequential(BestPriceFinder.java:40)
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
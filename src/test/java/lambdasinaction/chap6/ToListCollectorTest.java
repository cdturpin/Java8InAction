package lambdasinaction.chap6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ToListCollectorTest {
	@Test
	public void testAccumulator_1()
		throws Exception {
		ToListCollector fixture = new ToListCollector();

		BiConsumer<List<Object>, Object> result = fixture.accumulator();

		assertNotNull(result);
	}

	@Test
	public void testCharacteristics_1()
		throws Exception {
		ToListCollector fixture = new ToListCollector();

		Set<java.util.stream.Collector.Characteristics> result = fixture.characteristics();

		assertNotNull(result);
		assertEquals(2, result.size());
	}

	@Test
	public void testCombiner_1()
		throws Exception {
		ToListCollector fixture = new ToListCollector();

		BinaryOperator<List<Object>> result = fixture.combiner();

		assertNotNull(result);
	}

	@Test
	public void testFinisher_1()
		throws Exception {
		ToListCollector fixture = new ToListCollector();

		Function<List<Object>, List<Object>> result = fixture.finisher();

		assertNotNull(result);
	}

	@Test
	public void testSupplier_1()
		throws Exception {
		ToListCollector fixture = new ToListCollector();

		Supplier<List<Object>> result = fixture.supplier();

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
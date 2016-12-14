package lambdasinaction.chap14;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

import java.util.function.Consumer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersistentTrainJourneyTest {
	@Test
	public void testAppend_1()
		throws Exception {
		PersistentTrainJourney.TrainJourney a = new PersistentTrainJourney.TrainJourney(1, new PersistentTrainJourney.TrainJourney(1, new PersistentTrainJourney.TrainJourney(0, (PersistentTrainJourney.TrainJourney) null)));
		PersistentTrainJourney.TrainJourney b = new PersistentTrainJourney.TrainJourney(1, new PersistentTrainJourney.TrainJourney(0, (PersistentTrainJourney.TrainJourney) null));

		PersistentTrainJourney.TrainJourney result = PersistentTrainJourney.append(a, b);

		assertNotNull(result);
	}

	@Test
	public void testAppend_2()
		throws Exception {
		PersistentTrainJourney.TrainJourney a = null;
		PersistentTrainJourney.TrainJourney b = new PersistentTrainJourney.TrainJourney(1, new PersistentTrainJourney.TrainJourney(0, (PersistentTrainJourney.TrainJourney) null));

		PersistentTrainJourney.TrainJourney result = PersistentTrainJourney.append(a, b);

		assertNotNull(result);
	}

	@Test
	public void testLink_1()
		throws Exception {
		PersistentTrainJourney.TrainJourney a = null;
		PersistentTrainJourney.TrainJourney b = new PersistentTrainJourney.TrainJourney(1, new PersistentTrainJourney.TrainJourney(0, (PersistentTrainJourney.TrainJourney) null));

		PersistentTrainJourney.TrainJourney result = PersistentTrainJourney.link(a, b);

		assertNotNull(result);
	}

	@Test
	public void testLink_2()
		throws Exception {
		PersistentTrainJourney.TrainJourney a = new PersistentTrainJourney.TrainJourney(1, new PersistentTrainJourney.TrainJourney(1, new PersistentTrainJourney.TrainJourney(0, (PersistentTrainJourney.TrainJourney) null)));
		PersistentTrainJourney.TrainJourney b = new PersistentTrainJourney.TrainJourney(1, new PersistentTrainJourney.TrainJourney(0, (PersistentTrainJourney.TrainJourney) null));

		PersistentTrainJourney.TrainJourney result = PersistentTrainJourney.link(a, b);

		assertNotNull(result);
	}

	@Test
	public void testMain_1()
		throws Exception {
		String[] args = new String[] {};

		PersistentTrainJourney.main(args);

	}

	@Test
	public void testVisit_1()
		throws Exception {
		PersistentTrainJourney.TrainJourney journey = new PersistentTrainJourney.TrainJourney(1, new PersistentTrainJourney.TrainJourney(1, new PersistentTrainJourney.TrainJourney(0, (PersistentTrainJourney.TrainJourney) null)));
		Consumer<PersistentTrainJourney.TrainJourney> c = mock(Consumer.class);
		// add mock object expectations here


		PersistentTrainJourney.visit(journey, c);

	}

	@Test
	public void testVisit_2()
		throws Exception {
		PersistentTrainJourney.TrainJourney journey = null;
		Consumer<PersistentTrainJourney.TrainJourney> c = mock(Consumer.class);
		// add mock object expectations here


		PersistentTrainJourney.visit(journey, c);

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
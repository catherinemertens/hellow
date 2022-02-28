package interval;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class IntervalTest {
	// Verschillende voorstellingen voor hetzelfde idee
	// Verschillende voorstellingen voor eenzelfde abstracte toestandsruimte

	
	@Test
	void test() {
		Interval mijnInterval = new Interval();
		assertEquals(0, mijnInterval.ondergrens);
		assertEquals(0, mijnInterval.bovengrens);
		
		mijnInterval.bovengrens = 2;
		assertEquals(2, mijnInterval.bovengrens);
		
		assertEquals(2, getLengte(mijnInterval));
		
		assertEquals(0, getOndergrens(mijnInterval));
		assertEquals(0, getBovengrens(mijnInterval));
		
		setBovengrens(mijnInterval, 2);
		assertEquals(2, Interval.getLengte(mijnInterval);)
	}

}

package ch.mrs.dtime;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.Test;

public class DtimeTest {
	private static Calendar ENTLASSUNG_PUK = new GregorianCalendar(2018, 11, 21);
	private static Calendar ERSTER_CASH = new GregorianCalendar(2019, 0, 18);

	@Test
	public void entlassungsdatum_IsDayOneYearMinusOne() {
		Dtime start = new Dtime(ENTLASSUNG_PUK);
		assertEquals(1,start.getDay());
		assertEquals(-1,start.getYear());
	}
	@Test
	public void ersterCash_IsDay18YearZero() {
		Dtime start = new Dtime(ERSTER_CASH);
		assertEquals(18,start.getDay());
		assertEquals(0,start.getYear());
	}
}

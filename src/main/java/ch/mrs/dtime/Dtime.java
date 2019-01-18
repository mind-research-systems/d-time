package ch.mrs.dtime;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * D-Time 
 * Starts at 21.12.2018 with day 1 and year -1
 * @author donatmueller
 *
 */
public class Dtime {

	private static final int START_YEAR = 2018;
	private static final int START_DAY = 21;
	private static Calendar START = new GregorianCalendar(START_YEAR, 11, START_DAY);
	private final Calendar calendar;
	
	public Dtime(Calendar c) {
		this.calendar = c;
	}
	
	public Dtime(long millis) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTimeInMillis(millis);
		this.calendar = gc;
	}
	
	public Dtime() {
		this(System.currentTimeMillis());
	}
	
	public Dtime(int day, int year) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(Calendar.DAY_OF_YEAR, day);
		gc.set(Calendar.YEAR, year);
		this.calendar = gc;
	}
	
	private boolean isYearBelowZero() {
		return calendar.get(Calendar.YEAR) <= START_YEAR;
	}
	public int getYear() {
		return calendar.get(Calendar.YEAR) - START.get(Calendar.YEAR) - 1;
	}
	
	public int getDay() {
		return calendar.get(Calendar.DAY_OF_YEAR) -  (isYearBelowZero() ? START.get(Calendar.DAY_OF_YEAR) - 1: 0);
	}

	@Override
	public String toString() {
		return "Dtime [day=" + getDay() + " year=" + getYear() + "]";
	}
	
}

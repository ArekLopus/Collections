package colls.set;

import java.util.EnumSet;

import colls.additionalClasses.Weekday;

public class EnumSetTest {
	
	public EnumSetTest() {
		
		EnumSet<Weekday> always = EnumSet.allOf(Weekday.class);
		EnumSet<Weekday> never = EnumSet.noneOf(Weekday.class);
		EnumSet<Weekday> workday = EnumSet.range(Weekday.MONDAY, Weekday.FRIDAY);
		EnumSet<Weekday> mwf = EnumSet.of(Weekday.MONDAY, Weekday.WEDNESDAY, Weekday.FRIDAY);
		
		System.out.println(always);
		System.out.println(never);
		System.out.println(workday);
		System.out.println(mwf);
	}

	public static void main(String[] args) {
		new EnumSetTest();
	}

}


package com.hackerrank;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

// https://www.hackerrank.com/challenges/java-date-and-time/problem?isFullScreen=true&h_r=next-challenge&h_v=zen

public class CalendarDay {
	public static void main(String[] args) {
		String s = findDay(8, 05, 2015);
		System.out.println("---- " + s);
	}

	public static String findDay(int month, int day, int year) {
		Locale locale = new Locale("English", "IN");
		LocalDate date = LocalDate.of(year, month, day);
		// LocalDate date = LocalDate.now();
		DayOfWeek dw = date.getDayOfWeek();
		return dw.getDisplayName(TextStyle.FULL, locale).toUpperCase();
	}

}

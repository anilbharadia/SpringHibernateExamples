package org.rw.commons.lang;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;

public class TimestampUtils {

	
	public static final String DEFAULT_DATE_FORMAT_PATTERN = "dd/MM/yyyy";
	
	
	public static String format(Timestamp timestamp) {
		return format(timestamp, DEFAULT_DATE_FORMAT_PATTERN);
	}
	public static String format(Timestamp timestamp, String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(timestamp);
	}
	
	
	public static Timestamp parse(String timeStampString) {
		return parse(timeStampString, new String[] {DEFAULT_DATE_FORMAT_PATTERN});
	}
	public static Timestamp parse(String timeStampString, String[] parsePatterns) {
		Date date;
		try {
			date = DateUtils.parseDateStrictly(timeStampString, parsePatterns);
		} catch (ParseException e) {
			throw new RuntimeException("Can not parse String value[" + timeStampString + "] to java.util.Date");
		}
		return new Timestamp(date.getTime());
		
	}
	
}

package org.rw.commons.lang;


public class StringUtils extends org.apache.commons.lang.StringUtils {

	public static final String DOUBLE_QUOTE = "\"";
	
	/**
	 * <code>
	 * <br>doubleQuote("abc") --> "\"abc\""
	 * <br>doubleQuote("") --> "\"\""
	 * <br>doubleQuote(null) --> null
	 * </code>
	 */
	public static String doubleQuote(String string) {
		if (string == null) {
			return null;
		}
		return DOUBLE_QUOTE + string + DOUBLE_QUOTE;
	}
	
}

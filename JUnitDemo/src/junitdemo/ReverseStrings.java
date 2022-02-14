package junitdemo;

public class ReverseStrings {

	/*
	 * Reverse a given String
	 */
	public static String reverse(String string) {
		return new StringBuilder(string).reverse().toString();
	}
}

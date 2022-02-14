package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junitdemo.ReverseStrings;

class ReverseStringsTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	/*
	 * Testen von Annahmen
	 */
	@Test
	void reverse_non_null_string() {
		/*
		 * "abc" -> "cba"
		 * Spezialfall umgedrehter String
		 * Leerstrings "" ->  ""
		 */
		String emptyString = "";
		
		String reversed =  ReverseStrings.reverse(emptyString);
		
		// Annahmen
		assertEquals("", reversed);
		assertEquals("cba", ReverseStrings.reverse("abc"));
		assertEquals("fed", ReverseStrings.reverse("def"), "Nachricht");
		
		//Assert mit primitiven DatenTypen
		assertEquals(123, 123);
	}
	
	/*
	 * Testen von Exceptions
	 */
	@Test
	void reverse_null_string() {
		try {
			ReverseStrings.reverse(null);
			fail("Sollte eine IllegalArgumentException werfen.");
		} catch (IllegalArgumentException e) {
			
		}
	}
	
	@Test
	void reverse_null_string_02() {
		assertThrows(IllegalArgumentException.class, () -> {
			ReverseStrings.reverse(null);}
		);
	}

}

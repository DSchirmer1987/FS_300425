package bhs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import bhs.model.pflanze.Pflanze;

class PflanzeTest {
	private static Pflanze pflanze;
	
	@BeforeAll
	static void setUp() {
		pflanze = new Pflanze("Karotte");
	}
	
	@BeforeEach
	void erzwingeFehler() {
		pflanze.setSorte("Kartoffel");
		pflanze.ernten();
	}
	
	@Disabled
	@Test
	void test() {
		assertEquals("Karotte", pflanze.getSorte());
	}
	
	@Test
	@DisplayName("Qualit�t sollte Null sein")
	void test2() {
		assertEquals(25, pflanze.getQualitaet());
	}
	
	@Test
	@DisplayName("Qualit�t sollte definitiv NICHT NULL sein")
	void test3() {
		assertNotNull(pflanze.getQualitaet());
	}
	
	@Test
	@DisplayName("Qualit�t muss zwischen 50 und 85 sein")
	void test4() {
		assertTrue(pflanze.getQualitaet() >= 50 && pflanze.getQualitaet() <= 85);
	}

}

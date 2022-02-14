package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.*;

class FixtureDemoTest {
	static final Logger log = Logger.getLogger(FixtureDemoTest.class.getName());
	
	// @BeforeAll - Wird ausgeführt wenn die Testklasse ausgeführt wird - Nur einmal
	@BeforeAll
	@DisplayName("Starte")
	static void startPunkt() {
		log.info("@BeforeAll");
	}
	
	// @AfterAll - Wird nach Beendigung aller Tests ausgeführt - Nur einmal
	@AfterAll
	static void afterClass() {
		log.info("@AfterAll");
	}
	
	// @BeforeEach - Wird vor JEDEM Test ausgeführt
	@BeforeEach
	void setUp() {
		log.info("@Before");
	}
	
	// @AfterEach - Wird nach JEDEM Test ausgeführt
	@AfterEach
	void tearDown() {
		log.info("@After");
	}
	
	// @Test - Der Testfall direkt
	@Test
	void test() {
		log.info("@Test");
	}
	
	@Test
	void test2() {
		log.info("@Test 2");
	}

}

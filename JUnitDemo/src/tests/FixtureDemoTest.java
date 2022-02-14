package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.*;

class FixtureDemoTest {
	static final Logger log = Logger.getLogger(FixtureDemoTest.class.getName());
	
	// @BeforeAll - Wird ausgef�hrt wenn die Testklasse ausgef�hrt wird - Nur einmal
	@BeforeAll
	@DisplayName("Starte")
	static void startPunkt() {
		log.info("@BeforeAll");
	}
	
	// @AfterAll - Wird nach Beendigung aller Tests ausgef�hrt - Nur einmal
	@AfterAll
	static void afterClass() {
		log.info("@AfterAll");
	}
	
	// @BeforeEach - Wird vor JEDEM Test ausgef�hrt
	@BeforeEach
	void setUp() {
		log.info("@Before");
	}
	
	// @AfterEach - Wird nach JEDEM Test ausgef�hrt
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

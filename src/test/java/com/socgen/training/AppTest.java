package com.socgen.training;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class AppTest {
	
//	@Test
//	void testSample() {
//		fail("Test failed...");
//	}
	
	App app;
	
	@BeforeAll
	static void callAtBeginning() {
		System.out.println("callAtBeginning...");
	}
	
	@AfterAll
	static void callAtEnd() {
		System.out.println("callAtEnd...");
	}
	
	@BeforeEach
	void callBeforeEachTestCase() {
		app = new App();
		System.out.println("callBeforeEachTestCase...");
	}
	
	@AfterEach
	void callAfterEachTestCase() {
		System.out.println("callAfterEachTestCase...");
	}
	
	
	
	
	@Test
	@DisplayName("Test Division")
//	@EnabledOnOs(OS.LINUX) //Conditional disabling
	//@EnabledOnJre(value = JRE.JAVA_15)
	void testDivide() {

		int result = app.divide(50, 2);
		
		assertAll(
			() -> assertEquals(25, result),
			() -> assertNotEquals(25, app.divide(100, 7)),
			() -> assertTrue(true)
				);
		
//		assertNull(app);
		
	}
	
	@Test
	@DisplayName("Check for null")
	//@Disabled //Disabled Test now, would not be executed
	void testGetMessage() {
		String ref = app.getMessage();
		
		assertNotNull(ref, "method returned null");
	}
	
	
	
	
	
	
}

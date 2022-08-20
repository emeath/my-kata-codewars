package codeWarsPractice.CamelCase;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CamelCaseTest {

	@Test
	void test() {
		String input = "test-A-app";
		String output = CamelCase.toCamelCase(input);
		assertEquals("testAApp", output);
	}

}

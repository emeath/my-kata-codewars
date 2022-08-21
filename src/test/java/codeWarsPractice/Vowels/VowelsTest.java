package codeWarsPractice.Vowels;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class VowelsTest {

	@Test
	void vowelCounterDeveRetornar4VogaisParaPalavraAbacate() {
		String input = "abacate";
		assertEquals(4, Vowels.vowelCounter(input));
	}
	
	@Test
	void vowelCounterDeveRetornar10VogaisParaFraseAbacateMuitoMaduro() {
		String input = "abacate muito maduro";
		assertEquals(10, Vowels.vowelCounter(input));
	}
	
	@Test
	void vowelCounterDeveRetornar0VogaisParaPalavraXYZ() {
		String input = "xyz";
		assertEquals(0, Vowels.vowelCounter(input));
	}
	
	
}

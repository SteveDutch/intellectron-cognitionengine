package com.stevedutch.intellectron.web;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

class HomeControllerTest {

	@InjectMocks
	HomeController underTest;

	@Test
	void testShowHomePage() {
		fail("Not yet implemented");
	}

	@Test
	void testShowAlsoHomePage() {
		fail("Not yet implemented");
	}

	@Test
	 void testShowHomePage_1() throws Exception {
	// given
	// when
	String actual=underTest.showHomePage();
	// then
	assertThat(actual).isEqualTo("TestExpected");
	}

	@Test
	 void testShowAlsoHomePage_1() throws Exception {
	// given
	// when
	String actual=underTest.showAlsoHomePage();
	// then
	assertThat(actual).isEqualTo("TestExpected");
	}

}

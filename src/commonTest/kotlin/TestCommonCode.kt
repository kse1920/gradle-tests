package com.example.lib

import kotlin.test.Test
import kotlin.test.assertEquals

@DisplayName("Common Code Test")
class TestCommonCode {
	@Test
	@DisplayName("Test id")
	fun testId() {
		val x = 1
		val idX = 3
		assertEquals(x, idX)
	}

	@DisplayName("Second Test")
	@Test
	fun testExpectedFun() {
		expectedFun()
	}
}

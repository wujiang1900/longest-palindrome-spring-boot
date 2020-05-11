package com.odx.test.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class PalindromeServiceTest {
	
	@Test
	public void getLongestPalindromicSubstring_test_should_return_string() {
		String input = "ababba";
		assertNotNull(new PalindromeServiceImpl().getLongestPalindromicSubstring(input));
	}
	
	@Test
	public void getLongestPalindromicSubstring_test_null() {
		String input = null;
		String str = "";
		assertEquals(str, new PalindromeServiceImpl().getLongestPalindromicSubstring(input));
	}
	
	@Test
	public void getLongestPalindromicSubstring_test_empty() {
		String input = "";
		String str = "";
		assertEquals(str, new PalindromeServiceImpl().getLongestPalindromicSubstring(input));
	}
	
	@Test
	public void getLongestPalindromicSubstring_test_length_1() {
		String input = "a";
		String str = "a";
		assertEquals(str, new PalindromeServiceImpl().getLongestPalindromicSubstring(input));
	}

	@Test
	public void getLongestPalindromicSubstring_test_length_2() {
		String input = "aa";
		String str = "aa";
		assertEquals(str, new PalindromeServiceImpl().getLongestPalindromicSubstring(input));
	}

	@Test
	public void getLongestPalindromicSubstring_test_length_2_negative() {
		String input = "ab";
		String str = "a";
		assertEquals(str, new PalindromeServiceImpl().getLongestPalindromicSubstring(input));
	}
	
	@Test
	public void getLongestPalindromicSubstring_test_length_3() {
		String input = "aba";
		String str = "aba";
		assertEquals(str, new PalindromeServiceImpl().getLongestPalindromicSubstring(input));
	}
	
	@Test
	public void getLongestPalindromicSubstring_test_length_3_negative() {
		String input = "caa";
		String str = "aa";
		assertEquals(str, new PalindromeServiceImpl().getLongestPalindromicSubstring(input));
	}
	
	@Test
	public void getLongestPalindromicSubstring_test_length_3_up() {
		String input = "ababba";
		String str = "abba";
		assertEquals(str, new PalindromeServiceImpl().getLongestPalindromicSubstring(input));
	}
}

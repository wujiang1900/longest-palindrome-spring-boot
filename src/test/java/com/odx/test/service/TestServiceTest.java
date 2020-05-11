package com.odx.test.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.odx.test.entity.Palin;
import com.odx.test.repo.TestRepo;

@ExtendWith(MockitoExtension.class)
public class TestServiceTest {
	@Mock
	PalindromeService palinService;
	
	@Mock
	TestRepo repo;
	
	@InjectMocks
	TestService service;
	
	@Test
	public void getLongestPalindromicSubstring_test_in_db() {
		String input = "ababba";
		String longest = "abba";
		Palin palin = new Palin(input, longest);
		when(repo.findByName(input)).thenReturn(Optional.of(palin));
		
		String actual = service.getLongestPalindromicSubstring(input);
		assertEquals(longest, actual);
	}

	@Test
	public void getLongestPalindromicSubstring_test_not_in_db() {
		String input = "ababba";
		String longest = "abba";
		when(repo.findByName(input)).thenReturn(Optional.empty());
		when(palinService.getLongestPalindromicSubstring(input)).thenReturn(longest);
		
		String actual = service.getLongestPalindromicSubstring(input);
		assertEquals(longest, actual);
	}

}

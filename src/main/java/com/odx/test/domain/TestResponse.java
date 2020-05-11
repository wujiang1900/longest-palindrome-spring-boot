package com.odx.test.domain;

import lombok.AllArgsConstructor;
import lombok.Value;

@AllArgsConstructor
@Value
public class TestResponse {
	String inputString;
	String longestPalindromicSubstring;
}

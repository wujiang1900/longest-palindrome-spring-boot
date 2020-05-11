package com.odx.test.service;

import org.springframework.stereotype.Service;

@Service
public class PalindromeServiceImpl implements PalindromeService {

	boolean[][] isP;
	
	@Override
	public String getLongestPalindromicSubstring(String inputString) {
		if(inputString==null || inputString.isEmpty()) return "";
	
		char[] str = inputString.toCharArray();
		int length = inputString.length();
		isP = new boolean[length][length];
		
		int max = 1; 
		int start = 0; // any string of length 1 is a palindrome by itself
		for(int i=0; i<length; i++) {
			isP[i][i] = true; // any substring of length 1 is a palindrome
			
			// any substring of length 2
			if(i<length-1 && str[i]==str[i+1]) {
				isP[i][i+1] = true;
				max = 2;
				start = i;
			}
		}
		
		// any substring of length 3 and up
		for(int j=2; j<length; j++) {
			for(int i=0; i<length; i++) {
				if(i+j<length  && str[i]==str[i+j] && isP[i+1][i+j-1]) {
					isP[i][i+j] = true;
					if(j+1>max) {
						max = j+1;
						start = i;
					}
				}
			}
		}
		return inputString.substring(start, start+max);
	}
	
}

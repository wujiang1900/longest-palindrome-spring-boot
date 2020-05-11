package com.odx.test.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity(name="demo")
public class Palin {
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String longestPalin;

	public Palin(String input, String longest) {
		name = input;
		longestPalin = longest;
	}
}

package com.ashiqur.rahman.generics;

import static org.junit.Assert.*;

import org.junit.Test;

public class appTest {

	@Test
	public void addTest() {
		App a = new App();
		int i=a.list.size();
		int j = a.add(1,"Rakib");
		assertEquals(i+1, j);
	}
	@Test
	public void clearTest() {
		App a = new App();
		
		int j = a.clear();
		assertEquals(0, j);
	}

}

package edu.mum.cs.cs390fpp.finalexamstarter.q12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestIntegerSLList {

	@Test
	void testRemoveFirstWithEmptyList() {
		
		IntegerSLList list = new IntegerSLList();
		var result = list.removeFirst();
		assertEquals(null, result);
	}
	
	@Test
	void testRemoveFirstWithOneList() {
		
		IntegerSLList list = new IntegerSLList();
		list.addLast(12);
		var result = list.removeFirst();
		assertEquals(12, result);
	}
	
	@Test
	void testRemoveFirstWithFewLists() {
		
		IntegerSLList list = new IntegerSLList();
		list.addLast(18);
		list.addLast(11);
		list.addLast(0);
		list.addLast(9);
		var result = list.removeFirst();
		assertEquals(18, result);
	}
	
	@Test
	void testFindMaxWithEmptyList() {
		
		IntegerSLList list = new IntegerSLList();
		var result = list.findMax();
		assertEquals(null, result);
	}
	
	@Test
	void testFindMaxWithOneList() {
		
		IntegerSLList list = new IntegerSLList();
		list.addLast(18);
		var result = list.findMax();
		assertEquals(18, result);
	}
	
	@Test
	void testFindMaxWithFewLists() {
		
		IntegerSLList list = new IntegerSLList();
		list.addLast(18);
		list.addLast(156);
		list.addLast(890);
		list.addLast(567);
		var result = list.findMax();
		assertEquals(890, result);
	}

}

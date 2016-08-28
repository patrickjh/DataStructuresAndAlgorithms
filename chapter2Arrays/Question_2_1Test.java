package dataStructuresAndAlgorithms.chapter2Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class Question_2_1Test {

	@Test
	public void getMaxReturnsHighestKey() {
		HighArray2_1 arr = new HighArray2_1(50);
		arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);
		
		long max = arr.getMax();
		
		assertEquals("getMax doesn't show correct maximum", 99, max);
	}
	
	@Test
	public void getMaxReturnsNegativeOneIfEmpty() {
		HighArray2_1 arr = new HighArray2_1(0);
		long max = arr.getMax();
		
		assertEquals("Array Should be empty and return -1", -1, max);
	}

}

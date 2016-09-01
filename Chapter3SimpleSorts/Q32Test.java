package dataStructuresAndAlgorithms.chapter3SimpleSorts;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q32Test {

	@Test
	public void medianShouldFindMiddleIfOddLength() {
		Q32 arr = new Q32(100);
		
		arr.insert(1);
		arr.insert(2);
		arr.insert(3);
		arr.insert(4);
		arr.insert(5);
		
		long median = arr.median();
		
		assertEquals("median should return median", 3, median);
	}
	
	@Test
	public void medianShouldFindMiddleIfEvenLength() {
		Q32 arr = new Q32(100);
		
		arr.insert(1);
		arr.insert(2);
		arr.insert(3);
		arr.insert(4);
		
		long median = arr.median();
		
		assertEquals("median should return median", 2, median);
	}

}

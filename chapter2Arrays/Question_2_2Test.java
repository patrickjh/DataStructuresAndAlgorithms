package dataStructuresAndAlgorithms.chapter2Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class Question_2_2Test {

	@Test
	public void removeMaxShouldHaveFindFail() {
		int maxSize = 50;
		HighArray2_2 arr = new HighArray2_2(maxSize);
		
		arr.insert(00);
		arr.insert(11);
		arr.insert(22);
		arr.insert(33);
		arr.insert(44);
		arr.insert(55);
		arr.insert(99);
		arr.insert(66);
		arr.insert(77);
		arr.insert(88);
	

		
		arr.removeMax();
		
		boolean found = arr.find(99);
		
		assertEquals("Couldn't find max because it was removed",false,found);
		
		
	}
	
	@Test
	public void removeMaxShouldReturnMax(){
		int maxSize = 50;
		HighArray2_2 arr = new HighArray2_2(maxSize);
		
		arr.insert(00);
		arr.insert(11);
		arr.insert(22);
		arr.insert(33);
		arr.insert(44);
		arr.insert(55);
		arr.insert(99);
		arr.insert(66);
		arr.insert(77);
		arr.insert(88);

		long remove = arr.removeMax();
		
		assertEquals("Removed item should be highest item", 99, remove);
	}

}

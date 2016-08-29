package dataStructuresAndAlgorithms.chapter2Arrays;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class Question_2_6Test {

	@Test
	public void noDupsShouldRemoveDuplicatesFromArray() {
		Question_2_6HighArray arr = new Question_2_6HighArray(3);
		
		arr.insert(22);
		arr.insert(22);
		arr.insert(22);
		
		arr.noDups();
		
		long[] expected = new long[1];
		expected[0] = 22;
		
		assertArrayEquals("Both should have one item", expected , arr.a);
	}

}

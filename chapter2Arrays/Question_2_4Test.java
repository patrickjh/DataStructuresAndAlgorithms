/**
 * 
 */
package dataStructuresAndAlgorithms.chapter2Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author patrick
 *
 */
public class Question_2_4Test {

	@Test
	public void insertWhenEmptyShouldInsert() {
		Question_2_4Array arr = new Question_2_4Array(100);
		
		arr.insert(11);
		
		int index = arr.find(11);
		
		assertEquals("Index of first Item should be 0",0,index);
	}

}

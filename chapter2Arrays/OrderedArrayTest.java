package dataStructuresAndAlgorithms.chapter2Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrderedArrayTest {

	@Test
	public void test() {
		OrdArray testOrdArray = new OrdArray(1);
		testOrdArray.insert(5);
		int result = testOrdArray.find(5);
		assertEquals(0, result);
	}

}

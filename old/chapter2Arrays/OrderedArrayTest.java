package dataStructuresAndAlgorithms.old.chapter2Arrays;

import static org.junit.Assert.*;

import org.junit.*;

public class OrderedArrayTest {

	@Test
	public void test() {
		OrdArray testOrdArray = new OrdArray(1);
		testOrdArray.insert(5);
		int result = testOrdArray.find(5);
		assertEquals(0, result);
	}
	
	public static void main(String args[]) {
		org.junit.runner.JUnitCore.main("dataStructuresAndAlgorithms.old.chapter2Arrays.OrderedArrayTest");
	
	}
	

}

package dataStructuresAndAlgorithms.chapter3SimpleSorts;

import static org.junit.Assert.*;

//import java.util.Arrays;

import org.junit.Test;

public class Q31Test {

	@Test
	public void test() {
		Q31 arr = new Q31(10);
		
		arr.insert(22);
		arr.insert(55);
		arr.insert(11);
		arr.insert(99);
		arr.insert(66);
		arr.insert(33);
		arr.insert(00);
		arr.insert(88);
		arr.insert(44);
		arr.insert(77);
		
		arr.bubbleSort();
		
		long[] expected = new long[]{00,11,22,33,44,55,66,77,88,99};
		//arr.display();
		//System.out.println(Arrays.toString(expected));
		assertArrayEquals("Array should be sorted", expected, arr.a);
	}

}

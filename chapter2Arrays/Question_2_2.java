package dataStructuresAndAlgorithms.chapter2Arrays;

/*
Modify the method in Programming Project 2.1 
so that the item with the highest key is not only returned by the method, 
but also removed from the array. 
Call the method removeMax( ).
*/

class HighArray2_2 extends HighArray2_1{
	HighArray2_2(int length) {
		super(length);
	}
	
	public long removeMax() {
		long max = getMax();
		delete(max);
		return max;
	}
}


public class Question_2_2{
	
}

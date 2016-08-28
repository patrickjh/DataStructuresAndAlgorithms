package dataStructuresAndAlgorithms.chapter2Arrays;

/*
2.3 The removeMax( ) method in Programming Project 2.2 
suggests a way to sort the contents of an array by key value.
Implement a sorting scheme that does not require modifying the HighArray class,
but only the code in main( ). 
You'll need a second array, which will end up inversely sorted.
(This scheme is a rather crude variant of the selection sort in Chapter 3, “Simple Sorting.”)
*/

public class Question_2_3{
	
	public static void main(String[] args) {
		//this assignment does not lend itself to TDD very well
		HighArray2_2 arr = new HighArray2_2(100);
		
		arr.insert(00);
		arr.insert(11);
		arr.insert(22);
		arr.insert(33);
		arr.insert(44);
		arr.insert(55);
		arr.insert(66);
		arr.insert(99);
		arr.insert(77);
		arr.insert(88);
		
		
		HighArray2_2 sortedArr = new HighArray2_2(100);
		
		long highest;
		
		while(true) {
		
			highest = arr.removeMax();
			if(highest == -1)
				break;
			sortedArr.insert(highest);
		}	
		
		sortedArr.display();
	}
	
}
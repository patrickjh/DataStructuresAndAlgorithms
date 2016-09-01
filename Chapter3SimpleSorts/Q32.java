/**
 * 
 */
package dataStructuresAndAlgorithms.chapter3SimpleSorts;

/**
 * @author patrick
 *3.2 Add a method called median( ) to the ArrayIns class in the insertSort.java program (Listing 3.3). 
 *This method should return the median value in the array. 
 *(Recall that in a group of numbers half are larger than the median and half are smaller.) 
 *Do it the easy way.
 */
 
 
 /*
 Thoughts on how to solve this:
 	first sort the array
	find the middle items by going to
	index which is nelems divided in half
	check for modulus then do average of two 
	numbers if there is a modulus, 
	so if nelems%2 != 0, then take (a[nelems/2] + a[ (nelems/2 ) + 1]) / 2
	else take a[nelems/2]
	that is the median
	
test case: have a 10 item array. check if median is 
what i think it should be.
 */
public class Q32 extends ArrayIns {
	public Q32(int max) {
		super(max);
	}
	
	public long median() {
		this.insertionSort();
		long median = 0;
		int midpoint = (nElems-1)/2;
		
		//if array is even length
		if(nElems%2 == 0) {
			median = ( (a[midpoint] + a[midpoint +1])    / 2);
		} else{
		//if array is odd length	
			median = a[midpoint];
		}
		return median;
	}

}

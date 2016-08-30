/**
 * 
 */
package dataStructuresAndAlgorithms.chapter3SimpleSorts;

/**
 * @author patrick
 *3.4 Another simple sort is the odd-even sort. The idea is to repeatedly make two passes through the array. 
 *On the first pass you look at all the pairs of items, a[j] and a[j+1], where j is odd (j = 1, 3, 5, …). 
 *If their key values are out of order, you swap them. 
 *On the second pass you do the same for all the even values (j = 2, 4, 6, …). You do these two passes repeatedly until the array is sorted. 
 *Replace the bubbleSort( ) method in bubbleSort.java (Listing 3.1) with an oddEvenSort( ) method. 
 *Make sure it works for varying amounts of data. You'll need to figure out how many times to do the two passes.          
 *The odd-even sort is actually useful in a multiprocessing environment, where a separate processor can operate on each odd pair simultaneously 
 *and then on each even pair. 
 *Because the odd pairs are independent of each other, each pair can be checked—and swapped, if necessary—by a different processor. 
 *This makes for a very fast sort.
*/


/*
Thoughts on how to solve this
	inside a do while loop
	define boolean swaps to false
	do two for loops. one for odds, one for even
		first do a loop which compares j and j+1 and 
		calls swap if left one is larger and sets swaps to true
		next do a loop with j+1 and j+2,
		if left one is larger, call swap, set swap to true
	while loop ends when no swaps are done
		i.e. swaps = false after inner loops


*/
public class Question_3_4 {

}

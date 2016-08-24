/**
 * 
 */
package dataStructuresAndAlgorithms.chapter3SimpleSorts;

/**
 * @author patrick
 *3.6 Here's an interesting way to remove duplicates from an array. 
 *The insertion sort uses a loop-within-a-loop algorithm that compares every item in the array with every other item. 
 *If you want to remove duplicates, this is one way to start. (See also Exercise 2.6 in Chapter 2.) 
 *Modify the insertionSort( ) method in the insertSort.java program so that it removes duplicates as it sorts.
 * Here's one approach: When a duplicate is found, 
 * write over one of the duplicated items with a key value less than any normally used (such as -1, if all the normal keys are positive).
 * Then the normal insertion sort algorithm, treating this new key like any other item, will put it at index 0. 
 * From now on the algorithm can ignore this item. The next duplicate will go at index 1, and so on. When the sort is finished, all
 * the removed dups (now represented by -1 values) will be found at the beginning of the array. 
 * The array can then be resized and shifted down so it starts at 0.
 */
public class Question_3_6 {

}

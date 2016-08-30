/**
 * 
 */
package dataStructuresAndAlgorithms.chapter3SimpleSorts;

/**
 * @author patrick
 *3.3 To the insertSort.java program (Listing 3.3), add a method called noDups( ) 
 *that removes duplicates from a previously sorted array without disrupting the order. 
 *(You can use the insertionSort( ) method to sort the data, or you can simply use main( ) to insert the data in sorted order.) 
 *One can imagine schemes in which all the items from the place where a duplicate was discovered to the end of the array 
 *would be shifted down one space every time a duplicate was discovered, 
 *but this would lead to slow O(N2) time, at least when there were a lot of duplicates. 
 *In your algorithm, make sure no item is moved more than once, no matter how many duplicates there are. 
 *This will give you an algorithm with O(N) time.
 */
 
 /*
 thoughts on how to solve:

 first call insertion sort to check if its sorted or not.
 
 Go through the array with a temporary value current.
 and a temporary value called insertionPoint
 if the array item equals current, do nothing.
 if it doesnt, 
 	set current to that item
	put that item at array[insertionPoint]
	increment insertionPoint
 since array is sorted, each item should 
 show up once in order then not again.
 stop when current equals array[nElems]
 truncate any of the array left after the insertion point 
 so the array length = insertion point.
 set nelems = insertion point
 return
 
 */
public class Question_3_3 {

}

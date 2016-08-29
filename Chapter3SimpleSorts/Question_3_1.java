/**
 * 
 */
package dataStructuresAndAlgorithms.chapter3SimpleSorts;

/**
 * @author patrick
 *3.1 In the bubbleSort.java program (Listing 3.1) and the BubbleSort Workshop applet, 
 *the index always goes from left to right, finding the largest item and carrying it toward out on the right. 
 *Modify the bubbleSort( ) method so that it's bidirectional. 
 *This means the in index will first carry the largest item from left to right as before,
 *but when it reaches out, it will reverse and carry the smallest item from right to left. 
 *You'll need two outer indexes, one on the right (the old out) and another on the left.
 */
public class Question_3_1 {
/*
We will need two indexes, one for the bottom, one for the top
on each big loop, they will move towards the middle.
we will need two inner loops
	first loop moves left to right,
		it checks if the left one is bigger 
		than the right one and swaps until it 
		reaches right index
	second loop moves right to left.
		it checks if right one is smaller than 
		left one and swaps if they are.
	big loop keeps going until these meet in the middle
	have a left index and a right index that each loop moves.
	have it inside a while loop which checks if 
	left index and right index are equal
	
	test case checks if a ten item array gets sorted or not.
	it uses an array comparison.
	
*/
}

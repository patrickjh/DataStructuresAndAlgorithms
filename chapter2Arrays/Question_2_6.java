package dataStructuresAndAlgorithms.chapter2Arrays;

import java.util.Arrays;

/*
Write a noDups( ) method for
the HighArray class of the highArray.java program (Listing 2.3). 
This method should remove all duplicates from the array. 
That is, if three items with the key 17 appear in the array, 
noDups( ) should remove two of them. 
Don't worry about maintaining the order of the items.
One approach is to first compare every item with all the other items
and overwrite any duplicates with a null (or a distinctive value that isn't used for real keys). 
Then remove all the nulls. Of course, the array size will be reduced.
*/

public class Question_2_6 {}

class Question_2_6HighArray extends HighArray{
	
	Question_2_6HighArray(int max) {
		super(max);
	}
	
	public void noDups() {
		Question_2_6HighArray newArray = new Question_2_6HighArray(this.nElems);
		
		for (int i = 0; i<this.nElems; i++){
			if(newArray.find(this.a[i]) == false) {
				newArray.insert(this.a[i]);
			}		
		}
		
		this.a = Arrays.copyOfRange(newArray.a, 0, newArray.nElems);
	}
}
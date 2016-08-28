package dataStructuresAndAlgorithms.chapter2Arrays;

/*
Modify the orderedArray.java program (Listing 2.4) 
so that the insert( ) and delete( ) routines, as well as find( ), 
use a binary search, as suggested in the text.
*/



public class Question_2_4 {
	
}

//This is bad code duplication.
class Question_2_4Array {
		private long[] a;
		private int nElems;
		
		public Question_2_4Array(int max) {
			a = new long[max];
			nElems = 0;
		}
		
		public int size() {
			return nElems;
		}
		
		public int find(long searchKey){
			int lowerBound = 0;
			int upperBound = nElems-1;
			int curIn;
			
			while(true) {
				curIn = (lowerBound + upperBound) / 2;
				if(a[curIn] == searchKey)
					return curIn;
				else if(lowerBound > upperBound)
					return nElems;
				else {
					if(a[curIn] < searchKey)
						lowerBound = curIn + 1;
					else
						upperBound = curIn - 1;
				}
			}
		}
		
		public void insert(long value) {
			int j = 0;
			int lowerBound = 0;
			int upperBound = nElems-1;
			int median = 0;
			
			if(nElems != 0) {
				while(true) {
					median = (lowerBound + upperBound)/2;
					if(a[median]<=value && a[median + 1] >= value) {
						j = median;
						break;
					} else if(lowerBound > upperBound) {
						System.out.println("Something went wrong!");
					} else {
						if(a[median] < value ) {
							lowerBound = median;
						} else{
							upperBound = median;
						}
					}
				}			
			}
			for(int k= nElems; k>j; k--)
				a[k] = a [k-1];
			a[j] = value;
			nElems++;
		}
		
		public boolean delete(long value) {
			int j = find(value);
			if(j==nElems)
				return false;
			else {
				for(int k=j; k<nElems; k++)
					a[k] = a[k+1];
				nElems--;
				return true;
			}
		}
		
		public void display() {
			for(int j=0; j<nElems; j++)
				System.out.print(a[j] + " ");
			System.out.println("");
		}
}
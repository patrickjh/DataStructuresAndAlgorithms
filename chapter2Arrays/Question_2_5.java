package dataStructuresAndAlgorithms.chapter2Arrays;

/*
Add a merge( ) method to the OrdArray class 
in the orderedArray.java program (Listing 2.4) 
so that you can merge two ordered source arrays 
into an ordered destination array. Write code in main( ) 
that inserts some random numbers into the two source arrays, 
invokes merge( ), and displays the contents of the resulting destination array. 
The source arrays may hold different numbers of data items. 
In your algorithm you will need to compare the keys of the source arrays, 
picking the smallest one to copy to the destination. 
You'll also need to handle the situation when one source array exhausts its contents before the other.
*/

//This is bad code duplication.
class Question_2_5Array{
		private long[] a;
		private int nElems;
		
		public Question_2_5Array(int max) {
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
			int j;
			for(j=0; j<nElems; j++)
				if(a[j] > value)
					break;
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
		
		public Question_2_5Array merge(Question_2_5Array Array1, Question_2_5Array Array2){
			
			int combinedSize = (Array1.size() + Array2.size());
			Question_2_5Array newArray = new Question_2_5Array(combinedSize);
			
			while(Array1.size() != 0 || Array2.size() != 0){
				if (Array1.a[0] >= Array2.a[0]) {
					newArray.insert(Array1.a[0]);
					Array1.delete(Array1.a[0]);
				} 
				
				else {
					newArray.insert(Array2.a[0]);
					Array2.delete(Array2.a[0]);
				}
			}
			
			
			
			return newArray;
		}
		
		public void display() {
			for(int j=0; j<nElems; j++)
				System.out.print(a[j] + " ");
			System.out.println("");
		}
	}
	


public class Question_2_5 {
	public static void main(String[] args) {
		Question_2_5Array Array1 = new Question_2_5Array(10);
		
		Array1.insert(11);
		Array1.insert(55);
		Array1.insert(37);
		Array1.insert(29);
		Array1.insert(4);
		Array1.insert(100);
		
		Question_2_5Array Array2 = new Question_2_5Array(10);
		
		Array2.insert(33);
		Array2.insert(5);
		
		Question_2_5Array mergedArray = new Question_2_5Array(20);
		
		mergedArray = mergedArray.merge(Array1, Array2);
		
		mergedArray.display();
	}
}
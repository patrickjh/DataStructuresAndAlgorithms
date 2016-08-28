package dataStructuresAndAlgorithms.chapter2Arrays;

/*
To the HighArray class in the highArray.java program (Listing 2.3), 
add a method called getMax( ) that returns the value of the highest key in the array, 
or -1 if the array is empty. 

Add some code in main( ) to exercise this method. 
You can assume all the keys are positive numbers.
*/
class HighArray2_1 extends HighArray {
		HighArray2_1(int max){
			super(max);
		}
		
		public long getMax() {
			long max = -1;
			int i = 0;
			while(super.getAtIndex(i) != -1) {
				if(super.getAtIndex(i) > max) {
					max = super.getAtIndex(i);
				}
				i++;
			}
			
			return max;
		}
	}
	public class Question_2_1 {
		public static void main(String[] args) {
			int maxSize = 100;
			HighArray2_1 arr;
			arr = new HighArray2_1(maxSize);
			
			arr.insert(77);
			arr.insert(99);
			arr.insert(44);
			arr.insert(55);
			arr.insert(22);
			arr.insert(88);
			arr.insert(11);
			arr.insert(00);
			arr.insert(66);
			arr.insert(33);
			
			arr.display();
			
			int searchKey = 35;
			if(arr.find(searchKey))
				System.out.println("Found " + searchKey);
			else
				System.out.println("Can't find " + searchKey);
			
			long max = arr.getMax();
			System.out.println("Current Maximum is " + max);
			arr.delete(00);
			arr.delete(55);
			arr.delete(99);
			
			arr.display();
			
			max = arr.getMax();
			System.out.println("New Maximum is " + max);
			
		}

	}

package dataStructuresAndAlgorithms.old.BasicSorting.src;

class ArrayBub	{
		private long[] a;
		private int nElems;

		public ArrayBub(int max) {
			a = new long[max];
			nElems = 0;
		}

		public void insert(long value) {
			a[nElems] = value;
			nElems++;
		}

		public void display() {
			for(int j=0; j<nElems; j++)
				System.out.print(a[j] + " ");
			System.out.println("");

		}

		public void bubbleSort() {
			int highOut = 0; 
			int in = 0;
			int lowOut = 0;
			
			for(highOut=nElems-1; highOut>1; highOut--, lowOut++)
				for(in=0; in<highOut; in++)
					if( a[in] > a[in+1])
						swap(in, in+1);
				for(lowOut=0; in>lowOut; in--)
					if( a[in] < a[in-1])
						swap(in, in-1);

		}

		public void oddEvenSort() {
			/*
			challenge 3.4 in the book
			overarching while loop to determine how many times to run the swaps
			have it run until no swaps occur in either the odd or the even for loops. Then it is sorted
			At the start of the while loop, set two boolean flags to false: oddSwap? and evenSwap?
			Inside the for loop for odd items set oddSwap to true when the odd items swap
			Same for evenSwap - when it swaps set evenSwap to true
			have the while condition check if these are both false. When they are both false, no swaps occurred so the array is sorted

			first for loop checks the odd items
			check for swap at pairs a[j] and a[j+1] where j is odd, swap()
			second for loop checks the even items
			check for swap at pairs where a[k] and a[k+1] where k is even
			increment k and j twice
			*/

			boolean oddSwap = true;
			boolean evenSwap = true;
			

			while(oddSwap == true && evenSwap == true) {
				oddSwap = false;
				evenSwap = false;
				for(int j =0; j<nElems-1;j=j+2) {
					if (a[j]>a[j+1]) {
						swap(j,j+1);
						oddSwap =true;
					}
				for(int k =1; k<nElems-1;k=k+2) {
					if (a[k]>a[k+1]) {
						swap(k, k+1);
						evenSwap = true;
					}
				}
				}


			}


		}

		private void swap(int one, int two) {
			long temp = a[one];
			a[one] = a[two];
			a[two] = temp;
		}


	}

	class BubbleSort {
		public static void main(String[] args) {
			int maxSize = 100;
			ArrayBub arr;
			arr = new ArrayBub(maxSize);

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

			arr.oddEvenSort();
			arr.display();
		}
	}
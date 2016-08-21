package dataStructuresAndAlgorithms.old.BasicSorting.src;

class ArrayIns {
	private long[] a;
	private int nElems;

	public ArrayIns(int max) {
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

	public void insertionSort() {
		int in, out;
		int copy = 0;
		int comparisons = 0;

		for(out=1; out<nElems; out++) {
			long temp = a[out];
			copy++;
			in = out;
			while(in>0 && a[in-1] >= temp) {
				a[in] = a[in-1];
				copy++;
				--in;
				comparisons++;
			}
			a[in] = temp;
			copy++;
		}
		System.out.println("Copies: " + copy + " / Comparisons: " + comparisons);
		/* Challenge 3.5 -modify this so it counts the number of copies and comparisons
			Display total at the end.
			Make two integers to hold the number - comparison and copy
			EFind the right place to put this into the code to run each time.

		*/
	}

	public long median() {
		int top = nElems-1;
		int bottom = 0;
		int middle = (top + bottom)/2;
		int odd = (top + bottom)%2;
		long median;

		this.insertionSort();

		if(odd == 0)
			median = a[middle];
		else 
			median = (a[middle] + a[middle+1])/2;

		return median;
	}

	public void noDups() {
		int index = 0;
		long comparer = -1;
		int  deleteHowMany = 0;
		

		this.insertionSort();

		for(index = 0; index<nElems-1; index++)
			if(comparer!=a[index]) {
				comparer = a[index];
			}
			else {
				a[index] = -1;
				deleteHowMany++;
			}

	ArrayIns uniques = new ArrayIns(nElems - deleteHowMany);
		for(index = 0; index<this.nElems; index++)
			if(a[index] != -1) {
				uniques.insert(a[index]);
			} else{;}
		

		this.a = uniques.a;
		this.nElems = uniques.nElems;
		return;
		


	}
}

class InsertionSort {
	public static void main(String[] args) {
		int maxSize = 100;
		ArrayIns arr;
		arr = new ArrayIns(maxSize);

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

		arr.insertionSort();

		arr.display();

		System.out.println("median = " + arr.median());

		arr.insert(77);
		arr.insert(77);
		arr.insert(77);
		arr.insert(00);
		arr.insert(00);
		arr.insert(22);
		arr.insert(33);
		arr.insert(33);
		arr.insert(33);

		arr.display();

		System.out.println("median = " + arr.median());

		arr.display();

		arr.noDups();

		arr.display();
	}
}
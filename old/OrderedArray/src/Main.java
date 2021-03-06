package dataStructuresAndAlgorithms.old.OrderedArray.src;

class OrdArray
{
	private long[] a;
	private int nElems;

	public OrdArray(int max)
	{
		a = new long[max];
		nElems = 0;
	}

	public int size()
	{ return nElems; }

	public int find(long searchKey)
	{
		int lowerBound = 0;
		int upperBound = nElems-1;
		int curIn;
	

		while(true)
		{
			curIn = (lowerBound + upperBound) / 2;
			if(a[curIn] == searchKey)
				return curIn;
			else if(lowerBound > upperBound)
				return nElems;
			else
				{
				if(a[curIn] < searchKey)
					lowerBound = curIn + 1;
				else
					upperBound = curIn - 1;
				}
		}
	}

	public void insert(long value)
	{
		int lowerBound = 0;
		int upperBound = nElems-1;
		int curIn;
		int j;


		/* Thinking. Need to have the binary search find the pair of indexes to insert into. 
		That means the lower bound has to be just one below the upper bound. 
		The lower bound needs to be less than the value to insert.
		The upper bound needs to be greater
		The upper index minus the lower index has to equal 1. 
		On each iteration, they will look at the current index -
		Current index is halfway between lower bound and upper bound
		If this value is greater than the insertion value, we need to move the lower bound up
		If it is less than the insertion value we need to move the upper bound down. 
		We need to repeat this process until they are one apart, then insert above the lower bound
		When we find this insertion point, we need to change the index of every 
		higher entry in the array up one and put that index = to the value.

		*/
		if (nElems == 0) {
			a[0] = value;
			nElems++;
			return;
		}


		while(1 < upperBound - lowerBound) {
			curIn = (lowerBound + upperBound) / 2;
			if (value > a[curIn])
				lowerBound = curIn+1;
			else
				upperBound = curIn-1;
		}
		if (value > a[upperBound])
			j = upperBound + 1;
		else if (value < a[upperBound] && value > a [lowerBound])
			j = upperBound;
		else
			j = lowerBound;

		for(int k=nElems; k>j; k--)
			a[k] = a[k-1];
		a[j] = value;
		nElems++;
		System.out.println("Inserted " + value);


	}

	public boolean delete(long value)
	{
		int lowerBound = 0;
		int upperBound = nElems-1;
		int curIn;
		int j;

		if (nElems == 0) {
			return false;
		}

		while(1 < upperBound - lowerBound) {
			curIn = (lowerBound + upperBound) / 2;
			if (value > a[curIn]) {
				lowerBound = curIn;
				System.out.println("LowerBound =" + lowerBound);
			}
			else {
				upperBound = curIn;
				System.out.println("UpperBound =" + upperBound);
			}
		}
		if (value == a[upperBound])
			j = upperBound ;
		else if (value == a[lowerBound])
			j = lowerBound;
		else
			return false;
		

			for(int k=j; k<nElems; k++)
				a[k] = a[k+1];
			nElems--;
			return true;
		
	}

	public void display()
	{
		for(int j=0; j<nElems; j++)
			System.out.print(a[j] + " ");
		System.out.println("");

	}
	
	public OrdArray merge(OrdArray array1, OrdArray array2) {
		OrdArray returnedArray = new OrdArray(array1.size() + array2.size());
		int j = 0;
		int k = 0;
		
		do 
			if ((array1.a[j] < array2.a[k]) && (j<array1.size())) {
				returnedArray.insert(array1.a[j]);
				j++;
					}
			else {
				returnedArray.insert(array2.a[k]);
				if(k < array2.size())
					k++;
			}
		while( returnedArray.size() < (array1.size() + array2.size()));
		
		return returnedArray;
		
	}
}

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		int maxSize = 100;
		OrdArray arr;
		arr = new OrdArray(maxSize);

		arr.insert(77);
		arr.display();
		arr.insert(99);
		arr.display();
		arr.insert(44);
		arr.display();
		arr.insert(55);
		arr.display();
		arr.insert(22);
		arr.display();
		arr.insert(88);
		arr.display();
		arr.insert(11);
		arr.display();
		arr.insert(00);
		arr.display();
		arr.insert(66);
		arr.display();
		arr.insert(33);
		arr.display();

		int searchKey = 55;
		if( arr.find(searchKey) != arr.size())
			System.out.println("Found " + searchKey);
		else
			System.out.println("Can't find " + searchKey);

		arr.display();

		arr.delete(00);
		arr.display();
		arr.delete(55);
		arr.display();
		arr.delete(99);

		arr.display();
		
		OrdArray firstArray = new OrdArray(100);
		OrdArray secondArray = new OrdArray(100);
		
		firstArray.insert(2);
		firstArray.insert(5);
		firstArray.insert(9);
		firstArray.insert(3);
		firstArray.insert(14);
		firstArray.insert(25);
		firstArray.insert(60);
		firstArray.insert(31);
		firstArray.insert(70);
		firstArray.insert(10);
		
		System.out.println("first array");
		firstArray.display();
		
		secondArray.insert(7);
		secondArray.insert(19);
		secondArray.insert(81);
		secondArray.insert(35);
		secondArray.insert(62);
		secondArray.insert(49);
		secondArray.insert(51);
		secondArray.insert(45);
		secondArray.insert(13);
		secondArray.insert(6);
		
		System.out.println("second array");
		secondArray.display();
		
		OrdArray thirdArray = secondArray.merge(firstArray, secondArray);
		thirdArray.display();
	}
}

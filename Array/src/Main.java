package dataStructuresAndAlgorithms.Array.src;

class Array
{
	private long[] a;
	private int nElems;

	public Array (int max)
	{
		a = new long[max];
		nElems = 0;
	}

	public long getMax()
	{
		long highest = -1;
		int j;
		for(j=0; j<nElems; j++)
			if (a[j] > highest)
				highest = a[j];

		return highest;

	}
	
	public long removeMax(){
		long highest = -1;
		int j;
		for(j=0; j<nElems; j++)
		    if(a[j]>highest)
				highest = a[j];
		if (highest == -1)
		{
			System.out.println("The Array is empty");
			return highest;
		}
		else{
			delete(highest);
			System.out.println("Deleted the highest number: " + highest);
			return highest;
		}
		
	}

	public boolean find(long searchKey)
	{
		int j;
		for(j=0; j<nElems; j++)
			if(a[j] == searchKey)
				break;
			if(j == nElems)
				return false;
			else 
				return true;
	}

	public void insert(long value)
	{
		a[nElems] = value;
		nElems++;
	}

	public boolean delete(long value)
	{
		int j;
		for(j=0; j<nElems; j++)
			if( value == a[j])
				break;
			if(j==nElems)
				return false;
			else
			{
				for(int k=j; k<nElems; k++)
					a[k] = a[k+1];
				nElems--;
				return true;
			}
	}
	public void display()
	{
		for(int j=0; j<nElems; j++)
			System.out.print(a[j] + " ");
		System.out.println(" ");
	}

	public void noDups() {
		int j = 0;
		int k = 0;
		
		for(j=0;j<nElems -1;j++)
			for(k=j;k<nElems;k++)
				if(a[j] == a[k]){
					System.out.println("Deleting " + a[k]);
					delete(a[k]);
					}
		return;
	}
}
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		int maxSize = 100;
		Array arr;
		Array arr2;
		arr = new Array(maxSize);
		arr2 = new Array(maxSize);
		
		System.out.println("The Maximum is " + arr.getMax());

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

		System.out.println("The Maximum is " + arr.getMax());

		System.out.println("Creating new ordered array");

		while(arr.getMax()!= -1)
			arr2.insert(arr.removeMax());

		System.out.println(" Created new array ");
		arr2.display();

		int searchKey = 35;
		if(arr2.find(searchKey))
			System.out.println("Found " + searchKey);
		else
			System.out.println(" Can't find " + searchKey);

		arr2.delete(00);
		arr2.delete(55);
		arr2.delete(99);

		arr2.display();
		arr2.removeMax();
		arr2.removeMax();
		arr2.display(); 
		
		Array arr3 = new Array(100);
		
		arr3.display();
		arr3.insert(5);
		arr3.insert(5);
		arr3.insert(5);
		arr3.insert(5);
		arr3.insert(3);
		arr3.insert(3);
		arr3.insert(3);
		arr3.insert(3);
		arr3.insert(31);
		arr3.insert(35);
		arr3.display();
		arr3.noDups();
		arr3.display();
	}
}

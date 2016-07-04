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
}
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("Hello World!");
		int maxSize = 100;
		Array arr;
		Array arr2;
		int j;
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
	}
}

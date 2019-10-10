
public class DHArrayList <E> implements BareBonesArrayList<E>
{
	private int size;	//How many elements in the ArrayList
	private int capacity; //What is the size of the ArrayList
	private Object[] myArray; //Array reference to store actual data
	private static final int INITIAL_CAPACITY = 10;
	//default size of the list
	
	//Constructor
	public DHArrayList()
	{
		   this.capacity = INITIAL_CAPACITY;
		   this.size = 0;
		   myArray = (E[]) new Object[this.capacity]; //Creates the array with the initial size
		   
	}
	
	//Overloaded constructor, to create ArrayList of variable size
	public DHArrayList(int capacity)
	{
		this.capacity = capacity;
		this.size = 0;
		myArray = (E[]) new Object[this.capacity];
	}
	
	
	@Override
	public void add(E a)
	{
		// This method adds the element at the end of the list
		if(size < capacity) //There is space at the end
		{
			myArray[size] = a;
			size ++;
		}
		else
		{
			System.out.println("Not enough space to insert!");
			System.out.println("Calling reallocate...");
			this.reallocate(); //Call reallocate
			this.add(a);	// The call this method again, there will be space now
		}
		
	}

	private void reallocate()
	{
		// This method doubles the size of the array
		this.capacity *=2;
		E[] temp = (E[]) new Object[this.capacity];//Create new array with updated size
		//need to copy the old array elemenets into the new one
		for(int i = 0; i <myArray.length; i++)
		{
			temp[i] = (E) myArray[i];
		}
		
		//After copying is done,update the reference to point to original array
		this.myArray = temp;
		
	}

	@Override
	public void add(E a, int index)
	{
		// This add method, inserts data at specific index
		//Check if the index is a valid one
		if(index < 0 || index > size)
		{
			System.out.println("Invalid Index!");
			return;
		}
		//we can reuse the other add method, if the index is at the end of the current list
		else if(index == size)
		{
			this.add(a);
		}
		else 
		{
			//Make sure there is space
			//Then move the elements of and insert
			if(this.capacity == this.size)
			{
				this.reallocate();//If full, call reallocate()
				
			}
			//move the data
			for(int i = size; i > index; i--)
			{
				this.myArray[i] = this.myArray[i-1];
			}
			//Once the data is moved, now you can insert
			this.myArray[index] = a;
			size++;
		}
		
	}

	@Override
	public E remove(int index)
	{
		// This method removes an element from the specified index 
		// Check if the index is valid
		if(index < 0 || index >= size)
		{
			System.out.println("Invalid index!");
			return null;
		}
		// The index is valid
		// Shifting might be required
		// Save the element that is being deleted to be returned
		
		E temp = (E) this.myArray[index];
		// Use a loop to shift the elements one place left from index
		for(int i = index; i < size -1; i++)
		{
			this.myArray[i] = this.myArray[i+1];
			
		}
		size--; //Update the size
		return temp;
	}

	@Override
	public E get(int index)
	{
		//  Returns the value at index
		// Check if the index is valid or not
		if(index < 0 || index > size)
		{
			return null;
		}
		return (E) this.myArray[index];
	}

	@Override
	public void set(E a, int index)
	{
		// Updates the value at specified index
		// Check if the index is valid or not
		if(index < 0 || index > size)
		{
			
		}
		this.myArray[index] = a;
		
	}

	@Override
	public int getSize()
	{
		// returns how many elements are there in the list
		return this.size;
	}

	@Override
	public int indexOf(E a)
	{
		// This method searches for the element a, and if found returns
		// the first matching index
		// If not found, we return -1
		for(int i = 0; i < size; i++)
		{
			//iterate over the array, and compare values
			if(this.myArray[i].equals(a))
				return i;
		}
		//If we have come here, then we didn't find the value
		return -1;
	}
	
	
	public String toString()
	{
		String s = " ";
		for(int i = 0; i < size; i++)
		{
			//Iterate over the elements in the arrayList
			//Append to the String
			s += myArray[i] + " ";
			
		}
		return s;
	}

}

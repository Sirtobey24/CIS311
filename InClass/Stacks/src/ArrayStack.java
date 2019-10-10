
public class ArrayStack <E> implements BareBonesStack <E>
{
	//Storage for the stack
	//Storage for the stack
			private E[] theData;
			// Top of stack
			private int topofStack = -1; //indicates nothing is there
			private static final int INIT_CAPACITY = 10; //Default Capacity
			private int capacity;
	 
	//Next we need constructors
	public ArrayStack()

	{
		this.theData = (E[]) new Object[this.INIT_CAPACITY]; //Downcast
		this.capacity = this.INIT_CAPACITY;
	}
	
	public ArrayStack(int size)
	{
		this.theData = (E[]) new Object[size];
		this.capacity = size;
		
	}
			
	
	@Override
	public void push(E data)
	{
		
		//We need to check if there is space to add data
		if(this.topofStack == this.capacity -1)
		{
			System.out.println("Stack Overflow..!!");
		}
		else
		{
			// THere is space for the data
			// Increment the TOS and add the data
			this.topofStack++;
			this.theData[topofStack] = data;
		}
		return;
	}

	//This method removes data from the Stack
	@Override
	public E pop()
	{
		if(empty())
		{
			System.out.println("Stack Underflow..!!");
			return null;
		}
		else
		{
			//We need to delete the element at location TOS
			E temp = this.theData[topofStack]; //Save the element to return
			this.topofStack--; //Decrement the TOS
			return temp;
		}
	}

	@Override
	public E peek()
	{
		if(empty())
		{
			System.out.println("Stack Underflow..!!");
			return null;
		}
		else
		{
			return this.theData[topofStack];
		}
		
	}

	@Override
	//Checks if the Stack is empty or not
	public boolean empty()
	{
		
		return (this.topofStack == -1);
	}
	
	public String toString()
	{
		String s = "Stack: ";
		for (int i = 0; i<=this.topofStack; i++)
		{
			s += theData[i] + ","; 
		}
		return s;
		
	
	}

}

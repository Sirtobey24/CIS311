
public interface BareBonesArrayList<E>
{
	public void add(E a);// This method is used to add 
	//to the end of the list
	public void add(E a, int index); // overloaded method
	//to add at specified index
	public E remove(int index);// Removes the data at
	//specified index
	public E get(int index); // Returns the data at index
	public void set(E a, int index);//Updates the value 
	// of the data at specified index
	public int getSize(); //Returns the total number of
	// elements in the list
	public int indexOf(E a); // Returns the index of the
	//given data
}

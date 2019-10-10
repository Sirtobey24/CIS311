//Interface with the Stack methods
public interface BareBonesStack <E>
{
	void push(E data); 	// This inserts the data into stack
	E pop();			// This removes the top data and returns it
	E peek();			// Returns TOS(Top of stack) without removing
	boolean empty();	// Checks the stack and returns true if empty
}

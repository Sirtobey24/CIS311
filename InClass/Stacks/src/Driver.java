
public class Driver
{

	public static void main(String[] args)
	{
		// We will create a Stack object and test our methods
		ArrayStack <Integer> myStack = new ArrayStack<Integer>(2);
		myStack.push(10);
		System.out.println(myStack);
		myStack.push(20);
		System.out.println(myStack);
		myStack.push(30);
		System.out.println(myStack);
		myStack.pop();
		System.out.println(myStack);
		//myStack.pop();
		System.out.println("The top element on the stack is: " + myStack.peek());
		System.out.println(myStack);

	}

}

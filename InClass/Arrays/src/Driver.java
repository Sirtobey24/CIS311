
public class Driver
{

	public static void main(String[] args)
	{
		// We will create an arrayList object from our class and test the method here
		DHArrayList<Integer> myList = new DHArrayList<>(1);
		myList.add(10);
		System.out.println(myList);
		myList.add(20);
		System.out.println(myList);
		myList.add(30);
		System.out.println(myList);
		myList.add(99,0);
		System.out.println(myList);
		myList.remove(1);
		myList.set(101, 0);
		System.out.println(myList);
		System.out.println("The value at the first index: " + myList.get(0));
		System.out.println("The location of 20 is: " + myList.indexOf(20));
		
	}

}

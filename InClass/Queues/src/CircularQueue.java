public class CircularQueue<E> implements Queue<E>
{
    private E[] Q;             //Array reference to hold the Queue elements
    private int front;              //Front of the queue
    private int rear;               //Rear of the queue
    private int count;              //How many elements in the queue
    private int capacity;           //What is the size of the current array for Queue
    private final int defaultCapacity = 5;

    public CircularQueue()
    {
        //Create the actual array here, set front , rear and size
        Q = new E[defaultCapacity];
        front = 0;
        rear = 0;
        count = 0;      //There are no elements at the beginning
        capacity = defaultCapacity;
    }

    @Override
    public void offer(E data)
    {
        //Method to add elements to the queue
        //First check if there is space to add the elements
        if (isFull())
        {
            System.out.println("The Queue is full, cannot add!");
            return;
        }
        //So there is space to add
        //Add at the rear, update rear and update count
        Q[rear] = data;  //Element added at rear
        rear = (rear + 1) % capacity;   //Circular array, so using %
        count++;    //Now there is one more element
    }

    @Override
    public E poll()
    {
        //Check if there is any element to delete
        if (isEmpty())
        {
            System.out.println("Cannot delete anything, empty Queue!");
            return null;
        }
        //There is element(s) to delete
        //Save the element
        E temp = Q[front];
        front = (front + 1) % capacity; // Update front
        count--;                        //Update count, reduce it
        return temp;                    //Return the data that was deleted
    }

    @Override
    public boolean isEmpty()
    {
        return (count == 0); //The number of elements if 0
    }

    @Override
    public boolean isFull()
    {
        return (count == capacity); //The Array is full if the number of elements is the same as the size of the array
    }

    //Method to display the Queue
    public String toString()
    {
        String S = "";
        for (int i = front; i < front + count; i++)
        {
            S += " | " + Q[i % capacity];
        }
        return S;
    }
}

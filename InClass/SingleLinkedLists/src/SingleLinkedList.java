//This is the class for the single linked list
//It is made up of Nodes
//There is a special Head node to begin the list
public class SingleLinkedList
{
    private Node head;            //Head of the linked list
    private int size;            //How many nodes are there in the list

    //Constructor
    public SingleLinkedList()
    {
        this.head = new Node(null); //Set the data of head to null (or -1)
        this.size = 0;        //Head is not part of the list, so size is 0
    }

    //Methods for linked list
    //Add methods
    //Method to add at the beginning of the linked list
    public void addFirst(Object item)
    {
        //Node first = new Node(item);    //Creates the node
        //first.next = head.next;         // Copy the next link from head

        //Node first = new Node(item, head.next);
        //head.next = first;                 //Update the head
        head.next = new Node(item, head.next);
        size++;
    }

    //Implement the addAfter method, to add a node after a given reference
    public void addAfter(Object item, Node target)
    {
//        Node insert = new Node(item);  //Create the Node
//        insert.next = target.next;     //Update the next on created node
//        target.next = insert;    //Update the next of target

        target.next = new Node(item, target.next);
        size++;
    }

    //Implement the addLast method, that adds a node at the end of the list
    public void addLast(Object item)
    {
        Node target = getNode(size); //We need a reference to the last node to add after that
        addAfter(item, target); // Then call addAfter() method
    }

    //Helper method, that returns the reference of node at given index
    public Node getNode(int index)
    {
        //First check if the index is valid or not
        if (index < 0 || index > size)
        {
            return null;        //tHE index is invalid
        }
        //Otherwise, we iterate over the list and return the reference at index
        Node iter = head; //Iterator node
        for (int i = 0; i < index; i++)
        {
            iter = iter.next;
        }
        return iter;
    }

    //Implement the removeFirst method
    public Object removeFirst()
    //Check if there is a node to delete
    {
        if (size == 0) //There is no node to delete
        {
            return null;
        }
        Node temp = head.next;  // Save the node reference that will be deleted
        head.next = head.next.next; //Update the head to point to second node
        size--;                     //Decrement the total number of nodes
        return temp.data;
    }


    //Implement the toString method to print the data in the list
    public String toString()
    {
        String value = "";
        Node temp = head;   //This is the iterator
        while (temp.next != null)
        {
            value += " | " + temp.next.data;
            temp = temp.next;       // Move to the next node
        }
        return value;
    }

    //Overloaded printReverse method for internal use
    public void printReverse(Node current)
    {
        //If this is the last node, you can print it
        if (current.next == null)
        {
            //This is the end of the list
            System.out.print(current.data + " <- ");
            return;
        }
        //Otherwise, there are nodes following, so we need to print those
        printReverse(current.next); //Print the other nodes first
        System.out.print(current.data + " <- "); //Once done print your data
    }

    public void printReverse()
    {
        //This method prints the linked list in reverse
        //Treat this as a wrapper method, which the user calls
        //We will call another printReverse method and supply the required parameters
        if (size == 0)
        {
            return;
        }
        printReverse(head.next); //Try to print the data of the list
    }

    public void printForward(Node current)
    {
        if (current.next == null)
        {
            printForward(current.next);
            System.out.println(current.data + " -> ");
            return;
        }

        System.out.println(current.data + " -> ");
    }

    public void printForward()
    {
        //This method prints the linked list in reverse
        //Treat this as a wrapper method, which the user calls
        //We will call another printReverse method and supply the required parameters
        if (size == 0)
        {
            return;
        }
        printForward(head.next); //Try to print the data of the list
    }


}

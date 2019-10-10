//This is a Node class, that helps in creating  a Linked List
public class Node
{
    //Data
    Object data;
    //Link
    Node next; //The link points to another node

    //Constructors
    //Default Constructor, creates node only with data
    public Node(Object data)
    {
        this.data = data;
        this.next = null;
    }

    //Overloaded Constructor, creates node and also points it to another one
    public Node(Object data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}

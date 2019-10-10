public class Node
{
    String data;
    Node next;

    public Node(String dataItem)
    {
        data = dataItem;
        next = null;
    }

    public Node(String dataItem, Node nodeRef)
    {
        this.data = dataItem;
        this.next = nodeRef;
    }
}

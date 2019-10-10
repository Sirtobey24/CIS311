public class LinkedList1
{

    public static void main(String[] args)
    {
        Node tom = new Node("Tom");
        Node dick = new Node("Dick");
        Node harry = new Node("Harry");
        Node sam = new Node("Sam");

        tom.next = dick;
        dick.next = harry;
        harry.next = sam;



    }
}

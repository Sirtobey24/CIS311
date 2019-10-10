public class Driver
{
    public static void main(String[] args)
    {
        //Create a linkedlist object and test the methods
        SingleLinkedList list = new SingleLinkedList();
        System.out.println(list);
        list.addFirst(101);
        System.out.println(list);
        list.addFirst(201);
        System.out.println(list);
        list.addLast(999);
        System.out.println(list);
        list.addAfter(512, list.getNode(1));

       // System.out.println("Printing in reverse: ");
        //list.printReverse();

        System.out.println("Printing in forward: ");
        list.printForward();

        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
    }
}
